package killbait.PrimordialCrops.Registry;

import killbait.PrimordialCrops.Config.PrimordialConfig;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;

public class ItemRenderRegistry {


	public static void registerItemRenderer() {

		// Vanilla/Elemental Seeds

		reg(ModCrops.MinicioSeeds);
		reg(ModCrops.MinicioEssence);

		if (PrimordialConfig.enableAirCrop) {
			reg(ModCrops.AirSeeds);
			reg(ModCrops.AirEssence);
		}
		if (PrimordialConfig.enableBlazeCrop) {
			reg(ModCrops.BlazeSeeds);
			reg(ModCrops.BlazeEssence);
		}
		if (PrimordialConfig.enableDiamondCrop) {
			reg(ModCrops.DiamondSeeds);
			reg(ModCrops.DiamondEssence);
		}
		if (PrimordialConfig.enableIronCrop) {
			reg(ModCrops.IronSeeds);
			reg(ModCrops.IronEssence);
		}
		if (PrimordialConfig.enableGoldCrop) {
			reg(ModCrops.GoldSeeds);
			reg(ModCrops.GoldEssence);
		}
		if (PrimordialConfig.enableCoalCrop) {
			reg(ModCrops.CoalSeeds);
			reg(ModCrops.CoalEssence);
		}
		if (PrimordialConfig.enableRedstoneCrop) {
			reg(ModCrops.RedstoneSeeds);
			reg(ModCrops.RedstoneEssence);
		}
		if (PrimordialConfig.enableQuartzCrop) {
			reg(ModCrops.QuartzSeeds);
			reg(ModCrops.QuartzEssence);
		}
		if (PrimordialConfig.enableObsidianCrop) {
			reg(ModCrops.ObsidianSeeds);
			reg(ModCrops.ObsidianEssence);
		}
		if (PrimordialConfig.enableNetherCrop) {
			reg(ModCrops.NetherSeeds);
			reg(ModCrops.NetherEssence);
		}
		if (PrimordialConfig.enableNatureCrop) {
			reg(ModCrops.NatureSeeds);
			reg(ModCrops.NatureEssence);
		}
		if (PrimordialConfig.enableLapisCrop) {
			reg(ModCrops.LapisSeeds);
			reg(ModCrops.LapisEssence);
		}
		if (PrimordialConfig.enableGlowstoneCrop) {
			reg(ModCrops.GlowstoneSeeds);
			reg(ModCrops.GlowstoneEssence);
		}
		if (PrimordialConfig.enableFireCrop) {
			reg(ModCrops.FireSeeds);
			reg(ModCrops.FireEssence);
		}
		if (PrimordialConfig.enableExperienceCrop) {
			reg(ModCrops.ExperienceSeeds);
			reg(ModCrops.ExperienceEssence);
		}
		if (PrimordialConfig.enableEmeraldCrop) {
			reg(ModCrops.EmeraldSeeds);
			reg(ModCrops.EmeraldEssence);
		}
		if (PrimordialConfig.enableEarthCrop) {
			reg(ModCrops.EarthSeeds);
			reg(ModCrops.EarthEssence);
		}
		if (PrimordialConfig.enableDyeCrop) {
			reg(ModCrops.DyeSeeds);
			reg(ModCrops.DyeEssence);
		}
		if (PrimordialConfig.enableWaterCrop) {
			reg(ModCrops.WaterSeeds);
			reg(ModCrops.WaterEssence);
		}
		if (PrimordialConfig.enablePrismarineShardCrop) {
			reg(ModCrops.PrismarineShardSeeds);
			reg(ModCrops.PrismarineShardEssence);
		}

		// Special Seeds

		if (PrimordialConfig.enableNetherCrop) {
			reg(ModCrops.NetherStarSeeds);
			reg(ModCrops.NetherStarEssence);
		}
		if (PrimordialConfig.enableDragonEggCrop) {
			reg(ModCrops.DragonEggSeeds);
			reg(ModCrops.DragonEggEssence);
		}

		// Food Seeds

		if (PrimordialConfig.enableDonutCrop) {
			reg(ModCrops.DonutSeeds);
			reg(ModCrops.Donut);
			reg(ModCrops.DonutEssence);
		}

		if (PrimordialConfig.enableCakeCrop) {
			reg(ModCrops.CakeSeeds);
			reg(ModCrops.CakeEssence);
		}

		// Mob Seeds

		if (PrimordialConfig.enableChickenCrop) {
			reg(ModCrops.ChickenSeeds);
			reg(ModCrops.ChickenEssence);
		}
		if (PrimordialConfig.enableCowCrop) {
			reg(ModCrops.CowSeeds);
			reg(ModCrops.CowEssence);

		}
		if (PrimordialConfig.enableCreeperCrop) {
			reg(ModCrops.CreeperSeeds);
			reg(ModCrops.CreeperEssence);
		}
		if (PrimordialConfig.enableEnderCrop) {
			reg(ModCrops.EnderSeeds);
			reg(ModCrops.EnderEssence);
		}
		if (PrimordialConfig.enableGhastCrop) {
			reg(ModCrops.GhastSeeds);
			reg(ModCrops.GhastEssence);
		}
		if (PrimordialConfig.enablePigCrop) {
			reg(ModCrops.PigSeeds);
			reg(ModCrops.PigEssence);
		}
		if (PrimordialConfig.enableSheepCrop) {
			reg(ModCrops.SheepSeeds);
			reg(ModCrops.SheepEssence);
		}
		if (PrimordialConfig.enableSkeletonCrop) {
			reg(ModCrops.SkeletonSeeds);
			reg(ModCrops.SkeletonEssence);
		}
		if (PrimordialConfig.enableSlimeCrop) {
			reg(ModCrops.SlimeSeeds);
			reg(ModCrops.SlimeEssence);
		}
		if (PrimordialConfig.enableSpiderCrop) {
			reg(ModCrops.SpiderSeeds);
			reg(ModCrops.SpiderEssence);
		}
		if (PrimordialConfig.enableWitherCrop) {
			reg(ModCrops.WitherSeeds);
			reg(ModCrops.WitherEssence);
		}
		if (PrimordialConfig.enableZombieCrop) {
			reg(ModCrops.ZombieSeeds);
			reg(ModCrops.ZombieEssence);
		}

		// Mod Support

		if (Loader.isModLoaded("tconstruct")) {
			if (PrimordialConfig.enableArditeCrop) {
				reg(ModCrops.ArditeSeeds);
				reg(ModCrops.ArditeEssence);
			}
			if (PrimordialConfig.enableCobaltCrop) {
				reg(ModCrops.CobaltSeeds);
				reg(ModCrops.CobaltEssence);
			}
			if (PrimordialConfig.enableManyullynCrop) {
				reg(ModCrops.ManyullynSeeds);
				reg(ModCrops.ManyullynEssence);
			}
			if (PrimordialConfig.enableKnightSlimeCrop) {
				reg(ModCrops.KnightSlimeSeeds);
				reg(ModCrops.KnightSlimeEssence);
			}
			if (PrimordialConfig.enablePigIronCrop) {
				reg(ModCrops.PigIronSeeds);
				reg(ModCrops.PigIronEssence);
			}
		}

		if (Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableAluminumCrop) {
				reg(ModCrops.AluminumSeeds);
				reg(ModCrops.AluminumEssence);
			}
			if (PrimordialConfig.enableNickelCrop) {
				reg(ModCrops.NickelSeeds);
				reg(ModCrops.NickelEssence);
			}
			if (PrimordialConfig.enableElectrumCrop) {
				reg(ModCrops.ElectrumSeeds);
				reg(ModCrops.ElectrumEssence);
			}
			if (PrimordialConfig.enableConstantanCrop) {
				reg(ModCrops.ConstantanSeeds);
				reg(ModCrops.ConstantanEssence);
			}
		}

