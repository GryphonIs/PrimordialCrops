package killbait.PrimordialCrops.Items;

import killbait.PrimordialCrops.PrimordialCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

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
	public ActionResult onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		if (worldIn.isRemote) {
			playerIn.openGui(PrimordialCrops.instance, 0, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
		}
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}

}
