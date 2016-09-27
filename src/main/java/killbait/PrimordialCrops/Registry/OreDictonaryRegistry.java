package killbait.PrimordialCrops.Registry;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictonaryRegistry {

	public static void regOreDic() {

		OreDictionary.registerOre("T3Essence", new ItemStack(ModItems.IronEssence));
		OreDictionary.registerOre("T3Essence", new ItemStack(ModItems.AirEssence));
		OreDictionary.registerOre("T3Essence", new ItemStack(ModItems.LapisEssence));

		OreDictionary.registerOre("T4Essence", new ItemStack(ModItems.GoldEssence));
		OreDictionary.registerOre("T4Essence", new ItemStack(ModItems.RedstoneEssence));
		OreDictionary.registerOre("T4Essence", new ItemStack(ModItems.QuartzEssence));
		OreDictionary.registerOre("T4Essence", new ItemStack(ModItems.GlowstoneEssence));
		OreDictionary.registerOre("T4Essence", new ItemStack(ModItems.FireEssence));

		OreDictionary.registerOre("T5Essence", new ItemStack(ModItems.ObsidianEssence));
		OreDictionary.registerOre("T5Essence", new ItemStack(ModItems.ExperienceEssence));
		OreDictionary.registerOre("T5Essence", new ItemStack(ModItems.EnderEssence));
		OreDictionary.registerOre("T5Essence", new ItemStack(ModItems.EmeraldEssence));
		OreDictionary.registerOre("T5Essence", new ItemStack(ModItems.DiamondEssence));

		OreDictionary.registerOre("smallShroom", new ItemStack(Blocks.RED_MUSHROOM));
		OreDictionary.registerOre("smallShroom", new ItemStack(Blocks.BROWN_MUSHROOM));

		OreDictionary.registerOre("InfusionStoneT1Plus", new ItemStack(ModItems.InfusionStoneT1));
		OreDictionary.registerOre("InfusionStoneT1Plus", new ItemStack(ModItems.InfusionStoneT2));
		OreDictionary.registerOre("InfusionStoneT1Plus", new ItemStack(ModItems.InfusionStoneT3));
		OreDictionary.registerOre("InfusionStoneT1Plus", new ItemStack(ModItems.InfusionStoneT4));
		OreDictionary.registerOre("InfusionStoneT1Plus", new ItemStack(ModItems.InfusionStoneT5));

		OreDictionary.registerOre("InfusionStoneT2Plus", new ItemStack(ModItems.InfusionStoneT2));
		OreDictionary.registerOre("InfusionStoneT2Plus", new ItemStack(ModItems.InfusionStoneT3));
		OreDictionary.registerOre("InfusionStoneT2Plus", new ItemStack(ModItems.InfusionStoneT4));
		OreDictionary.registerOre("InfusionStoneT2Plus", new ItemStack(ModItems.InfusionStoneT5));

		OreDictionary.registerOre("InfusionStoneT3Plus", new ItemStack(ModItems.InfusionStoneT3));
		OreDictionary.registerOre("InfusionStoneT3Plus", new ItemStack(ModItems.InfusionStoneT4));
		OreDictionary.registerOre("InfusionStoneT3Plus", new ItemStack(ModItems.InfusionStoneT5));

		OreDictionary.registerOre("InfusionStoneT4Plus", new ItemStack(ModItems.InfusionStoneT4));
		OreDictionary.registerOre("InfusionStoneT4Plus", new ItemStack(ModItems.InfusionStoneT5));

		OreDictionary.registerOre("InfusionStoneT5Plus", new ItemStack(ModItems.InfusionStoneT5));


		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("forestry") || Loader.isModLoaded("immersiveengineering")) {
			OreDictionary.registerOre("ingotCopper", new ItemStack(ModItems.CopperIngot));
			OreDictionary.registerOre("ingotTin", new ItemStack(ModItems.TinIngot));
		}

		if (Loader.isModLoaded("FunOres") || Loader.isModLoaded("IC2") || Loader.isModLoaded("ep") || Loader.isModLoaded("immersiveengineering")) {
			OreDictionary.registerOre("ingotLead", new ItemStack(ModItems.LeadIngot));
			OreDictionary.registerOre("ingotSilver", new ItemStack(ModItems.SilverIngot));
		}

		OreDictionary.registerOre("oreMinico", new ItemStack(ModBlocks.MinicioOre));
	}
}
