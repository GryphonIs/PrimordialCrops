package killbait.PrimordialCrops.Seeds;

import killbait.PrimordialCrops.PrimordialCrops;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class CropSeedsSpecial extends ItemSeeds {

	public CropSeedsSpecial(Block crops, Block soil, String regName) {
		super(crops, soil);
		this.setUnlocalizedName(regName);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}
}
