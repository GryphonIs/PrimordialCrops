package killbait.PrimordialCrops.Registry;

import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.Items.PrimordialBook;
import killbait.PrimordialCrops.Items.PrimordialCropsItem;
import killbait.PrimordialCrops.Tools.Swords;
import killbait.PrimordialCrops.Utils.LogHelper;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

public class ModItems {

	public static Item AccioEssence;
	public static Item CrucioEssence;
	public static Item ImperioEssence;
	public static Item ZivicioEssence;

	public static Item InfusionStoneT1;
	public static Item InfusionStoneT2;
	public static Item InfusionStoneT3;
	public static Item InfusionStoneT4;
	public static Item InfusionStoneT5;

	public static Item.ToolMaterial ZivicioSwordMaterial = EnumHelper.addToolMaterial("ZivicioSwordMaterial", 2, 20000, 1.0F, 22, 30);
	public static Item.ToolMaterial AccioSwordMaterial = EnumHelper.addToolMaterial("AccioSwordMaterial", 2, 3000, 1.0F, 9, 30);
	public static Item.ToolMaterial CrucioSwordMaterial = EnumHelper.addToolMaterial("CrucioSwordMaterial", 2, 8000, 1.0F, 11, 30);
	public static Item.ToolMaterial ImperioSwordMaterial = EnumHelper.addToolMaterial("ImperioSwordMaterial", 2, 16000, 1.0F, 15, 30);

	public static Item ZivicioSword = new Swords(ZivicioSwordMaterial, "ZivicioSword");
	public static Item AccioSword = new Swords(AccioSwordMaterial, "AccioSword");
	public static Item CrucioSword = new Swords(CrucioSwordMaterial, "CrucioSword");
	public static Item ImperioSword = new Swords(ImperioSwordMaterial, "ImperioSword");

	public static Item PrimordialBook = new PrimordialBook();

	public static void init() {

		CrucioEssence = regCraftItem("CrucioEssence");
		ImperioEssence = regCraftItem("ImperioEssence");
		ZivicioEssence = regCraftItem("ZivicioEssence");
		AccioEssence = regCraftItem("AccioEssence");


		if (PrimordialConfig.infusionStoneDurability) {
			LogHelper.info("*** Infusion Stone Durabitily Enabled, Max Uses is " + PrimordialConfig.infusionStoneMaxUses + " ***");
			InfusionStoneT1 = regCraftItemWithDamage("InfusionStoneT1", true, PrimordialConfig.infusionStoneMaxUses);
			InfusionStoneT2 = regCraftItemWithDamage("InfusionStoneT2", true, PrimordialConfig.infusionStoneMaxUses);
			InfusionStoneT3 = regCraftItemWithDamage("InfusionStoneT3", true, PrimordialConfig.infusionStoneMaxUses);
			InfusionStoneT4 = regCraftItemWithDamage("InfusionStoneT4", true, PrimordialConfig.infusionStoneMaxUses);
			InfusionStoneT5 = regCraftItemWithDamage("InfusionStoneT5", true, PrimordialConfig.infusionStoneMaxUses);
		} else {
			LogHelper.info("*** Infusion Stone Durabitily Disabled ***");
			InfusionStoneT1 = regCraftItemWithDamage("InfusionStoneT1", false, PrimordialConfig.infusionStoneMaxUses);
			InfusionStoneT2 = regCraftItemWithDamage("InfusionStoneT2", false, PrimordialConfig.infusionStoneMaxUses);
			InfusionStoneT3 = regCraftItemWithDamage("InfusionStoneT3", false, PrimordialConfig.infusionStoneMaxUses);
			InfusionStoneT4 = regCraftItemWithDamage("InfusionStoneT4", false, PrimordialConfig.infusionStoneMaxUses);
			InfusionStoneT5 = regCraftItemWithDamage("InfusionStoneT5", false, PrimordialConfig.infusionStoneMaxUses);
		}

		if (PrimordialConfig.enableWeapons) {
			GameRegistry.register(ZivicioSword.setRegistryName("ZivicioSword"));
			GameRegistry.register(AccioSword.setRegistryName("AccioSword"));
			GameRegistry.register(CrucioSword.setRegistryName("CrucioSword"));
			GameRegistry.register(ImperioSword.setRegistryName("ImperioSword"));
		}

		if (PrimordialConfig.enableIngameBook) {
			GameRegistry.register(PrimordialBook.setRegistryName("PrimordialBook"));
		}

	}

	public static Item regCraftItem(String regName) {
		Item item = register(new PrimordialCropsItem(regName));
		return item;
	}

	public static Item regCraftItemWithDamage(String regName, boolean hasDamage, int maxUses) {
		Item item = register(new PrimordialCropsItem(regName, hasDamage, maxUses, 1));
		return item;
	}
}
