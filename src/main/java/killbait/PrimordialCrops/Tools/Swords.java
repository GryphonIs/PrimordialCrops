package killbait.PrimordialCrops.Tools;

import killbait.PrimordialCrops.PrimordialCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class Swords extends ItemSword {

	public Swords(Item.ToolMaterial material, String regName) {
		super(material);
		this.setUnlocalizedName(regName);
		this.setMaxStackSize(1);
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
	}

}

