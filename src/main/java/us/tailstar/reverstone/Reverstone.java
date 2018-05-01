package us.tailstar.reverstone;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import us.tailstar.reverstone.proxy.CommonProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTEDVERSIONS)
public class Reverstone {

    @SidedProxy(serverSide = "us.tailstar.reverstone.proxy.CommonProxy", clientSide = "us.tailstar.reverstone.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(Reference.MODID)
    public static Reverstone instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.NAME + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
