package keg.examplemod.items.tools;

import keg.examplemod.init.TutorialItems;
import net.minecraft.item.ItemSword;

public class SuperCheatySword extends ItemSword {

    public SuperCheatySword() {
        super(TutorialItems.cheaty_tool_material);

        this.setUnlocalizedName("super_cheaty_sword");
        this.setRegistryName("super_cheaty_sword");
    }

}
