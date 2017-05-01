package killbait.PrimordialCrops.Config;

import killbait.PrimordialCrops.Utils.LogHelper;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;


public class PrimordialConfig {

	private static final String CATEGORY_MOD = "Base Settings";
	private static final String CATEGORY_CROPS = "Crops Settings";
	private static final String CATEGORY_DANGER = "Danger Area";

	public static String configpath;
	public static Configuration config;

	// Mod Options
	public static boolean infusionStoneDurability;
	public static int infusionStoneMaxUses;
	public static boolean enableWeapons;
	public static boolean enableTools;
	public static boolean enableArmour;
	public static int regularSeedExtraChance;
	public static boolean specialCropsAreTooHard;
	public static int specialSeedExtraChance;
	public static boolean rightClickHarvest;
	public static boolean addMinicioSeedToGrassDrop;

	// 1.6g new stuff
	public static boolean enableBonemealUse;

	// WIP
	public static boolean enableIngameBook;

	// Crops

	public static boolean enableAirCrop;
	public static boolean enableAluminumCrop;
	public static boolean enableApatiteCrop;
	public static boolean enableArditeCrop;
	public static boolean enableAwakeDraconiumCrop;
	public static boolean enableBlazeCrop;
	public static boolean enableBlutoniumCrop;
	public static boolean enableBronzeCrop;
	public static boolean enableCakeCrop;
	public static boolean enableChickenCrop;
	public static boolean enableCoalCrop;
	public static boolean enableCobaltCrop;
	public static boolean enableConstantanCrop;
	public static boolean enableCopperCrop;
	public static boolean enableCowCrop;
	public static boolean enableCreeperCrop;
	public static boolean enableCyaniteCrop;
	public static boolean enableDiamondCrop;
	public static boolean enableDonutCrop;
	public static boolean enableDraconiumCrop;
	public static boolean enableDragonEggCrop;
	public static boolean enableDyeCrop;
	public static boolean enableEarthCrop;
	public static boolean enableElectrumCrop;
	public static boolean enableElementiumCrop;
	public static boolean enableEmeraldCrop;
	public static boolean enableEnderCrop;
	public static boolean enableEndermanCrop;
	public static boolean enableExperienceCrop;
	public static boolean enableFireCrop;
	public static boolean enableGhastCrop;
	public static boolean enableGlowstoneCrop;
	public static boolean enableGoldCrop;
	public static boolean enableIronCrop;
	public static boolean enableKnightSlimeCrop;
	public static boolean enableLapisCrop;
	public static boolean enableLeadCrop;
	public static boolean enableLudicriteCrop;
	public static boolean enableManaSteelCrop;
	public static boolean enableManyullynCrop;
	public static boolean enableNatureCrop;
	public static boolean enableNetherCrop;
	public static boolean enableNetherStarCrop;
	public static boolean enableNickelCrop;
	public static boolean enableObsidianCrop;
	public static boolean enableOsmiumCrop;
	public static boolean enablePigCrop;
	public static boolean enablePigIronCrop;
	public static boolean enableQuartzCrop;
	public static boolean enableRedstoneCrop;
	public static boolean enableRubberCrop;
	public static boolean enableSheepCrop;
	public static boolean enableSilverCrop;
	public static boolean enableSkeletonCrop;
	public static boolean enableSlimeCrop;
	public static boolean enableSpiderCrop;
	public static boolean enableSteelCrop;
	public static boolean enableTerraSteelCrop;
	public static boolean enableTinCrop;
	public static boolean enableUraniumCrop;
	public static boolean enableWaterCrop;
	public static boolean enableWitherCrop;
	public static boolean enableYelloriteCrop;
	public static boolean enableZombieCrop;

	// 1.6g new Stuff
	public static boolean enableCertusCrop;
	public static boolean enableChargedCertusCrop;
	public static boolean enableFluixCrop;
	public static boolean enablePrismarineShardCrop;
	//public static boolean enablePrismarineCrystalCrop;

	public static boolean enableZivicioArmorFlight;
	public static boolean enableOreSpawn;
	public static int oreSpawnChance;
	public static int oreSpawnMinZ;
	public static int oreSpawnMaxZ;

	//1.7d new stuff
	public static boolean enableZivicioHoeSpeedup;

