package killbait.PrimordialCrops.Items;

import killbait.PrimordialCrops.PrimordialCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PrimordialBook extends Item {

/*
*
*Idea to implement a book to walk players through the mod
*
*/

	public PrimordialBook() {
		super();
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
		this.setUnlocalizedName("PrimoirdialBook");
		this.setMaxStackSize(1);
	}
	
	@Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        if (worldIn.isRemote) {
            playerIn.openGui(PrimordialCrops.instance, 0, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
        }
        return itemStackIn;
    }
    
}
