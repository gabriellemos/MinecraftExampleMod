package keg.examplemod.proxy;

import keg.examplemod.init.TutorialBlocks;
import keg.examplemod.init.TutorialItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        TutorialBlocks.registerRenders();
        TutorialItems.registerRenders();
    }

}
