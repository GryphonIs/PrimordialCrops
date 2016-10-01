package killbait.PrimordialCrops.Blocks;

import killbait.PrimordialCrops.Registry.ModCrops;
import killbait.PrimordialCrops.Config.PrimordialConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.FMLLog;

import java.util.List;
import java.util.Random;

public class CropBlocksSpecial extends BlockCrops implements IGrowable, IPlantable {

	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 7);

	public final String regName;

	public CropBlocksSpecial(String regName) {
		super();
		this.regName = regName;
		this.setDefaultState(blockState.getBaseState().withProperty(AGE, 0));
	}

	public boolean isSuitableForPlant(Block soil) {
		return soil == Blocks.FARMLAND;
	}

	protected PropertyInteger getAge() {
		return AGE;
	}

	public int getHarvestReadyAge() {
		return 7;
	}

	public boolean isHarvestReady(IBlockState state) {
		return state.getValue(getAge()) >= getHarvestReadyAge();
	}

	protected Item getSeeds() {
		final Item seeds = ModCrops.seedsMapSpecial.get(this);

		if (seeds == null) {
			FMLLog.bigWarning("No seeds detected!");
			return new Item();
		}
		return seeds;
	}

	@Override
	public ItemStack getItem(World world, BlockPos pos, IBlockState state) {
		return new ItemStack(getSeeds());
	}

	@Override
	public boolean canGrow(World worl, BlockPos pos, IBlockState state, boolean isClient) {
		return !isHarvestReady(state);
	}

	protected Item getHarvestedItem() {
		final Item harvestedItem = ModCrops.harvestedItemMapSpecial.get(this);
		if (harvestedItem == null) {
			FMLLog.bigWarning("No drop registered!");
			return new Item();
		}
		return harvestedItem;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(getAge(), meta);
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rnd) {
		this.checkAndDropBlock(world, pos, state);

		if (world.getLightFromNeighbors(pos.up()) >= 9) {
			int i = this.getMetaFromState(state);

			if (i < this.getHarvestReadyAge()) {
				float f = getGrowthChance(this, world, pos);

				if (rnd.nextInt((int) (25.0F / f) + 1) == 0) {
					world.setBlockState(pos, this.getStateFromMeta(i + 1), 2);
				}
			}
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rnd, int fortune) {
		if (!isHarvestReady(state)) {
			return getSeeds();
		} else {
			return getHarvestedItem();
		}
	}

	public int getMetaFromState(IBlockState state) {
		return state.getValue(getAge());
	}

	@Override
	public boolean canPlaceBlockAt(World world, BlockPos pos) {
		Block soilBlock = world.getBlockState(pos.down()).getBlock();

		return this.isSuitableForPlant(soilBlock);
	}

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
									ItemStack stack, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (PrimordialConfig.rightClickHarvest && isHarvestReady(state)) {
			if(world.isRemote) {
                return true;
            }

            final ItemStack savedStack = new ItemStack(getHarvestedItem());

            world.setBlockState(pos, state.withProperty(AGE, 0), 7);
 final EntityItem entItem = new EntityItem(world, player.posX, player.posY - 1D, player.posZ, savedStack);
            world.spawnEntityInWorld(entItem);
            entItem.onCollideWithPlayer(player);
            return true;
        }
        return false;
    }


	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Crop;
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, AGE);
	}

	protected int getRandomInt(World world) {
		return MathHelper.getRandomIntegerInRange(world.rand, 1, 7);
	}

	@Override
	public void grow(World world, BlockPos pos, IBlockState state) {
		int newGrowth = getMetaFromState(state) + getRandomInt(world);
		int maxGrowth = getHarvestReadyAge();

		if (newGrowth > maxGrowth) {
			newGrowth = maxGrowth;
		}

		world.setBlockState(pos, getStateFromMeta(newGrowth), 2);
	}

	@Override
	public void grow(World world, Random rnd, BlockPos pos, IBlockState state) {
		grow(world, pos, state);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof CropBlocks && regName.equals(((CropBlocks) obj).regName));
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		List<ItemStack> ret = new java.util.ArrayList<ItemStack>();

		Random rnd = world instanceof World ? ((World) world).rand : new Random();

		int age = getMetaFromState(state);
		int extraseed;

		// how many essence to give
		int count = quantityDropped(state, fortune, rnd);
		for (int i = 0; i < count; i++) {
			Item item = this.getItemDropped(state, rnd, fortune);
			if (item != null) {
				ret.add(new ItemStack(item, 1, this.damageDropped(state)));
			}
		}

		// how many seeds to give
		if (age >= getHarvestReadyAge()) {
			if ((Math.random() * 100) <= PrimordialConfig.specialSeedExtraChance) {
				extraseed = 1 + (1 * fortune);
			} else {
				extraseed = 0;
			}
			ret.add(new ItemStack(this.getSeeds(), 1 + extraseed, 0));
		}

		return ret;
	}
}
