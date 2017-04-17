package killbait.PrimordialCrops.Compat.Forestry.Test;

import forestry.api.farming.FarmDirection;
import forestry.api.farming.ICrop;
import forestry.api.farming.IFarmHousing;
import forestry.api.farming.IFarmLogic;
import killbait.PrimordialCrops.Utils.LogHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import java.util.Collection;

/**
 * Created by Jon on 14/04/2017.
 */
public class PrimordialFarmLogic implements IFarmLogic {

	private final Item farmSeed;
	private final Item logicIconItem;
	protected boolean isManual;

	public PrimordialFarmLogic(Item iconItem, Item seed) {
		this.farmSeed = seed;
		this.logicIconItem = iconItem;
	}


	@Override
	public int getFertilizerConsumption() {
		return 5;
	}

	@Override
	public int getWaterConsumption(float hydrationModifier) {
		return (int) (20 * hydrationModifier);
	}

	public boolean isAcceptedGround(@Nonnull IBlockState blockState) {
		return blockState.getBlock() == Blocks.FARMLAND;
	}

	@Override
	public boolean isAcceptedResource(ItemStack itemstack) {
		//return itemstack.isItemEqual(Blocks.FARMLAND);
		LogHelper.info("accept resource");
		return false;
	}

	@Override
	public boolean isAcceptedGermling(ItemStack itemstack) {
		return this.farmSeed == itemstack.getItem();
	}

	@Override
	public Collection<ItemStack> collect(World world, IFarmHousing farmHousing) {
		return null;
	}

	@Override
	public boolean cultivate(World world, IFarmHousing farmHousing, BlockPos pos, FarmDirection direction, int extent) {
		return false;
	}

	@Override
	public Collection<ICrop> harvest(World world, BlockPos pos, FarmDirection direction, int extent) {
		return null;
	}

	@Override
	public PrimordialFarmLogic setManual(boolean flag) {
		isManual = flag;
		return this;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ResourceLocation getTextureMap() {
		return TextureMap.LOCATION_BLOCKS_TEXTURE;
	}

	@Override
	public String getName() {
		return "test";
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(this.logicIconItem);
	}
}
