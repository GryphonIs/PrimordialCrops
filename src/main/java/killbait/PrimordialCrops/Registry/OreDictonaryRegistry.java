package killbait.PrimordialCrops.Registry;

import killbait.PrimordialCrops.Config.PrimordialConfig;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

public class OreDictonaryRegistry {

	public static void regOreDic() {

		if (PrimordialConfig.enableCoalCrop) {
			OreDictionary.registerOre("T2Essence", new ItemStack(ModCrops.CoalEssence));
		} else {
			OreDictionary.registerOre("T2Essence", new ItemStack(Items.COAL, 1, 0));
		}

		if (PrimordialConfig.enableIronCrop) {
			OreDictionary.registerOre("T3Essence", new ItemStack(ModCrops.IronEssence));
		}

		if (PrimordialConfig.enableAirCrop) {
			OreDictionary.registerOre("T3Essence", new ItemStack(ModCrops.AirEssence));
		}

		if (PrimordialConfig.enableLapisCrop) {
			OreDictionary.registerOre("T3Essence", new ItemStack(ModCrops.LapisEssence));
		} else {
			OreDictionary.registerOre("T3Essence", new ItemStack(Blocks.LAPIS_BLOCK));
		}

		if (PrimordialConfig.enableGoldCrop) {
			OreDictionary.registerOre("T4Essence", new ItemStack(ModCrops.GoldEssence));
		} else {
			OreDictionary.registerOre("T4Essence", new ItemStack(Blocks.GOLD_BLOCK));
		}

		if (PrimordialConfig.enableRedstoneCrop) {
			OreDictionary.registerOre("T4Essence", new ItemStack(ModCrops.RedstoneEssence));
		}

		if (PrimordialConfig.enableQuartzCrop) {
			OreDictionary.registerOre("T4Essence", new ItemStack(ModCrops.QuartzEssence));
		}

		if (PrimordialConfig.enableGlowstoneCrop) {
			OreDictionary.registerOre("T4Essence", new ItemStack(ModCrops.GlowstoneEssence));
		}

		if (PrimordialConfig.enableFireCrop) {
			OreDictionary.registerOre("T4Essence", new ItemStack(ModCrops.FireEssence));
		}

		if (PrimordialConfig.enableObsidianCrop)
			OreDictionary.registerOre("T5Essence", new ItemStack(ModCrops.ObsidianEssence));

		if (PrimordialConfig.enableExperienceCrop)
			OreDictionary.registerOre("T5Essence", new ItemStack(ModCrops.ExperienceEssence));

		if (PrimordialConfig.enableEnderCrop)
			OreDictionary.registerOre("T5Essence", new ItemStack(ModCrops.EnderEssence));

		if (PrimordialConfig.enableEmeraldCrop) {
			OreDictionary.registerOre("T5Essence", new ItemStack(ModCrops.EmeraldEssence));
		} else {
			OreDictionary.registerOre("T5Essence", new ItemStack(Blocks.EMERALD_BLOCK));
		}
		if (PrimordialConfig.enableDiamondCrop) {
			OreDictionary.registerOre("T5Essence", new ItemStack(ModCrops.DiamondEssence));
		} else {
			OreDictionary.registerOre("T5Essence", new ItemStack(Blocks.DIAMOND_BLOCK));
		}

		OreDictionary.registerOre("smallShroom", new ItemStack(Blocks.RED_MUSHROOM));
		OreDictionary.registerOre("smallShroom", new ItemStack(Blocks.BROWN_MUSHROOM));

		if (PrimordialConfig.infusionStoneDurability) {
			OreDictionary.registerOre("InfusionStoneT1Plus", new ItemStack(ModItems.InfusionStoneT1, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT1Plus", new ItemStack(ModItems.InfusionStoneT2, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT1Plus", new ItemStack(ModItems.InfusionStoneT3, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT1Plus", new ItemStack(ModItems.InfusionStoneT4, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT1Plus", new ItemStack(ModItems.InfusionStoneT5, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT2Plus", new ItemStack(ModItems.InfusionStoneT2, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT2Plus", new ItemStack(ModItems.InfusionStoneT3, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT2Plus", new ItemStack(ModItems.InfusionStoneT4, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT2Plus", new ItemStack(ModItems.InfusionStoneT5, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT3Plus", new ItemStack(ModItems.InfusionStoneT3, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT3Plus", new ItemStack(ModItems.InfusionStoneT4, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT3Plus", new ItemStack(ModItems.InfusionStoneT5, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT4Plus", new ItemStack(ModItems.InfusionStoneT4, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT4Plus", new ItemStack(ModItems.InfusionStoneT5, 1, OreDictionary.WILDCARD_VALUE));
			OreDictionary.registerOre("InfusionStoneT5Plus", new ItemStack(ModItems.InfusionStoneT5, 1, OreDictionary.WILDCARD_VALUE));
		} else {
			OreDictionary.registerOre("InfusionStoneT1Plus", ModItems.InfusionStoneT1);
			OreDictionary.registerOre("InfusionStoneT1Plus", ModItems.InfusionStoneT2);
			OreDictionary.registerOre("InfusionStoneT1Plus", ModItems.InfusionStoneT3);
			OreDictionary.registerOre("InfusionStoneT1Plus", ModItems.InfusionStoneT4);
			OreDictionary.registerOre("InfusionStoneT1Plus", ModItems.InfusionStoneT5);
			OreDictionary.registerOre("InfusionStoneT2Plus", ModItems.InfusionStoneT2);
			OreDictionary.registerOre("InfusionStoneT2Plus", ModItems.InfusionStoneT3);
			OreDictionary.registerOre("InfusionStoneT2Plus", ModItems.InfusionStoneT4);
			OreDictionary.registerOre("InfusionStoneT2Plus", ModItems.InfusionStoneT5);
			OreDictionary.registerOre("InfusionStoneT3Plus", ModItems.InfusionStoneT3);
			OreDictionary.registerOre("InfusionStoneT3Plus", ModItems.InfusionStoneT4);
			OreDictionary.registerOre("InfusionStoneT3Plus", ModItems.InfusionStoneT5);
			OreDictionary.registerOre("InfusionStoneT4Plus", ModItems.InfusionStoneT4);
			OreDictionary.registerOre("InfusionStoneT4Plus", ModItems.InfusionStoneT5);
			OreDictionary.registerOre("InfusionStoneT5Plus", ModItems.InfusionStoneT5);
		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableUraniumCrop)
				OreDictionary.registerOre("oreUranium", new ItemStack(ModBlocks.UraniumOre));
			if (PrimordialConfig.enableSteelCrop)
				OreDictionary.registerOre("ingotSteel", new ItemStack(ModCrops.SteelIngot));
		}

		if (Loader.isModLoaded("IC2") || Loader.isModLoaded("forestry")) {
			if (PrimordialConfig.enableBronzeCrop)
				OreDictionary.registerOre("ingotBronze", new ItemStack(ModCrops.BronzeIngot));
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("forestry") || Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableCopperCrop)
				OreDictionary.registerOre("ingotCopper", new ItemStack(ModCrops.CopperIngot));
			if (PrimordialConfig.enableTinCrop) OreDictionary.registerOre("ingotTin", new ItemStack(ModCrops.TinIngot));
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("immersiveengineering")) {
			if (PrimordialConfig.enableLeadCrop)
				OreDictionary.registerOre("ingotLead", new ItemStack(ModCrops.LeadIngot));
			if (PrimordialConfig.enableSilverCrop)
				OreDictionary.registerOre("ingotSilver", new ItemStack(ModCrops.SilverIngot));
		}

		OreDictionary.registerOre("oreMinico", new ItemStack(ModBlocks.MinicioOre));
	}

	// returns an itemstack of the first block/Item id that matches the OreDict name
	public static ItemStack getOreDictItemWithMeta(String oreIdName, int num) {
		List<ItemStack> res = OreDictionary.getOres(oreIdName);
		if (res != null || !res.isEmpty()) {
			ItemStack[] res2 = res.toArray(new ItemStack[res.size()]);
			for (int i = 0; i < res.size(); ++i) {
				return new ItemStack(res2[i].getItem(), num, res2[i].getItemDamage());
			}
		}
		return null;
	}
}
