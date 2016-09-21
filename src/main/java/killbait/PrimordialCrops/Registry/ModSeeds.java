package killbait.PrimordialCrops.Registry;

import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Seeds.CropSeeds;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

public class ModSeeds {

	public static HashMap<CropBlocks, Item> seedsMap = new HashMap<CropBlocks, Item>();

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

	//modded items

	public static Item CopperSeeds;
	public static Item TinSeeds;
	public static Item SilverSeeds;
	public static Item LeadSeeds;
	public static Item OsmiumSeeds;

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




		if(Loader.isModLoaded("FunOres") || Loader.isModLoaded("forestry") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("tconstruct")){
			CopperSeeds = regSeeds("CopperSeeds", ModBlocks.CopperCrop);
			TinSeeds = regSeeds("TinSeeds", ModBlocks.TinCrop);
			SilverSeeds = regSeeds("SilverSeeds", ModBlocks.SilverCrop);
			LeadSeeds = regSeeds("LeadSeeds", ModBlocks.LeadCrop);
		}

		if(Loader.isModLoaded("Mekanism")) {
			OsmiumSeeds = regSeeds("OsmiumSeeds", ModBlocks.OsmiumCrop);
		}



		//MCSeeds = new Item[] {CoalSeeds, IronSeeds, GoldSeeds, DiamondSeeds, LapisSeeds, RedstoneSeeds, QuartzSeeds, ObsidianSeeds, NetherSeeds, NatureSeeds, LapisSeeds, GlowstoneSeeds, FireSeeds, ExperienceSeeds, EmeraldSeeds, EnderSeeds, EarthSeeds, DyeSeeds, AirSeeds, MinicioSeeds};

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
