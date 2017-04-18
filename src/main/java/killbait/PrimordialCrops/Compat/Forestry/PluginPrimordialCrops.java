package killbait.PrimordialCrops.Compat.Forestry;

import forestry.api.circuits.ChipsetManager;
import forestry.api.circuits.ICircuit;
import forestry.api.circuits.ICircuitLayout;
import forestry.api.core.ForestryAPI;
import forestry.api.farming.Farmables;
import forestry.core.utils.Log;
import forestry.core.utils.ModUtil;
import forestry.farming.circuits.CircuitFarmLogic;
import forestry.farming.logic.FarmableAgingCrop;
import forestry.plugins.BlankForestryPlugin;
import forestry.plugins.ForestryPlugin;
import forestry.plugins.ForestryPluginUids;
import killbait.PrimordialCrops.Blocks.CropBlocks;
import killbait.PrimordialCrops.Blocks.CropBlocksSpecial;
import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.Registry.ModCrops;
import killbait.PrimordialCrops.Utils.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import javax.annotation.Nullable;

/**
 * Created by Jon on 13/04/2017.
 */
@ForestryPlugin(pluginID = "forestry:primordialcrops", name = "PrimordialCrops", author = "KillBait!", url = "https://minecraft.curseforge.com/projects/primordial-crops", unlocalizedDescription = "for.plugin.primordialcrops.description")
public class PluginPrimordialCrops extends BlankForestryPlugin {

	private static final String PRI_CROP = "mc";

	private static void registerSeedPlant(@Nullable Item seedItem, String blockName) {
		if (seedItem != null) {
			Block plantBlock = getBlock(blockName);
			if (plantBlock != null) {
				Farmables.farmables.put("farmWheat", new FarmableAgingCrop(new ItemStack(seedItem), plantBlock, CropBlocks.AGE, 7));
			}
		}
	}

	//

	private static void registerSpecialSeedPlant(@Nullable Item seedItem, String blockName) {
		if (seedItem != null) {
			Block plantBlock = getBlock(blockName);
			if (plantBlock != null) {
				Farmables.farmables.put("farmWheat", new FarmableAgingCrop(new ItemStack(seedItem), plantBlock, CropBlocksSpecial.AGE, 7));
			}
		}
	}

	@Nullable
	private static Block getBlock(String blockName) {
		ResourceLocation key = new ResourceLocation(PRI_CROP, blockName);
		if (ForgeRegistries.BLOCKS.containsKey(key)) {
			LogHelper.info("Found block " + ForgeRegistries.BLOCKS.getValue(key));
			return ForgeRegistries.BLOCKS.getValue(key);
		} else {
			LogHelper.error("Could not find {}" + key);
			return null;
		}
	}

	@Nullable
	private static Item getItem(String itemName) {
		ResourceLocation key = new ResourceLocation(PRI_CROP, itemName);
		if (ForgeRegistries.ITEMS.containsKey(key)) {
			return ForgeRegistries.ITEMS.getValue(key);
		} else {
			Log.error("Could not find {}", key);
			return null;
		}
	}

	/*@Override
	public void registerRecipes() {

		//add farm seed planting

		Item minicioSeed = getItem("MinicioSeeds");
			if (minicioSeed != null) {
				Block plantBlock = getBlock("MinicioCrop");
				if (plantBlock != null) {
					Farmables.farmables.put("farmMinicio", new FarmableAgingCrop(new ItemStack(minicioSeed), plantBlock, CropBlocks.AGE, 7));
				}
			}


	}*/

