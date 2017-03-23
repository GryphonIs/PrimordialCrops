package killbait.PrimordialCrops.Items.Tools;

import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Utils.Colours;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

import java.util.List;

import static killbait.PrimordialCrops.Registry.ModItems.zivicioShovelMaterial;

public class PrimordialShovel extends ItemSpade {

	public PrimordialShovel(Item.ToolMaterial material, String regName) {
		super(material);
		this.setUnlocalizedName(regName);
		this.setMaxStackSize(1);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		if (this.getToolMaterial() == zivicioShovelMaterial) list.add(Colours.LIGHTGREEN + "Unbreakable");
	}

	@Override
	public void setDamage(ItemStack stack, int damage) {
		if (this.getToolMaterial() != zivicioShovelMaterial) {
			super.setDamage(stack, damage);
		}
	}
}
