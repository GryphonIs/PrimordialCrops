package killbait.PrimordialCrops.Registry;


import killbait.PrimordialCrops.Utils.LogHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.List;

import static net.minecraft.init.Blocks.SKULL;

// TODO: add support for Tinkers (cobalt, ardite, manyullyn)
// TODO: Add support for Immersive Engineering (Bauxite/Aluminum, Nickel, electrum, Uranium, steel (ore dict with ic2?) )
// TODO: Add support for Botania (manasteel, terrasteel)

// TODO: add IC2 Bronze, Rubber, Steel

public class ModCrafting {

	public static void initCrafting() {

		// set Infusion Stones to be returned on crafting success
		ModItems.InfusionStoneT1.setContainerItem(ModItems.InfusionStoneT1);
		ModItems.InfusionStoneT2.setContainerItem(ModItems.InfusionStoneT2);
		ModItems.InfusionStoneT3.setContainerItem(ModItems.InfusionStoneT3);
		ModItems.InfusionStoneT4.setContainerItem(ModItems.InfusionStoneT4);
		ModItems.InfusionStoneT5.setContainerItem(ModItems.InfusionStoneT5);

		// Smelting
		GameRegistry.addSmelting(ModBlocks.MinicioOre, new ItemStack(ModItems.MinicioEssence, 4), 3.5F);

        // Coal Seeds
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.CoalSeeds), new Object[]{"scs","c1c","scs", 's', ModItems.MinicioEssence, 'c', Items.COAL, '1', "InfusionStoneT1Plus"}));

        // Diamond Seeds
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.DiamondSeeds), new Object[]{"idi","d5d","idi", 'i', ModItems.ZivicioEssence,'d', Items.DIAMOND, '5', "InfusionStoneT4Plus"}));
		//GameRegistry.addRecipe(new ItemStack(ModSeeds.DiamondSeeds), new Object[]{"idi","d5d","idi", 'i', ModItems.ZivicioEssence,'d', Items.DIAMOND, '5', ModItems.InfusionStoneT5});

        // Iron Seeds
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.IronSeeds), new Object[]{"cic","i2i","cic", 'c', ModItems.CrucioEssence, 'i', Items.IRON_INGOT, '2', "InfusionStoneT2Plus"}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.IronSeeds), new Object[]{"cic","i2i","cic", 'c', ModItems.CrucioEssence, 'i', Items.IRON_INGOT, '2', ModItems.InfusionStoneT3});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.IronSeeds), new Object[]{"cic","i2i","cic", 'c', ModItems.CrucioEssence, 'i', Items.IRON_INGOT, '2', ModItems.InfusionStoneT4});
		GameRegistry.addRecipe(new ItemStack(ModSeeds.IronSeeds), new Object[]{"cic","i2i","cic", 'c', ModItems.CrucioEssence, 'i', Items.IRON_INGOT, '2', ModItems.InfusionStoneT5});*/

		// Gold Seeds
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.GoldSeeds), new Object[]{"igi","g3g","igi", 'i', ModItems.ImperioEssence, 'g', Items.GOLD_INGOT, '3', "InfusionStoneT3Plus"}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.GoldSeeds), new Object[]{"igi","g3g","igi", 'i', ModItems.ImperioEssence, 'g', Items.GOLD_INGOT, '3', ModItems.InfusionStoneT4});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.GoldSeeds), new Object[]{"igi","g3g","igi", 'i', ModItems.ImperioEssence, 'g', Items.GOLD_INGOT, '3', ModItems.InfusionStoneT5});*/

        // Redstone Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.RedstoneSeeds), new Object[]{"ara","r3r","ara", 'a', ModItems.ImperioEssence, 'r', Items.REDSTONE, '3', "InfusionStoneT3Plus"}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.RedstoneSeeds), new Object[]{"ara","r3r","ara", 'a', ModItems.ImperioEssence, 'r', Items.REDSTONE, '3', ModItems.InfusionStoneT4});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.RedstoneSeeds), new Object[]{"ara","r3r","ara", 'a', ModItems.ImperioEssence, 'r', Items.REDSTONE, '3', ModItems.InfusionStoneT5});*/

        // (Vanilla) Quartz Seed
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.QuartzSeeds), new Object[]{"aqa","q3q","aqa", 'a', ModItems.ImperioEssence, 'q', Items.QUARTZ, '3', "InfusionStoneT3Plus"}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.QuartzSeeds), new Object[]{"aqa","q3q","aqa", 'a', ModItems.ImperioEssence, 'q', Items.QUARTZ, '3', ModItems.InfusionStoneT4});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.QuartzSeeds), new Object[]{"aqa","q3q","aqa", 'a', ModItems.ImperioEssence, 'q', Items.QUARTZ, '3', ModItems.InfusionStoneT5});*/

        // Obsidian Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.ObsidianSeeds), new Object[]{"ara","r4r","ara", 'a', ModItems.ZivicioEssence, 'r', Blocks.OBSIDIAN, '4', "InfusionStoneT4Plus"}));
        //GameRegistry.addRecipe(new ItemStack(ModSeeds.ObsidianSeeds), new Object[]{"ara","r4r","ara", 'a', ModItems.ZivicioEssence, 'r', Blocks.OBSIDIAN, '4', ModItems.InfusionStoneT4});
        //GameRegistry.addRecipe(new ItemStack(ModSeeds.ObsidianSeeds), new Object[]{"ara","r4r","ara", 'a', ModItems.ZivicioEssence, 'r', Blocks.OBSIDIAN, '4', ModItems.InfusionStoneT5});

        // Nether seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.NetherSeeds), new Object[]{"ara","r3r","ara", 'a', ModItems.ImperioEssence, 'r', Blocks.NETHERRACK, '3', "InfusionStoneT3Plus"}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.NetherSeeds), new Object[]{"ara","r3r","ara", 'a', ModItems.ImperioEssence, 'r', Blocks.NETHERRACK, '3', ModItems.InfusionStoneT4});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.NetherSeeds), new Object[]{"ara","r3r","ara", 'a', ModItems.ImperioEssence, 'r', Blocks.NETHERRACK, '3', ModItems.InfusionStoneT5});*/

        // Nature Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.NatureSeeds), new Object[]{" s ","sms"," s ", 's', Items.WHEAT_SEEDS, 'm', "InfusionStoneT2Plus"}));

        // Lapis Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.LapisSeeds), new Object[]{"ala","l2l","ala", 'a', ModItems.CrucioEssence, '2', "InfusionStoneT2Plus", 'l', new ItemStack(Items.DYE, 1, 4)}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.LapisSeeds), new Object[]{"ala","l2l","ala", 'a', ModItems.CrucioEssence, '2', ModItems.InfusionStoneT3, 'l', new ItemStack(Items.DYE, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.LapisSeeds), new Object[]{"ala","l2l","ala", 'a', ModItems.CrucioEssence, '2', ModItems.InfusionStoneT4, 'l', new ItemStack(Items.DYE, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.LapisSeeds), new Object[]{"ala","l2l","ala", 'a', ModItems.CrucioEssence, '2', ModItems.InfusionStoneT5, 'l', new ItemStack(Items.DYE, 1, 4)});*/

        // GlowStone Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.GlowstoneSeeds), new Object[]{"cgc","g3g","cgc", 'c', ModItems.ImperioEssence, 'g', Items.GLOWSTONE_DUST, '3', "InfusionStoneT3Plus"}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.GlowstoneSeeds), new Object[]{"cgc","g3g","cgc", 'c', ModItems.ImperioEssence, 'g', Items.GLOWSTONE_DUST, '3', ModItems.InfusionStoneT4});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.GlowstoneSeeds), new Object[]{"cgc","g3g","cgc", 'c', ModItems.ImperioEssence, 'g', Items.GLOWSTONE_DUST, '3', ModItems.InfusionStoneT5});*/

        // Fire Seeds
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.FireSeeds), new Object[]{"XYX","Y3Y","XYX", '3', "InfusionStoneT3Plus", 'Y', Items.LAVA_BUCKET, 'X', ModItems.ImperioEssence}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.FireSeeds), new Object[]{"XYX","Y3Y","XYX", '3', ModItems.InfusionStoneT4, 'Y', Items.LAVA_BUCKET, 'X', ModItems.ImperioEssence});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.FireSeeds), new Object[]{"XYX","Y3Y","XYX", '3', ModItems.InfusionStoneT5, 'Y', Items.LAVA_BUCKET, 'X', ModItems.ImperioEssence});*/

        // Experience Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.ExperienceSeeds), new Object[]{"ibi","g4a","ifi", 'b', Items.BONE, 'i', ModItems.ImperioEssence, 'g', Items.GUNPOWDER, 'a', Items.ARROW, 'f', Items.ROTTEN_FLESH, '4', "InfusionStoneT4Plus"}));
        //GameRegistry.addRecipe(new ItemStack(ModSeeds.ExperienceSeeds), new Object[]{"ibi","g4a","ifi", 'b', Items.BONE, 'i', ModItems.ImperioEssence, 'g', Items.GUNPOWDER, 'a', Items.ARROW, 'f', Items.ROTTEN_FLESH, '4', ModItems.InfusionStoneT4});
        //GameRegistry.addRecipe(new ItemStack(ModSeeds.ExperienceSeeds), new Object[]{"ibi","g4a","ifi", 'b', Items.BONE, 'i', ModItems.ImperioEssence, 'g', Items.GUNPOWDER, 'a', Items.ARROW, 'f', Items.ROTTEN_FLESH, '4', ModItems.InfusionStoneT5});

        // Emerald Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.EmeraldSeeds), new Object[]{"iei","e4e","iei", 'i', ModItems.ZivicioEssence, 'e', Items.EMERALD, '4', "InfusionStoneT4Plus"}));
        //GameRegistry.addRecipe(new ItemStack(ModSeeds.EmeraldSeeds), new Object[]{"iei","e4e","iei", 'i', ModItems.ImperioEssence, 'e', ModItems.ImperioEssence, '4', ModItems.InfusionStoneT4});
        //GameRegistry.addRecipe(new ItemStack(ModSeeds.EmeraldSeeds), new Object[]{"iei","e4e","iei", 'i', ModItems.ZivicioEssence, 'e', Items.EMERALD, '4', ModItems.InfusionStoneT5});

        // Earth Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.EarthSeeds), new Object[]{"asa","d2d","asa", 's', ModSeeds.MinicioSeeds, 'd', Blocks.DIRT, '2', "InfusionStoneT2Plus", 'a', ModItems.AccioEssence}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.EarthSeeds), new Object[]{"asa","d2d","asa", 's', ModSeeds.MinicioSeeds, 'd', Blocks.DIRT, '2', ModItems.InfusionStoneT3, 'a', ModItems.AccioEssence});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.EarthSeeds), new Object[]{"asa","d2d","asa", 's', ModSeeds.MinicioSeeds, 'd', Blocks.DIRT, '2', ModItems.InfusionStoneT4, 'a', ModItems.AccioEssence});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.EarthSeeds), new Object[]{"asa","d2d","asa", 's', ModSeeds.MinicioSeeds, 'd', Blocks.DIRT, '2', ModItems.InfusionStoneT5, 'a', ModItems.AccioEssence});*/

        // Minicio Seeds
        GameRegistry.addRecipe(new ItemStack(ModSeeds.MinicioSeeds), new Object[]{" m ","msm"," m ", 'm', ModItems.MinicioEssence, 's', Items.WHEAT_SEEDS});

        // Air Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.AirSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.CrucioEssence, 'g', Items.GLASS_BOTTLE, '1', "InfusionStoneT2Plus"}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.AirSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.CrucioEssence, 'g', Items.GLASS_BOTTLE, '1', ModItems.InfusionStoneT3});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.AirSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.CrucioEssence, 'g', Items.GLASS_BOTTLE, '1', ModItems.InfusionStoneT4});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.AirSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.CrucioEssence, 'g', Items.GLASS_BOTTLE, '1', ModItems.InfusionStoneT5});*/

        // dye Seeds - Changed to Ore Dictionary, uses any dye
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.DyeSeeds), new Object[]{"ada","d2d","ada", 'a', ModItems.CrucioEssence, '2', "InfusionStoneT2Plus", 'd', "dye"}));
        /*GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.DyeSeeds), new Object[]{"ada","d2d","ada", 'a', ModItems.CrucioEssence, '2', ModItems.InfusionStoneT3, 'd', "dye"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.DyeSeeds), new Object[]{"ada","d2d","ada", 'a', ModItems.CrucioEssence, '2', ModItems.InfusionStoneT4, 'd', "dye"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.DyeSeeds), new Object[]{"ada","d2d","ada", 'a', ModItems.CrucioEssence, '2', ModItems.InfusionStoneT5, 'd', "dye"}));*/

        //Ender Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.EnderSeeds), new Object[]{"iei","e4e","iei", 'e', Items.ENDER_PEARL, 'i', ModItems.ImperioEssence, '4', "InfusionStoneT4Plus"}));
        //GameRegistry.addRecipe(new ItemStack(ModSeeds.EnderSeeds), new Object[]{"iei","e4e","iei", 'e', Items.ENDER_PEARL, 'i', ModItems.ImperioEssence, '4', ModItems.InfusionStoneT5});

        //Water Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.WaterSeeds), new Object[]{"XYX","Y3Y","XYX", '3', "InfusionStoneT2Plus", 'Y', Items.WATER_BUCKET, 'X', ModItems.CrucioEssence}));
        /*GameRegistry.addRecipe(new ItemStack(ModSeeds.WaterSeeds), new Object[]{"XYX","Y3Y","XYX", '3', ModItems.InfusionStoneT3, 'Y', Items.WATER_BUCKET, 'X', ModItems.CrucioEssence});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.WaterSeeds), new Object[]{"XYX","Y3Y","XYX", '3', ModItems.InfusionStoneT4, 'Y', Items.WATER_BUCKET, 'X', ModItems.CrucioEssence});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.WaterSeeds), new Object[]{"XYX","Y3Y","XYX", '3', ModItems.InfusionStoneT5, 'Y', Items.WATER_BUCKET, 'X', ModItems.CrucioEssence});*/


        // Grass Drop
        MinecraftForge.addGrassSeed(new ItemStack(ModSeeds.MinicioSeeds), 15);

        // Chicken Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.ChickenSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.AccioEssence, 'g', Items.CHICKEN, '1', "InfusionStoneT2Plus"}));

        // Cow seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.CowSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.AccioEssence, 'g', Items.BEEF, '1', "InfusionStoneT2Plus"}));

        // Pig Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.PigSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.AccioEssence, 'g', Items.PORKCHOP, '1', "InfusionStoneT2Plus"}));

        // Sheep Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.SheepSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.AccioEssence, 'g', Items.MUTTON, '1', "InfusionStoneT2Plus"}));

        // Creeper Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.CreeperSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.CrucioEssence, 'g', Items.GUNPOWDER, '1', "InfusionStoneT3Plus"}));

        // Zombie Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.ZombieSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.CrucioEssence, 'g', Items.ROTTEN_FLESH, '1', "InfusionStoneT3Plus"}));

        // Skeleton Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.SkeletonSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.CrucioEssence, 'g', Items.BONE, '1', "InfusionStoneT3Plus"}));

        // Slime Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.SlimeSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.CrucioEssence, 'g', Items.SLIME_BALL, '1', "InfusionStoneT3Plus"}));

        // Spider Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.SpiderSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.CrucioEssence, 'g', Items.SPIDER_EYE, '1', "InfusionStoneT3Plus"}));

        // Wither Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.WitherSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.ImperioEssence, 'g', new ItemStack(Items.SKULL, 1, 1), '1', "InfusionStoneT4Plus"}));

        // Ghast seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.GhastSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.ImperioEssence, 'g', Items.GHAST_TEAR, '1', "InfusionStoneT4Plus"}));

        // Blaze Seeds
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.BlazeSeeds), new Object[]{"aga","g1g","aga", 'a', ModItems.ImperioEssence, 'g', Items.BLAZE_ROD, '1', "InfusionStoneT4Plus"}));

        // -------------
		// Vanilla Items
        // -------------

		// Air Essence
		GameRegistry.addRecipe(new ItemStack(Items.SNOWBALL, 32), new Object[]{"ox ","xo ","   ", 'o', ModItems.WaterEssence, 'x', ModItems.AirEssence});
        GameRegistry.addRecipe(new ItemStack(Items.GLASS_BOTTLE, 6), new Object[]{"   ","X X","XXX", 'X', ModItems.AirEssence});

		// Earth Essence
		GameRegistry.addRecipe(new ItemStack(Blocks.DIRT, 32), new Object[]{"dd ","dd ","   ", 'd', ModItems.EarthEssence});
		GameRegistry.addRecipe(new ItemStack(Blocks.GRASS, 16), new Object[]{"nn ","ee ","   ", 'n', ModItems.NatureEssence, 'e', ModItems.EarthEssence});
		GameRegistry.addRecipe(new ItemStack(Blocks.DIRT, 16, 2), new Object[]{"ee ","nn ","   ", 'n', ModItems.NatureEssence, 'e', ModItems.EarthEssence}); // reverse Grass = Podzol recipe
		GameRegistry.addRecipe(new ItemStack(Blocks.SAND, 32), new Object[]{"se ","es ","   ", 's', ModItems.EarthEssence, 'e', ModItems.NatureEssence});
        GameRegistry.addRecipe(new ItemStack(Blocks.SAND, 32, 1), new Object[]{"es ","se ","   ", 's', ModItems.EarthEssence, 'e', ModItems.NatureEssence});
		GameRegistry.addRecipe(new ItemStack(Blocks.GRAVEL, 32), new Object[]{"ss ","ee ","   ", 's', ModItems.EarthEssence, 'e', ModItems.FireEssence});

		//Nature Essence
        GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE, 32), new Object[]{"sss","s s","sss", 's', ModItems.NatureEssence});
		GameRegistry.addRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE, 8), new Object[]{"sss","sns","sss", 's', Blocks.COBBLESTONE, 'n', ModItems.NatureEssence});
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.MYCELIUM, 8), new Object[]{"ndn","dmd","ndn", 'n', ModItems.NatureEssence, 'd', Blocks.DIRT, 'm', "smallShroom"}));
		GameRegistry.addRecipe(new ItemStack(Blocks.VINE, 16), new Object[]{"n n","nnn","n n", 'n', ModItems.NatureEssence});
		GameRegistry.addRecipe(new ItemStack(Blocks.WATERLILY, 8), new Object[]{" n ","nnn","n n", 'n', ModItems.NatureEssence});

		// Fire Essence
        GameRegistry.addRecipe(new ItemStack(Items.LAVA_BUCKET), new Object[]{" n ","nbn"," n ", 'b', Items.BUCKET, 'n', ModItems.FireEssence});
		GameRegistry.addRecipe(new ItemStack(ModItems.MinicioEssence, 4), new Object[]{"fff","f f","fff", 'f', ModItems.FireEssence}); // remove when world gen changes?

		//Water Essence
        GameRegistry.addRecipe(new ItemStack(Items.WATER_BUCKET), new Object[]{" w ","wbw"," w ", 'w', ModItems.WaterEssence, 'b', Items.BUCKET});
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 16), new Object[]{"wn ","nn ","   ", 'w', ModItems.WaterEssence, 'n', ModItems.NatureEssence}); // Oak Wood
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 16, 1), new Object[]{"nw ","nn ","   ", 'w', ModItems.WaterEssence, 'n', ModItems.NatureEssence}); // Spruce Wood
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 16, 2), new Object[]{"nn ","wn ","   ", 'w', ModItems.WaterEssence, 'n', ModItems.NatureEssence}); // Birch Wood
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 16, 3), new Object[]{"nn ","nw ","   ", 'w', ModItems.WaterEssence, 'n', ModItems.NatureEssence}); // Jungle Wood
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG2, 16), new Object[]{"ww ","nn ","   ", 'w', ModItems.WaterEssence, 'n', ModItems.NatureEssence}); // Acacia Wood
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG2, 16, 1), new Object[]{"nn ","ww ","   ", 'w', ModItems.WaterEssence, 'n', ModItems.NatureEssence}); // Dark Oak Wood

        // Nether Essence
        GameRegistry.addRecipe(new ItemStack(Blocks.NETHERRACK, 16), new Object[]{"nnn","   ","nnn", 'n', ModItems.NetherEssence});
        GameRegistry.addRecipe(new ItemStack(Blocks.SOUL_SAND, 12), new Object[]{"nnn","n n","nnn", 'n', ModItems.NetherEssence});
        GameRegistry.addRecipe(new ItemStack(Items.NETHER_WART, 12), new Object[]{"n n"," n ","n n", 'n', ModItems.NetherEssence});


        // Dye Essence
        GameRegistry.addRecipe(new ItemStack(Items.DYE, 2, 1), new Object[]{"ddd","   ","   ", 'd', ModItems.DyeEssence});
        GameRegistry.addRecipe(new ItemStack(Items.DYE, 2, 2), new Object[]{"dd ","  ","  ", 'd', ModItems.DyeEssence});
        GameRegistry.addRecipe(new ItemStack(Items.DYE, 2, 3), new Object[]{"d  "," d ","  d", 'd',ModItems.DyeEssence});
        GameRegistry.addRecipe(new ItemStack(Items.DYE, 8, 4), new Object[]{"lll","l l","lll", 'l', ModItems.LapisEssence});
        GameRegistry.addRecipe(new ItemStack(Items.DYE, 2, 5), new Object[]{"d  ","d  ","d  ", 'd', ModItems.DyeEssence});
        GameRegistry.addRecipe(new ItemStack(Items.DYE, 2, 6), new Object[]{" d "," d "," d ", 'd', ModItems.DyeEssence});
        GameRegistry.addRecipe(new ItemStack(Items.DYE, 2, 7), new Object[]{"  d"," d ","d  ", 'd', ModItems.DyeEssence});
        GameRegistry.addRecipe(new ItemStack(Items.DYE, 2, 8), new Object[]{"  d","  d","  d", 'd', ModItems.DyeEssence});

        // Ore Essence
		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND, 1), new Object[]{"ddd","d d","ddd", 'd', ModItems.DiamondEssence});
		GameRegistry.addRecipe(new ItemStack(Blocks.IRON_ORE, 6), new Object[]{"iii","i i","iii", 'i', ModItems.IronEssence});
		GameRegistry.addRecipe(new ItemStack(Blocks.GOLD_ORE, 5), new Object[]{"ggg","g g","ggg", 'g', ModItems.GoldEssence});
		GameRegistry.addRecipe(new ItemStack(Items.COAL, 12), new Object[]{"ccc","c c","ccc", 'c', ModItems.CoalEssence});
		GameRegistry.addRecipe(new ItemStack(Items.REDSTONE, 12), new Object[]{"rrr","r r","rrr", 'r', ModItems.RedstoneEssence});
		GameRegistry.addRecipe(new ItemStack(Items.QUARTZ, 6), new Object[]{"qqq","q q","qqq", 'q', ModItems.QuartzEssence});
		GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN, 12), new Object[]{"ooo","o o","ooo", 'o', ModItems.ObsidianEssence});
        GameRegistry.addRecipe(new ItemStack(Items.EMERALD, 1), new Object[]{"eee","eee","eee", 'e', ModItems.EmeraldEssence});
		GameRegistry.addRecipe(new ItemStack(Items.GLOWSTONE_DUST, 4), new Object[]{"gg ","gg ","   ", 'g', ModItems.GlowstoneEssence});
		GameRegistry.addRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 6), new Object[]{"eee","e e","eee", 'e',  ModItems.ExperienceEssence});

        // Pig Essence
        GameRegistry.addRecipe(new ItemStack(Items.PORKCHOP, 16), new Object[]{"ddd","d d","ddd", 'd', ModItems.PigEssence});
        GameRegistry.addRecipe(new ItemStack(Items.COOKED_PORKCHOP, 16), new Object[]{"ddd","dfd","ddd", 'd', ModItems.PigEssence, 'f', ModItems.FireEssence});

        // Chicken Essence

        GameRegistry.addRecipe(new ItemStack(Items.CHICKEN, 16), new Object[]{"ddd","d d","ddd", 'd', ModItems.ChickenEssence});
        GameRegistry.addRecipe(new ItemStack(Items.COOKED_CHICKEN, 16), new Object[]{"ddd","dfd","ddd", 'd', ModItems.ChickenEssence, 'f', ModItems.FireEssence});
        GameRegistry.addRecipe(new ItemStack(Items.FEATHER, 4), new Object[]{"X X","X X","X X", 'X', ModItems.ChickenEssence});

        // Sheep Essence

        GameRegistry.addRecipe(new ItemStack(Items.MUTTON, 16), new Object[]{"ddd","d d","ddd", 'd', ModItems.SheepEssence});
        GameRegistry.addRecipe(new ItemStack(Items.COOKED_MUTTON, 16), new Object[]{"ddd","dfd","ddd", 'd', ModItems.SheepEssence, 'f', ModItems.FireEssence});
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 0), new Object[]{" w ","w w"," w ", 'w', ModItems.SheepEssence}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 1), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 14)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 2), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 13)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 3), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 12)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 4), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 11)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 5), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 10)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 6), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 9)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 7), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 8)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 8), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 7)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 9), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 6)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 10), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 5)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 11), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 4)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 12), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 3)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 13), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 2)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 8, 14), new Object[]{" w ","wdw"," w ", 'w', ModItems.SheepEssence, 'd', new ItemStack (Items.DYE, 1, 1)}));



        // Cow Essence

        GameRegistry.addRecipe(new ItemStack(Items.BEEF, 16), new Object[]{"ddd","d d","ddd", 'd', ModItems.CowEssence});
        GameRegistry.addRecipe(new ItemStack(Items.COOKED_BEEF, 16), new Object[]{"ddd","dfd","ddd", 'd', ModItems.CowEssence, 'f', ModItems.FireEssence});
        GameRegistry.addRecipe(new ItemStack(Items.LEATHER, 8), new Object[]{"ll ","ll ","   ", 'l', ModItems.CowEssence});


        // Ender Essence
        GameRegistry.addRecipe(new ItemStack(Items.ENDER_PEARL, 4), new Object[]{"e e","   ","e e", 'e', ModItems.EnderEssence});
        GameRegistry.addRecipe(new ItemStack(Blocks.END_STONE, 8), new Object[]{"ee ","ee ","   ", 'e', ModItems.EnderEssence});
        GameRegistry.addRecipe(new ItemStack(Items.CHORUS_FRUIT, 16), new Object[]{"XYX","Y Y","XYX", 'X', ModItems.EmeraldEssence, 'Y', ModItems.EnderEssence});
        GameRegistry.addRecipe(new ShapedOreRecipe( new ItemStack(Blocks.CHORUS_FLOWER, 2), new Object[]{"ese","sbs","ese", 'e', ModItems.EnderEssence, 's', ModItems.EmeraldEssence, 'b', new ItemStack(Blocks.DOUBLE_PLANT,1)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ENDER_EYE, 4), new Object[]{"ebe","b b","ebe", 'e', ModItems.EnderEssence, 'b', ModItems.FireEssence}));

        // Ghast Essence
        GameRegistry.addRecipe(new ItemStack(Items.GHAST_TEAR, 8), new Object[]{"ddd","d d","ddd", 'd', ModItems.GhastEssence});

        // Creeper Essence
        GameRegistry.addRecipe(new ShapedOreRecipe( new ItemStack(Items.SKULL, 1, 4), new Object[]{"ebe","beb","ebe", 'e', ModItems.CreeperEssence, 'b', Items.BONE}));
        GameRegistry.addRecipe(new ItemStack(Items.GUNPOWDER, 8), new Object[]{"XXX","X X","XXX", 'X', ModItems.CreeperEssence});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_13, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 11)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_11, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 8)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_BLOCKS, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 14)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_CAT, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_CHIRP, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_FAR, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 10)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_MALL, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_MELLOHI, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 9)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_STAL, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_STRAD, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 15)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_WAIT, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(Items.RECORD_WARD, 1), new Object[]{"beb","ede","beb", 'e', ModItems.CreeperEssence, 'b', Items.BONE, 'd', new ItemStack(Items.DYE, 1, 6)});

        // Zombie Essence
        GameRegistry.addRecipe(new ShapedOreRecipe( new ItemStack(Items.SKULL, 1, 2), new Object[]{"ebe","beb","ebe", 'e', ModItems.ZombieEssence, 'b', Items.BONE}));
        GameRegistry.addRecipe(new ItemStack(Items.ROTTEN_FLESH, 16), new Object[]{"fff","f f","fff", 'f', ModItems.ZombieEssence});

        // Slime Essence
        GameRegistry.addRecipe(new ItemStack(Items.SLIME_BALL, 8), new Object[]{" s ","s s"," s ", 's', ModItems.SlimeEssence});
        GameRegistry.addRecipe(new ItemStack(Items.MAGMA_CREAM, 8), new Object[]{"fsf","s s","fsf", 's', ModItems.SlimeEssence, 'f', ModItems.FireEssence});

        // Wither Essence
        GameRegistry.addRecipe(new ItemStack(Items.SKULL, 1, 1), new Object[]{"wbw","bwb","wbw", 'w', ModItems.WitherEssence, 'b', Items.BONE});

        // Skeleton Essence
        GameRegistry.addRecipe(new ShapedOreRecipe( new ItemStack(Items.SKULL, 1, 0), new Object[]{"ebe","beb","ebe", 'e', ModItems.SkeletonEssence, 'b', Items.BONE}));
        GameRegistry.addRecipe(new ItemStack(Items.BONE, 16), new Object[]{"bbb","b b","bbb", 'b', ModItems.SkeletonEssence});

        // Blaze Essence
        GameRegistry.addRecipe(new ItemStack(Items.BLAZE_ROD, 6), new Object[]{"eee","   ","   ", 'e', ModItems.BlazeEssence});
        GameRegistry.addRecipe(new ItemStack(Items.BLAZE_POWDER, 12), new Object[]{"   ","   ","eee", 'e', ModItems.BlazeEssence});

        // Spider Essence
        GameRegistry.addRecipe(new ItemStack(Items.FERMENTED_SPIDER_EYE, 8), new Object[]{"ses","e e","ses", 'e', ModItems.SpiderEssence, 's', Items.SUGAR});
        GameRegistry.addRecipe(new ItemStack(Items.STRING, 8), new Object[]{" e ","e e"," e ", 'e', ModItems.SpiderEssence});
        GameRegistry.addRecipe(new ItemStack(Items.SPIDER_EYE, 8), new Object[]{"s s"," s ","s s", 's', ModItems.SpiderEssence});

        // Random Stuff

        GameRegistry.addRecipe(new ItemStack(Blocks.DRAGON_EGG), new Object[]{"XXX","XYX","XXX", 'X', ModItems.ZivicioEssence, 'Y', Items.NETHER_STAR});
		GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_APPLE), new Object[]{"XXX","XYX","XXX", 'X', ModItems.GoldEssence, 'Y', Items.APPLE});
		GameRegistry.addRecipe(new ItemStack(Items.BUCKET), new Object[]{"   ","X X"," X ", 'X', ModItems.IronEssence});
		GameRegistry.addRecipe(new ItemStack(Items.SADDLE), new Object[]{"XYX","YDY","   ", 'X', ModItems.FireEssence, 'Y', ModItems.EarthEssence, 'D', ModItems.DiamondEssence});

        // Crafting Essence
		GameRegistry.addRecipe(new ItemStack(ModItems.AccioEssence, 1), new Object[]{" m ","mtm"," m ", 'm', ModItems.MinicioEssence, 't', ModItems.InfusionStoneT1});
		GameRegistry.addRecipe(new ItemStack(ModItems.CrucioEssence, 1), new Object[]{" m ","mtm"," m ", 'm', ModItems.AccioEssence, 't', ModItems.InfusionStoneT2});
		GameRegistry.addRecipe(new ItemStack(ModItems.ImperioEssence, 1), new Object[]{" m ","mtm"," m ", 'm', ModItems.CrucioEssence, 't', ModItems.InfusionStoneT3});
		GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioEssence, 1), new Object[]{" m ","mtm"," m ", 'm', ModItems.ImperioEssence, 't', ModItems.InfusionStoneT4});

		GameRegistry.addRecipe(new ItemStack(ModItems.AccioEssence, 1), new Object[]{" m ","mtm"," m ", 'm', ModItems.MinicioEssence, 't', ModItems.InfusionStoneT5});
		GameRegistry.addRecipe(new ItemStack(ModItems.CrucioEssence, 1), new Object[]{" m ","mtm"," m ", 'm', ModItems.AccioEssence, 't', ModItems.InfusionStoneT5});
		GameRegistry.addRecipe(new ItemStack(ModItems.ImperioEssence, 1), new Object[]{" m ","mtm"," m ", 'm', ModItems.CrucioEssence, 't', ModItems.InfusionStoneT5});
		GameRegistry.addRecipe(new ItemStack(ModItems.ZivicioEssence, 1), new Object[]{" m ","mtm"," m ", 'm', ModItems.ImperioEssence, 't', ModItems.InfusionStoneT5});

        // Infusion Stones
		GameRegistry.addRecipe(new ItemStack(ModItems.InfusionStoneT1), new Object[]{" s ","sds"," s ", 's', ModSeeds.MinicioSeeds, 'd', Items.DIAMOND});
        GameRegistry.addRecipe(new ItemStack(ModItems.InfusionStoneT2), new Object[]{"ccc","ctc","ccc", 'c', ModItems.CoalEssence, 't', ModItems.InfusionStoneT1});
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT3),new Object[]{"XXX","XYX","XXX", 'X', "T3Essence", 'Y', ModItems.InfusionStoneT2}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT4),new Object[]{"XXX","XYX","XXX", 'X', "T4Essence", 'Y', ModItems.InfusionStoneT3}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.InfusionStoneT5),new Object[]{"XXX","XYX","XXX", 'X', "T5Essence", 'Y', ModItems.InfusionStoneT4}));

        // Food Items
        GameRegistry.addRecipe(new ItemStack(ModItems.Donut), new Object[]{"XX ","XX ","   ", 'X', ModItems.DonutEssence});
        GameRegistry.addRecipe(new ItemStack(ModSeeds.DonutSeeds), new Object[]{"XXX","ZYZ","   ", 'X', Items.WHEAT, 'Y', Items.MILK_BUCKET, 'Z', Items.SUGAR});

        //getEquivelent("ingotCopper");
        //getEquivelent("plankWood");

        if(Loader.isModLoaded("FunOres") || Loader.isModLoaded("forestry") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("tconstruct")){

        	//Experimental
        	//GameRegistry.addRecipe(new ItemStack(getEquivelant("ingotCopper"), 4), new Object[]{"XXX","X X","XXX", 'X', ModItems.CopperEssence});

			GameRegistry.addRecipe(new ItemStack(ModItems.CopperIngot, 4), new Object[]{"XXX","X X","XXX", 'X', ModItems.CopperEssence});
        	GameRegistry.addRecipe(new ItemStack(ModItems.TinIngot, 6), new Object[]{"XXX","X X","XXX", 'X', ModItems.TinEssence});
        	GameRegistry.addRecipe(new ItemStack(ModItems.LeadIngot, 4), new Object[]{"XXX","X X","XXX", 'X', ModItems.LeadEssence});
        	GameRegistry.addRecipe(new ItemStack(ModItems.SilverIngot, 4), new Object[]{"XXX","X X","XXX", 'X', ModItems.SilverEssence});

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.CopperSeeds), new Object[]{"XYX","YZY","XYX", 'Y', ModItems.CopperIngot, 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"}));
        	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.TinSeeds), new Object[]{"XYX","YZY","XYX", 'Y', ModItems.TinIngot, 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"}));
        	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.LeadSeeds), new Object[]{"XYX","YZY","XYX", 'Y', ModItems.LeadIngot, 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"}));
        	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.SilverSeeds), new Object[]{"XYX","YZY","XYX", 'Y', ModItems.SilverIngot, 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"}));
        }

        if(Loader.isModLoaded("Mekanism")) {
            GameRegistry.addRecipe(new ItemStack(ModItems.OsmiumIngot, 4), new Object[]{"XXX","X X","XXX", 'X', ModItems.OsmiumEssence});
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModSeeds.OsmiumSeeds), new Object[]{"XYX","YZY","XYX", 'Y', ModItems.OsmiumIngot, 'X', ModItems.ImperioEssence, 'Z', "InfusionStoneT3Plus"}));
        }

        	
    }

	public static Item getEquivelent(String oreId) {
	    LogHelper.info("**** checking OreDictionary for " + oreId + " ****");
		List<ItemStack> res = OreDictionary.getOres(oreId);
		/*if(res == null || res.isEmpty()) {
			return null;
		}*/
		ItemStack[] res2 = res.toArray(new ItemStack[res.size()]);
		for(int i = 0; i < res.size(); ++i) {
			//res2[i] = res2[i].copy();
			//res2[i].stackSize = getInput().stackSize;
            //System.out.println(res2[i].getUnlocalizedName());
            //System.out.println(res2[i].getItem());
            return res2[i].getItem();
            //ItemStack res3=res2[i].copy();
            //break;

		}

        //return res3;
        return null;
    }
	
}
