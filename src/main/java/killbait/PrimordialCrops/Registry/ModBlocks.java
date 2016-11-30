package killbait.PrimordialCrops.Registry;


import killbait.PrimordialCrops.Blocks.PrimordialBlock;
import killbait.PrimordialCrops.Config.PrimordialConfig;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block MinicioOre;
	public static Block UraniumOre;

	public static void init() {
		MinicioOre = registerMiscBlock("MinicioOre").setHardness(2);
		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableUraniumCrop) {
				UraniumOre = registerMiscBlock("UraniumOre").setHardness(2);
			}
		}
	}

	private static Block registerMiscBlock(String regName) {
		final Block MagicalBlock = new PrimordialBlock(regName);
		final ItemBlock itemBlock = new ItemBlock(MagicalBlock);

		return registerBlock(regName, itemBlock, MagicalBlock);
	}

	private static Block registerBlock(String regName, ItemBlock itemBlock, Block block) {
		block.setRegistryName(regName);
		block.setUnlocalizedName(regName);

		GameRegistry.register(block);

		if (block instanceof PrimordialBlock) {
			itemBlock.setRegistryName(regName);
			itemBlock.setUnlocalizedName(regName);
			GameRegistry.register(itemBlock);
		}
		return block;
	}


}
