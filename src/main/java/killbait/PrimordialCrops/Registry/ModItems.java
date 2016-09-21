package killbait.PrimordialCrops.Registry;

import killbait.PrimordialCrops.Items.Donut;
import killbait.PrimordialCrops.Items.PrimordialCropsItem;
import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Tools.Swords;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

public class ModItems {

    public static HashMap<CropBlocks, Item> harvestedItemMap = new HashMap<CropBlocks, Item>();
    
    //public static Item[] MCDrops;
    //public static Item[] MCMisc;

    //essence
    
    public static Item MinicioEssence;
    public static Item AirEssence;
    public static Item CoalEssence;
    public static Item DyeEssence;
    public static Item EarthEssence;
    public static Item EmeraldEssence;
    public static Item ExperienceEssence;
    public static Item FireEssence;
    public static Item GlowstoneEssence;
    public static Item LapisEssence;
    public static Item NatureEssence;
    public static Item NetherEssence;
    public static Item ObsidianEssence;
    public static Item QuartzEssence;
    public static Item IronEssence;
    public static Item GoldEssence;
    public static Item DiamondEssence;
    public static Item RedstoneEssence;
    public static Item WaterEssence;
    public static Item DonutEssence;

    public static Item AccioEssence;
    public static Item CrucioEssence;
    public static Item ImperioEssence;
    public static Item ZivicioEssence;

    public static Item BlazeEssence;
    public static Item ChickenEssence;
    public static Item CowEssence;
    public static Item CreeperEssence;
    public static Item EnderEssence;
    public static Item GhastEssence;
    public static Item PigEssence;
    public static Item SheepEssence;
    public static Item SkeletonEssence;
    public static Item SlimeEssence;
    public static Item SpiderEssence;
    public static Item WitherEssence;
    public static Item ZombieEssence;






    //stones
    public static Item InfusionStoneT1;
    public static Item InfusionStoneT2;
    public static Item InfusionStoneT3;
    public static Item InfusionStoneT4;
    public static Item InfusionStoneT5;

    // Food
    public static Item Donut = new Donut(6, false);

    // Weapons
    public static Item.ToolMaterial ZivicioSwordMaterial = EnumHelper.addToolMaterial("ZivicioSwordMaterial", 2, 20000, 1.0F, 22, 30);
    public static Item.ToolMaterial AccioSwordMaterial = EnumHelper.addToolMaterial("AccioSwordMaterial", 2, 3000, 1.0F, 9, 30);
    public static Item.ToolMaterial CrucioSwordMaterial = EnumHelper.addToolMaterial("CrucioSwordMaterial", 2, 8000, 1.0F, 11, 30);
    public static Item.ToolMaterial ImperioSwordMaterial = EnumHelper.addToolMaterial("ImperioSwordMaterial", 2, 16000, 1.0F, 15, 30);

    public static Item ZivicioSword = new Swords(ZivicioSwordMaterial, "ZivicioSword");
    public static Item AccioSword = new Swords(AccioSwordMaterial, "AccioSword");
    public static Item CrucioSword = new Swords(CrucioSwordMaterial, "CrucioSword");
    public static Item ImperioSword = new Swords(ImperioSwordMaterial, "ImperioSword");
    
    //modded items

    public static Item CopperEssence;
    public static Item TinEssence;
    public static Item SilverEssence;
    public static Item LeadEssence;
    public static Item OsmiumEssence;
    
    public static Item CopperIngot;
    public static Item TinIngot;
    public static Item SilverIngot;
    public static Item LeadIngot;
    public static Item OsmiumIngot;

