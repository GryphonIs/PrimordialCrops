package killbait.PrimordialCrops.Utils;


import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.Registry.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class EventHandler {
	@SubscribeEvent
	public void PlayerTickEvent(TickEvent.PlayerTickEvent event) {
		if (!event.player.capabilities.isCreativeMode) {
			if (PrimordialConfig.enableZivicioArmorFlight) {
				int armorCount = 0;
				for (ItemStack stack : event.player.getArmorInventoryList()) {
					if (stack != null) {
						if (stack.getItem() == ModItems.ZivicioHelmet || stack.getItem() == ModItems.ZivicioChestPlate || stack.getItem() == ModItems.ZivicioLeggings || stack.getItem() == ModItems.ZivicioBoots) {
							armorCount++;
						}
					}
				}

				if (armorCount == 4) {
					event.player.capabilities.allowFlying = true;
				} else {
					event.player.capabilities.allowFlying = false;
					event.player.capabilities.isFlying = false;

				}
			}
		}
		event.setResult(Event.Result.ALLOW);
	}

}
