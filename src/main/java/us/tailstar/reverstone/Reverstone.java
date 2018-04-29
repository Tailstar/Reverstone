package us.tailstar.reverstone;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import us.tailstar.reverstone.proxy.CommonProxy;

@Mod(modid = Reverstone.modId, name = Reverstone.name, version = Reverstone.version, acceptedMinecraftVersions = "[1.12.2]")
public class Reverstone {

    public static final String modId = "reverstone";
    public static final String name = "Reverstone";
    public static final String version = "1.0.0";

    @SidedProxy(serverSide = "us.tailstar.reverstone.proxy.CommonProxy", clientSide = "us.tailstar.reverstone.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static Reverstone instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
