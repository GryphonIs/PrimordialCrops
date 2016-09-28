package killbait.PrimordialCrops.Registry;


import killbait.PrimordialCrops.Blocks.CropBlocks;
import killbait.PrimordialCrops.Blocks.CropBlocksSpecial;
import killbait.PrimordialCrops.Blocks.PrimordialBlock;
import killbait.PrimordialCrops.Utils.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	// Item Crops

	public static Block MinicioCrop;
	public static Block AirCrop;
	public static Block CoalCrop;
	public static Block DyeCrop;
	public static Block EarthCrop;
	public static Block EmeraldCrop;
	public static Block EnderCrop;
	public static Block ExperienceCrop;
	public static Block FireCrop;
	public static Block GlowstoneCrop;
	public static Block LapisCrop;
	public static Block NatureCrop;
	public static Block NetherCrop;
	public static Block ObsidianCrop;
	public static Block QuartzCrop;
	public static Block IronCrop;
	public static Block GoldCrop;
	public static Block DiamondCrop;
	public static Block RedstoneCrop;
	public static Block WaterCrop;

	// Mod Crops


	// Food Crops

	public static Block DonutCrop;
	public static Block CakeCrop;

	// Mob Crops

	public static Block BlazeCrop;
	public static Block ChickenCrop;
	public static Block CowCrop;
	public static Block CreeperCrop;
	public static Block EndermanCrop;
	public static Block GhastCrop;
	public static Block PigCrop;
	public static Block SheepCrop;
	public static Block SkeletonCrop;
	public static Block SlimeCrop;
	public static Block SpiderCrop;
	public static Block WitherCrop;
	public static Block ZombieCrop;

	//Mod Intergration Crops

	public static Block CopperCrop;
	public static Block TinCrop;
	public static Block LeadCrop;
	public static Block SilverCrop;
	public static Block OsmiumCrop;
	public static Block ArditeCrop;
	public static Block CobaltCrop;
	public static Block ManyullynCrop;
	public static Block KnightSlimeCrop;
	public static Block PigIronCrop;
	public static Block AluminumCrop;
	public static Block NickelCrop;
	public static Block UraniumCrop;
	public static Block ElectrumCrop;
	public static Block SteelCrop;
	public static Block ConstantanCrop;
	public static Block RubberCrop;
	public static Block BronzeCrop;
	public static Block ManaSteelCrop;
	public static Block TerraSteelCrop;
	public static Block ElementiumCrop;
	public static Block ApatiteCrop;
	public static Block YelloriteCrop;
	public static Block LudicriteCrop;
	public static Block CyaniteCrop;
	public static Block BlutoniumCrop;
	public static Block DraconiumCrop;
	public static Block AwakeDraconiumCrop;

	public static Block NetherStarCrop;
	public static Block DragonEggCrop;

	public static Block MinicioOre;
	public static Block UraniumOre;

	public static void init() {

		// Resource Crops

		MinicioCrop = registerBlockCrop("MinicioCrop");
		AirCrop = registerBlockCrop("AirCrop");
		CoalCrop = registerBlockCrop("CoalCrop");
		DyeCrop = registerBlockCrop("DyeCrop");
		EarthCrop = registerBlockCrop("EarthCrop");
		EmeraldCrop = registerBlockCrop("EmeraldCrop");
		ExperienceCrop = registerBlockCrop("ExperienceCrop");
		FireCrop = registerBlockCrop("FireCrop");
		GlowstoneCrop = registerBlockCrop("GlowstoneCrop");
		LapisCrop = registerBlockCrop("LapisCrop");
		NatureCrop = registerBlockCrop("NatureCrop");
		NetherCrop = registerBlockCrop("NetherCrop");
		ObsidianCrop = registerBlockCrop("ObsidianCrop");
		QuartzCrop = registerBlockCrop("QuartzCrop");
		IronCrop = registerBlockCrop("IronCrop");
		GoldCrop = registerBlockCrop("GoldCrop");
		DiamondCrop = registerBlockCrop("DiamondCrop");
		RedstoneCrop = registerBlockCrop("RedstoneCrop");
		WaterCrop = registerBlockCrop("WaterCrop");

		// Food

		DonutCrop = registerBlockCrop("DonutCrop");
		CakeCrop = registerBlockCrop("CakeCrop");

		// Mob crops

		BlazeCrop = registerBlockCrop("BlazeCrop");
		ChickenCrop = registerBlockCrop("ChickenCrop");
		CowCrop = registerBlockCrop("CowCrop");
		CreeperCrop = registerBlockCrop("CreeperCrop");
		EnderCrop = registerBlockCrop("EndermanCrop");
		GhastCrop = registerBlockCrop("GhastCrop");
		PigCrop = registerBlockCrop("PigCrop");
		SheepCrop = registerBlockCrop("SheepCrop");
		SkeletonCrop = registerBlockCrop("SkeletonCrop");
		SlimeCrop = registerBlockCrop("SlimeCrop");
		SpiderCrop = registerBlockCrop("SpiderCrop");
		WitherCrop = registerBlockCrop("WitherCrop");
		ZombieCrop = registerBlockCrop("ZombieCrop");

		// Special crops

		NetherStarCrop = registerSpecialBlockCrop("NetherStarCrop");
		DragonEggCrop = registerSpecialBlockCrop("DragonEggCrop");

		// Mod Compatability crops

		if (Loader.isModLoaded("tconstruct")) {
			LogHelper.info("Tinkers Construct Detected, adding crops for : Ardite, Cobalt, Manyullyn, KnightSlime, PigIron");
			ArditeCrop = registerBlockCrop("ArditeCrop");
			CobaltCrop = registerBlockCrop("CobaltCrop");
			ManyullynCrop = registerBlockCrop("ManyullynCrop");
			KnightSlimeCrop = registerBlockCrop("KnightSlimeCrop");
			PigIronCrop = registerBlockCrop("PigIronCrop");
		}

		if (Loader.isModLoaded("immersiveengineering")) {
			LogHelper.info("Immersive Engineering Detected, adding crops for : Aluminum, Nickel, Electrum, Constantan");
			AluminumCrop = registerBlockCrop("AluminumCrop");
			NickelCrop = registerBlockCrop("NickelCrop");
			ElectrumCrop = registerBlockCrop("ElectrumCrop");
			ConstantanCrop = registerBlockCrop("ConstantanCrop");
		}

		if (Loader.isModLoaded("botania") || Loader.isModLoaded("Botania")) {
			LogHelper.info("Botania Detected, adding crops for : ManaSteel, TerraSteel, Elementium");
			ManaSteelCrop = registerBlockCrop("ManaSteelCrop");
			TerraSteelCrop = registerBlockCrop("TerraSteelCrop");
			ElementiumCrop = registerBlockCrop("ElementiumCrop");
		}

		if (Loader.isModLoaded("IC2")) {
			RubberCrop = registerBlockCrop("RubberCrop");
		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("immersiveengineering")) {
			UraniumCrop = registerBlockCrop("UraniumCrop");
			UraniumOre = registerMiscBlock("UraniumOre").setHardness(2);
			SteelCrop = registerBlockCrop("SteelCrop");
		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("forestry")) {
			BronzeCrop = registerBlockCrop("BronzeCrop");
		}

		if (Loader.isModLoaded("forestry")) {
			ApatiteCrop = registerBlockCrop("ApatiteCrop");
		}

		if (Loader.isModLoaded("bigreactors")) {
			YelloriteCrop = registerBlockCrop("YelloriteCrop");
			LudicriteCrop = registerBlockCrop("LudicriteCrop");
			CyaniteCrop = registerBlockCrop("CyaniteCrop");
			BlutoniumCrop = registerBlockCrop("BlutoniumCrop");
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("forestry") || Loader.isModLoaded("immersiveengineering")) {
			CopperCrop = registerBlockCrop("CopperCrop");
			TinCrop = registerBlockCrop("TinCrop");
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("immersiveengineering")) {
			SilverCrop = registerBlockCrop("SilverCrop");
			LeadCrop = registerBlockCrop("LeadCrop");
		}

		if (Loader.isModLoaded("Mekanism")) {
			OsmiumCrop = registerBlockCrop("OsmiumCrop");
		}

		if (Loader.isModLoaded("draconicevolution")) {
			DraconiumCrop = registerBlockCrop("DraconiumCrop");
			AwakeDraconiumCrop = registerBlockCrop("AwakeDraconiumCrop");
		}

		MinicioOre = registerMiscBlock("MinicioOre").setHardness(2);


	}

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

}
