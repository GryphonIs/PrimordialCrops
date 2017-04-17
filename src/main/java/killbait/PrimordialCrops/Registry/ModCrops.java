package killbait.PrimordialCrops.Registry;

import killbait.PrimordialCrops.Blocks.CropBlocks;
import killbait.PrimordialCrops.Blocks.CropBlocksSpecial;
import killbait.PrimordialCrops.Blocks.PrimordialBlock;
import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.Items.Donut;
import killbait.PrimordialCrops.Items.PrimordialCropsItem;
import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Seeds.CropSeeds;
import killbait.PrimordialCrops.Seeds.CropSeedsSpecial;
import killbait.PrimordialCrops.Utils.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

/**
 * Created by Jon on 30/09/2016.
 */
public class ModCrops {

	public static HashMap<CropBlocks, Item> seedsMap = new HashMap<CropBlocks, Item>();
	public static HashMap<CropBlocks, Item> harvestedItemMap = new HashMap<CropBlocks, Item>();

	public static HashMap<CropBlocksSpecial, Item> seedsMapSpecial = new HashMap<CropBlocksSpecial, Item>();
	public static HashMap<CropBlocksSpecial, Item> harvestedItemMapSpecial = new HashMap<CropBlocksSpecial, Item>();

	public static Block MinicioCrop;
	public static Item MinicioSeeds;
	public static Item MinicioEssence;


	public static Block AirCrop;
	public static Item AirEssence;
	public static Item AirSeeds;

	public static Block EarthCrop;
	public static Item EarthSeeds;
	public static Item EarthEssence;

	public static Block FireCrop;
	public static Item FireSeeds;
	public static Item FireEssence;

	public static Block WaterCrop;
	public static Item WaterSeeds;
	public static Item WaterEssence;

	public static Block NatureCrop;
	public static Item NatureSeeds;
	public static Item NatureEssence;

	public static Block NetherCrop;
	public static Item NetherSeeds;
	public static Item NetherEssence;

	public static Block CoalCrop;
	public static Item CoalSeeds;
	public static Item CoalEssence;

	public static Block DiamondCrop;
	public static Item DiamondSeeds;
	public static Item DiamondEssence;

	public static Block DyeCrop;
	public static Item DyeSeeds;
	public static Item DyeEssence;

	public static Block EmeraldCrop;
	public static Item EmeraldSeeds;
	public static Item EmeraldEssence;

	public static Block ExperienceCrop;
	public static Item ExperienceSeeds;
	public static Item ExperienceEssence;

	public static Block GlowstoneCrop;
	public static Item GlowstoneSeeds;
	public static Item GlowstoneEssence;

	public static Block GoldCrop;
	public static Item GoldSeeds;
	public static Item GoldEssence;

	public static Block IronCrop;
	public static Item IronSeeds;
	public static Item IronEssence;

	public static Block LapisCrop;
	public static Item LapisSeeds;
	public static Item LapisEssence;

	public static Block ObsidianCrop;
	public static Item ObsidianSeeds;
	public static Item ObsidianEssence;

	public static Block QuartzCrop;
	public static Item QuartzSeeds;
	public static Item QuartzEssence;

	public static Block RedstoneCrop;
	public static Item RedstoneSeeds;
	public static Item RedstoneEssence;

	public static Block PrismarineShardCrop;
	public static Item PrismarineShardSeeds;
	public static Item PrismarineShardEssence;

	//
	// Mob Crops
	//
	public static Block BlazeCrop;
	public static Item BlazeSeeds;
	public static Item BlazeEssence;

	public static Block ChickenCrop;
	public static Item ChickenSeeds;
	public static Item ChickenEssence;

	public static Block CowCrop;
	public static Item CowSeeds;
	public static Item CowEssence;

	public static Block CreeperCrop;
	public static Item CreeperSeeds;
	public static Item CreeperEssence;

	public static Block EnderCrop;
	public static Item EnderSeeds;
	public static Item EnderEssence;

	public static Block GhastCrop;
	public static Item GhastSeeds;
	public static Item GhastEssence;

	public static Block PigCrop;
	public static Item PigSeeds;
	public static Item PigEssence;

	public static Block SheepCrop;
	public static Item SheepSeeds;
	public static Item SheepEssence;

