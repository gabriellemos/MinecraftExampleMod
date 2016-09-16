package keg.examplemod.items.tools;

import com.google.common.collect.Multimap;
import keg.examplemod.init.TutorialItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;

public class SuperCheatySword extends ItemSword {

    public SuperCheatySword() {
        super(TutorialItems.cheaty_tool_material);

        this.setUnlocalizedName("super_cheaty_sword");
        this.setRegistryName("super_cheaty_sword");
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}
