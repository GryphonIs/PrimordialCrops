package killbait.PrimordialCrops.proxy;

import killbait.PrimordialCrops.Compat.CompatHandler;
import killbait.PrimordialCrops.PrimordialCrops;
import killbait.PrimordialCrops.Registry.*;
import killbait.PrimordialCrops.Utils.EventHandler;
import killbait.PrimordialCrops.Utils.GuiHandler;
import killbait.PrimordialCrops.WorldGen.MagicalWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModBlocks.init();
		ModItems.init();
		ModCrops.init();
		OreDictonaryRegistry.regOreDic();

		CompatHandler.registerTOP();
		CompatHandler.registerWaila();

		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}

	public void init(FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(new MagicalWorldGen(), 0);
		ModCrafting.initCrafting();
		NetworkRegistry.INSTANCE.registerGuiHandler(PrimordialCrops.instance, new GuiHandler());
	}

	public void postInit(FMLPostInitializationEvent e) {
	}
}
