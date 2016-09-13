package keg.examplemod;

import keg.examplemod.init.TutorialBlocks;
import keg.examplemod.init.TutorialCrafting;
import keg.examplemod.init.TutorialItems;
import keg.examplemod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * O objetivo desse mod é testar funcionalidades básicas como:
 *      1- Adicionar craft de item
 *      2- Adicionar novo item ao jogo
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class TutorialMod
{

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("RUNNING PRE INIT");

        TutorialItems.init();
        TutorialItems.register();

        TutorialBlocks.init();
        TutorialBlocks.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("RUNNING INIT");

        proxy.registerRenders();
        TutorialCrafting.register();
    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event) {
        System.out.println("RUNNING POST INIT");
    }
}
