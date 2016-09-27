package killbait.PrimordialCrops.Registry;

import killbait.PrimordialCrops.Blocks.CropBlocks;
import killbait.PrimordialCrops.Blocks.CropBlocksSpecial;
import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Seeds.CropSeeds;
import killbait.PrimordialCrops.Seeds.CropSeedsSpecial;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

public class ModSeeds {

	public static HashMap<CropBlocks, Item> seedsMap = new HashMap<CropBlocks, Item>();
	public static HashMap<CropBlocksSpecial, Item> seedsMapSpecial = new HashMap<CropBlocksSpecial, Item>();

	//public static Item[] MCSeeds;

	//seeds

	public static Item MinicioSeeds;
	public static Item AirSeeds;
	public static Item CoalSeeds;
	public static Item DyeSeeds;
	public static Item EarthSeeds;
	public static Item EmeraldSeeds;

	public static Item ExperienceSeeds;
	public static Item FireSeeds;
	public static Item GlowstoneSeeds;
	public static Item LapisSeeds;
	public static Item NatureSeeds;
	public static Item NetherSeeds;
	public static Item ObsidianSeeds;
	public static Item QuartzSeeds;
	public static Item IronSeeds;
	public static Item GoldSeeds;
	public static Item DiamondSeeds;
	public static Item RedstoneSeeds;
	public static Item WaterSeeds;

	public static Item BlazeSeeds;
    public static Item ChickenSeeds;
    public static Item CowSeeds;
    public static Item CreeperSeeds;
    public static Item EnderSeeds;
    public static Item GhastSeeds;
    public static Item PigSeeds;
    public static Item SheepSeeds;
    public static Item SkeletonSeeds;
    public static Item SlimeSeeds;
    public static Item SpiderSeeds;
    public static Item WitherSeeds;
	public static Item ZombieSeeds;

	// Food
	public static Item DonutSeeds;
	public static Item CakeSeeds;
	//modded items

	public static Item CopperSeeds;
	public static Item TinSeeds;
	public static Item SilverSeeds;
	public static Item LeadSeeds;
	public static Item OsmiumSeeds;
	public static Item ArditeSeeds;
	public static Item CobaltSeeds;
	public static Item ManyullynSeeds;
	public static Item KnightSlimeSeeds;
	public static Item PigIronSeeds;
	public static Item AluminumSeeds;
	public static Item NickelSeeds;
	public static Item UraniumSeeds;
	public static Item ElectrumSeeds;
	public static Item SteelSeeds;
	public static Item ConstantanSeeds;
	public static Item RubberSeeds;
	public static Item BronzeSeeds;
	public static Item ManaSteelSeeds;
	public static Item TerraSteelSeeds;
	public static Item ElementiumSeeds;
	public static Item ApatiteSeeds;
	public static Item YelloriteSeeds;
	public static Item LudicriteSeeds;
	public static Item CyaniteSeeds;
	public static Item BlutoniumSeeds;

	public static Item NetherStarSeeds;
	public static Item DragonEggSeeds;





