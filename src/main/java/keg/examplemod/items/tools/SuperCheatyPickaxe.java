package keg.examplemod.items.tools;

import keg.examplemod.init.TutorialItems;
import net.minecraft.item.ItemPickaxe;

public class SuperCheatyPickaxe extends ItemPickaxe{

    public SuperCheatyPickaxe() {
        super(TutorialItems.cheaty_tool_material);

        this.setUnlocalizedName("super_cheaty_pickaxe");
        this.setRegistryName("super_cheaty_pickaxe");
    }
}
