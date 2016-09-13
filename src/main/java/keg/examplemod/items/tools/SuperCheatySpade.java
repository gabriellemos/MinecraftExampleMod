package keg.examplemod.items.tools;

import keg.examplemod.init.TutorialItems;
import net.minecraft.item.ItemSpade;

public class SuperCheatySpade extends ItemSpade {

    public SuperCheatySpade() {
        super(TutorialItems.cheaty_tool_material);

        this.setUnlocalizedName("super_cheaty_spade");
        this.setRegistryName("super_cheaty_spade");
    }
}
