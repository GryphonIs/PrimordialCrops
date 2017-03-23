package killbait.PrimordialCrops.Items.Tools;

import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Utils.Colours;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

import static killbait.PrimordialCrops.Registry.ModItems.ZivicioSwordMaterial;

public class PrimordialSword extends ItemSword {

	public PrimordialSword(Item.ToolMaterial material, String regName) {
		super(material);
		this.setUnlocalizedName(regName);
		this.setMaxStackSize(1);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		if (this.getToolMaterialName() == ZivicioSwordMaterial.toString()) list.add(Colours.LIGHTGREEN + "Unbreakable");
	}

	// there is no way to get a reference to the actual material used, getToolMaterialName() only returns a string
	// meh... this is ugly, checking against a specific material works though.
	@Override
	public void setDamage(ItemStack stack, int damage) {
		if (this.getToolMaterialName() != ZivicioSwordMaterial.toString()) {
			super.setDamage(stack, damage);
		}
	}
}