    public static void init() {

        // MinicioEssence = register(new ItemBase("MinicioEssence").setCreativeTab(PrimordialCrops.PrimordialCrops));
        //harvestedItemMap.put((CropBlocks) MinicioCrop, MinicioEssence);

        MinicioEssence = regHarvestItem("MinicioEssence", ModBlocks.MinicioCrop);
        DiamondEssence = regHarvestItem("DiamondEssence", ModBlocks.DiamondCrop);
        AirEssence = regHarvestItem("AirEssence", ModBlocks.AirCrop);
        CoalEssence = regHarvestItem("CoalEssence", ModBlocks.CoalCrop);
        DyeEssence = regHarvestItem("DyeEssence", ModBlocks.DyeCrop);
        EarthEssence = regHarvestItem("EarthEssence", ModBlocks.EarthCrop);
        EmeraldEssence = regHarvestItem("EmeraldEssence", ModBlocks.EmeraldCrop);

        ExperienceEssence = regHarvestItem("ExperienceEssence", ModBlocks.ExperienceCrop);
        FireEssence = regHarvestItem("FireEssence", ModBlocks.FireCrop);
        GlowstoneEssence = regHarvestItem("GlowstoneEssence", ModBlocks.GlowstoneCrop);
        LapisEssence = regHarvestItem("LapisEssence", ModBlocks.LapisCrop);
        NatureEssence = regHarvestItem("NatureEssence", ModBlocks.NatureCrop);
        NetherEssence = regHarvestItem("NetherEssence", ModBlocks.NetherCrop);
        ObsidianEssence = regHarvestItem("ObsidianEssence", ModBlocks.ObsidianCrop);
        QuartzEssence = regHarvestItem("QuartzEssence", ModBlocks.QuartzCrop);
        IronEssence = regHarvestItem("IronEssence", ModBlocks.IronCrop);
        GoldEssence = regHarvestItem("GoldEssence", ModBlocks.GoldCrop);
        RedstoneEssence = regHarvestItem("RedstoneEssence", ModBlocks.RedstoneCrop);
        WaterEssence = regHarvestItem("WaterEssence", ModBlocks.WaterCrop);
        DonutEssence = regHarvestItem("DonutEssence", ModBlocks.DonutCrop);



        BlazeEssence = regHarvestItem("BlazeEssence", ModBlocks.BlazeCrop);
        ChickenEssence = regHarvestItem("ChickenEssence", ModBlocks.ChickenCrop);
        CowEssence = regHarvestItem("CowEssence", ModBlocks.CowCrop);
        CreeperEssence = regHarvestItem("CreeperEssence", ModBlocks.CreeperCrop);
        EnderEssence = regHarvestItem("EnderEssence", ModBlocks.EnderCrop);
        GhastEssence = regHarvestItem("GhastEssence", ModBlocks.GhastCrop);
        PigEssence = regHarvestItem("PigEssence", ModBlocks.PigCrop);
        SheepEssence = regHarvestItem("SheepEssence", ModBlocks.SheepCrop);
        SkeletonEssence = regHarvestItem("SkeletonEssence", ModBlocks.SkeletonCrop);
        SlimeEssence = regHarvestItem("SlimeEssence", ModBlocks.SlimeCrop);
        SpiderEssence = regHarvestItem("SpiderEssence", ModBlocks.SpiderCrop);
        WitherEssence = regHarvestItem("WitherEssence", ModBlocks.WitherCrop);
        ZombieEssence = regHarvestItem("ZombieEssence", ModBlocks.ZombieCrop);



        CrucioEssence = regCraftItem("CrucioEssence");
        ImperioEssence = regCraftItem("ImperioEssence");
        ZivicioEssence = regCraftItem("ZivicioEssence");
        AccioEssence = regCraftItem("AccioEssence");
         
        InfusionStoneT1 = regCraftItem("InfusionStoneT1");
        InfusionStoneT2 = regCraftItem("InfusionStoneT2");
        InfusionStoneT3 = regCraftItem("InfusionStoneT3");
        InfusionStoneT4 = regCraftItem("InfusionStoneT4");
        InfusionStoneT5 = regCraftItem("InfusionStoneT5");

        GameRegistry.register(Donut.setRegistryName("Donut"));

        GameRegistry.register(ZivicioSword.setRegistryName("ZivicioSword"));
        GameRegistry.register(AccioSword.setRegistryName("AccioSword"));
        GameRegistry.register(CrucioSword.setRegistryName("CrucioSword"));
        GameRegistry.register(ImperioSword.setRegistryName("ImperioSword"));
         
        if(Loader.isModLoaded("FunOres") || Loader.isModLoaded("forestry") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("tconstruct")){

        	 CopperEssence = regHarvestItem("CopperEssence", ModBlocks.CopperCrop);
        	 TinEssence = regHarvestItem("TinEssence", ModBlocks.TinCrop);
        	 SilverEssence = regHarvestItem("SilverEssence", ModBlocks.SilverCrop);
        	 LeadEssence = regHarvestItem("LeadEssence", ModBlocks.LeadCrop);
        	 
        	 CopperIngot = regCraftItem("CopperIngot");
        	 TinIngot = regCraftItem("TinIngot");
        	 SilverIngot = regCraftItem("SilverIngot");
        	 LeadIngot = regCraftItem("LeadIngot");
        }

        if(Loader.isModLoaded("Mekanism")) {
            OsmiumIngot = regCraftItem("OsmiumIngot");
            OsmiumEssence = regHarvestItem("OsmiumEssence", ModBlocks.OsmiumCrop);
        }
         
         
         
       //MCDrops = new Item[] {AccioEssence, ZivicioEssence, ImperioEssence, CrucioEssence, CoalEssence, IronEssence, GoldEssence, DiamondEssence, LapisEssence, RedstoneEssence, QuartzEssence, ObsidianEssence, NetherEssence, NatureEssence, LapisEssence, GlowstoneEssence, FireEssence, ExperienceEssence, EmeraldEssence, EnderEssence, EarthEssence, DyeEssence, AirEssence, MinicioEssence};
       //MCMisc = new Item[] {InfusionStoneT1, InfusionStoneT2, InfusionStoneT3, InfusionStoneT4, InfusionStoneT5};
       
	}

    public static Item regHarvestItem(String regName, Block crop) {
        Item item = register(new PrimordialCropsItem(regName).setCreativeTab(PrimordialCrops.PrimordialCrops));
        harvestedItemMap.put((CropBlocks) crop, item);
        return item;
    }

    public static Item regCraftItem(String regName) {
        Item item = register(new PrimordialCropsItem(regName).setCreativeTab(PrimordialCrops.PrimordialCrops));
        return item;
    }
}
