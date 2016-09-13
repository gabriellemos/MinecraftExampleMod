package keg.examplemod.items.tools;

import keg.examplemod.init.TutorialItems;
import net.minecraft.item.ItemHoe;

public class SuperCheatyHoe extends ItemHoe{

    public SuperCheatyHoe() {
        super(TutorialItems.cheaty_tool_material);

        this.setUnlocalizedName("super_cheaty_hoe");
        this.setRegistryName("super_cheaty_hoe");
    }

}
