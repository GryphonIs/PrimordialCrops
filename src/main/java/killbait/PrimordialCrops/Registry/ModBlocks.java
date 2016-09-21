package killbait.PrimordialCrops.Registry;


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
	public static Block DonutCrop;

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
    
    
    public static Block MinicioOre;
	
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
		DonutCrop = registerBlockCrop("DonutCrop");

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

		if(Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("tconstruct") || Loader.isModLoaded("forestry")){
			LogHelper.info("Mods Detected with Copper/Tin/Lead/Silver adding crops for them");
			CopperCrop = registerBlockCrop("CopperCrop");
    	    TinCrop = registerBlockCrop("TinCrop");
    	    SilverCrop = registerBlockCrop("SilverCrop");
    	    LeadCrop = registerBlockCrop("LeadCrop");
        }

		if(Loader.isModLoaded("Mekanism")) {
			LogHelper.info("Mekanism Detected, adding Osmium Crops");
			OsmiumCrop = registerBlockCrop("OsmiumCrop");
		}
	     
	     MinicioOre = registerMiscBlock("MinicioOre").setHardness(2);
	     
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

			//System.out.println(block);

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
