package killbait.PrimordialCrops.Blocks;

import killbait.PrimordialCrops.PrimordialCrops;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


//ignore this
public class PrimordialBlock extends Block {

	public PrimordialBlock(Material material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}

	public PrimordialBlock(String unlocalisedName) {
		this(Material.ROCK, unlocalisedName);
	}

}
