package killbait.PrimordialCrops.Items.Tools;

import killbait.PrimordialCrops.PrimordialCrops;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

public class PrimordialSword extends ItemSword {

	public PrimordialSword(Item.ToolMaterial material, String regName) {
		super(material);
		this.setUnlocalizedName(regName);
		this.setMaxStackSize(1);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		if (stack.getMaxDamage() == 0) list.add("\u00A7aUnbreakable");
	}

}