	// 1.7e new stuff
	public static boolean enableExtraWAILAInfo;
	public static boolean enableExtraTOPInfo;
	public static boolean enableForestryFarmSupport;

	//1.7g new stuff

	public static int essenceMultiplier;
	public static boolean enableNoOre;


	public static boolean useAlternateIfDisabled;

	public static void init(FMLPreInitializationEvent event) {

		configpath = event.getModConfigurationDirectory().getAbsolutePath() + File.separator;
		config = new Configuration(new File(configpath + "PrimordialCrops.cfg"));
		try {
			config.load();
			PrimordialConfig.configure(config);
		} catch (Exception e1) {
			LogHelper.error("Problem loading config file! " + e1);
		} finally {
			if (config.hasChanged()) {
				config.save();
			}
		}
	}

	public static void configure(Configuration config) {

		config.addCustomCategoryComment(CATEGORY_MOD, "Mod Settings");
		infusionStoneDurability = config.getBoolean("infusionStonesHaveDurability", CATEGORY_MOD, false, "Set to true if you want Infusions stones to have durability");
		infusionStoneMaxUses = config.getInt("infusionStoneMaxUses", CATEGORY_MOD, 256, 0, 1000, "How many uses an infusions stone has before it breaks (if infusionStoneDurability is true)");
		enableWeapons = config.getBoolean("enableWeapons", CATEGORY_MOD, true, "Set to false if you dont want the mods Weapons");
		enableTools = config.getBoolean("enableTools", CATEGORY_MOD, true, "Set to false if you dont want the mods Tools");
		enableArmour = config.getBoolean("enableArmour", CATEGORY_MOD, true, "Set to false if you dont want the mods Armour");
		regularSeedExtraChance = config.getInt("extraSeedChanceRegular", CATEGORY_MOD, 20, 0, 100, "Percentage chance you get an extra seed from regular crops");
		specialCropsAreTooHard = config.getBoolean("easySpecials", CATEGORY_MOD, false, "Set to true if you want easy crafting recipes for special crops");
		specialSeedExtraChance = config.getInt("extraSeedChanceSpecial", CATEGORY_MOD, 3, 0, 100, "Percentage chance you get an extra seed from special crops");
		rightClickHarvest = config.getBoolean("harvestOnRightClick", CATEGORY_MOD, false, "Set to true if you want right click harvesting of crops (if false and still occurs another mod is responsible)");
		addMinicioSeedToGrassDrop = config.getBoolean("grassDropsMinicioSeed", CATEGORY_MOD, true, "Set to false if you don't want minicio seeds as a chance drop from breaking grass");
		enableBonemealUse = config.getBoolean("allowBonemealCrops", CATEGORY_MOD, true, "Set to false if you don't want bonemeal to speed up crop growth");
		// Work In Progress (Not Yet Craftable)
		enableIngameBook = config.getBoolean("enableInGameBook", CATEGORY_MOD, true, "Set to false if you don't want to use the Ingame Manual");
		enableZivicioArmorFlight = config.getBoolean("enableZivicioArmourFlight", CATEGORY_MOD, true, "Set to false if you don't want wearing a full set of Zivicio Armour to grant flight");
		enableZivicioHoeSpeedup = config.getBoolean("enableZivicioHoeRightClick", CATEGORY_MOD, true, "Set to false if you don't want the Zivicio Hoe's crop speedup on right click");
		enableExtraWAILAInfo = config.getBoolean("enableExtraWailaInfo", CATEGORY_MOD, true, "Set to false if you don't want to see extra crop info in WAILA");
		enableExtraTOPInfo = config.getBoolean("enableExtraProbeInfo", CATEGORY_MOD, true, "Set to false if you don't want to see extra crop info in The One Probe");
		enableForestryFarmSupport = config.getBoolean("enableForestryFarmSupport", CATEGORY_MOD, true, "Set to false if you don't want forestry farm support");
		enableNoOre = config.getBoolean("essenceGivesIngots", CATEGORY_MOD, false, "Set to true if you want essence recipes to give ingots instead of ore");


		config.addCustomCategoryComment(CATEGORY_CROPS, "Enable/Disable individual crops (also disables/Enables the seeds)");
		enableAirCrop = config.getBoolean("enableAirCrop", CATEGORY_CROPS, true, "Set to false to disable Air Crops/Seeds/Essence");
		enableAluminumCrop = config.getBoolean("enableAluminumCrop", CATEGORY_CROPS, true, "Set to false to disable Aluminum Crops/Seeds/Essence");
		enableApatiteCrop = config.getBoolean("enableApatiteCrop", CATEGORY_CROPS, true, "Set to false to disable Apatite Crops/Seeds/Essence");
		enableArditeCrop = config.getBoolean("enableArditeCrop", CATEGORY_CROPS, true, "Set to false to disable Ardite Crops/Seeds/Essence");
		enableAwakeDraconiumCrop = config.getBoolean("enableAwakenedDraconiumCrop", CATEGORY_CROPS, true, "Set to false to disable AwakenedDraconium Crops/Seeds/Essence");
		enableBlazeCrop = config.getBoolean("enableBlazeCrop", CATEGORY_CROPS, true, "Set to false to disable Blaze Crops/Seeds/Essence");
		enableBlutoniumCrop = config.getBoolean("enableBlutoniumCrop", CATEGORY_CROPS, true, "Set to false to disable Blutonium Crops/Seeds/Essence");
		enableBronzeCrop = config.getBoolean("enableBronzeCrop", CATEGORY_CROPS, true, "Set to false to disable Bronze Crops/Seeds/Essence");
		enableCakeCrop = config.getBoolean("enableCakeCrop", CATEGORY_CROPS, true, "Set to false to disable Cake Crops/Seeds/Essence");
		enableChickenCrop = config.getBoolean("enableChickenCrop", CATEGORY_CROPS, true, "Set to false to disable Chicken Crops/Seeds/Essence");
		enableCoalCrop = config.getBoolean("enableCoalCrop", CATEGORY_CROPS, true, "Set to false to disable Coal Crops/Seeds/Essence");
		enableCobaltCrop = config.getBoolean("enableCobaltCrop", CATEGORY_CROPS, true, "Set to false to disable Cobalt Crops/Seeds/Essence");
		enableConstantanCrop = config.getBoolean("enableConstantanCrop", CATEGORY_CROPS, true, "Set to false to disable Constantan Crops/Seeds/Essence");
		enableCopperCrop = config.getBoolean("enableCopperCrop", CATEGORY_CROPS, true, "Set to false to disable Copper Crops/Seeds/Essence");
		enableCowCrop = config.getBoolean("enableCowCrop", CATEGORY_CROPS, true, "Set to false to disable Cow Crops/Seeds/Essence");
		enableCreeperCrop = config.getBoolean("enableCreeperCrop", CATEGORY_CROPS, true, "Set to false to disable Creeper Crops/Seeds/Essence");
		enableCyaniteCrop = config.getBoolean("enableCyaniteCrop", CATEGORY_CROPS, true, "Set to false to disable Cyanite Crops/Seeds/Essence");
		enableDiamondCrop = config.getBoolean("enableDiamondCrop", CATEGORY_CROPS, true, "Set to false to disable Diamond Crops/Seeds/Essence");
		enableDonutCrop = config.getBoolean("enableDonutCrop", CATEGORY_CROPS, true, "Set to false to disable Donut Crops/Seeds/Essence");
		enableDraconiumCrop = config.getBoolean("enableDraconiumCrop", CATEGORY_CROPS, true, "Set to false to disable Draconium Crops/Seeds/Essence");
		enableDragonEggCrop = config.getBoolean("enableDragonEggCrop", CATEGORY_CROPS, true, "Set to false to disable DragonEgg Crops/Seeds/Essence");
		enableDyeCrop = config.getBoolean("enableDyeCrop", CATEGORY_CROPS, true, "Set to false to disable Dye Crops/Seeds/Essence");
		enableEarthCrop = config.getBoolean("enableEarthCrop", CATEGORY_CROPS, true, "Set to false to disable Earth Crops/Seeds/Essence");
		enableElectrumCrop = config.getBoolean("enableElectrumCrop", CATEGORY_CROPS, true, "Set to false to disable Electrum Crops/Seeds/Essence");
		enableElementiumCrop = config.getBoolean("enableElementiumCrop", CATEGORY_CROPS, true, "Set to false to disable Elementium Crops/Seeds/Essence");
		enableEmeraldCrop = config.getBoolean("enableEmeraldCrop", CATEGORY_CROPS, true, "Set to false to disable Emerald Crops/Seeds/Essence");
		enableEnderCrop = config.getBoolean("enableEnderCrop", CATEGORY_CROPS, true, "Set to false to disable Ender Crops/Seeds/Essence");
		enableEndermanCrop = config.getBoolean("enableEndermanCrop", CATEGORY_CROPS, true, "Set to false to disable Enderman Crops/Seeds/Essence");
		enableExperienceCrop = config.getBoolean("enableExperienceCrop", CATEGORY_CROPS, true, "Set to false to disable Experience Crops/Seeds/Essence");
		enableFireCrop = config.getBoolean("enableFireCrop", CATEGORY_CROPS, true, "Set to false to disable Fire Crops/Seeds/Essence");
		enableGhastCrop = config.getBoolean("enableGhastCrop", CATEGORY_CROPS, true, "Set to false to disable Ghast Crops/Seeds/Essence");
		enableGlowstoneCrop = config.getBoolean("enableGlowstoneCrop", CATEGORY_CROPS, true, "Set to false to disable Glowstone Crops/Seeds/Essence");
		enableGoldCrop = config.getBoolean("enableGoldCrop", CATEGORY_CROPS, true, "Set to false to disable Gold Crops/Seeds/Essence");
		enableIronCrop = config.getBoolean("enableIronCrop", CATEGORY_CROPS, true, "Set to false to disable Iron Crops/Seeds/Essence");
		enableKnightSlimeCrop = config.getBoolean("enableKnightSlimeCrop", CATEGORY_CROPS, true, "Set to false to disable KnightSlime Crops/Seeds/Essence");
		enableLapisCrop = config.getBoolean("enableLapisCrop", CATEGORY_CROPS, true, "Set to false to disable Lapis Crops/Seeds/Essence");
		enableLeadCrop = config.getBoolean("enableLeadCrop", CATEGORY_CROPS, true, "Set to false to disable Lead Crops/Seeds/Essence");
		enableLudicriteCrop = config.getBoolean("enableLudicriteCrop", CATEGORY_CROPS, true, "Set to false to disable Ludicrite Crops/Seeds/Essence");
		enableManaSteelCrop = config.getBoolean("enableManaSteelCrop", CATEGORY_CROPS, true, "Set to false to disable ManaSteel Crops/Seeds/Essence");
		enableManyullynCrop = config.getBoolean("enableManyullynCrop", CATEGORY_CROPS, true, "Set to false to disable Manyullyn Crops/Seeds/Essence");
		enableNatureCrop = config.getBoolean("enableNatureCrop", CATEGORY_CROPS, true, "Set to false to disable Nature Crops/Seeds/Essence");
		enableNetherCrop = config.getBoolean("enableNetherCrop", CATEGORY_CROPS, true, "Set to false to disable Nether Crops/Seeds/Essence");
		enableNetherStarCrop = config.getBoolean("enableNetherStarCrop", CATEGORY_CROPS, true, "Set to false to disable NetherStar Crops/Seeds/Essence");
		enableNickelCrop = config.getBoolean("enableNickelCrop", CATEGORY_CROPS, true, "Set to false to disable Nickel Crops/Seeds/Essence");
		enableObsidianCrop = config.getBoolean("enableObsidianCrop", CATEGORY_CROPS, true, "Set to false to disable Obsidian Crops/Seeds/Essence");
		enableOsmiumCrop = config.getBoolean("enableOsmiumCrop", CATEGORY_CROPS, true, "Set to false to disable Osmium Crops/Seeds/Essence");
		enablePigCrop = config.getBoolean("enablePigCrop", CATEGORY_CROPS, true, "Set to false to disable Pig Crops/Seeds/Essence");
		enablePigIronCrop = config.getBoolean("enablePigIronCrop", CATEGORY_CROPS, true, "Set to false to disable PigIron Crops/Seeds/Essence");
		enableQuartzCrop = config.getBoolean("enableQuartzCrop", CATEGORY_CROPS, true, "Set to false to disable Quartz Crops/Seeds/Essence");
		enableRedstoneCrop = config.getBoolean("enableRedstoneCrop", CATEGORY_CROPS, true, "Set to false to disable Redstone Crops/Seeds/Essence");
		enableRubberCrop = config.getBoolean("enableRubberCrop", CATEGORY_CROPS, true, "Set to false to disable Rubber Crops/Seeds/Essence");
		enableSheepCrop = config.getBoolean("enableSheepCrop", CATEGORY_CROPS, true, "Set to false to disable Sheep Crops/Seeds/Essence");
		enableSilverCrop = config.getBoolean("enableSilverCrop", CATEGORY_CROPS, true, "Set to false to disable Silver Crops/Seeds/Essence");
		enableSkeletonCrop = config.getBoolean("enableSkeletonCrop", CATEGORY_CROPS, true, "Set to false to disable Skeleton Crops/Seeds/Essence");
		enableSlimeCrop = config.getBoolean("enableSlimeCrop", CATEGORY_CROPS, true, "Set to false to disable Slime Crops/Seeds/Essence");
		enableSpiderCrop = config.getBoolean("enableSpiderCrop", CATEGORY_CROPS, true, "Set to false to disable Spider Crops/Seeds/Essence");
		enableSteelCrop = config.getBoolean("enableSteelCrop", CATEGORY_CROPS, true, "Set to false to disable Steel Crops/Seeds/Essence");
		enableTerraSteelCrop = config.getBoolean("enableTerraSteelCrop", CATEGORY_CROPS, true, "Set to false to disable TerraSteel Crops/Seeds/Essence");
		enableTinCrop = config.getBoolean("enableTinCrop", CATEGORY_CROPS, true, "Set to false to disable Tin Crops/Seeds/Essence");
		enableUraniumCrop = config.getBoolean("enableUraniumCrop", CATEGORY_CROPS, true, "Set to false to disable Uranium Crops/Seeds/Essence");
		enableWaterCrop = config.getBoolean("enableWaterCrop", CATEGORY_CROPS, true, "Set to false to disable Water Crops/Seeds/Essence");
		enableWitherCrop = config.getBoolean("enableWitherCrop", CATEGORY_CROPS, true, "Set to false to disable Wither Crops/Seeds/Essence");
		enableYelloriteCrop = config.getBoolean("enableYelloriteCrop", CATEGORY_CROPS, true, "Set to false to disable Yellorite Crops/Seeds/Essence");
		enableZombieCrop = config.getBoolean("enableZombieCrop", CATEGORY_CROPS, true, "Set to false to disable Zombie Crops/Seeds/Essence");

		// 1.6g new stuff
		enableCertusCrop = config.getBoolean("enableCertusCrop", CATEGORY_CROPS, true, "Set to false to disable AE2 Certus Quartz Crops/Seeds/Essence");
		enableFluixCrop = config.getBoolean("enableFluixCrystalCrop", CATEGORY_CROPS, true, "Set to false to disable AE2 Fluix Crystal Crops/Seeds/Essence");
		enablePrismarineShardCrop = config.getBoolean("enablePrismarineShardCrop", CATEGORY_CROPS, true, "Set to false to disable Prismarine Shard Crops/Seeds/Essence");

		config.addCustomCategoryComment(CATEGORY_DANGER, "DANGER AREA!!! - All these options can unbalance the mod if true, Use at your own risk!!!");
		useAlternateIfDisabled = config.getBoolean("useAlternateRecipeIfCropDisabled", CATEGORY_DANGER, false, "If true, certain recipes that use disabled crop essence will use vanilla items instead, can make items too easy to make");
		enableOreSpawn = config.getBoolean("enableOreSpawn", CATEGORY_DANGER, true, "Set to false to disable minicio ore spawning (WARNING - Use at own Risk!!!)");
		oreSpawnChance = config.getInt("oreSpawnChance", CATEGORY_DANGER, 20, 5, 40, "How many chances of Ore to Spawn per chunk (BEWARE - numbers below 7 may result in no ore spawning at all)");
		oreSpawnMinZ = config.getInt("oreSpawnMinZ", CATEGORY_DANGER, 5, 0, 64, "Minimum Z height for ore to start spawning (WARNING - If your not sure what this does, do not adjust it!!!)");
		oreSpawnMaxZ = config.getInt("oreSpawnMaxZ", CATEGORY_DANGER, 64, 0, 64, "Maximum Z height for ore to stop spawning (WARNING - If your not sure what this does, do not adjust it!!!)");
		essenceMultiplier = config.getInt("harvestEssenceAmount", CATEGORY_DANGER, 1, 1, 8, "How many essence you get on a crop harvest (WARNING - Mods that increase harvest output may result in an Insane amount per plant)");
	}
}
