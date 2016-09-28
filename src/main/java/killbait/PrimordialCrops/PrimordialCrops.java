package killbait.PrimordialCrops;

import killbait.PrimordialCrops.Registry.ModSeeds;
import killbait.PrimordialCrops.Utils.LogHelper;
import killbait.PrimordialCrops.Utils.PrimordialConfig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

// TODO: Add config file support
// TODO: Tier'ed seed give more essence back?
// TODO: Save the world/Feed The Whales/Cure world hunger and other misc stuff :)

@Mod(modid = Info.MODID, version = Info.VERSION, name = Info.MODNAME)

public class PrimordialCrops {

	@SidedProxy(clientSide = "killbait.PrimordialCrops.proxy.ClientProxy", serverSide = "killbait.PrimordialCrops.proxy.ServerProxy")

	public static killbait.PrimordialCrops.proxy.CommonProxy proxy;

	public static CreativeTabs PrimordialCrops = new CreativeTabs("PrimordialCrops") {
		@Override
		public Item getTabIconItem() {
			return ModSeeds.MinicioSeeds;
		}

	};


	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		this.proxy.preInit(e);
		PrimordialConfig.init(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		this.proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);

	}

}