	@Override
	public void doInit() {

		super.doInit();

		if (ForestryAPI.enabledPlugins.contains(ForestryPluginUids.FARMING)) {

			registerFarmLogic("Minicio", ModCrops.MinicioEssence, ModCrops.MinicioSeeds, ModCrops.MinicioCrop);

			if (PrimordialConfig.enableAirCrop) {
				registerFarmLogic("Air", ModCrops.AirEssence, ModCrops.AirSeeds, ModCrops.AirCrop);
			}
			if (PrimordialConfig.enableEarthCrop) {
				registerFarmLogic("Earth", ModCrops.EarthEssence, ModCrops.EarthSeeds, ModCrops.EarthCrop);
			}
			if (PrimordialConfig.enableFireCrop) {
				registerFarmLogic("Fire", ModCrops.FireEssence, ModCrops.FireSeeds, ModCrops.FireCrop);
			}
			if (PrimordialConfig.enableWaterCrop) {
				registerFarmLogic("Water", ModCrops.WaterEssence, ModCrops.WaterSeeds, ModCrops.WaterCrop);
			}
			if (PrimordialConfig.enableNatureCrop) {
				registerFarmLogic("Nature", ModCrops.NatureEssence, ModCrops.NatureSeeds, ModCrops.NatureCrop);
			}
			if (PrimordialConfig.enableNetherCrop) {
				registerFarmLogic("Nether", ModCrops.NetherEssence, ModCrops.NetherSeeds, ModCrops.NetherCrop);
			}
			if (PrimordialConfig.enableCoalCrop) {
				registerFarmLogic("Coal", ModCrops.CoalEssence, ModCrops.CoalSeeds, ModCrops.CoalCrop);
			}
			if (PrimordialConfig.enableDiamondCrop) {
				registerFarmLogic("Diamond", ModCrops.DiamondEssence, ModCrops.DiamondSeeds, ModCrops.DiamondCrop);
			}
			if (PrimordialConfig.enableDyeCrop) {
				registerFarmLogic("Dye", ModCrops.DyeEssence, ModCrops.DyeSeeds, ModCrops.DyeCrop);
			}
			if (PrimordialConfig.enableEmeraldCrop) {
				registerFarmLogic("Emerald", ModCrops.EmeraldEssence, ModCrops.EmeraldSeeds, ModCrops.EmeraldCrop);
			}
			if (PrimordialConfig.enableExperienceCrop) {
				registerFarmLogic("Experience", ModCrops.ExperienceEssence, ModCrops.ExperienceSeeds, ModCrops.ExperienceCrop);
			}
			if (PrimordialConfig.enableGlowstoneCrop) {
				registerFarmLogic("Glowstone", ModCrops.GlowstoneEssence, ModCrops.GlowstoneSeeds, ModCrops.GlowstoneCrop);
			}
			if (PrimordialConfig.enableGoldCrop) {
				registerFarmLogic("Gold", ModCrops.GoldEssence, ModCrops.GoldSeeds, ModCrops.GoldCrop);
			}
			if (PrimordialConfig.enableIronCrop) {
				registerFarmLogic("Iron", ModCrops.IronEssence, ModCrops.IronSeeds, ModCrops.IronCrop);
			}
			if (PrimordialConfig.enableLapisCrop) {
				registerFarmLogic("Lapis", ModCrops.LapisEssence, ModCrops.LapisSeeds, ModCrops.LapisCrop);
			}
			if (PrimordialConfig.enableObsidianCrop) {
				registerFarmLogic("Odsidian", ModCrops.ObsidianEssence, ModCrops.ObsidianSeeds, ModCrops.ObsidianCrop);
			}
			if (PrimordialConfig.enableQuartzCrop) {
				registerFarmLogic("Quartz", ModCrops.QuartzEssence, ModCrops.QuartzSeeds, ModCrops.QuartzCrop);
			}
			if (PrimordialConfig.enableRedstoneCrop) {
				registerFarmLogic("Redstone", ModCrops.RedstoneEssence, ModCrops.RedstoneSeeds, ModCrops.RedstoneCrop);
			}
			if (PrimordialConfig.enablePrismarineShardCrop) {
				registerFarmLogic("Prismarine", ModCrops.PrismarineShardEssence, ModCrops.PrismarineShardSeeds, ModCrops.PrismarineShardCrop);
			}

			//-----------------------------------------------------
			// Mob Crops
			//-----------------------------------------------------

			if (PrimordialConfig.enableBlazeCrop) {
				registerFarmLogic("Blaze", ModCrops.BlazeEssence, ModCrops.BlazeSeeds, ModCrops.BlazeCrop);
			}
			if (PrimordialConfig.enableChickenCrop) {
				registerFarmLogic("Chicken", ModCrops.ChickenEssence, ModCrops.ChickenSeeds, ModCrops.ChickenCrop);
			}
			if (PrimordialConfig.enableCowCrop) {
				registerFarmLogic("Cow", ModCrops.CowEssence, ModCrops.CowSeeds, ModCrops.CowCrop);
			}
			if (PrimordialConfig.enableCreeperCrop) {
				registerFarmLogic("Creeper", ModCrops.CreeperEssence, ModCrops.CreeperSeeds, ModCrops.CreeperCrop);
			}
			if (PrimordialConfig.enableEnderCrop) {
				registerFarmLogic("Ender", ModCrops.EnderEssence, ModCrops.EnderSeeds, ModCrops.EnderCrop);
			}
			if (PrimordialConfig.enableGhastCrop) {
				registerFarmLogic("Ghast", ModCrops.GhastEssence, ModCrops.GhastSeeds, ModCrops.GhastCrop);
			}
			if (PrimordialConfig.enablePigCrop) {
				registerFarmLogic("Pig", ModCrops.PigEssence, ModCrops.PigSeeds, ModCrops.PigCrop);
			}
			if (PrimordialConfig.enableSheepCrop) {
				registerFarmLogic("Sheep", ModCrops.SheepEssence, ModCrops.SheepSeeds, ModCrops.SheepCrop);
			}
			if (PrimordialConfig.enableSkeletonCrop) {
				registerFarmLogic("Skeleton", ModCrops.SkeletonEssence, ModCrops.SkeletonSeeds, ModCrops.SkeletonCrop);
			}
			if (PrimordialConfig.enableSlimeCrop) {
				registerFarmLogic("Slime", ModCrops.SlimeEssence, ModCrops.SlimeSeeds, ModCrops.SlimeCrop);
			}
			if (PrimordialConfig.enableSpiderCrop) {
				registerFarmLogic("Spider", ModCrops.SpiderEssence, ModCrops.SpiderSeeds, ModCrops.SpiderCrop);
			}
			if (PrimordialConfig.enableWitherCrop) {
				registerFarmLogic("Wither", ModCrops.WitherEssence, ModCrops.WitherSeeds, ModCrops.WitherCrop);
			}
			if (PrimordialConfig.enableZombieCrop) {
				registerFarmLogic("Zombie", ModCrops.ZombieEssence, ModCrops.ZombieSeeds, ModCrops.ZombieCrop);
			}

			//-----------------------------------------------------
			// Special Crops
			//-----------------------------------------------------

			if (PrimordialConfig.enableDragonEggCrop) {
				registerFarmLogic("Dragon", ModCrops.DragonEggEssence, ModCrops.DragonEggSeeds, ModCrops.DragonEggCrop);
			}
			if (PrimordialConfig.enableNetherCrop) {
				registerFarmLogic("NetherStar", ModCrops.NetherStarEssence, ModCrops.NetherStarSeeds, ModCrops.NetherStarCrop);
			}

			//-----------------------------------------------------
			// Food Crops
			//-----------------------------------------------------

			if (PrimordialConfig.enableCakeCrop) {
				registerFarmLogic("Cake", ModCrops.CakeEssence, ModCrops.CakeSeeds, ModCrops.CakeCrop);
			}
			if (PrimordialConfig.enableDonutCrop) {
				registerFarmLogic("Donut", ModCrops.DonutEssence, ModCrops.DonutSeeds, ModCrops.DonutCrop);
			}

			//-----------------------------------------------------
			// Mod Crops
			//-----------------------------------------------------

			if (Loader.isModLoaded("tconstruct")) {
				if (PrimordialConfig.enableArditeCrop) {
					registerFarmLogic("Ardite", ModCrops.ArditeEssence, ModCrops.ArditeSeeds, ModCrops.ArditeCrop);
				}
				if (PrimordialConfig.enableCobaltCrop) {
					registerFarmLogic("Cobalt", ModCrops.CobaltEssence, ModCrops.CobaltSeeds, ModCrops.CobaltCrop);
				}
				if (PrimordialConfig.enableManyullynCrop) {
					registerFarmLogic("Manyullyn", ModCrops.ManyullynEssence, ModCrops.ManyullynSeeds, ModCrops.ManyullynCrop);
				}
				if (PrimordialConfig.enableKnightSlimeCrop) {
					registerFarmLogic("KnightSlime", ModCrops.KnightSlimeEssence, ModCrops.KnightSlimeSeeds, ModCrops.KnightSlimeCrop);
				}
				if (PrimordialConfig.enablePigIronCrop) {
					registerFarmLogic("PigIron", ModCrops.PigIronEssence, ModCrops.PigIronSeeds, ModCrops.PigIronCrop);
				}
			}

			if (Loader.isModLoaded("immersiveengineering")) {
				if (PrimordialConfig.enableAluminumCrop) {
					registerFarmLogic("Aluminum", ModCrops.AluminumEssence, ModCrops.AluminumSeeds, ModCrops.AluminumCrop);
				}
				if (PrimordialConfig.enableNickelCrop) {
					registerFarmLogic("Nickel", ModCrops.NickelEssence, ModCrops.NickelSeeds, ModCrops.NickelCrop);
				}
				if (PrimordialConfig.enableElectrumCrop) {
					registerFarmLogic("Electrum", ModCrops.ElectrumEssence, ModCrops.ElectrumSeeds, ModCrops.ElectrumCrop);
				}
				if (PrimordialConfig.enableConstantanCrop) {
					registerFarmLogic("Constantan", ModCrops.ConstantanEssence, ModCrops.ConstantanSeeds, ModCrops.ConstantanCrop);
				}
			}

			if (Loader.isModLoaded("botania") || Loader.isModLoaded("Botania")) {
				if (PrimordialConfig.enableManaSteelCrop) {
					registerFarmLogic("ManaSteel", ModCrops.ManaSteelEssence, ModCrops.ManaSteelSeeds, ModCrops.ManaSteelCrop);
				}
				if (PrimordialConfig.enableTerraSteelCrop) {
					registerFarmLogic("TerraSteel", ModCrops.TerraSteelEssence, ModCrops.TerraSteelSeeds, ModCrops.TerraSteelCrop);
				}
				if (PrimordialConfig.enableElementiumCrop) {
					registerFarmLogic("Elementium", ModCrops.ElementiumEssence, ModCrops.ElementiumSeeds, ModCrops.ElementiumCrop);
				}
			}

			if (Loader.isModLoaded("IC2")) {
				if (PrimordialConfig.enableRubberCrop) {
					registerFarmLogic("Rubber", ModCrops.RubberEssence, ModCrops.RubberSeeds, ModCrops.RubberCrop);
				}

			}

			if (Loader.isModLoaded("IC2") || Loader.isModLoaded("immersiveengineering")) {
				if (PrimordialConfig.enableUraniumCrop) {
					registerFarmLogic("Uranium", ModCrops.UraniumEssence, ModCrops.UraniumSeeds, ModCrops.UraniumCrop);
				}
				if (PrimordialConfig.enableSteelCrop) {
					registerFarmLogic("Steel", ModCrops.SteelEssence, ModCrops.SteelSeeds, ModCrops.SteelCrop);
				}
			}

			if (Loader.isModLoaded("IC2") || Loader.isModLoaded("forestry")) {
				if (PrimordialConfig.enableBronzeCrop) {
					registerFarmLogic("Bronze", ModCrops.BronzeEssence, ModCrops.BronzeSeeds, ModCrops.BronzeCrop);
				}
			}

			if (Loader.isModLoaded("forestry")) {
				if (PrimordialConfig.enableApatiteCrop) {
					registerFarmLogic("Apatite", ModCrops.ApatiteEssence, ModCrops.ApatiteSeeds, ModCrops.ApatiteCrop);
				}
			}

			if (Loader.isModLoaded("bigreactors")) {
				if (PrimordialConfig.enableYelloriteCrop) {
					registerFarmLogic("Yellorite", ModCrops.YelloriteEssence, ModCrops.YelloriteSeeds, ModCrops.YelloriteCrop);
				}
				if (PrimordialConfig.enableLudicriteCrop) {
					registerFarmLogic("Ludicrite", ModCrops.LudicriteEssence, ModCrops.LudicriteSeeds, ModCrops.LudicriteCrop);
				}
				if (PrimordialConfig.enableCyaniteCrop) {
					registerFarmLogic("Cyanite", ModCrops.CyaniteEssence, ModCrops.CyaniteSeeds, ModCrops.CyaniteCrop);
				}
				if (PrimordialConfig.enableBlutoniumCrop) {
					registerFarmLogic("Blutonium", ModCrops.BlutoniumEssence, ModCrops.BlutoniumSeeds, ModCrops.BlutoniumCrop);
				}
			}

			if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("forestry") || Loader.isModLoaded("immersiveengineering")) {
				if (PrimordialConfig.enableCopperCrop) {
					registerFarmLogic("Copper", ModCrops.CopperEssence, ModCrops.CopperSeeds, ModCrops.CopperCrop);
				}
				if (PrimordialConfig.enableTinCrop) {
					registerFarmLogic("Tin", ModCrops.TinEssence, ModCrops.TinSeeds, ModCrops.TinCrop);
				}
			}

			if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("immersiveengineering")) {
				if (PrimordialConfig.enableSilverCrop) {
					registerFarmLogic("Silver", ModCrops.SilverEssence, ModCrops.SilverSeeds, ModCrops.SilverCrop);
				}
				if (PrimordialConfig.enableLeadCrop) {
					registerFarmLogic("Lead", ModCrops.LeadEssence, ModCrops.LeadSeeds, ModCrops.LeadCrop);
				}
			}

