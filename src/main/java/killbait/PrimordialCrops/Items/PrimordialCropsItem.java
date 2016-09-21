package killbait.PrimordialCrops.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PrimordialCropsItem extends Item {

    protected String name;

    public PrimordialCropsItem(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    public PrimordialCropsItem setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
