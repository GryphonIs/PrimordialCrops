package killbait.PrimordialCrops.Items;

import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Utils.Colours;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;

import javax.annotation.Nullable;
import java.util.List;

public class PrimordialCropsItem extends Item {

	protected String name;
	private boolean isEssence;

	public PrimordialCropsItem(String name) {
		this(name, false);

	}

	public PrimordialCropsItem(String name, @Nullable boolean isEssence) {
		this.name = name;
		this.isEssence = isEssence;
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

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		if (this.isEssence) {
			if (Loader.isModLoaded("forestry")) {
				list.add(Colours.YELLOW + "Solder onto forestry circuit boards to set farm type");
			}
		}

		// A very generic check, but no items in the mod use Subtypes except for durability infusion stones
		// so its safe to just do this check

		if (this.getHasSubtypes()) {
			list.add("Uses Remaining " + (PrimordialConfig.infusionStoneMaxUses - stack.getMetadata()));

		}
	}
}
