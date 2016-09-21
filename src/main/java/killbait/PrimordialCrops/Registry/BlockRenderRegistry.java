package killbait.PrimordialCrops.Registry;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegistry {
	
	public static void registerBlockRenderer() {
		
		 /*reg(ModBlocks.MinicioCrop);
	     reg(ModBlocks.AirCrop);
	     reg(ModBlocks.CoalCrop);
	     reg(ModBlocks.DyeCrop);
	     reg(ModBlocks.EarthCrop);
	     reg(ModBlocks.EmeraldCrop);
	     reg(ModBlocks.EnderCrop);
	     reg(ModBlocks.ExperienceCrop);
	     reg(ModBlocks.FireCrop);
	     reg(ModBlocks.GlowstoneCrop);
	     reg(ModBlocks.LapisCrop);
	     reg(ModBlocks.NatureCrop);
	     reg(ModBlocks.NetherCrop);
	     reg(ModBlocks.ObsidianCrop);
	     reg(ModBlocks.QuartzCrop);
	     reg(ModBlocks.IronCrop);
	     reg(ModBlocks.GoldCrop);
	     reg(ModBlocks.DiamondCrop);
	     reg(ModBlocks.RedstoneCrop);*/
	     
	     reg(ModBlocks.MinicioOre);
	     
         /*if(Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("tconstruct") || Loader.isModLoaded("forestry")) {
			 System.out.println("Mods with Copper, Silver, Lead, and Tin Found! Creating Crops for them");
			 reg(ModBlocks.CopperCrop);
			 reg(ModBlocks.TinCrop);
			 reg(ModBlocks.LeadCrop);
			 reg(ModBlocks.SilverCrop);
		 }
	    if(Loader.isModLoaded("Mekanism")) {
			FMLLog.info("Mekanism Detected, adding Osmium crop");
		    reg(ModBlocks.OsmiumCrop);
		}*/

	}
	
	  public static void reg(Block block) {
	        Item item = Item.getItemFromBlock(block);

	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	                .register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
   }
	
}
