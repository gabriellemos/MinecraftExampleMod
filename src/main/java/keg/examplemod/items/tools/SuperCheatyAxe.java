package keg.examplemod.items.tools;

import keg.examplemod.init.TutorialItems;
import net.minecraft.item.ItemAxe;

public class SuperCheatyAxe extends ItemAxe{

    private static final float ATTACK_DAMAGE = 10;
    private static final float ATTACK_SPEED = 10;

    public SuperCheatyAxe() {
        super(TutorialItems.cheaty_tool_material, ATTACK_DAMAGE, ATTACK_SPEED);

        this.setUnlocalizedName("super_cheaty_axe");
        this.setRegistryName("super_cheaty_axe");
    }

}
