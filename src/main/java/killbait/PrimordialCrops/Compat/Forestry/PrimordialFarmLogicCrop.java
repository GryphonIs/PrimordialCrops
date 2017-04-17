package killbait.PrimordialCrops.Compat.Forestry;

import forestry.api.farming.FarmDirection;
import forestry.api.farming.ICrop;
import forestry.api.farming.IFarmHousing;
import forestry.api.farming.IFarmable;
import forestry.core.utils.BlockUtil;
import forestry.farming.logic.FarmLogicWatered;
import forestry.farming.logic.FarmableAgingCrop;
import killbait.PrimordialCrops.Blocks.CropBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Collection;
import java.util.Stack;

/**
 * Created by Jon on 15/04/2017.
 */
public class PrimordialFarmLogicCrop extends FarmLogicWatered {

	private final Item logicIconItem;
	private final Item farmSeed;
	private final Block cropBlock;
	private final String logicName;
	private final IFarmable farmItem;

	public PrimordialFarmLogicCrop(String essenceName, Item iconItem, Item seed, Block seedBlock) {
		super(new ItemStack(Blocks.DIRT), Blocks.FARMLAND.getDefaultState());
		this.farmSeed = seed;
		this.logicIconItem = iconItem;
		this.cropBlock = seedBlock;
		this.farmItem = new FarmableAgingCrop(new ItemStack(this.farmSeed), this.cropBlock, CropBlocks.AGE, 7);
		this.logicName = essenceName;
	}

	@Override
	public boolean isAcceptedGround(IBlockState blockState) {
		return super.isAcceptedGround(blockState) || blockState.getBlock() == Blocks.FARMLAND;
	}

	@Override
	public boolean isAcceptedGermling(ItemStack itemstack) {
		return this.farmSeed == itemstack.getItem();
	}

	@Override
	public boolean isAcceptedWindfall(ItemStack itemstack) {
		return false;
	}

	@Override
	protected boolean maintainCrops(World world, IFarmHousing farmHousing, BlockPos pos, FarmDirection direction, int extent) {
		for (int i = 0; i < extent; i++) {
			BlockPos position = translateWithOffset(pos, direction, i);
			IBlockState state = world.getBlockState(position);
			if (!world.isAirBlock(position) && !BlockUtil.isReplaceableBlock(state, world, position)) {
				continue;
			}

			IBlockState groundState = world.getBlockState(position.down());
			if (isAcceptedGround(groundState)) {
				return trySetCrop(world, farmHousing, position);
			}
		}

		return false;
	}

	private boolean trySetCrop(World world, IFarmHousing farmHousing, BlockPos position) {
		if (farmHousing.plantGermling(this.farmItem, world, position)) {
			return true;
		}
		return false;
	}

	@Override
	public Collection<ICrop> harvest(World world, BlockPos pos, FarmDirection direction, int extent) {
		Stack<ICrop> crops = new Stack<ICrop>();
		for (int i = 0; i < extent; i++) {
			BlockPos position = translateWithOffset(pos.up(), direction, i);
			IBlockState blockState = world.getBlockState(position);
			ICrop crop = this.farmItem.getCropAt(world, position, blockState);
			if (crop != null) {
				crops.push(crop);
			}
		}
		return crops;
	}

	@Override
	public String getName() {
		return logicName + " Crop";
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(this.logicIconItem);
	}
}
