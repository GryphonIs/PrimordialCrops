package killbait.PrimordialCrops.Seeds;

import killbait.PrimordialCrops.PrimordialCrops;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CropSeeds extends ItemSeeds {

	public final Block plant;
	public final String name;

	public CropSeeds(Block crops, Block soil, String regName) {
		super(crops, soil);
		this.plant = crops;
		this.name = regName;
		this.setUnlocalizedName(regName);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return this.plant.getDefaultState();
	}
}
