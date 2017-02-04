package killbait.PrimordialCrops.Registry;

import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.Info;
import killbait.PrimordialCrops.Items.PrimordialArmor;
import killbait.PrimordialCrops.Items.PrimordialBook;
import killbait.PrimordialCrops.Items.PrimordialCropsItem;
import killbait.PrimordialCrops.Items.Tools.*;
import killbait.PrimordialCrops.Utils.LogHelper;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
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

	public static Item accioIngot;
	public static Item crucioIngot;
	public static Item imperioIngot;
	public static Item zivicioIngot;

	public static final Item.ToolMaterial accioToolMaterial = EnumHelper.addToolMaterial("ACCIO", 2, 1500, 10, 4, 22);
	public static final Item.ToolMaterial crucioToolMaterial = EnumHelper.addToolMaterial("CRUCIO", 2, 2500, 18, 6, 22);
	public static final Item.ToolMaterial imperioToolMaterial = EnumHelper.addToolMaterial("IMPERIO", 3, 4500, 26, 8, 22);
	public static final Item.ToolMaterial zivicioToolMaterial = EnumHelper.addToolMaterial("ZIVICIO", 3, 0, 38, 10, 22);

	// standard tool material above make even the accio shovel almost insta break dirt, so we create a new set of materials
	public static final Item.ToolMaterial accioShovelMaterial = EnumHelper.addToolMaterial("ACCIOSHOVEL", 2, 1500, 6, 4, 22);
	public static final Item.ToolMaterial crucioShovelMaterial = EnumHelper.addToolMaterial("CRUCIOSHOVEL", 2, 2500, 9, 6, 22);
	public static final Item.ToolMaterial imperioShovelMaterial = EnumHelper.addToolMaterial("IMPERIOSHOVEL", 3, 4500, 14, 8, 22);
	public static final Item.ToolMaterial zivicioShovelMaterial = EnumHelper.addToolMaterial("ZIVICIOSHOVEL", 3, 0, 21, 10, 22);


	public static final Item.ToolMaterial AccioSwordMaterial = EnumHelper.addToolMaterial("AccioSwordMaterial", 2, 1500, 1.0F, 9, 22);
	public static final Item.ToolMaterial CrucioSwordMaterial = EnumHelper.addToolMaterial("CrucioSwordMaterial", 2, 3000, 1.0F, 11, 22);
	public static final Item.ToolMaterial ImperioSwordMaterial = EnumHelper.addToolMaterial("ImperioSwordMaterial", 2, 6000, 1.0F, 15, 22);
	public static final Item.ToolMaterial ZivicioSwordMaterial = EnumHelper.addToolMaterial("ZivicioSwordMaterial", 2, 0, 1.0F, 22, 22);

	public static final ItemArmor.ArmorMaterial accioArmorMaterial = EnumHelper.addArmorMaterial("ACCIO", Info.MODID + ":accio", 20, new int[]{2, 5, 4, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ItemArmor.ArmorMaterial crucioArmorMaterial = EnumHelper.addArmorMaterial("CRUCIO", Info.MODID + ":crucio", 30, new int[]{2, 6, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ItemArmor.ArmorMaterial imperioArmorMaterial = EnumHelper.addArmorMaterial("IMPERIO", Info.MODID + ":imperio", 40, new int[]{3, 8, 6, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ItemArmor.ArmorMaterial zivicioArmorMaterial = EnumHelper.addArmorMaterial("ZIVICIO", Info.MODID + ":zivicio", 0, new int[]{4, 9, 7, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static Item ZivicioSword = new PrimordialSword(ZivicioSwordMaterial, "ZivicioSword");
	public static Item AccioSword = new PrimordialSword(AccioSwordMaterial, "AccioSword");
	public static Item CrucioSword = new PrimordialSword(CrucioSwordMaterial, "CrucioSword");
	public static Item ImperioSword = new PrimordialSword(ImperioSwordMaterial, "ImperioSword");

	public static Item AccioPickAxe = new PrimordialPickAxe(accioToolMaterial, "AccioPickAxe");
	public static Item CrucioPickAxe = new PrimordialPickAxe(crucioToolMaterial, "CrucioPickAxe");
	public static Item ImperioPickAxe = new PrimordialPickAxe(imperioToolMaterial, "ImperioPickAxe");
	public static Item ZivicioPickAxe = new PrimordialPickAxe(zivicioToolMaterial, "ZivicioPickAxe");

	public static Item AccioAxe = new PrimordialAxe(accioToolMaterial, "AccioAxe", 5, -3f);
	public static Item CrucioAxe = new PrimordialAxe(crucioToolMaterial, "CrucioAxe", 7, -3f);
	public static Item ImperioAxe = new PrimordialAxe(imperioToolMaterial, "ImperioAxe", 9, -3f);
	public static Item ZivicioAxe = new PrimordialAxe(zivicioToolMaterial, "ZivicioAxe", 11, -3f);

	public static Item AccioShovel = new PrimordialShovel(accioShovelMaterial, "AccioShovel");
	public static Item CrucioShovel = new PrimordialShovel(crucioShovelMaterial, "CrucioShovel");
	public static Item ImperioShovel = new PrimordialShovel(imperioShovelMaterial, "ImperioShovel");
	public static Item ZivicioShovel = new PrimordialShovel(zivicioShovelMaterial, "ZivicioShovel");

	public static Item AccioHoe = new PrimordialHoe(accioToolMaterial, "AccioHoe");
	public static Item CrucioHoe = new PrimordialHoe(crucioToolMaterial, "CrucioHoe");
	public static Item ImperioHoe = new PrimordialHoe(imperioToolMaterial, "ImperioHoe");
	public static Item ZivicioHoe = new PrimordialHoe(zivicioToolMaterial, "ZivicioHoe");

	public static ItemArmor AccioHelmet = new PrimordialArmor(accioArmorMaterial, 0, EntityEquipmentSlot.HEAD, "accioHelmet");
	public static ItemArmor AccioChestPlate = new PrimordialArmor(accioArmorMaterial, 0, EntityEquipmentSlot.CHEST, "accioChestPlate");
	public static ItemArmor AccioLeggings = new PrimordialArmor(accioArmorMaterial, 0, EntityEquipmentSlot.LEGS, "accioLeggings");
	public static ItemArmor AccioBoots = new PrimordialArmor(accioArmorMaterial, 0, EntityEquipmentSlot.FEET, "accioBoots");

	public static ItemArmor CrucioHelmet = new PrimordialArmor(crucioArmorMaterial, 0, EntityEquipmentSlot.HEAD, "crucioHelmet");
	public static ItemArmor CrucioChestPlate = new PrimordialArmor(crucioArmorMaterial, 0, EntityEquipmentSlot.CHEST, "crucioChestPlate");
	public static ItemArmor CrucioLeggings = new PrimordialArmor(crucioArmorMaterial, 0, EntityEquipmentSlot.LEGS, "crucioLeggings");
	public static ItemArmor CrucioBoots = new PrimordialArmor(crucioArmorMaterial, 0, EntityEquipmentSlot.FEET, "crucioBoots");

	public static ItemArmor ImperioHelmet = new PrimordialArmor(imperioArmorMaterial, 0, EntityEquipmentSlot.HEAD, "imperioHelmet");
	public static ItemArmor ImperioChestPlate = new PrimordialArmor(imperioArmorMaterial, 0, EntityEquipmentSlot.CHEST, "imperioChestPlate");
	public static ItemArmor ImperioLeggings = new PrimordialArmor(imperioArmorMaterial, 0, EntityEquipmentSlot.LEGS, "imperioLeggings");
	public static ItemArmor ImperioBoots = new PrimordialArmor(imperioArmorMaterial, 0, EntityEquipmentSlot.FEET, "imperioBoots");

	public static ItemArmor ZivicioHelmet = new PrimordialArmor(zivicioArmorMaterial, 0, EntityEquipmentSlot.HEAD, "zivicioHelmet");
	public static ItemArmor ZivicioChestPlate = new PrimordialArmor(zivicioArmorMaterial, 0, EntityEquipmentSlot.CHEST, "zivicioChestPlate");
	public static ItemArmor ZivicioLeggings = new PrimordialArmor(zivicioArmorMaterial, 0, EntityEquipmentSlot.LEGS, "zivicioLeggings");
	public static ItemArmor ZivicioBoots = new PrimordialArmor(zivicioArmorMaterial, 0, EntityEquipmentSlot.FEET, "zivicioBoots");





	public static Item PrimordialBook = new PrimordialBook();

	public static void init() {

		CrucioEssence = regCraftItem("CrucioEssence");
		ImperioEssence = regCraftItem("ImperioEssence");
		ZivicioEssence = regCraftItem("ZivicioEssence");
		AccioEssence = regCraftItem("AccioEssence");

		accioIngot = regCraftItem("accioIngot");
		crucioIngot = regCraftItem("crucioIngot");
		imperioIngot = regCraftItem("imperioIngot");
		zivicioIngot = regCraftItem("zivicioIngot");


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
			LogHelper.info("Eseence Based Weapons Enabled");
			GameRegistry.register(ZivicioSword.setRegistryName("ZivicioSword"));
			GameRegistry.register(AccioSword.setRegistryName("AccioSword"));
			GameRegistry.register(CrucioSword.setRegistryName("CrucioSword"));
			GameRegistry.register(ImperioSword.setRegistryName("ImperioSword"));
		} else {
			LogHelper.info("Eseence Based Weapons Disabled");
		}

		if (PrimordialConfig.enableTools) {
			LogHelper.info("Eseence Based Tools Enabled");
			GameRegistry.register(AccioPickAxe.setRegistryName("Accio_PickAxe"));
			GameRegistry.register(AccioAxe.setRegistryName("Accio_Axe"));
			GameRegistry.register(AccioShovel.setRegistryName("Accio_Shovel"));
			GameRegistry.register(AccioHoe.setRegistryName("Accio_Hoe"));

			GameRegistry.register(CrucioPickAxe.setRegistryName("Crucio_PickAxe"));
			GameRegistry.register(CrucioAxe.setRegistryName("Crucio_Axe"));
			GameRegistry.register(CrucioShovel.setRegistryName("Crucio_Shovel"));
			GameRegistry.register(CrucioHoe.setRegistryName("Crucio_Hoe"));

			GameRegistry.register(ImperioPickAxe.setRegistryName("Imperio_PickAxe"));
			GameRegistry.register(ImperioAxe.setRegistryName("Imperio_Axe"));
			GameRegistry.register(ImperioShovel.setRegistryName("Imperio_Shovel"));
			GameRegistry.register(ImperioHoe.setRegistryName("Imperio_Hoe"));

			GameRegistry.register(ZivicioPickAxe.setRegistryName("Zivicio_PickAxe"));
			GameRegistry.register(ZivicioAxe.setRegistryName("Zivicio_Axe"));
			GameRegistry.register(ZivicioShovel.setRegistryName("Zivicio_Shovel"));
			GameRegistry.register(ZivicioHoe.setRegistryName("Zivicio_Hoe"));
		} else {
			LogHelper.info("Eseence Based Tools Disabled");
		}

		if (PrimordialConfig.enableArmour) {
			LogHelper.info("Essence Based Armor Enabled");
			GameRegistry.register(AccioHelmet.setRegistryName("Accio_Helmet"));
			GameRegistry.register(AccioChestPlate.setRegistryName("Accio_ChestPlate"));
			GameRegistry.register(AccioLeggings.setRegistryName("Accio_Leggings"));
			GameRegistry.register(AccioBoots.setRegistryName("Accio_Boots"));

			GameRegistry.register(CrucioHelmet.setRegistryName("Crucio_Helmet"));
			GameRegistry.register(CrucioChestPlate.setRegistryName("Crucio_ChestPlate"));
			GameRegistry.register(CrucioLeggings.setRegistryName("Crucio_Leggings"));
			GameRegistry.register(CrucioBoots.setRegistryName("Crucio_Boots"));

			GameRegistry.register(ImperioHelmet.setRegistryName("Imperio_Helmet"));
			GameRegistry.register(ImperioChestPlate.setRegistryName("Imperio_ChestPlate"));
			GameRegistry.register(ImperioLeggings.setRegistryName("Imperio_Leggings"));
			GameRegistry.register(ImperioBoots.setRegistryName("Imperio_Boots"));

			GameRegistry.register(ZivicioHelmet.setRegistryName("Zivicio_Helmet"));
			GameRegistry.register(ZivicioChestPlate.setRegistryName("Zivicio_ChestPlate"));
			GameRegistry.register(ZivicioLeggings.setRegistryName("Zivicio_Leggings"));
			GameRegistry.register(ZivicioBoots.setRegistryName("Zivicio_Boots"));
		} else {
			LogHelper.info("Eseence Based Armor Disabled");
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