	public static Block SkeletonCrop;
	public static Item SkeletonSeeds;
	public static Item SkeletonEssence;

	public static Block SlimeCrop;
	public static Item SlimeSeeds;
	public static Item SlimeEssence;

	public static Block SpiderCrop;
	public static Item SpiderSeeds;
	public static Item SpiderEssence;

	public static Block WitherCrop;
	public static Item WitherSeeds;
	public static Item WitherEssence;

	public static Block ZombieCrop;
	public static Item ZombieSeeds;
	public static Item ZombieEssence;

	// Special Crops
	public static Block DragonEggCrop;
	public static Item DragonEggSeeds;
	public static Item DragonEggEssence;

	public static Block NetherStarCrop;
	public static Item NetherStarSeeds;
	public static Item NetherStarEssence;


	// Food
	public static Block CakeCrop;
	public static Item CakeSeeds;
	public static Item CakeEssence;

	public static Item Donut;
	public static Block DonutCrop;
	public static Item DonutSeeds;
	public static Item DonutEssence;

	// Mod Crops
	public static Block ArditeCrop;
	public static Item ArditeSeeds;
	public static Item ArditeEssence;

	public static Block CobaltCrop;
	public static Item CobaltSeeds;
	public static Item CobaltEssence;

	public static Block ManyullynCrop;
	public static Item ManyullynSeeds;
	public static Item ManyullynEssence;

	public static Block KnightSlimeCrop;
	public static Item KnightSlimeSeeds;
	public static Item KnightSlimeEssence;

	public static Block PigIronCrop;
	public static Item PigIronSeeds;
	public static Item PigIronEssence;

	public static Block AluminumCrop;
	public static Item AluminumSeeds;
	public static Item AluminumEssence;

	public static Block NickelCrop;
	public static Item NickelSeeds;
	public static Item NickelEssence;

	public static Block ElectrumCrop;
	public static Item ElectrumSeeds;
	public static Item ElectrumEssence;

	public static Block ConstantanCrop;
	public static Item ConstantanSeeds;
	public static Item ConstantanEssence;

	public static Block ManaSteelCrop;
	public static Item ManaSteelSeeds;
	public static Item ManaSteelEssence;

	public static Block TerraSteelCrop;
	public static Item TerraSteelSeeds;
	public static Item TerraSteelEssence;

	public static Block ElementiumCrop;
	public static Item ElementiumSeeds;
	public static Item ElementiumEssence;

	public static Block RubberCrop;
	public static Item RubberSeeds;
	public static Item RubberEssence;

	public static Block UraniumCrop;
	public static Item UraniumSeeds;
	public static Item UraniumEssence;

	public static Block SteelCrop;
	public static Item SteelSeeds;
	public static Item SteelEssence;
	public static Item SteelIngot;

	public static Block BronzeCrop;
	public static Item BronzeSeeds;
	public static Item BronzeEssence;
	public static Item BronzeIngot;

	public static Block ApatiteCrop;
	public static Item ApatiteSeeds;
	public static Item ApatiteEssence;

	public static Block YelloriteCrop;
	public static Item YelloriteSeeds;
	public static Item YelloriteEssence;

	public static Block LudicriteCrop;
	public static Item LudicriteSeeds;
	public static Item LudicriteEssence;

	public static Block CyaniteCrop;
	public static Item CyaniteSeeds;
	public static Item CyaniteEssence;

	public static Block BlutoniumCrop;
	public static Item BlutoniumSeeds;
	public static Item BlutoniumEssence;

	public static Block CopperCrop;
	public static Item CopperSeeds;
	public static Item CopperEssence;
	public static Item CopperIngot;

	public static Block TinCrop;
	public static Item TinSeeds;
	public static Item TinEssence;
	public static Item TinIngot;

	public static Block SilverCrop;
	public static Item SilverSeeds;
	public static Item SilverEssence;
	public static Item SilverIngot;

	public static Block LeadCrop;
	public static Item LeadSeeds;
	public static Item LeadEssence;
	public static Item LeadIngot;

	public static Block OsmiumCrop;
	public static Item OsmiumSeeds;
	public static Item OsmiumEssence;
	public static Item OsmiumIngot;

	public static Block DraconiumCrop;
	public static Item DraconiumSeeds;
	public static Item DraconiumEssence;

