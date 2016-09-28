package killbait.PrimordialCrops.Registry;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;

public class ItemRenderRegistry {


	public static void registerItemRenderer() {

		// Vanilla/Elemental Seeds
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

		// Special Seeds

		reg(ModSeeds.NetherStarSeeds);
		reg(ModSeeds.DragonEggSeeds);

		// Mob Seeds

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


		// Vanilla/Elemental Essence

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

		// Special Essence

		reg(ModItems.NetherStarEssence);
		reg(ModItems.DragonEggEssence);

		// Mob Essence

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

		reg(ModSeeds.DonutSeeds);
		reg(ModItems.Donut);
		reg(ModItems.DonutEssence);

		reg(ModSeeds.CakeSeeds);
		reg(ModItems.CakeEssence);
		// Tools

		reg(ModItems.ZivicioSword);
		reg(ModItems.AccioSword);
		reg(ModItems.CrucioSword);
		reg(ModItems.ImperioSword);

		// Mod Support

		if (Loader.isModLoaded("tconstruct")) {
			reg(ModSeeds.ArditeSeeds);
			reg(ModItems.ArditeEssence);
			reg(ModSeeds.CobaltSeeds);
			reg(ModItems.CobaltEssence);
			reg(ModSeeds.ManyullynSeeds);
			reg(ModItems.ManyullynEssence);
			reg(ModSeeds.KnightSlimeSeeds);
			reg(ModItems.KnightSlimeEssence);
			reg(ModSeeds.PigIronSeeds);
			reg(ModItems.PigIronEssence);
		}

		if (Loader.isModLoaded("immersiveengineering")) {
			reg(ModSeeds.AluminumSeeds);
			reg(ModItems.AluminumEssence);
			reg(ModSeeds.NickelSeeds);
			reg(ModItems.NickelEssence);
			reg(ModSeeds.ElectrumSeeds);
			reg(ModItems.ElectrumEssence);


			reg(ModSeeds.ConstantanSeeds);
			reg(ModItems.ConstantanEssence);
		}

		if (Loader.isModLoaded("botania") || Loader.isModLoaded("Botania")) {
			reg(ModSeeds.ManaSteelSeeds);
			reg(ModItems.ManaSteelEssence);
			reg(ModSeeds.TerraSteelSeeds);
			reg(ModItems.TerraSteelEssence);
			reg(ModSeeds.ElementiumSeeds);
			reg(ModItems.ElementiumEssence);
		}

		if (Loader.isModLoaded("IC2")) {
			reg(ModSeeds.RubberSeeds);
			reg(ModItems.RubberEssence);
		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("immersiveengineering")) {
			reg(ModSeeds.UraniumSeeds);
			reg(ModItems.UraniumEssence);
			reg(ModSeeds.SteelSeeds);
			reg(ModItems.SteelEssence);
			reg(ModItems.SteelIngot);

		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("forestry")) {
			reg(ModSeeds.BronzeSeeds);
			reg(ModItems.BronzeEssence);
			reg(ModItems.BronzeIngot);
		}

		if (Loader.isModLoaded("forestry")) {
			reg(ModSeeds.ApatiteSeeds);
			reg(ModItems.ApatiteEssence);
		}

		if (Loader.isModLoaded("bigreactors")) {
			reg(ModSeeds.YelloriteSeeds);
			reg(ModItems.YelloriteEssence);
			reg(ModSeeds.LudicriteSeeds);
			reg(ModItems.LudicriteEssence);
			reg(ModSeeds.CyaniteSeeds);
			reg(ModItems.CyaniteEssence);
			reg(ModSeeds.BlutoniumSeeds);
			reg(ModItems.BlutoniumEssence);
		}


		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("forestry") || Loader.isModLoaded("immersiveengineering")) {
			reg(ModSeeds.CopperSeeds);
			reg(ModItems.CopperEssence);
			reg(ModItems.CopperIngot);
			reg(ModSeeds.TinSeeds);
			reg(ModItems.TinEssence);
			reg(ModItems.TinIngot);
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("immersiveengineering")) {
			reg(ModSeeds.SilverSeeds);
			reg(ModItems.SilverEssence);
			reg(ModItems.SilverIngot);
			reg(ModSeeds.LeadSeeds);
			reg(ModItems.LeadEssence);
			reg(ModItems.LeadIngot);
		}

		if (Loader.isModLoaded("Mekanism")) {
			reg(ModSeeds.OsmiumSeeds);
			reg(ModItems.OsmiumEssence);
			reg(ModItems.OsmiumIngot);
		}

		if (Loader.isModLoaded("draconicevolution")) {
			reg(ModSeeds.DraconiumSeeds);
			reg(ModItems.DraconiumEssence);
			reg(ModSeeds.AwakeDraconiumSeeds);
			reg(ModItems.AwakeDraconiumEssence);
		}


	}

	public static void reg(Item item) {
		ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");

		ModelLoader.setCustomModelResourceLocation(item, 0, res);
	}
}