		if (Loader.isModLoaded("botania") || Loader.isModLoaded("Botania")) {
			if (PrimordialConfig.enableManaSteelCrop) {
				reg(ModCrops.ManaSteelSeeds);
				reg(ModCrops.ManaSteelEssence);
			}
			if (PrimordialConfig.enableTerraSteelCrop) {
				reg(ModCrops.TerraSteelSeeds);
				reg(ModCrops.TerraSteelEssence);
			}
			if (PrimordialConfig.enableElementiumCrop) {
				reg(ModCrops.ElementiumSeeds);
				reg(ModCrops.ElementiumEssence);
			}
		}

		if (Loader.isModLoaded("IC2")) {
			if (PrimordialConfig.enableRubberCrop) {
				reg(ModCrops.RubberSeeds);
				reg(ModCrops.RubberEssence);
			}
		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableUraniumCrop) {
				reg(ModCrops.UraniumSeeds);
				reg(ModCrops.UraniumEssence);
			}
			if (PrimordialConfig.enableSteelCrop) {
				reg(ModCrops.SteelSeeds);
				reg(ModCrops.SteelEssence);
				reg(ModCrops.SteelIngot);
			}

		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("forestry")) {
			if (PrimordialConfig.enableBronzeCrop) {
				reg(ModCrops.BronzeSeeds);
				reg(ModCrops.BronzeEssence);
				reg(ModCrops.BronzeIngot);
			}
		}

		if (Loader.isModLoaded("forestry")) {
			if (PrimordialConfig.enableApatiteCrop) {
				reg(ModCrops.ApatiteSeeds);
				reg(ModCrops.ApatiteEssence);
			}
		}

		if (Loader.isModLoaded("bigreactors")) {
			if (PrimordialConfig.enableYelloriteCrop) {
				reg(ModCrops.YelloriteSeeds);
				reg(ModCrops.YelloriteEssence);
			}
			if (PrimordialConfig.enableLudicriteCrop) {
				reg(ModCrops.LudicriteSeeds);
				reg(ModCrops.LudicriteEssence);
			}
			if (PrimordialConfig.enableCyaniteCrop) {
				reg(ModCrops.CyaniteSeeds);
				reg(ModCrops.CyaniteEssence);
			}
			if (PrimordialConfig.enableBlutoniumCrop) {
				reg(ModCrops.BlutoniumSeeds);
				reg(ModCrops.BlutoniumEssence);
			}
		}


		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("forestry") || Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableCopperCrop) {
				reg(ModCrops.CopperSeeds);
				reg(ModCrops.CopperEssence);
				reg(ModCrops.CopperIngot);
			}
			if (PrimordialConfig.enableTinCrop) {
				reg(ModCrops.TinSeeds);
				reg(ModCrops.TinEssence);
				reg(ModCrops.TinIngot);
			}
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableSilverCrop) {
				reg(ModCrops.SilverSeeds);
				reg(ModCrops.SilverEssence);
				reg(ModCrops.SilverIngot);
			}
			if (PrimordialConfig.enableLeadCrop) {
				reg(ModCrops.LeadSeeds);
				reg(ModCrops.LeadEssence);
				reg(ModCrops.LeadIngot);
			}
		}

		if (Loader.isModLoaded("Mekanism")) {
			if (PrimordialConfig.enableOsmiumCrop) {
				reg(ModCrops.OsmiumSeeds);
				reg(ModCrops.OsmiumEssence);
				reg(ModCrops.OsmiumIngot);
			}
		}

		if (Loader.isModLoaded("draconicevolution")) {
			if (PrimordialConfig.enableDraconiumCrop) {
				reg(ModCrops.DraconiumSeeds);
				reg(ModCrops.DraconiumEssence);
			}
			if (PrimordialConfig.enableAwakeDraconiumCrop) {
				reg(ModCrops.AwakeDraconiumSeeds);
				reg(ModCrops.AwakeDraconiumEssence);
			}
		}

		if (Loader.isModLoaded("appliedenergistics2")) {
			if (PrimordialConfig.enableCertusCrop) {
				reg(ModCrops.CertusQuartzSeeds);
				reg(ModCrops.CertusQuartzEssence);
			}
			if (PrimordialConfig.enableFluixCrop) {
				reg(ModCrops.FluixSeeds);
				reg(ModCrops.FluixEssence);
			}
		}

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


		// Tools

		if (PrimordialConfig.enableWeapons) {
			reg(ModItems.ZivicioSword);
			reg(ModItems.AccioSword);
			reg(ModItems.CrucioSword);
			reg(ModItems.ImperioSword);
		}

		if (PrimordialConfig.enableIngameBook) {
			reg(ModItems.PrimordialBook);
		}

	}

	public static void reg(Item item) {
		ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");

		ModelLoader.setCustomModelResourceLocation(item, 0, res);
	}
}
