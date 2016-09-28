package killbait.PrimordialCrops.Utils;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;


public class PrimordialConfig {

	private static final String CATEGORY_NORMAL = "Normal Config";
	private static final String CATEGORY_SPECIAL = "Special Config";
	public static String configpath;
	public static Configuration config;

	public static int regularSeedExtraChance;
	public static boolean specialCropsAreTooHard;
	public static int specialSeedExtraChance;

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

		config.addCustomCategoryComment(CATEGORY_NORMAL, "General Crop Settings");
		regularSeedExtraChance = config.getInt("extraSeedChanceRegular", CATEGORY_NORMAL, 20, 0, 100, "Percentage chance you get an extra seed from regular crops");

		config.addCustomCategoryComment(CATEGORY_SPECIAL, "Special Crop Settings");
		specialCropsAreTooHard = config.getBoolean("easySpecials", CATEGORY_SPECIAL, false, "Set to true if you want easy crafting recipes for special crops");
		specialSeedExtraChance = config.getInt("extraSeedChanceSpecial", CATEGORY_SPECIAL, 3, 0, 100, "Percentage chance you get an extra seed from special crops");


	}
}
