package killbait.PrimordialCrops.Items;

import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.PrimordialCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PrimordialCropsItem extends Item {

	protected String name;

	public PrimordialCropsItem(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}

	public PrimordialCropsItem(String name, boolean hasDamage, int maxDamage, int stackNum) {
		this.name = name;
		if (hasDamage) {
			this.setHasSubtypes(true);
			this.setMaxDamage(maxDamage - 1);
			this.setNoRepair();
		}
		this.maxStackSize = stackNum;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}

	@Override
	public PrimordialCropsItem setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		ItemStack copiedStack = itemStack.copy();
		if (PrimordialConfig.infusionStoneDurability) {
			copiedStack.setItemDamage(copiedStack.getItemDamage() + 1);
		}
		copiedStack.setCount(1);
		return copiedStack;
	}
}
