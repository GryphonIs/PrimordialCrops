package killbait.PrimordialCrops.proxy;

import killbait.PrimordialCrops.Registry.*;
import killbait.PrimordialCrops.WorldGen.MagicalWorldGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModBlocks.init();
		ModItems.init();
		ModCrops.init();
		OreDictonaryRegistry.regOreDic();
	}

	public void init(FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(new MagicalWorldGen(), 0);
		ModCrafting.initCrafting();
	        NetworkRegistry.INSTANCE.registerGuiHandler(PrimordialCrops.instance, new GuiHandler());
	}

	public void postInit(FMLPostInitializationEvent e) {
	}
}