			if (Loader.isModLoaded("Mekanism")) {
				if (PrimordialConfig.enableOsmiumCrop) {
					registerFarmLogic("Osmium", ModCrops.OsmiumEssence, ModCrops.OsmiumSeeds, ModCrops.OsmiumCrop);
				}
			}

			if (Loader.isModLoaded("draconicevolution")) {
				if (PrimordialConfig.enableDraconiumCrop) {
					registerFarmLogic("Draconium", ModCrops.DraconiumEssence, ModCrops.DraconiumSeeds, ModCrops.DraconiumCrop);
				}
				if (PrimordialConfig.enableAwakeDraconiumCrop) {
					registerFarmLogic("AwakenedDraconium", ModCrops.AwakeDraconiumEssence, ModCrops.AwakeDraconiumSeeds, ModCrops.AwakeDraconiumCrop);
				}
			}

			if (Loader.isModLoaded("appliedenergistics2")) {
				if (PrimordialConfig.enableCertusCrop) {
					registerFarmLogic("CertusQuartz", ModCrops.CertusQuartzEssence, ModCrops.CertusQuartzSeeds, ModCrops.CertusQuartzCrop);
				}
				if (PrimordialConfig.enableFluixCrop) {
					registerFarmLogic("Fluix", ModCrops.FluixEssence, ModCrops.FluixSeeds, ModCrops.FluixCrop);
				}
			}
		}

		/*ICircuitSocketType type = new PrimordialCircuitSocketType("primordialsockettype");
		ICircuitLayout layout = new PrimordialCircuitLayout("primordialcircuit", type);
		ICircuit circiut = new PrimordialCircuit(Info.MODID, layout, new ItemStack(ModItems.AccioAxe));*/
	}

	private void registerFarmLogic(String uid, Item iconItem, Item seedItem, Block seedBlock) {

		ICircuit circuit = new CircuitFarmLogic(uid, new PrimordialFarmLogicCrop(uid, iconItem, seedItem, seedBlock));
		if (ForestryAPI.enabledPlugins.contains(ForestryPluginUids.FARMING) && circuit != null) {
			ICircuitLayout layoutManaged = ChipsetManager.circuitRegistry.getLayout("forestry.farms.managed");
			//ICircuitLayout layoutManual = ChipsetManager.circuitRegistry.getLayout("forestry.farms.manual");
			ChipsetManager.solderManager.addRecipe(layoutManaged, new ItemStack(iconItem), circuit);
			//ChipsetManager.solderManager.addRecipe(layoutManual, new ItemStack(iconItem), circuit);
		}
	}

	@Override
	public boolean isAvailable() {
		return ModUtil.isModLoaded(PRI_CROP);
	}

	@Override
	public String getFailMessage() {
		return "Primordial Crops not found!";
	}
}