	public static void init() {

		MinicioSeeds = regSeeds("MinicioSeeds", ModBlocks.MinicioCrop);
		DiamondSeeds = regSeeds("DiamondSeeds", ModBlocks.DiamondCrop);
		AirSeeds = regSeeds("AirSeeds", ModBlocks.AirCrop);
		CoalSeeds = regSeeds("CoalSeeds", ModBlocks.CoalCrop);
		DyeSeeds = regSeeds("DyeSeeds", ModBlocks.DyeCrop);
		EarthSeeds = regSeeds("EarthSeeds", ModBlocks.EarthCrop);
		EmeraldSeeds = regSeeds("EmeraldSeeds", ModBlocks.EmeraldCrop);

		ExperienceSeeds = regSeeds("ExperienceSeeds", ModBlocks.ExperienceCrop);
		FireSeeds = regSeeds("FireSeeds", ModBlocks.FireCrop);
		GlowstoneSeeds = regSeeds("GlowstoneSeeds", ModBlocks.GlowstoneCrop);
		LapisSeeds = regSeeds("LapisSeeds", ModBlocks.LapisCrop);
		NatureSeeds = regSeeds("NatureSeeds", ModBlocks.NatureCrop);
		NetherSeeds = regSeeds("NetherSeeds", ModBlocks.NetherCrop);
		ObsidianSeeds = regSeeds("ObsidianSeeds", ModBlocks.ObsidianCrop);
		QuartzSeeds = regSeeds("QuartzSeeds", ModBlocks.QuartzCrop);
		IronSeeds = regSeeds("IronSeeds", ModBlocks.IronCrop);
		GoldSeeds = regSeeds("GoldSeeds", ModBlocks.GoldCrop);
		RedstoneSeeds = regSeeds("RedstoneSeeds", ModBlocks.RedstoneCrop);
		WaterSeeds = regSeeds("WaterSeeds", ModBlocks.WaterCrop);

		DonutSeeds = regSeeds("DonutSeeds", ModBlocks.DonutCrop);
		CakeSeeds = regSeeds("CakeSeeds", ModBlocks.CakeCrop);

		BlazeSeeds = regSeeds("BlazeSeeds", ModBlocks.BlazeCrop);
        ChickenSeeds = regSeeds("ChickenSeeds", ModBlocks.ChickenCrop);
        CowSeeds = regSeeds("CowSeeds", ModBlocks.CowCrop);
		CreeperSeeds = regSeeds("CreeperSeeds", ModBlocks.CreeperCrop);
        EnderSeeds = regSeeds("EnderSeeds", ModBlocks.EnderCrop);
        GhastSeeds = regSeeds("GhastSeeds", ModBlocks.GhastCrop);
        PigSeeds = regSeeds("PigSeeds", ModBlocks.PigCrop);
        SheepSeeds = regSeeds("SheepSeeds", ModBlocks.SheepCrop);
        SkeletonSeeds = regSeeds("SkeletonSeeds", ModBlocks.SkeletonCrop);
        SlimeSeeds = regSeeds("SlimeSeeds", ModBlocks.SlimeCrop);
        SpiderSeeds = regSeeds("SpiderSeeds", ModBlocks.SpiderCrop);
        WitherSeeds = regSeeds("WitherSeeds", ModBlocks.WitherCrop);
		ZombieSeeds = regSeeds("ZombieSeeds", ModBlocks.ZombieCrop);

		NetherStarSeeds = regSpecialSeeds("NetherStarSeeds", ModBlocks.NetherStarCrop);
		DragonEggSeeds = regSpecialSeeds("DragonEggSeeds", ModBlocks.DragonEggCrop);

		if (Loader.isModLoaded("tconstruct")) {
			ArditeSeeds = regSeeds("ArditeSeeds", ModBlocks.ArditeCrop);
			CobaltSeeds = regSeeds("CobaltSeeds", ModBlocks.CobaltCrop);
			ManyullynSeeds = regSeeds("ManyullynSeeds", ModBlocks.ManyullynCrop);
			KnightSlimeSeeds = regSeeds("KnightSlimeSeeds", ModBlocks.KnightSlimeCrop);
			PigIronSeeds = regSeeds("PigIronSeeds", ModBlocks.PigIronCrop);
		}

		if (Loader.isModLoaded("immersiveengineering")) {
			AluminumSeeds = regSeeds("AluminumSeeds", ModBlocks.AluminumCrop);
			NickelSeeds = regSeeds("NickelSeeds", ModBlocks.NickelCrop);
			ElectrumSeeds = regSeeds("ElectrumSeeds", ModBlocks.ElectrumCrop);
			ConstantanSeeds = regSeeds("ConstantanSeeds", ModBlocks.ConstantanCrop);
		}

		if (Loader.isModLoaded("botania") || Loader.isModLoaded("Botania")) {
			ManaSteelSeeds = regSeeds("ManaSteelSeeds", ModBlocks.ManaSteelCrop);
			TerraSteelSeeds = regSeeds("TerraSteelSeeds", ModBlocks.TerraSteelCrop);
			ElementiumSeeds = regSeeds("ElementiumSeeds", ModBlocks.ElementiumCrop);
		}

		if (Loader.isModLoaded("IC2")) {
			RubberSeeds = regSeeds("RubberSeeds", ModBlocks.RubberCrop);
		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("immersiveengineering")) {
			UraniumSeeds = regSeeds("UraniumSeeds", ModBlocks.UraniumCrop);
			SteelSeeds = regSeeds("SteelSeeds", ModBlocks.SteelCrop);
		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("forestry")) {
			BronzeSeeds = regSeeds("BronzeSeeds", ModBlocks.BronzeCrop);
		}

		if (Loader.isModLoaded("forestry")) {
			ApatiteSeeds = regSeeds("ApatiteSeeds", ModBlocks.ApatiteCrop);
		}

		if (Loader.isModLoaded("bigreactors")) {
			YelloriteSeeds = regSeeds("YelloriteSeeds", ModBlocks.YelloriteCrop);
			LudicriteSeeds = regSeeds("LudicriteSeeds", ModBlocks.LudicriteCrop);
			CyaniteSeeds = regSeeds("CyaniteSeeds", ModBlocks.CyaniteCrop);
			BlutoniumSeeds = regSeeds("BlutoniumSeeds", ModBlocks.BlutoniumCrop);
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("forestry") || Loader.isModLoaded("immersiveengineering")) {
			CopperSeeds = regSeeds("CopperSeeds", ModBlocks.CopperCrop);
			TinSeeds = regSeeds("TinSeeds", ModBlocks.TinCrop);
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep")|| Loader.isModLoaded("immersiveengineering")) {
			SilverSeeds = regSeeds("SilverSeeds", ModBlocks.SilverCrop);
			LeadSeeds = regSeeds("LeadSeeds", ModBlocks.LeadCrop);
		}

		if (Loader.isModLoaded("Mekanism")) {
			OsmiumSeeds = regSeeds("OsmiumSeeds", ModBlocks.OsmiumCrop);
		}

		//MCSeeds = new Item[] {CoalSeeds, IronSeeds, GoldSeeds, DiamondSeeds, LapisSeeds, RedstoneSeeds, QuartzSeeds, ObsidianSeeds, NetherSeeds, NatureSeeds, LapisSeeds, GlowstoneSeeds, FireSeeds, ExperienceSeeds, EmeraldSeeds, EnderSeeds, EarthSeeds, DyeSeeds, AirSeeds, MinicioSeeds};

	}

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
