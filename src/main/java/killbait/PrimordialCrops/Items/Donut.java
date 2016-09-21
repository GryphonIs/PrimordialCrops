package killbait.PrimordialCrops.Items;

import killbait.PrimordialCrops.PrimordialCrops;
import net.minecraft.item.ItemFood;

public class Donut extends ItemFood {

    public Donut(int amount, boolean isWolfFood) {
        super(amount, isWolfFood);
        this.setCreativeTab(PrimordialCrops.PrimordialCrops);
        this.setUnlocalizedName("Donut");
    }
}