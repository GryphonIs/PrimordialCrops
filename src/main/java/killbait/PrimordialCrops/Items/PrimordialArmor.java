package killbait.PrimordialCrops.Items;


import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Utils.Colours;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import java.util.List;

import static killbait.PrimordialCrops.Registry.ModItems.zivicioArmorMaterial;

public class PrimordialArmor extends ItemArmor {

	private String name;

	public PrimordialArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String regName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.name = regName;
		setUnlocalizedName(regName);
		//setRegistryName(regName);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		if (this.getArmorMaterial() == zivicioArmorMaterial) {
			list.add(Colours.LIGHTGREEN + "Unbreakable");
			if (PrimordialConfig.enableZivicioArmorFlight) {
				list.add(Colours.YELLOW + "Grants Creative Flight when full set equipped");
			}
			else
			{
				list.add(Colours.LIGHTRED + "[DISABLED] " + Colours.YELLOW + "Grants Creative Flight when full set equipped ");
			}
		}
	}

	@Override
	public void setDamage(ItemStack stack, int damage) {
		if (this.getArmorMaterial() != zivicioArmorMaterial) {
			//LogHelper.info("Applying Damage");
			super.setDamage(stack, damage);
		}
	}
}
