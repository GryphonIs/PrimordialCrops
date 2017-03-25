package killbait.PrimordialCrops.Items.Tools;

import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Utils.Colours;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

import static killbait.PrimordialCrops.Registry.ModItems.zivicioToolMaterial;

public class PrimordialHoe extends ItemHoe {

	public PrimordialHoe(Item.ToolMaterial material, String regName) {
		super(material);
		this.setUnlocalizedName(regName);
		this.setMaxStackSize(1);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		if (this.getMaterialName() == zivicioToolMaterial.toString()) list.add(Colours.LIGHTGREEN + "Unbreakable");
		list.add(Colours.YELLOW + "Right click on plants to speed up growth");
	}

	// there is no way to get a reference to the actual material used, getMaterialName() only returns a string
	// meh... this is ugly, checking against a specific material works though.
	@Override
	public void setDamage(ItemStack stack, int damage) {
		if (this.getMaterialName() != zivicioToolMaterial.toString()) {
			super.setDamage(stack, damage);
		}
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY) {
		super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY);

		if (this.getMaterialName() == zivicioToolMaterial.toString() && PrimordialConfig.enableZivicioHoeSpeedup) {

			IBlockState iblockstate = playerIn.getBlockState(worldIn);
			Block block = iblockstate.getBlock();

			if (block != null && block instanceof IGrowable) {
				IGrowable igrowable = (IGrowable) block;
				if (igrowable.canGrow(playerIn, worldIn, iblockstate, playerIn.isRemote)) {
					if (!playerIn.isRemote) {
						if (igrowable.canUseBonemeal(playerIn, playerIn.rand, worldIn, iblockstate)) {
							//igrowable.grow(worldIn, worldIn.rand, pos, iblockstate); // no client side update
							//iblockstate.getBlock().updateTick(worldIn, pos, iblockstate, worldIn.rand); // no client side update
							//LogHelper.info("update");
							playerIn.scheduleUpdate(worldIn, block, 1);
						}
					} else {
						//LogHelper.info("spawn" + igrowable.toString());
						spawnBonemealParticles(playerIn, worldIn, 5);
					}
				}
			}
		}
		return EnumActionResult.PASS;
	}

	@SideOnly(Side.CLIENT)
	public static void spawnBonemealParticles(World worldIn, BlockPos pos, int amount) {
		if (amount == 0) {
			amount = 15;
		}

		IBlockState iblockstate = worldIn.getBlockState(pos);

		if (iblockstate.getMaterial() != Material.AIR) {
			for (int i = 0; i < amount; ++i) {
				double d0 = itemRand.nextGaussian() * 0.02D;
				double d1 = itemRand.nextGaussian() * 0.02D;
				double d2 = itemRand.nextGaussian() * 0.02D;
				worldIn.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, (double) ((float) pos.getX() + itemRand.nextFloat()), (double) pos.getY() + (double) itemRand.nextFloat() * iblockstate.getBoundingBox(worldIn, pos).maxY, (double) ((float) pos.getZ() + itemRand.nextFloat()), d0, d1, d2, new int[0]);
			}
		} else {
			for (int i1 = 0; i1 < amount; ++i1) {
				double d0 = itemRand.nextGaussian() * 0.02D;
				double d1 = itemRand.nextGaussian() * 0.02D;
				double d2 = itemRand.nextGaussian() * 0.02D;
				worldIn.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, (double) ((float) pos.getX() + itemRand.nextFloat()), (double) pos.getY() + (double) itemRand.nextFloat() * 1.0f, (double) ((float) pos.getZ() + itemRand.nextFloat()), d0, d1, d2, new int[0]);
			}
		}
	}
}
