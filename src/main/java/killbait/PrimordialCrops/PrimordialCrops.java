package killbait.PrimordialCrops;

import killbait.PrimordialCrops.Config.PrimordialConfig;
import killbait.PrimordialCrops.Registry.ModCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// TODO: Tier'ed seed give more essence back?
//  MAJOR re-write of whole block/item registration needed i think :( , easy option, multiplier config option
//  but thats just the lazy way

// TODO: Save the world/Feed The Whales/Cure world hunger and other misc stuff :)

@Mod(modid = Info.MODID, version = Info.VERSION, name = Info.MODNAME)

public class PrimordialCrops {

	@Mod.Instance(Info.MODID)
	public static PrimordialCrops instance;
	
	@SidedProxy(clientSide = "killbait.PrimordialCrops.proxy.ClientProxy", serverSide = "killbait.PrimordialCrops.proxy.ServerProxy")

	public static killbait.PrimordialCrops.proxy.CommonProxy proxy;

	public static CreativeTabs PrimordialCrops = new CreativeTabs("PrimordialCrops") {
		@Override
		public Item getTabIconItem() {
			return ModCrops.MinicioSeeds;
		}

	};


	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		PrimordialConfig.init(e);
		proxy.preInit(e);

	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);

	}

}
