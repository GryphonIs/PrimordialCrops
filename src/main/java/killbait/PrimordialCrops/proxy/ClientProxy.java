package killbait.PrimordialCrops.proxy;

import killbait.PrimordialCrops.Registry.BlockRenderRegistry;
import killbait.PrimordialCrops.Registry.ItemRenderRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		ItemRenderRegistry.registerItemRenderer();

	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		BlockRenderRegistry.registerBlockRenderer();
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

}
