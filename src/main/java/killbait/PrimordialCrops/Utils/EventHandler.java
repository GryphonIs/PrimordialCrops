package killbait.PrimordialCrops.Utils;


import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.Registry.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

// Feb 5th - Functional, but doesn't play well with other mods flight - Temp disabled in 1.7c release..
// Mar 23rd - Hopefully will play nice now, sooooooooo much time and testing wasted on a small thing - Released 1.7d

public class EventHandler {

	private static boolean isFlyingClient = false;
	private static boolean isFlyingServer = false;

	@SubscribeEvent
	public void PlayerTickEvent(TickEvent.PlayerTickEvent event) {
		if (PrimordialConfig.enableZivicioArmorFlight) {
			if (!event.player.capabilities.isCreativeMode) {
				int armorCount = 0;
				for (ItemStack stack : event.player.getArmorInventoryList()) {
					if (stack != null) {
						if (stack.getItem() == ModItems.ZivicioHelmet || stack.getItem() == ModItems.ZivicioChestPlate || stack.getItem() == ModItems.ZivicioLeggings || stack.getItem() == ModItems.ZivicioBoots) {
							armorCount++;
						}
					}
				}

				if (armorCount == 4 && event.player.capabilities.allowFlying == false) {
					event.player.capabilities.allowFlying = true;
					if (event.side == Side.CLIENT) {
						isFlyingClient = true;
						//LogHelper.info("Enabled Client Flight");
					} else {
						isFlyingServer = true;
						//LogHelper.info("Enabled Server Flight");
					}
				} else {
					if (isFlyingServer && !event.player.worldObj.isRemote && armorCount != 4) {
						isFlyingServer = false;
						if (!event.player.capabilities.isCreativeMode) {
							event.player.capabilities.allowFlying = false;
							event.player.capabilities.isFlying = false;
							event.player.sendPlayerAbilities();
							//LogHelper.info("Disabled Server Flight");
						}
					}

					if (isFlyingClient && event.player.worldObj.isRemote && armorCount != 4) {
						isFlyingClient = false;
						if (!event.player.capabilities.isCreativeMode) {
							event.player.capabilities.allowFlying = false;
							event.player.capabilities.isFlying = false;
							//LogHelper.info("Disabled Client Flight");
						}
					}
				}
			}
		}
		event.setResult(Event.Result.ALLOW);
	}
}
