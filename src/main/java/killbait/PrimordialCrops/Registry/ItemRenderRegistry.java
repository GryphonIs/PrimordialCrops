package killbait.PrimordialCrops.Registry;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;

public class ItemRenderRegistry {

	
    public static void registerItemRenderer() {

		// Seeds
		reg(ModSeeds.DiamondSeeds);
		reg(ModSeeds.IronSeeds);
		reg(ModSeeds.GoldSeeds);
		reg(ModSeeds.CoalSeeds);
		reg(ModSeeds.RedstoneSeeds);
		reg(ModSeeds.QuartzSeeds);
		reg(ModSeeds.ObsidianSeeds);
		reg(ModSeeds.NetherSeeds);
		reg(ModSeeds.NatureSeeds);
		reg(ModSeeds.LapisSeeds);
		reg(ModSeeds.GlowstoneSeeds);
		reg(ModSeeds.FireSeeds);
		reg(ModSeeds.ExperienceSeeds);
		reg(ModSeeds.EmeraldSeeds);
		reg(ModSeeds.EarthSeeds);
		reg(ModSeeds.DyeSeeds);
		reg(ModSeeds.AirSeeds);
		reg(ModSeeds.WaterSeeds);
		reg(ModSeeds.MinicioSeeds);

        reg(ModSeeds.BlazeSeeds);
        reg(ModSeeds.ChickenSeeds);
        reg(ModSeeds.CowSeeds);
        reg(ModSeeds.CreeperSeeds);
        reg(ModSeeds.EnderSeeds);
        reg(ModSeeds.GhastSeeds);
        reg(ModSeeds.PigSeeds);
        reg(ModSeeds.SheepSeeds);
        reg(ModSeeds.SkeletonSeeds);
        reg(ModSeeds.SlimeSeeds);
        reg(ModSeeds.SpiderSeeds);
        reg(ModSeeds.WitherSeeds);
		reg(ModSeeds.ZombieSeeds);
		reg(ModSeeds.DonutSeeds);

		// Crop Essence

		reg(ModItems.DiamondEssence);
		reg(ModItems.IronEssence);
		reg(ModItems.GoldEssence);
		reg(ModItems.CoalEssence);
		reg(ModItems.RedstoneEssence);
		reg(ModItems.QuartzEssence);
		reg(ModItems.ObsidianEssence);
		reg(ModItems.NetherEssence);
		reg(ModItems.NatureEssence);
		reg(ModItems.LapisEssence);
		reg(ModItems.GlowstoneEssence);
		reg(ModItems.FireEssence);
		reg(ModItems.ExperienceEssence);
		reg(ModItems.EmeraldEssence);
		reg(ModItems.EarthEssence);
		reg(ModItems.DyeEssence);
		reg(ModItems.AirEssence);
		reg(ModItems.WaterEssence);
		reg(ModItems.MinicioEssence);
		reg(ModItems.DonutEssence);

		reg(ModItems.BlazeEssence);
        reg(ModItems.ChickenEssence);
        reg(ModItems.CowEssence);
		reg(ModItems.CreeperEssence);
        reg(ModItems.EnderEssence);
        reg(ModItems.GhastEssence);
        reg(ModItems.PigEssence);
        reg(ModItems.SheepEssence);
        reg(ModItems.SkeletonEssence);
        reg(ModItems.SlimeEssence);
        reg(ModItems.SpiderEssence);
        reg(ModItems.WitherEssence);
		reg(ModItems.ZombieEssence);

		// Crafting Essence

		reg(ModItems.AccioEssence);
		reg(ModItems.CrucioEssence);
		reg(ModItems.ImperioEssence);
		reg(ModItems.ZivicioEssence);

		// Infusion Stones

		reg(ModItems.InfusionStoneT1);
		reg(ModItems.InfusionStoneT2);
		reg(ModItems.InfusionStoneT3);
		reg(ModItems.InfusionStoneT4);
		reg(ModItems.InfusionStoneT5);

		// Food

		reg(ModItems.Donut);

		// Tools

		reg(ModItems.ZivicioSword);
		reg(ModItems.AccioSword);
		reg(ModItems.CrucioSword);
		reg(ModItems.ImperioSword);


			
        if(Loader.isModLoaded("FunOres") || Loader.isModLoaded("forestry")||Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("tconstruct")){
			reg(ModSeeds.CopperSeeds);
	        reg(ModSeeds.TinSeeds);
	        reg(ModSeeds.LeadSeeds);
	        reg(ModSeeds.SilverSeeds);
	        	 
	        reg(ModItems.CopperEssence);
	        reg(ModItems.TinEssence);
	        reg(ModItems.LeadEssence);
	        reg(ModItems.SilverEssence);

	        reg(ModItems.CopperIngot);
	        reg(ModItems.TinIngot);
	        reg(ModItems.LeadIngot);
	        reg(ModItems.SilverIngot);
	        	 
		}

		if(Loader.isModLoaded("Mekanism")) {
			 reg(ModSeeds.OsmiumSeeds);
			 reg(ModItems.OsmiumEssence);
             reg(ModItems.OsmiumIngot);
		}


		}
		
	    public static void reg(Item item) {
	        ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");

	        ModelLoader.setCustomModelResourceLocation(item, 0, res);
	    }
}
