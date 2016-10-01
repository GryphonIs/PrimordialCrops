package killbait.PrimordialCrops.Registry;

import killbait.PrimordialCrops.Config.PrimordialConfig;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegistry {

	public static void registerBlockRenderer() {

		reg(ModBlocks.MinicioOre);
		if (PrimordialConfig.enableUraniumCrop) reg(ModBlocks.UraniumOre);
	}

	public static void reg(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