	public static Block AwakeDraconiumCrop;
	public static Item AwakeDraconiumSeeds;
	public static Item AwakeDraconiumEssence;

	public static Block CertusQuartzCrop;
	public static Item CertusQuartzSeeds;
	public static Item CertusQuartzEssence;

	public static Block FluixCrop;
	public static Item FluixSeeds;
	public static Item FluixEssence;


	public static void init() {

		MinicioCrop = registerBlockCrop("MinicioCrop");
		MinicioSeeds = regSeeds("MinicioSeeds", MinicioCrop);
		MinicioEssence = regHarvestItem("MinicioEssence", MinicioCrop);

		if (PrimordialConfig.enableAirCrop) {
			AirCrop = registerBlockCrop("AirCrop");
			AirSeeds = regSeeds("AirSeeds", AirCrop);
			AirEssence = regHarvestItem("AirEssence", AirCrop);
		}
		if (PrimordialConfig.enableEarthCrop) {
			EarthCrop = registerBlockCrop("EarthCrop");
			EarthSeeds = regSeeds("EarthSeeds", EarthCrop);
			EarthEssence = regHarvestItem("EarthEssence", EarthCrop);
		}
		if (PrimordialConfig.enableFireCrop) {
			FireCrop = registerBlockCrop("FireCrop");
			FireSeeds = regSeeds("FireSeeds", FireCrop);
			FireEssence = regHarvestItem("FireEssence", FireCrop);
		}
		if (PrimordialConfig.enableWaterCrop) {
			WaterCrop = registerBlockCrop("WaterCrop");
			WaterSeeds = regSeeds("WaterSeeds", WaterCrop);
			WaterEssence = regHarvestItem("WaterEssence", WaterCrop);
		}
		if (PrimordialConfig.enableNatureCrop) {
			NatureCrop = registerBlockCrop("NatureCrop");
			NatureSeeds = regSeeds("NatureSeeds", NatureCrop);
			NatureEssence = regHarvestItem("NatureEssence", NatureCrop);
		}
		if (PrimordialConfig.enableNetherCrop) {
			NetherCrop = registerBlockCrop("NetherCrop");
			NetherSeeds = regSeeds("NetherSeeds", NetherCrop);
			NetherEssence = regHarvestItem("NetherEssence", NetherCrop);
		}
		if (PrimordialConfig.enableCoalCrop) {
			CoalCrop = registerBlockCrop("CoalCrop");
			CoalSeeds = regSeeds("CoalSeeds", CoalCrop);
			CoalEssence = regHarvestItem("CoalEssence", CoalCrop);
		}
		if (PrimordialConfig.enableDiamondCrop) {
			DiamondCrop = registerBlockCrop("DiamondCrop");
			DiamondSeeds = regSeeds("DiamondSeeds", DiamondCrop);
			DiamondEssence = regHarvestItem("DiamondEssence", DiamondCrop);
		}
		if (PrimordialConfig.enableDyeCrop) {
			DyeCrop = registerBlockCrop("DyeCrop");
			DyeSeeds = regSeeds("DyeSeeds", DyeCrop);
			DyeEssence = regHarvestItem("DyeEssence", DyeCrop);
		}
		if (PrimordialConfig.enableEmeraldCrop) {
			EmeraldCrop = registerBlockCrop("EmeraldCrop");
			EmeraldSeeds = regSeeds("EmeraldSeeds", EmeraldCrop);
			EmeraldEssence = regHarvestItem("EmeraldEssence", EmeraldCrop);
		}
		if (PrimordialConfig.enableExperienceCrop) {
			ExperienceCrop = registerBlockCrop("ExperienceCrop");
			ExperienceSeeds = regSeeds("ExperienceSeeds", ExperienceCrop);
			ExperienceEssence = regHarvestItem("ExperienceEssence", ExperienceCrop);
		}
		if (PrimordialConfig.enableGlowstoneCrop) {
			GlowstoneCrop = registerBlockCrop("GlowstoneCrop");
			GlowstoneSeeds = regSeeds("GlowstoneSeeds", GlowstoneCrop);
			GlowstoneEssence = regHarvestItem("GlowstoneEssence", GlowstoneCrop);
		}
		if (PrimordialConfig.enableGoldCrop) {
			GoldCrop = registerBlockCrop("GoldCrop");
			GoldSeeds = regSeeds("GoldSeeds", GoldCrop);
			GoldEssence = regHarvestItem("GoldEssence", GoldCrop);
		}
		if (PrimordialConfig.enableIronCrop) {
			IronCrop = registerBlockCrop("IronCrop");
			IronSeeds = regSeeds("IronSeeds", IronCrop);
			IronEssence = regHarvestItem("IronEssence", IronCrop);
		}
		if (PrimordialConfig.enableLapisCrop) {
			LapisCrop = registerBlockCrop("LapisCrop");
			LapisSeeds = regSeeds("LapisSeeds", LapisCrop);
			LapisEssence = regHarvestItem("LapisEssence", LapisCrop);
		}
		if (PrimordialConfig.enableObsidianCrop) {
			ObsidianCrop = registerBlockCrop("ObsidianCrop");
			ObsidianSeeds = regSeeds("ObsidianSeeds", ObsidianCrop);
			ObsidianEssence = regHarvestItem("ObsidianEssence", ObsidianCrop);
		}
		if (PrimordialConfig.enableQuartzCrop) {
			QuartzCrop = registerBlockCrop("QuartzCrop");
			QuartzSeeds = regSeeds("QuartzSeeds", QuartzCrop);
			QuartzEssence = regHarvestItem("QuartzEssence", QuartzCrop);
		}
		if (PrimordialConfig.enableRedstoneCrop) {
			RedstoneCrop = registerBlockCrop("RedstoneCrop");
			RedstoneSeeds = regSeeds("RedstoneSeeds", RedstoneCrop);
			RedstoneEssence = regHarvestItem("RedstoneEssence", RedstoneCrop);
		}

		if (PrimordialConfig.enablePrismarineShardCrop) {
			PrismarineShardCrop = registerBlockCrop("PrismarineShardCrop");
			PrismarineShardSeeds = regSeeds("PrismarineShardSeeds", PrismarineShardCrop);
			PrismarineShardEssence = regHarvestItem("PrismarineShardEssence", PrismarineShardCrop);
		}

		//-----------------------------------------------------
		// Mob Crops
		//-----------------------------------------------------

		if (PrimordialConfig.enableBlazeCrop) {
			BlazeCrop = registerBlockCrop("BlazeCrop");
			BlazeSeeds = regSeeds("BlazeSeeds", BlazeCrop);
			BlazeEssence = regHarvestItem("BlazeEssence", BlazeCrop);
		}
		if (PrimordialConfig.enableChickenCrop) {
			ChickenCrop = registerBlockCrop("ChickenCrop");
			ChickenSeeds = regSeeds("ChickenSeeds", ChickenCrop);
			ChickenEssence = regHarvestItem("ChickenEssence", ChickenCrop);
		}
		if (PrimordialConfig.enableCowCrop) {
			CowCrop = registerBlockCrop("CowCrop");
			CowSeeds = regSeeds("CowSeeds", CowCrop);
			CowEssence = regHarvestItem("CowEssence", CowCrop);
		}
		if (PrimordialConfig.enableCreeperCrop) {
			CreeperCrop = registerBlockCrop("CreeperCrop");
			CreeperSeeds = regSeeds("CreeperSeeds", CreeperCrop);
			CreeperEssence = regHarvestItem("CreeperEssence", CreeperCrop);
		}
		if (PrimordialConfig.enableEnderCrop) {
			EnderCrop = registerBlockCrop("EndermanCrop");
			EnderSeeds = regSeeds("EnderSeeds", EnderCrop);
			EnderEssence = regHarvestItem("EnderEssence", EnderCrop);
		}
		if (PrimordialConfig.enableGhastCrop) {
			GhastCrop = registerBlockCrop("GhastCrop");
			GhastSeeds = regSeeds("GhastSeeds", GhastCrop);
			GhastEssence = regHarvestItem("GhastEssence", GhastCrop);
		}
		if (PrimordialConfig.enablePigCrop) {
			PigCrop = registerBlockCrop("PigCrop");
			PigSeeds = regSeeds("PigSeeds", PigCrop);
			PigEssence = regHarvestItem("PigEssence", PigCrop);
		}
		if (PrimordialConfig.enableSheepCrop) {
			SheepCrop = registerBlockCrop("SheepCrop");
			SheepSeeds = regSeeds("SheepSeeds", SheepCrop);
			SheepEssence = regHarvestItem("SheepEssence", SheepCrop);
		}
		if (PrimordialConfig.enableSkeletonCrop) {
			SkeletonCrop = registerBlockCrop("SkeletonCrop");
			SkeletonSeeds = regSeeds("SkeletonSeeds", SkeletonCrop);
			SkeletonEssence = regHarvestItem("SkeletonEssence", SkeletonCrop);
		}
		if (PrimordialConfig.enableSlimeCrop) {
			SlimeCrop = registerBlockCrop("SlimeCrop");
			SlimeSeeds = regSeeds("SlimeSeeds", SlimeCrop);
			SlimeEssence = regHarvestItem("SlimeEssence", SlimeCrop);
		}
		if (PrimordialConfig.enableSpiderCrop) {
			SpiderCrop = registerBlockCrop("SpiderCrop");
			SpiderSeeds = regSeeds("SpiderSeeds", SpiderCrop);
			SpiderEssence = regHarvestItem("SpiderEssence", SpiderCrop);
		}
		if (PrimordialConfig.enableWitherCrop) {
			WitherCrop = registerBlockCrop("WitherCrop");
			WitherSeeds = regSeeds("WitherSeeds", WitherCrop);
			WitherEssence = regHarvestItem("WitherEssence", WitherCrop);
		}
		if (PrimordialConfig.enableZombieCrop) {
			ZombieCrop = registerBlockCrop("ZombieCrop");
			ZombieSeeds = regSeeds("ZombieSeeds", ZombieCrop);
			ZombieEssence = regHarvestItem("ZombieEssence", ZombieCrop);
		}

		//-----------------------------------------------------
		// Special Crops
		//-----------------------------------------------------

		if (PrimordialConfig.enableDragonEggCrop) {
			DragonEggCrop = registerSpecialBlockCrop("DragonEggCrop");
			DragonEggSeeds = regSpecialSeeds("DragonEggSeeds", DragonEggCrop);
			DragonEggEssence = regSpecialHarvestItem("DragonEggEssence", DragonEggCrop);
		}
		if (PrimordialConfig.enableNetherCrop) {
			NetherStarCrop = registerSpecialBlockCrop("NetherStarCrop");
			NetherStarSeeds = regSpecialSeeds("NetherStarSeeds", NetherStarCrop);
			NetherStarEssence = regSpecialHarvestItem("NetherStarEssence", NetherStarCrop);
		}

		//-----------------------------------------------------
		// Food Crops
		//-----------------------------------------------------

		if (PrimordialConfig.enableCakeCrop) {
			CakeCrop = registerBlockCrop("CakeCrop");
			CakeSeeds = regSeeds("CakeSeeds", CakeCrop);
			CakeEssence = regHarvestItem("CakeEssence", CakeCrop);
		}
		if (PrimordialConfig.enableDonutCrop) {
			DonutCrop = registerBlockCrop("DonutCrop");
			DonutSeeds = regSeeds("DonutSeeds", DonutCrop);
			DonutEssence = regHarvestItem("DonutEssence", DonutCrop);
			Donut = new Donut(6, false);
			GameRegistry.register(Donut.setRegistryName("Donut"));
		}

		//-----------------------------------------------------
		// Mod Crops
		//-----------------------------------------------------

		if (Loader.isModLoaded("tconstruct")) {
			LogHelper.info("Tinkers Construct Detected, adding crops if config allows");
			if (PrimordialConfig.enableArditeCrop) {
				ArditeCrop = registerBlockCrop("ArditeCrop");
				ArditeSeeds = regSeeds("ArditeSeeds", ArditeCrop);
				ArditeEssence = regHarvestItem("ArditeEssence", ArditeCrop);
			}
			if (PrimordialConfig.enableCobaltCrop) {
				CobaltCrop = registerBlockCrop("CobaltCrop");
				CobaltSeeds = regSeeds("CobaltSeeds", CobaltCrop);
				CobaltEssence = regHarvestItem("CobaltEssence", CobaltCrop);
			}
			if (PrimordialConfig.enableManyullynCrop) {
				ManyullynCrop = registerBlockCrop("ManyullynCrop");
				ManyullynSeeds = regSeeds("ManyullynSeeds", ManyullynCrop);
				ManyullynEssence = regHarvestItem("ManyullynEssence", ManyullynCrop);
			}
			if (PrimordialConfig.enableKnightSlimeCrop) {
				KnightSlimeCrop = registerBlockCrop("KnightSlimeCrop");
				KnightSlimeSeeds = regSeeds("KnightSlimeSeeds", KnightSlimeCrop);
				KnightSlimeEssence = regHarvestItem("KnightSlimeEssence", KnightSlimeCrop);
			}
			if (PrimordialConfig.enablePigIronCrop) {
				PigIronCrop = registerBlockCrop("PigIronCrop");
				PigIronSeeds = regSeeds("PigIronSeeds", PigIronCrop);
				PigIronEssence = regHarvestItem("PigIronEssence", PigIronCrop);
			}
		}

		if (Loader.isModLoaded("immersiveengineering")) {
			LogHelper.info("Immersive Engineering Detected, adding crops if config allows");
			if (PrimordialConfig.enableAluminumCrop) {
				AluminumCrop = registerBlockCrop("AluminumCrop");
				AluminumSeeds = regSeeds("AluminumSeeds", AluminumCrop);
				AluminumEssence = regHarvestItem("AluminumEssence", AluminumCrop);
			}
			if (PrimordialConfig.enableNickelCrop) {
				NickelCrop = registerBlockCrop("NickelCrop");
				NickelSeeds = regSeeds("NickelSeeds", NickelCrop);
				NickelEssence = regHarvestItem("NickelEssence", NickelCrop);
			}
			if (PrimordialConfig.enableElectrumCrop) {
				ElectrumCrop = registerBlockCrop("ElectrumCrop");
				ElectrumSeeds = regSeeds("ElectrumSeeds", ElectrumCrop);
				ElectrumEssence = regHarvestItem("ElectrumEssence", ElectrumCrop);
			}
			if (PrimordialConfig.enableConstantanCrop) {
				ConstantanCrop = registerBlockCrop("ConstantanCrop");
				ConstantanSeeds = regSeeds("ConstantanSeeds", ConstantanCrop);
				ConstantanEssence = regHarvestItem("ConstantanEssence", ConstantanCrop);
			}
		}

		if (Loader.isModLoaded("botania") || Loader.isModLoaded("Botania")) {
			LogHelper.info("Botania Detected, adding crops if config allows");
			if (PrimordialConfig.enableManaSteelCrop) {
				ManaSteelCrop = registerBlockCrop("ManaSteelCrop");
				ManaSteelSeeds = regSeeds("ManaSteelSeeds", ManaSteelCrop);
				ManaSteelEssence = regHarvestItem("ManaSteelEssence", ManaSteelCrop);
			}
			if (PrimordialConfig.enableTerraSteelCrop) {
				TerraSteelCrop = registerBlockCrop("TerraSteelCrop");
				TerraSteelSeeds = regSeeds("TerraSteelSeeds", TerraSteelCrop);
				TerraSteelEssence = regHarvestItem("TerraSteelEssence", TerraSteelCrop);
			}
			if (PrimordialConfig.enableElementiumCrop) {
				ElementiumCrop = registerBlockCrop("ElementiumCrop");
				ElementiumSeeds = regSeeds("ElementiumSeeds", ElementiumCrop);
				ElementiumEssence = regHarvestItem("ElementiumEssence", ElementiumCrop);
			}
		}

		if (Loader.isModLoaded("IC2")) {
			LogHelper.info("IC2 Detected, adding crops if config allows");
			if (PrimordialConfig.enableRubberCrop) {
				RubberCrop = registerBlockCrop("RubberCrop");
				RubberSeeds = regSeeds("RubberSeeds", RubberCrop);
				RubberEssence = regHarvestItem("RubberEssence", RubberCrop);
			}

		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("immersiveengineering")) {

			if (PrimordialConfig.enableUraniumCrop) {
				UraniumCrop = registerBlockCrop("UraniumCrop");
				UraniumSeeds = regSeeds("UraniumSeeds", UraniumCrop);
				UraniumEssence = regHarvestItem("UraniumEssence", UraniumCrop);
			}
			if (PrimordialConfig.enableSteelCrop) {
				SteelCrop = registerBlockCrop("SteelCrop");
				SteelSeeds = regSeeds("SteelSeeds", SteelCrop);
				SteelEssence = regHarvestItem("SteelEssence", SteelCrop);
				SteelIngot = regCraftItem("SteelIngot");
			}
		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("forestry")) {
			if (PrimordialConfig.enableBronzeCrop) {
				BronzeCrop = registerBlockCrop("BronzeCrop");
				BronzeSeeds = regSeeds("BronzeSeeds", BronzeCrop);
				BronzeEssence = regHarvestItem("BronzeEssence", BronzeCrop);
				BronzeIngot = regCraftItem("BronzeIngot");
			}
		}

		if (Loader.isModLoaded("forestry")) {
			LogHelper.info("Forestry Detected, adding crops if config allows");
			if (PrimordialConfig.enableApatiteCrop) {
				ApatiteCrop = registerBlockCrop("ApatiteCrop");
				ApatiteSeeds = regSeeds("ApatiteSeeds", ApatiteCrop);
				ApatiteEssence = regHarvestItem("ApatiteEssence", ApatiteCrop);
			}
		}

		if (Loader.isModLoaded("bigreactors")) {
			LogHelper.info("Extreme Reactors Detected, adding crops if config allows");
			if (PrimordialConfig.enableYelloriteCrop) {
				YelloriteCrop = registerBlockCrop("YelloriteCrop");
				YelloriteSeeds = regSeeds("YelloriteSeeds", YelloriteCrop);
				YelloriteEssence = regHarvestItem("YelloriteEssence", YelloriteCrop);
			}
			if (PrimordialConfig.enableLudicriteCrop) {
				LudicriteCrop = registerBlockCrop("LudicriteCrop");
				LudicriteSeeds = regSeeds("LudicriteSeeds", LudicriteCrop);
				LudicriteEssence = regHarvestItem("LudicriteEssence", LudicriteCrop);
			}
			if (PrimordialConfig.enableCyaniteCrop) {
				CyaniteCrop = registerBlockCrop("CyaniteCrop");
				CyaniteSeeds = regSeeds("CyaniteSeeds", CyaniteCrop);
				CyaniteEssence = regHarvestItem("CyaniteEssence", CyaniteCrop);
			}
			if (PrimordialConfig.enableBlutoniumCrop) {
				BlutoniumCrop = registerBlockCrop("BlutoniumCrop");
				BlutoniumSeeds = regSeeds("BlutoniumSeeds", BlutoniumCrop);
				BlutoniumEssence = regHarvestItem("BlutoniumEssence", BlutoniumCrop);
			}
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("forestry") || Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableCopperCrop) {
				CopperCrop = registerBlockCrop("CopperCrop");
				CopperSeeds = regSeeds("CopperSeeds", CopperCrop);
				CopperEssence = regHarvestItem("CopperEssence", CopperCrop);
				CopperIngot = regCraftItem("CopperIngot");
			}
			if (PrimordialConfig.enableTinCrop) {
				TinCrop = registerBlockCrop("TinCrop");
				TinSeeds = regSeeds("TinSeeds", TinCrop);
				TinEssence = regHarvestItem("TinEssence", TinCrop);
				TinIngot = regCraftItem("TinIngot");
			}
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableSilverCrop) {
				SilverCrop = registerBlockCrop("SilverCrop");
				SilverSeeds = regSeeds("SilverSeeds", SilverCrop);
				SilverEssence = regHarvestItem("SilverEssence", SilverCrop);
				SilverIngot = regCraftItem("SilverIngot");
			}
			if (PrimordialConfig.enableLeadCrop) {
				LeadCrop = registerBlockCrop("LeadCrop");
				LeadSeeds = regSeeds("LeadSeeds", LeadCrop);
				LeadEssence = regHarvestItem("LeadEssence", LeadCrop);
				LeadIngot = regCraftItem("LeadIngot");
			}
		}

		if (Loader.isModLoaded("Mekanism")) {
			LogHelper.info("Mekanism Detected, adding crops if config allows");
			if (PrimordialConfig.enableOsmiumCrop) {
				OsmiumCrop = registerBlockCrop("OsmiumCrop");
				OsmiumSeeds = regSeeds("OsmiumSeeds", OsmiumCrop);
				OsmiumEssence = regHarvestItem("OsmiumEssence", OsmiumCrop);
				OsmiumIngot = regCraftItem("OsmiumIngot");
			}
		}

		if (Loader.isModLoaded("draconicevolution")) {
			LogHelper.info("Draconic Evolution Detected, adding crops if config allows");
			if (PrimordialConfig.enableDraconiumCrop) {
				DraconiumCrop = registerBlockCrop("DraconiumCrop");
				DraconiumSeeds = regSeeds("DraconiumSeeds", DraconiumCrop);
				DraconiumEssence = regHarvestItem("DraconiumEssence", DraconiumCrop);
			}
			if (PrimordialConfig.enableAwakeDraconiumCrop) {
				AwakeDraconiumCrop = registerBlockCrop("AwakeDraconiumCrop");
				AwakeDraconiumSeeds = regSeeds("AwakeDraconiumSeeds", AwakeDraconiumCrop);
				AwakeDraconiumEssence = regHarvestItem("AwakeDraconiumEssence", AwakeDraconiumCrop);
			}
		}

		if (Loader.isModLoaded("appliedenergistics2")) {
			LogHelper.info("AE2 Detected, adding crops if config allows");
			if (PrimordialConfig.enableCertusCrop) {
				CertusQuartzCrop = registerBlockCrop("CertusQuartzCrop");
				CertusQuartzSeeds = regSeeds("CertusQuartzSeeds", CertusQuartzCrop);
				CertusQuartzEssence = regHarvestItem("CertusQuartzEssence", CertusQuartzCrop);
			}
			if (PrimordialConfig.enableFluixCrop) {
				FluixCrop = registerBlockCrop("FluixCrop");
				FluixSeeds = regSeeds("FluixSeeds", FluixCrop);
				FluixEssence = regHarvestItem("FluixEssence", FluixCrop);
			}
		}

	}
	//
	// Block registry functions
	//

	private static Block registerSpecialBlockCrop(String regName) {
		final Block MagicalCrop = new CropBlocksSpecial(regName);
		//final ItemBlock itemBlock = new ItemBlock(MagicalCrop);

		return registerBlock(regName, null, MagicalCrop);
	}

	private static Block registerBlockCrop(String regName) {
		final Block MagicalCrop = new CropBlocks(regName);
		//final ItemBlock itemBlock = new ItemBlock(MagicalCrop);

		return registerBlock(regName, null, MagicalCrop);
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


	private static Block registerMiscBlock(String regName) {
		final Block MagicalBlock = new PrimordialBlock(regName);
		final ItemBlock itemBlock = new ItemBlock(MagicalBlock);

		return registerBlock(regName, itemBlock, MagicalBlock);
	}

	//
	// Item Registry Functions
	//

	public static Item regSpecialHarvestItem(String regName, Block crop) {
		Item item = register(new PrimordialCropsItem(regName, true));
		harvestedItemMapSpecial.put((CropBlocksSpecial) crop, item);
		return item;
	}

	public static Item regHarvestItem(String regName, Block crop) {
		Item item = register(new PrimordialCropsItem(regName, true));
		harvestedItemMap.put((CropBlocks) crop, item);
		return item;
	}

	public static Item regCraftItem(String regName) {
		Item item = register(new PrimordialCropsItem(regName));
		return item;
	}

	public static Item regCraftItemWithDamage(String regName, boolean hasDamage, int maxUses) {
		Item item = register(new PrimordialCropsItem(regName, hasDamage, maxUses, 1));
		return item;
	}

	//
	// Seed Registry Functions
	//

	public static Item regSpecialSeeds(String regName, Block crop) {

		CropSeedsSpecial item = new CropSeedsSpecial(crop, Blocks.FARMLAND, regName);
		seedsMapSpecial.put((CropBlocksSpecial) crop, item);
		item.setRegistryName(regName);
		item.setUnlocalizedName(regName);
		item.setCreativeTab(PrimordialCrops.PrimordialCrops);

		return GameRegistry.register(item);
	}


	public static Item regSeeds(String regName, Block crop) {

		CropSeeds item = new CropSeeds(crop, Blocks.FARMLAND, regName);
		seedsMap.put((CropBlocks) crop, item);
		item.setRegistryName(regName);
		item.setUnlocalizedName(regName);
		item.setCreativeTab(PrimordialCrops.PrimordialCrops);

		return GameRegistry.register(item);
	}
}
