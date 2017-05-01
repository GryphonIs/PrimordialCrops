package killbait.PrimordialCrops.Registry;


import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.Utils.LogHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.List;

public class ModCrafting {

	public static void initCrafting() {

		// set Infusion Stones to be returned on crafting success
		ModItems.InfusionStoneT1.setContainerItem(ModItems.InfusionStoneT1);
		ModItems.InfusionStoneT2.setContainerItem(ModItems.InfusionStoneT2);
		ModItems.InfusionStoneT3.setContainerItem(ModItems.InfusionStoneT3);
		ModItems.InfusionStoneT4.setContainerItem(ModItems.InfusionStoneT4);
		ModItems.InfusionStoneT5.setContainerItem(ModItems.InfusionStoneT5);

		//
		// Smelting
		//

		GameRegistry.addSmelting(ModBlocks.MinicioOre, new ItemStack(ModCrops.MinicioEssence, 4), 3.5F);

		//
		// Ingots
		//

		GameRegistry.addRecipe(new ItemStack(ModItems.accioIngot, 2), "nin", "iei", "nin", 'n', Items.GOLD_NUGGET, 'i', Items.IRON_INGOT, 'e', ModItems.AccioEssence);
		GameRegistry.addRecipe(new ItemStack(ModItems.crucioIngot, 2), "nin", "iei", "nin", 'n', Items.GOLD_NUGGET, 'i', Items.IRON_INGOT, 'e', ModItems.CrucioEssence);
		GameRegistry.addRecipe(new ItemStack(ModItems.imperioIngot, 2), "nin", "iei", "nin", 'n', Items.GOLD_NUGGET, 'i', Items.IRON_INGOT, 'e', ModItems.ImperioEssence);
		GameRegistry.addRecipe(new ItemStack(ModItems.zivicioIngot, 2), "nin", "iei", "nin", 'n', Items.GOLD_NUGGET, 'i', Items.IRON_INGOT, 'e', ModItems.ZivicioEssence);

		//
		// Reverse Essence recipes
		//

		GameRegistry.addShapelessRecipe(new ItemStack(ModCrops.MinicioEssence, 4), ModItems.AccioEssence);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.AccioEssence, 4), ModItems.CrucioEssence);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CrucioEssence, 4), ModItems.ImperioEssence);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ImperioEssence, 4), ModItems.ZivicioEssence);

		//
		// Seeds
		//

		GameRegistry.addRecipe(new ItemStack(ModCrops.MinicioSeeds), " m ", "msm", " m ", 'm', ModCrops.MinicioEssence, 's', Items.WHEAT_SEEDS);


		if (PrimordialConfig.enableCoalCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.CoalSeeds), "scs", "c1c", "scs", 's', ModCrops.MinicioEssence, 'c', Items.COAL, '1', "InfusionStoneT1Plus"));
		}
		if (PrimordialConfig.enableDiamondCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.DiamondSeeds), "idi", "d5d", "idi", 'i', ModItems.ZivicioEssence, 'd', Items.DIAMOND, '5', "InfusionStoneT4Plus"));
		}
		if (PrimordialConfig.enableIronCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.IronSeeds), "cic", "i2i", "cic", 'c', ModItems.CrucioEssence, 'i', Items.IRON_INGOT, '2', "InfusionStoneT2Plus"));
		}
		if (PrimordialConfig.enableGoldCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.GoldSeeds), "igi", "g3g", "igi", 'i', ModItems.ImperioEssence, 'g', Items.GOLD_INGOT, '3', "InfusionStoneT3Plus"));
		}
		if (PrimordialConfig.enableRedstoneCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.RedstoneSeeds), "ara", "r3r", "ara", 'a', ModItems.ImperioEssence, 'r', Items.REDSTONE, '3', "InfusionStoneT3Plus"));
		}
		if (PrimordialConfig.enableQuartzCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.QuartzSeeds), "aqa", "q3q", "aqa", 'a', ModItems.ImperioEssence, 'q', Items.QUARTZ, '3', "InfusionStoneT3Plus"));
		}
		if (PrimordialConfig.enableObsidianCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ObsidianSeeds), "ara", "r4r", "ara", 'a', ModItems.ImperioEssence, 'r', Blocks.OBSIDIAN, '4', "InfusionStoneT3Plus"));
		}
		if (PrimordialConfig.enableNetherCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.NetherSeeds), "ara", "r3r", "ara", 'a', ModItems.ImperioEssence, 'r', Blocks.NETHERRACK, '3', "InfusionStoneT3Plus"));
		}
		if (PrimordialConfig.enableNatureCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.NatureSeeds), " s ", "sms", " s ", 's', Items.WHEAT_SEEDS, 'm', "InfusionStoneT2Plus"));
		}
		if (PrimordialConfig.enableLapisCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.LapisSeeds), "ala", "l2l", "ala", 'a', ModItems.CrucioEssence, '2', "InfusionStoneT2Plus", 'l', new ItemStack(Items.DYE, 1, 4)));
		}
		if (PrimordialConfig.enableGlowstoneCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.GlowstoneSeeds), "cgc", "g3g", "cgc", 'c', ModItems.ImperioEssence, 'g', Items.GLOWSTONE_DUST, '3', "InfusionStoneT3Plus"));
		}

		if (PrimordialConfig.enablePrismarineShardCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.PrismarineShardSeeds), "epe", "pip", "epe", 'i', "InfusionStoneT2Plus", 'p', Items.PRISMARINE_SHARD, 'e', ModItems.CrucioEssence));
		}

		if (PrimordialConfig.enableFireCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.FireSeeds), "XYX", "Y3Y", "XYX", '3', "InfusionStoneT3Plus", 'Y', Items.LAVA_BUCKET, 'X', ModItems.ImperioEssence));
		}
		if (PrimordialConfig.enableExperienceCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ExperienceSeeds), "ibi", "g4a", "ifi", 'b', Items.BONE, 'i', ModItems.ImperioEssence, 'g', Items.GUNPOWDER, 'a', Items.ARROW, 'f', Items.ROTTEN_FLESH, '4', "InfusionStoneT4Plus"));
		}
		if (PrimordialConfig.enableEmeraldCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.EmeraldSeeds), "iei", "e4e", "iei", 'i', ModItems.ZivicioEssence, 'e', Items.EMERALD, '4', "InfusionStoneT4Plus"));
		}
		if (PrimordialConfig.enableEarthCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.EarthSeeds), "asa", "d2d", "asa", 's', ModCrops.MinicioSeeds, 'd', Blocks.DIRT, '2', "InfusionStoneT2Plus", 'a', ModItems.AccioEssence));
		}
		if (PrimordialConfig.enableDyeCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.DyeSeeds), "ada", "d2d", "ada", 'a', ModItems.CrucioEssence, '2', "InfusionStoneT2Plus", 'd', "dye"));
		}
		if (PrimordialConfig.enableEnderCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.EnderSeeds), "iei", "e4e", "iei", 'e', Items.ENDER_PEARL, 'i', ModItems.ImperioEssence, '4', "InfusionStoneT4Plus"));
		}
		if (PrimordialConfig.enableWaterCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.WaterSeeds), "XYX", "Y3Y", "XYX", '3', "InfusionStoneT2Plus", 'Y', Items.WATER_BUCKET, 'X', ModItems.CrucioEssence));
		}

		//
		// Grass Drop
		//

		if (PrimordialConfig.addMinicioSeedToGrassDrop)
			MinecraftForge.addGrassSeed(new ItemStack(ModCrops.MinicioSeeds), 15);

		//
		// Mob Seeds
		//

		if (PrimordialConfig.enableBlazeCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.BlazeSeeds), "aga", "g1g", "aga", 'a', ModItems.ImperioEssence, 'g', Items.BLAZE_ROD, '1', "InfusionStoneT4Plus"));
		}
		if (PrimordialConfig.enableChickenCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ChickenSeeds), "aga", "g1g", "aga", 'a', ModItems.AccioEssence, 'g', Items.CHICKEN, '1', "InfusionStoneT2Plus"));
		}
		if (PrimordialConfig.enableCowCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.CowSeeds), "aga", "g1g", "aga", 'a', ModItems.AccioEssence, 'g', Items.BEEF, '1', "InfusionStoneT2Plus"));
		}
		if (PrimordialConfig.enablePigCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.PigSeeds), "aga", "g1g", "aga", 'a', ModItems.AccioEssence, 'g', Items.PORKCHOP, '1', "InfusionStoneT2Plus"));
		}
		if (PrimordialConfig.enableSheepCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.SheepSeeds), "aga", "g1g", "aga", 'a', ModItems.AccioEssence, 'g', Items.MUTTON, '1', "InfusionStoneT2Plus"));
		}
		if (PrimordialConfig.enableCreeperCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.CreeperSeeds), "aga", "g1g", "aga", 'a', ModItems.CrucioEssence, 'g', Items.GUNPOWDER, '1', "InfusionStoneT3Plus"));
		}
		if (PrimordialConfig.enableZombieCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ZombieSeeds), "aga", "g1g", "aga", 'a', ModItems.CrucioEssence, 'g', Items.ROTTEN_FLESH, '1', "InfusionStoneT3Plus"));
		}
		if (PrimordialConfig.enableSkeletonCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.SkeletonSeeds), "aga", "g1g", "aga", 'a', ModItems.CrucioEssence, 'g', Items.BONE, '1', "InfusionStoneT3Plus"));
		}
		if (PrimordialConfig.enableSlimeCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.SlimeSeeds), "aga", "g1g", "aga", 'a', ModItems.CrucioEssence, 'g', Items.SLIME_BALL, '1', "InfusionStoneT3Plus"));
		}
		if (PrimordialConfig.enableSpiderCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.SpiderSeeds), "aga", "g1g", "aga", 'a', ModItems.CrucioEssence, 'g', Items.SPIDER_EYE, '1', "InfusionStoneT3Plus"));
		}
		if (PrimordialConfig.enableWitherCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.WitherSeeds), "aga", "g1g", "aga", 'a', ModItems.ImperioEssence, 'g', new ItemStack(Items.SKULL, 1, 1), '1', "InfusionStoneT4Plus"));
		}
		if (PrimordialConfig.enableGhastCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.GhastSeeds), "aga", "g1g", "aga", 'a', ModItems.ImperioEssence, 'g', Items.GHAST_TEAR, '1', "InfusionStoneT4Plus"));
		}

		//
		//
		// **NOTE **
		//
		// If the Primary essence is disabled, the recipe is NOT registered, there are far too many possible combinations to use alternate for everything
		//
		//


		// -------------
		// Vanilla Items
		// -------------

		// Air Essence
		if (PrimordialConfig.enableAirCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.AirSeeds), "aga", "g1g", "aga", 'a', ModItems.CrucioEssence, 'g', Items.GLASS_BOTTLE, '1', "InfusionStoneT2Plus"));
			if (PrimordialConfig.enableWaterCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.SNOWBALL, 32), "ox ", "xo ", "   ", 'o', ModCrops.WaterEssence, 'x', ModCrops.AirEssence);
			} else {
				GameRegistry.addRecipe(new ItemStack(Items.SNOWBALL, 32), "ox ", "xo ", "   ", 'o', Items.WATER_BUCKET, 'x', ModCrops.AirEssence);
			}
			GameRegistry.addRecipe(new ItemStack(Items.GLASS_BOTTLE, 6), "   ", "X X", "XXX", 'X', ModCrops.AirEssence);
		}

		// Earth Essence
		if (PrimordialConfig.enableEarthCrop) {
			GameRegistry.addRecipe(new ItemStack(Blocks.DIRT, 32), "dd ", "dd ", "   ", 'd', ModCrops.EarthEssence);

			if (PrimordialConfig.enableNatureCrop) {
				GameRegistry.addRecipe(new ItemStack(Blocks.GRASS, 16), "nn ", "ee ", "   ", 'n', ModCrops.NatureEssence, 'e', ModCrops.EarthEssence);
				GameRegistry.addRecipe(new ItemStack(Blocks.DIRT, 16, 2), "ee ", "nn ", "   ", 'n', ModCrops.NatureEssence, 'e', ModCrops.EarthEssence); // reverse Grass = Podzol recipe
				GameRegistry.addRecipe(new ItemStack(Blocks.SAND, 32), "se ", "es ", "   ", 's', ModCrops.EarthEssence, 'e', ModCrops.NatureEssence);
				GameRegistry.addRecipe(new ItemStack(Blocks.SAND, 32, 1), "es ", "se ", "   ", 's', ModCrops.EarthEssence, 'e', ModCrops.NatureEssence); // Red Sand
				if (PrimordialConfig.enableFireCrop) {
					GameRegistry.addRecipe(new ItemStack(Blocks.GLASS, 32), " e ", "nfn", " e ", 'n', ModCrops.NatureEssence, 'e', ModCrops.EarthEssence, 'f', ModCrops.FireEssence); // Glass
				}
			}
			if (PrimordialConfig.enableFireCrop) {
				GameRegistry.addRecipe(new ItemStack(Blocks.GRAVEL, 32), "ee ", "ff ", "   ", 'e', ModCrops.EarthEssence, 'f', ModCrops.FireEssence);
				GameRegistry.addRecipe(new ItemStack(Items.FLINT, 32), "ff ", "ee ", "   ", 'e', ModCrops.EarthEssence, 'f', ModCrops.FireEssence);
			}
		}

		//Nature Essence
		if (PrimordialConfig.enableNatureCrop) {
			GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE, 32), "sss", "s s", "sss", 's', ModCrops.NatureEssence);
			GameRegistry.addRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE, 8), "sss", "sns", "sss", 's', Blocks.COBBLESTONE, 'n', ModCrops.NatureEssence);
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.MYCELIUM, 8), "ndn", "dmd", "ndn", 'n', ModCrops.NatureEssence, 'd', Blocks.DIRT, 'm', "smallShroom"));
			GameRegistry.addRecipe(new ItemStack(Blocks.VINE, 16), "n n", "nnn", "n n", 'n', ModCrops.NatureEssence);
			GameRegistry.addRecipe(new ItemStack(Blocks.WATERLILY, 8), " n ", "nnn", "n n", 'n', ModCrops.NatureEssence);
			if (PrimordialConfig.enableWaterCrop) {
				if (PrimordialConfig.enableFireCrop) {
					GameRegistry.addRecipe(new ItemStack(Blocks.SPONGE, 16), " e ", "fwf", " e ", 'e', ModCrops.NatureEssence, 'f', ModCrops.FireEssence, 'w', ModCrops.WaterEssence); // Sponge
				}
			}
		}

		// Fire Essence
		if (PrimordialConfig.enableFireCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.LAVA_BUCKET), " n ", "nbn", " n ", 'b', Items.BUCKET, 'n', ModCrops.FireEssence);
		}

		//Water Essence
		if (PrimordialConfig.enableWaterCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.WATER_BUCKET), " w ", "wbw", " w ", 'w', ModCrops.WaterEssence, 'b', Items.BUCKET);
			if (PrimordialConfig.enableNatureCrop) {
				GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 16), "wn ", "nn ", "   ", 'w', ModCrops.WaterEssence, 'n', ModCrops.NatureEssence); // Oak Wood
				GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 16, 1), "nw ", "nn ", "   ", 'w', ModCrops.WaterEssence, 'n', ModCrops.NatureEssence); // Spruce Wood
				GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 16, 2), "nn ", "wn ", "   ", 'w', ModCrops.WaterEssence, 'n', ModCrops.NatureEssence); // Birch Wood
				GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 16, 3), "nn ", "nw ", "   ", 'w', ModCrops.WaterEssence, 'n', ModCrops.NatureEssence); // Jungle Wood
				GameRegistry.addRecipe(new ItemStack(Blocks.LOG2, 16), "ww ", "nn ", "   ", 'w', ModCrops.WaterEssence, 'n', ModCrops.NatureEssence); // Acacia Wood
				GameRegistry.addRecipe(new ItemStack(Blocks.LOG2, 16, 1), "nn ", "ww ", "   ", 'w', ModCrops.WaterEssence, 'n', ModCrops.NatureEssence); // Dark Oak Wood
			}
			if (PrimordialConfig.enableEarthCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 32), "we ", "ew ", "   ", 'e', ModCrops.EarthEssence, 'w', ModCrops.WaterEssence); // clay ball
			}
		}

		// Nether Essence
		if (PrimordialConfig.enableNetherCrop) {
			GameRegistry.addRecipe(new ItemStack(Blocks.NETHERRACK, 16), "nnn", "   ", "nnn", 'n', ModCrops.NetherEssence);
			GameRegistry.addRecipe(new ItemStack(Blocks.SOUL_SAND, 12), "nnn", "n n", "nnn", 'n', ModCrops.NetherEssence);
			GameRegistry.addRecipe(new ItemStack(Items.NETHER_WART, 12), "n n", " n ", "n n", 'n', ModCrops.NetherEssence);
		}


		// Dye Essence
		if (PrimordialConfig.enableDyeCrop) {
			if (PrimordialConfig.enableWaterCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 0), "dwd", "   ", "   ", 'd', ModCrops.DyeEssence, 'w', ModCrops.WaterEssence);
			}
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 1), "ddd", "   ", "   ", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 2), "dd ", "  ", "  ", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 3), "d  ", " d ", "  d", 'd', ModCrops.DyeEssence);

			if (PrimordialConfig.enableLapisCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 4), "lll", "l l", "lll", 'l', ModCrops.LapisEssence);
			}
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 5), "d  ", "d  ", "d  ", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 6), " d ", " d ", " d ", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 7), "   ", "d  ", "d  ", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 8), " d ", " d ", "   ", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 9), "  d", "  d", "   ", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 10), "  d", "   ", "  d", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 11), "   ", "   ", "ddd", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 12), "   ", "   ", "dd ", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 13), "   ", "dd ", "   ", 'd', ModCrops.DyeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 14), "   ", "ddd", "   ", 'd', ModCrops.DyeEssence);
			if (PrimordialConfig.enableSkeletonCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 15), "dsd", "   ", "   ", 'd', ModCrops.DyeEssence, 's', ModCrops.SkeletonEssence);
			}
		}

		// Ore Essence
		if (PrimordialConfig.enableDiamondCrop)
			GameRegistry.addRecipe(new ItemStack(Items.DIAMOND, 4), "ddd", "d d", "ddd", 'd', ModCrops.DiamondEssence);

		if (PrimordialConfig.enableIronCrop) {
			if (PrimordialConfig.enableNoOre) {
				GameRegistry.addRecipe(new ItemStack(Items.IRON_INGOT, 16), "iii", "i i", "iii", 'i', ModCrops.IronEssence);
			} else {
				GameRegistry.addRecipe(new ItemStack(Blocks.IRON_ORE, 6), "iii", "i i", "iii", 'i', ModCrops.IronEssence);
			}
		}

		if (PrimordialConfig.enableGoldCrop) {
			if (PrimordialConfig.enableNoOre) {
				GameRegistry.addRecipe(new ItemStack(Items.GOLD_INGOT, 12), "ggg", "g g", "ggg", 'g', ModCrops.GoldEssence);
			} else {
				GameRegistry.addRecipe(new ItemStack(Blocks.GOLD_ORE, 6), "ggg", "g g", "ggg", 'g', ModCrops.GoldEssence);
			}
		}

		if (PrimordialConfig.enableCoalCrop)
			GameRegistry.addRecipe(new ItemStack(Items.COAL, 16), "ccc", "c c", "ccc", 'c', ModCrops.CoalEssence);
		if (PrimordialConfig.enableRedstoneCrop)
			GameRegistry.addRecipe(new ItemStack(Items.REDSTONE, 16), "rrr", "r r", "rrr", 'r', ModCrops.RedstoneEssence);
		if (PrimordialConfig.enableQuartzCrop)
			GameRegistry.addRecipe(new ItemStack(Items.QUARTZ, 16), "qqq", "q q", "qqq", 'q', ModCrops.QuartzEssence);
		if (PrimordialConfig.enableObsidianCrop)
			GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN, 16), "ooo", "o o", "ooo", 'o', ModCrops.ObsidianEssence);
		if (PrimordialConfig.enableEmeraldCrop)
			GameRegistry.addRecipe(new ItemStack(Items.EMERALD, 4), "eee", "e e", "eee", 'e', ModCrops.EmeraldEssence);
		if (PrimordialConfig.enableGlowstoneCrop)
			GameRegistry.addRecipe(new ItemStack(Items.GLOWSTONE_DUST, 16), "ggg", "g g", "ggg", 'g', ModCrops.GlowstoneEssence);
		if (PrimordialConfig.enableExperienceCrop)
			GameRegistry.addRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 8), "eee", "e e", "eee", 'e', ModCrops.ExperienceEssence);

		// Blaze Essence

		if (PrimordialConfig.enableBlazeCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.BLAZE_ROD, 6), "eee", "   ", "   ", 'e', ModCrops.BlazeEssence);
			GameRegistry.addRecipe(new ItemStack(Items.BLAZE_POWDER, 12), "   ", "   ", "eee", 'e', ModCrops.BlazeEssence);
		}

		// Pig Essence
		if (PrimordialConfig.enablePigCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.PORKCHOP, 16), "ddd", "d d", "ddd", 'd', ModCrops.PigEssence);
			if (PrimordialConfig.enableFireCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.COOKED_PORKCHOP, 16), "ddd", "dfd", "ddd", 'd', ModCrops.PigEssence, 'f', ModCrops.FireEssence);
			}
		}

		// Chicken Essence
		if (PrimordialConfig.enableChickenCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.CHICKEN, 16), "ddd", "d d", "ddd", 'd', ModCrops.ChickenEssence);
			GameRegistry.addRecipe(new ItemStack(Items.FEATHER, 4), "X X", "X X", "X X", 'X', ModCrops.ChickenEssence);
			if (PrimordialConfig.enableFireCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.COOKED_CHICKEN, 16), "ddd", "dfd", "ddd", 'd', ModCrops.ChickenEssence, 'f', ModCrops.FireEssence);
			}
		}


		// Sheep Essence
		if (PrimordialConfig.enableSheepCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.MUTTON, 16), "ddd", "d d", "ddd", 'd', ModCrops.SheepEssence);
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 0), " w ", "w w", " w ", 'w', ModCrops.SheepEssence));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 1), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 14)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 2), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 13)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 3), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 12)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 4), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 11)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 5), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 10)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 6), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 9)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 7), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 8)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 8), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 7)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 9), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 6)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 10), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 5)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 11), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 4)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 12), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 3)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 13), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 2)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 14), " w ", "wdw", " w ", 'w', ModCrops.SheepEssence, 'd', new ItemStack(Items.DYE, 1, 1)));
			if (PrimordialConfig.enableFireCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.COOKED_MUTTON, 16), "ddd", "dfd", "ddd", 'd', ModCrops.SheepEssence, 'f', ModCrops.FireEssence);
			}
		}

		// Cow Essence
		if (PrimordialConfig.enableCowCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.BEEF, 16), "ddd", "d d", "ddd", 'd', ModCrops.CowEssence);
			GameRegistry.addRecipe(new ItemStack(Items.LEATHER, 8), "ll ", "ll ", "   ", 'l', ModCrops.CowEssence);
			GameRegistry.addRecipe(new ItemStack(Items.MILK_BUCKET), " c ", "cbc", " c ", 'c', ModCrops.CowEssence, 'b', Items.BUCKET);
			if (PrimordialConfig.enableFireCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.COOKED_BEEF, 16), "ddd", "dfd", "ddd", 'd', ModCrops.CowEssence, 'f', ModCrops.FireEssence);
			}
		}


		// Ender Essence
		if (PrimordialConfig.enableEnderCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.ENDER_PEARL, 4), "e e", "   ", "e e", 'e', ModCrops.EnderEssence);
			GameRegistry.addRecipe(new ItemStack(Blocks.END_STONE, 8), "ee ", "ee ", "   ", 'e', ModCrops.EnderEssence);
			if (PrimordialConfig.enableEmeraldCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.CHORUS_FRUIT, 16), "XYX", "Y Y", "XYX", 'X', ModCrops.EmeraldEssence, 'Y', ModCrops.EnderEssence);
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.CHORUS_FLOWER, 2), "ese", "sbs", "ese", 'e', ModCrops.EnderEssence, 's', ModCrops.EmeraldEssence, 'b', new ItemStack(Blocks.DOUBLE_PLANT, 1)));
			}
			if (PrimordialConfig.enableFireCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ENDER_EYE, 4), "ebe", "b b", "ebe", 'e', ModCrops.EnderEssence, 'b', ModCrops.FireEssence));
			}
		}

		// Ghast Essence
		if (PrimordialConfig.enableGhastCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.GHAST_TEAR, 8), "ddd", "d d", "ddd", 'd', ModCrops.GhastEssence);
		}

		// Creeper Essence
		if (PrimordialConfig.enableCreeperCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.SKULL, 1, 4), "ebe", "beb", "ebe", 'e', ModCrops.CreeperEssence, 'b', Items.BONE));
			GameRegistry.addRecipe(new ItemStack(Items.GUNPOWDER, 8), "XXX", "X X", "XXX", 'X', ModCrops.CreeperEssence);
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_13, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 11));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_11, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 8));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_BLOCKS, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 14));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_CAT, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 2));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_CHIRP, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 1));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_FAR, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 10));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_MALL, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 5));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_MELLOHI, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 9));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_STAL, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 0));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_STRAD, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 15));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_WAIT, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 4));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_WARD, 1), "beb", "ede", "beb", 'e', ModCrops.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 6));
		}

		// Zombie Essence
		if (PrimordialConfig.enableZombieCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.SKULL, 1, 2), "ebe", "beb", "ebe", 'e', ModCrops.ZombieEssence, 'b', Items.BONE));
			GameRegistry.addRecipe(new ItemStack(Items.ROTTEN_FLESH, 16), "fff", "f f", "fff", 'f', ModCrops.ZombieEssence);
		}

		// Slime Essence
		if (PrimordialConfig.enableSlimeCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.SLIME_BALL, 8), " s ", "s s", " s ", 's', ModCrops.SlimeEssence);
			if (PrimordialConfig.enableFireCrop) {
				GameRegistry.addRecipe(new ItemStack(Items.MAGMA_CREAM, 8), "fsf", "s s", "fsf", 's', ModCrops.SlimeEssence, 'f', ModCrops.FireEssence);
			}
		}

		// Wither Essence
		if (PrimordialConfig.enableWitherCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.SKULL, 1, 1), "wbw", "bwb", "wbw", 'w', ModCrops.WitherEssence, 'b', Items.BONE);
		}

		// Skeleton Essence
		if (PrimordialConfig.enableSkeletonCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.SKULL, 1, 0), "ebe", "beb", "ebe", 'e', ModCrops.SkeletonEssence, 'b', Items.BONE));
			GameRegistry.addRecipe(new ItemStack(Items.BONE, 16), "bbb", "b b", "bbb", 'b', ModCrops.SkeletonEssence);
		}

		// Spider Essence
		if (PrimordialConfig.enableSpiderCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.FERMENTED_SPIDER_EYE, 8), "ses", "e e", "ses", 'e', ModCrops.SpiderEssence, 's', Items.SUGAR);
			GameRegistry.addRecipe(new ItemStack(Items.STRING, 8), " e ", "e e", " e ", 'e', ModCrops.SpiderEssence);
			GameRegistry.addRecipe(new ItemStack(Items.SPIDER_EYE, 8), "s s", " s ", "s s", 's', ModCrops.SpiderEssence);
		}


		// Special Crop Stuff

		if (PrimordialConfig.enableNetherStarCrop) {
			if (PrimordialConfig.specialCropsAreTooHard) {
				if (PrimordialConfig.enableNetherCrop) {
					LogHelper.info("Registering Easy Recipe for NetherStar Seed");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.NetherStarSeeds), "aga", "n1n", "aga", 'a', ModItems.CrucioEssence, 'g', Items.NETHER_STAR, 'n', ModCrops.NetherEssence, '1', "InfusionStoneT3Plus"));
				} else {
					LogHelper.info("Registering Alternate Easy Recipe for NetherStar Seed");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.NetherStarSeeds), "aga", "n1n", "aga", 'a', ModItems.CrucioEssence, 'g', Items.NETHER_STAR, 'n', Items.MAGMA_CREAM, '1', "InfusionStoneT3Plus"));
				}
			} else {
				LogHelper.info("Registering Hard Recipes for NetherStar Seed");
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.NetherStarSeeds), "aga", "g1g", "aga", 'a', ModItems.ZivicioEssence, 'g', Items.NETHER_STAR, '1', "InfusionStoneT5Plus"));
			}
			GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR, 1), "sss", "s s", "sss", 's', ModCrops.NetherStarEssence);
		}

		if (PrimordialConfig.enableDragonEggCrop) {
			if (PrimordialConfig.specialCropsAreTooHard) {
				if (PrimordialConfig.enableEnderCrop) {
					LogHelper.info("Registering Easy Recipe for DragonEgg Seed");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.DragonEggSeeds), "zdz", "e5e", "zez", 'z', ModItems.CrucioEssence, 'd', Blocks.DRAGON_EGG, '5', "InfusionStoneT3Plus", 'e', ModCrops.EnderEssence));
				} else {
					LogHelper.info("Registering Alternate Easy Recipe for DragonEgg Seed");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.DragonEggSeeds), "zdz", "e5e", "zez", 'z', ModItems.CrucioEssence, 'd', Blocks.DRAGON_EGG, '5', "InfusionStoneT3Plus", 'e', Items.ENDER_PEARL));
				}
			} else {
				if (PrimordialConfig.enableEnderCrop) {
					LogHelper.info("Registering Hard Recipes for DragonEgg Seed");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.DragonEggSeeds), "zdz", "e5e", "zez", 'z', ModItems.ZivicioEssence, 'd', Blocks.DRAGON_EGG, '5', "InfusionStoneT5Plus", 'e', ModCrops.EnderEssence));
				} else {
					LogHelper.info("Registering Alternate Hard Recipes for DragonEgg Seed");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.DragonEggSeeds), "zdz", "e5e", "zez", 'z', ModItems.ZivicioEssence, 'd', Blocks.DRAGON_EGG, '5', "InfusionStoneT5Plus", 'e', Items.ENDER_PEARL));
				}
			}
			GameRegistry.addRecipe(new ItemStack(Blocks.DRAGON_EGG, 1), "ddd", "d d", "ddd", 'd', ModCrops.DragonEggEssence);
			GameRegistry.addRecipe(new ItemStack(Items.DRAGON_BREATH, 4), "beb", "e e", "beb", 'b', Items.GLASS_BOTTLE, 'e', ModCrops.DragonEggEssence);
		}

		//
		// Food Items
		//

		if (PrimordialConfig.enableCakeCrop) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.CakeSeeds), "aga", "g1g", "aga", 'a', ModItems.AccioEssence, 'g', Items.CAKE, '1', "InfusionStoneT2Plus"));
			GameRegistry.addRecipe(new ItemStack(Items.CAKE, 1), "cc ", "cc ", "   ", 'c', ModCrops.CakeEssence);
		}
		if (PrimordialConfig.enableDonutCrop) {
			GameRegistry.addRecipe(new ItemStack(ModCrops.Donut), "XX ", "XX ", "   ", 'X', ModCrops.DonutEssence);
			GameRegistry.addRecipe(new ItemStack(ModCrops.DonutSeeds), "XXX", "ZYZ", "   ", 'X', Items.WHEAT, 'Y', Items.MILK_BUCKET, 'Z', Items.SUGAR);
		}

		//
		// Random Stuff
		//

		if (PrimordialConfig.enablePrismarineShardCrop) {
			GameRegistry.addRecipe(new ItemStack(Items.PRISMARINE_SHARD, 8), "sss", "s s", "sss", 's', ModCrops.PrismarineShardEssence);
			GameRegistry.addRecipe(new ItemStack(Items.PRISMARINE_CRYSTALS, 8), "sss", "sns", "sss", 's', ModCrops.PrismarineShardEssence, 'n', Items.WHEAT_SEEDS);
		}
		if (PrimordialConfig.enableGoldCrop)
			GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_APPLE), "XXX", "XYX", "XXX", 'X', ModCrops.GoldEssence, 'Y', Items.APPLE);
		if (PrimordialConfig.enableIronCrop)
			GameRegistry.addRecipe(new ItemStack(Items.BUCKET), "   ", "X X", " X ", 'X', ModCrops.IronEssence);
		if (PrimordialConfig.enableFireCrop) {
			if (PrimordialConfig.enableEarthCrop) {
				if (PrimordialConfig.enableDiamondCrop) {
					GameRegistry.addRecipe(new ItemStack(Items.SADDLE), "XYX", "YDY", "   ", 'X', ModCrops.FireEssence, 'Y', ModCrops.EarthEssence, 'D', ModCrops.DiamondEssence);
				}
			}
		}

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.AccioEssence, 1), " m ", "mtm", " m ", 'm', ModCrops.MinicioEssence, 't', "InfusionStoneT1Plus"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.CrucioEssence, 1), " m ", "mtm", " m ", 'm', ModItems.AccioEssence, 't', "InfusionStoneT2Plus"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ImperioEssence, 1), " m ", "mtm", " m ", 'm', ModItems.CrucioEssence, 't', "InfusionStoneT3Plus"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ZivicioEssence, 1), " m ", "mtm", " m ", 'm', ModItems.ImperioEssence, 't', "InfusionStoneT4Plus"));

		if (PrimordialConfig.infusionStoneDurability) {

			GameRegistry.addRecipe(new ItemStack(ModItems.InfusionStoneT1, 1, 0), " s ", "sds", " s ", 's', ModCrops.MinicioSeeds, 'd', Items.DIAMOND);
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT2, 1, 0), "ccc", "ctc", "ccc", 'c', "T2Essence", 't', new ItemStack(ModItems.InfusionStoneT1, 1, OreDictionary.WILDCARD_VALUE)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT3, 1, 0), "XXX", "XYX", "XXX", 'X', "T3Essence", 'Y', new ItemStack(ModItems.InfusionStoneT2, 1, OreDictionary.WILDCARD_VALUE)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT4, 1, 0), "XXX", "XYX", "XXX", 'X', "T4Essence", 'Y', new ItemStack(ModItems.InfusionStoneT3, 1, OreDictionary.WILDCARD_VALUE)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT5, 1, 0), "XXX", "XYX", "XXX", 'X', "T5Essence", 'Y', new ItemStack(ModItems.InfusionStoneT4, 1, OreDictionary.WILDCARD_VALUE)));
		} else {

			GameRegistry.addRecipe(new ItemStack(ModItems.InfusionStoneT1, 1), " s ", "sds", " s ", 's', ModCrops.MinicioSeeds, 'd', Items.DIAMOND);
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT2, 1), "ccc", "ctc", "ccc", 'c', "T2Essence", 't', ModItems.InfusionStoneT1));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT3, 1), "XXX", "XYX", "XXX", 'X', "T3Essence", 'Y', ModItems.InfusionStoneT2));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT4, 1), "XXX", "XYX", "XXX", 'X', "T4Essence", 'Y', ModItems.InfusionStoneT3));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT5, 1), "XXX", "XYX", "XXX", 'X', "T5Essence", 'Y', ModItems.InfusionStoneT4));
		}

		//
		// Weapons
		//

		if (PrimordialConfig.enableWeapons) {
			GameRegistry.addRecipe(new ItemStack(ModItems.AccioSword), " e ", "ese", " e ", 'e', ModItems.AccioEssence, 's', Items.DIAMOND_SWORD);
			GameRegistry.addRecipe(new ItemStack(ModItems.CrucioSword), " e ", "ese", " e ", 'e', ModItems.CrucioEssence, 's', ModItems.AccioSword);
			GameRegistry.addRecipe(new ItemStack(ModItems.ImperioSword), " e ", "ese", " e ", 'e', ModItems.ImperioEssence, 's', ModItems.CrucioSword);
			GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioSword), " e ", "ese", " e ", 'e', ModItems.ZivicioEssence, 's', ModItems.ImperioSword);
		}

		//
		// Tools
		//

		if (PrimordialConfig.enableTools) {
			GameRegistry.addRecipe(new ItemStack(ModItems.AccioPickAxe), "iii", " s ", " s ", 'i', ModItems.accioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.AccioAxe), "ii ", "is ", " s ", 'i', ModItems.accioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.AccioShovel), " i ", " s ", " s ", 'i', ModItems.accioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.AccioHoe), "ii ", " s ", " s ", 'i', ModItems.accioIngot, 's', Items.STICK);

			GameRegistry.addRecipe(new ItemStack(ModItems.CrucioPickAxe), "iii", " s ", " s ", 'i', ModItems.crucioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.CrucioAxe), "ii ", "is ", " s ", 'i', ModItems.crucioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.CrucioShovel), " i ", " s ", " s ", 'i', ModItems.crucioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.CrucioHoe), "ii ", " s ", " s ", 'i', ModItems.crucioIngot, 's', Items.STICK);

			GameRegistry.addRecipe(new ItemStack(ModItems.ImperioPickAxe), "iii", " s ", " s ", 'i', ModItems.imperioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.ImperioAxe), "ii ", "is ", " s ", 'i', ModItems.imperioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.ImperioShovel), " i ", " s ", " s ", 'i', ModItems.imperioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.ImperioHoe), "ii ", " s ", " s ", 'i', ModItems.imperioIngot, 's', Items.STICK);

			GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioPickAxe), "iii", " s ", " s ", 'i', ModItems.zivicioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioAxe), "ii ", "is ", " s ", 'i', ModItems.zivicioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioShovel), " i ", " s ", " s ", 'i', ModItems.zivicioIngot, 's', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioHoe), "ii ", " s ", " s ", 'i', ModItems.zivicioIngot, 's', Items.STICK);
		}

		if (PrimordialConfig.enableArmour) {
			GameRegistry.addRecipe(new ItemStack(ModItems.AccioHelmet), "   ", "iii", "i i", 'i', ModItems.accioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.AccioChestPlate), "i i", "iii", "iii", 'i', ModItems.accioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.AccioLeggings), "iii", "i i", "i i", 'i', ModItems.accioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.AccioBoots), "   ", "i i", "i i", 'i', ModItems.accioIngot);

			GameRegistry.addRecipe(new ItemStack(ModItems.CrucioHelmet), "   ", "iii", "i i", 'i', ModItems.crucioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.CrucioChestPlate), "i i", "iii", "iii", 'i', ModItems.crucioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.CrucioLeggings), "iii", "i i", "i i", 'i', ModItems.crucioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.CrucioBoots), "   ", "i i", "i i", 'i', ModItems.crucioIngot);

			GameRegistry.addRecipe(new ItemStack(ModItems.ImperioHelmet), "   ", "iii", "i i", 'i', ModItems.imperioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.ImperioChestPlate), "i i", "iii", "iii", 'i', ModItems.imperioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.ImperioLeggings), "iii", "i i", "i i", 'i', ModItems.imperioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.ImperioBoots), "   ", "i i", "i i", 'i', ModItems.imperioIngot);

			GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioHelmet), "   ", "iii", "i i", 'i', ModItems.zivicioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioChestPlate), "i i", "iii", "iii", 'i', ModItems.zivicioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioLeggings), "iii", "i i", "i i", 'i', ModItems.zivicioIngot);
			GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioBoots), "   ", "i i", "i i", 'i', ModItems.zivicioIngot);

		}


		//
		// Mod Compatability
		//
		// Detect each mod and add seeds/recipes ONLY for the item specific to there mod.
		//
		// Common items that appear in multiple mods (e.x. multiple Copper ores) are detected
		// by OreDictionary name later on so we only register 1 seed instead of 10 copper seeds (for example)

		if (Loader.isModLoaded("tconstruct")) {
			if (PrimordialConfig.enableArditeCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ArditeSeeds), "XYX", "YZY", "XYX", 'Y', "ingotArdite", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotArdite", 4), "XXX", "X X", "XXX", 'X', ModCrops.ArditeEssence));
			}
			if (PrimordialConfig.enableCobaltCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.CobaltSeeds), "XYX", "YZY", "XYX", 'Y', "ingotCobalt", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotCobalt", 4), "XXX", "X X", "XXX", 'X', ModCrops.CobaltEssence));
			}
			if (PrimordialConfig.enableManyullynCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ManyullynSeeds), "XYX", "YZY", "XYX", 'Y', "ingotManyullyn", 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT4Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotManyullyn", 4), "XXX", "X X", "XXX", 'X', ModCrops.ManyullynEssence));
			}
			if (PrimordialConfig.enableKnightSlimeCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.KnightSlimeSeeds), "XYX", "YZY", "XYX", 'Y', "ingotKnightslime", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotKnightslime", 4), "XXX", "X X", "XXX", 'X', ModCrops.KnightSlimeEssence));
			}
			if (PrimordialConfig.enablePigIronCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.PigIronSeeds), "XYX", "YZY", "XYX", 'Y', "ingotPigiron", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotPigiron", 4), "XXX", "X X", "XXX", 'X', ModCrops.PigIronEssence));
			}
		}

		if (Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableAluminumCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.AluminumSeeds), "XYX", "YZY", "XYX", 'Y', "ingotAluminum", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotAluminum", 4), "XXX", "X X", "XXX", 'X', ModCrops.AluminumEssence));
			}
			if (PrimordialConfig.enableNickelCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.NickelSeeds), "XYX", "YZY", "XYX", 'Y', "ingotNickel", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotNickel", 4), "XXX", "X X", "XXX", 'X', ModCrops.NickelEssence));
			}
			if (PrimordialConfig.enableElectrumCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ElectrumSeeds), "XYX", "YZY", "XYX", 'Y', "ingotElectrum", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotElectrum", 4), "XXX", "X X", "XXX", 'X', ModCrops.ElectrumEssence));
			}
			if (PrimordialConfig.enableConstantanCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ConstantanSeeds), "XYX", "YZY", "XYX", 'Y', "ingotConstantan", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotConstantan", 4), "XXX", "X X", "XXX", 'X', ModCrops.ConstantanEssence));
			}
		}

		if (Loader.isModLoaded("botania") || Loader.isModLoaded("Botania")) {
			if (PrimordialConfig.enableManaSteelCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ManaSteelSeeds), "XYX", "YZY", "XYX", 'Y', "ingotManasteel", 'X', ModItems.AccioEssence, 'Z', "InfusionStoneT2Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotManasteel", 4), "XXX", "X X", "XXX", 'X', ModCrops.ManaSteelEssence));
			}
			if (PrimordialConfig.enableTerraSteelCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.TerraSteelSeeds), "XYX", "YZY", "XYX", 'Y', "ingotTerrasteel", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotTerrasteel", 4), "XXX", "X X", "XXX", 'X', ModCrops.TerraSteelEssence));
			}
			if (PrimordialConfig.enableElementiumCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ElementiumSeeds), "XYX", "YZY", "XYX", 'Y', "ingotElvenElementium", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotElvenElementium", 4), "XXX", "X X", "XXX", 'X', ModCrops.ElementiumEssence));
			}
		}

		if (Loader.isModLoaded("IC2")) {
			if (PrimordialConfig.enableRubberCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.RubberSeeds), "XYX", "YZY", "XYX", 'Y', "itemRubber", 'X', ModItems.AccioEssence, 'Z', "InfusionStoneT2Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("itemRubber", 8), "XXX", "X X", "XXX", 'X', ModCrops.RubberEssence));
			}
		}

		if (Loader.isModLoaded("forestry")) {
			if (PrimordialConfig.enableApatiteCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.ApatiteSeeds), "XYX", "YZY", "XYX", 'Y', "gemApatite", 'X', ModItems.AccioEssence, 'Z', "InfusionStoneT2Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("gemApatite", 8), "XXX", "X X", "XXX", 'X', ModCrops.ApatiteEssence));
			}
		}

		if (Loader.isModLoaded("bigreactors")) {
			if (PrimordialConfig.enableYelloriteCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.YelloriteSeeds), "XYX", "YZY", "XYX", 'Y', "ingotYellorium", 'X', ModItems.AccioEssence, 'Z', "InfusionStoneT2Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotYellorium", 4), "XXX", "X X", "XXX", 'X', ModCrops.YelloriteEssence));
			}
			if (PrimordialConfig.enableLudicriteCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.LudicriteSeeds), "XYX", "YZY", "XYX", 'Y', "ingotLudicrite", 'X', ModItems.AccioEssence, 'Z', "InfusionStoneT2Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotLudicrite", 4), "XXX", "X X", "XXX", 'X', ModCrops.LudicriteEssence));
			}
			if (PrimordialConfig.enableCyaniteCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.CyaniteSeeds), "XYX", "YZY", "XYX", 'Y', "ingotCyanite", 'X', ModItems.AccioEssence, 'Z', "InfusionStoneT2Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotCyanite", 4), "XXX", "X X", "XXX", 'X', ModCrops.CyaniteEssence));
			}
			if (PrimordialConfig.enableBlutoniumCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.BlutoniumSeeds), "XYX", "YZY", "XYX", 'Y', "ingotBlutonium", 'X', ModItems.AccioEssence, 'Z', "InfusionStoneT2Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("ingotBlutonium", 4), "XXX", "X X", "XXX", 'X', ModCrops.BlutoniumEssence));
			}
		}

		if (Loader.isModLoaded("Mekanism")) {
			if (PrimordialConfig.enableOsmiumCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.OsmiumSeeds), "XYX", "YZY", "XYX", 'Y', "ingotOsmium", 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(getOreDictItemWithMeta("ingotOsmium", 4), "XXX", "X X", "XXX", 'X', ModCrops.OsmiumEssence);
			}
		}

		if (Loader.isModLoaded("draconicevolution")) {
			if (PrimordialConfig.enableDraconiumCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.DraconiumSeeds), "XYX", "YZY", "XYX", 'Y', "ingotDraconium", 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"));
				GameRegistry.addRecipe(getOreDictItemWithMeta("ingotDraconium", 4), "XXX", "X X", "XXX", 'X', ModCrops.DraconiumEssence);
			}
			if (PrimordialConfig.enableAwakeDraconiumCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.AwakeDraconiumSeeds), "XYX", "YZY", "XYX", 'Y', "ingotDraconiumAwakened", 'X', ModItems.ZivicioEssence, 'Z', "InfusionStoneT5Plus"));
				GameRegistry.addRecipe(getOreDictItemWithMeta("ingotDraconiumAwakened", 4), "XXX", "XzX", "XXX", 'X', ModCrops.AwakeDraconiumEssence, 'z', ModItems.ZivicioEssence);
			}
		}

		if (Loader.isModLoaded("appliedenergistics2")) {
			if (PrimordialConfig.enableCertusCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.CertusQuartzSeeds), "XYX", "YZY", "XYX", 'Y', "crystalCertusQuartz", 'X', ModItems.AccioEssence, 'Z', "InfusionStoneT2Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("crystalCertusQuartz", 8), "XXX", "X X", "XXX", 'X', ModCrops.CertusQuartzEssence));
			}
			if (PrimordialConfig.enableFluixCrop) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.FluixSeeds), "XYX", "YZY", "XYX", 'Y', "crystalFluix", 'X', ModItems.AccioEssence, 'Z', "InfusionStoneT2Plus"));
				GameRegistry.addRecipe(new ShapedOreRecipe(getOreDictItemWithMeta("crystalFluix", 8), "XXX", "X X", "XXX", 'X', ModCrops.FluixEssence));
			}
		}

		//
		// Hacky way to detect common mod items, so we don't register the same thing multiple times
		//
		// check oreDictionary for a certain name
		//

		if (OreDictionary.doesOreNameExist("ingotBronze")) {
			if (Loader.isModLoaded("IC2") || Loader.isModLoaded("forestry")) {
				if (PrimordialConfig.enableBronzeCrop) {
					LogHelper.info("Detected oreDictionary name 'ingotBronze', adding support for Bronze seeds/crafting recipes");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.BronzeSeeds), "XYX", "YZY", "XYX", 'Y', "ingotBronze", 'X', ModItems.AccioEssence, 'Z', "InfusionStoneT2Plus"));
					GameRegistry.addRecipe(new ItemStack(ModCrops.BronzeIngot, 4), "XXX", "X X", "XXX", 'X', ModCrops.BronzeEssence);
				}
			}
		}

		if (OreDictionary.doesOreNameExist("oreUranium")) {
			if (Loader.isModLoaded("IC2") || Loader.isModLoaded("immersiveengineering")) {
				if (PrimordialConfig.enableUraniumCrop) {
					LogHelper.info("Detected oreDictionary name 'oreUranium', adding support for Uranium seeds/crafting recipes");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.UraniumSeeds), "XYX", "YZY", "XYX", 'Y', "oreUranium", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
					GameRegistry.addRecipe(new ItemStack(ModBlocks.UraniumOre, 4), "XXX", "X X", "XXX", 'X', ModCrops.UraniumEssence);
				}
			}
		}

		if (OreDictionary.doesOreNameExist("ingotSteel")) {
			if (Loader.isModLoaded("IC2") || Loader.isModLoaded("immersiveengineering")) {
				if (PrimordialConfig.enableSteelCrop) {
					LogHelper.info("Detected oreDictionary name 'ingotSteel', adding support for Steel seeds/crafting recipes");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.SteelSeeds), "XYX", "YZY", "XYX", 'Y', "ingotSteel", 'X', ModItems.CrucioEssence, 'Z', "InfusionStoneT3Plus"));
					GameRegistry.addRecipe(new ItemStack(ModCrops.SteelIngot, 4), "XXX", "X X", "XXX", 'X', ModCrops.SteelEssence);
				}
			}
		}

		if (OreDictionary.doesOreNameExist("ingotCopper")) {
			if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("forestry") || Loader.isModLoaded("immersiveengineering")) {
				if (PrimordialConfig.enableCopperCrop) {
					LogHelper.info("Detected oreDictionary name 'ingotCopper', adding support for Copper seeds/crafting recipes");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.CopperSeeds), "XYX", "YZY", "XYX", 'Y', "ingotCopper", 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"));
					GameRegistry.addRecipe(new ItemStack(ModCrops.CopperIngot, 4), "XXX", "X X", "XXX", 'X', ModCrops.CopperEssence);
				}
			}
		}

		if (OreDictionary.doesOreNameExist("ingotTin")) {
			if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("forestry") || Loader.isModLoaded("immersiveengineering")) {
				if (PrimordialConfig.enableTinCrop) {
					LogHelper.info("Detected oreDictionary name 'ingotTin', adding support for Tin seeds/crafting recipes");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.TinSeeds), "XYX", "YZY", "XYX", 'Y', "ingotTin", 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"));
					GameRegistry.addRecipe(new ItemStack(ModCrops.TinIngot, 4), "XXX", "X X", "XXX", 'X', ModCrops.TinEssence);
				}
			}
		}

		if (OreDictionary.doesOreNameExist("ingotLead")) {
			if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("immersiveengineering")) {
				if (PrimordialConfig.enableLeadCrop) {
					LogHelper.info("Detected oreDictionary name 'ingotLead', adding support for Lead seeds/crafting recipes");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.LeadSeeds), "XYX", "YZY", "XYX", 'Y', "ingotLead", 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"));
					GameRegistry.addRecipe(new ItemStack(ModCrops.LeadIngot, 4), "XXX", "X X", "XXX", 'X', ModCrops.LeadEssence);
				}
			}
		}

		if (OreDictionary.doesOreNameExist("ingotSilver")) {
			if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("immersiveengineering")) {
				if (PrimordialConfig.enableSilverCrop) {
					LogHelper.info("Detected oreDictionary name 'ingotSilver', adding support for Silver seeds/crafting recipes");
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModCrops.SilverSeeds), "XYX", "YZY", "XYX", 'Y', "ingotSilver", 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"));
					GameRegistry.addRecipe(new ItemStack(ModCrops.SilverIngot, 4), "XXX", "X X", "XXX", 'X', ModCrops.SilverEssence);
				}
			}
		}
	}

	// returns an itemstack of the first block/Item id that matches the OreDict name
	public static ItemStack getOreDictItemWithMeta(String oreIdName, int num) {
		List<ItemStack> res = OreDictionary.getOres(oreIdName);
		if (res != null) {
			ItemStack[] res2 = res.toArray(new ItemStack[res.size()]);
			for (int i = 0; i < res.size(); ++i) {
				return new ItemStack(res2[i].getItem(), num, res2[i].getItemDamage());
			}
		}
		return null;
	}
}
