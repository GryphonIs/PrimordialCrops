package killbait.PrimordialCrops.Items;

import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Utils.Colours;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.List;

public class PrimordialBook extends Item {

/*
*
*Idea to implement a book to walk players through the mod
*
*/

	public PrimordialBook() {
		super();
		this.setCreativeTab(PrimordialCrops.PrimordialCrops);
		this.setUnlocalizedName("PrimordialBook");
		this.setMaxStackSize(1);
	}

	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(Colours.LIGHTRED + "Work In Progress... Not Yet Available");
	}

	@Override
	public ActionResult onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		if (worldIn.isRemote) {
			playerIn.openGui(PrimordialCrops.instance, 0, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
		}
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}

}
