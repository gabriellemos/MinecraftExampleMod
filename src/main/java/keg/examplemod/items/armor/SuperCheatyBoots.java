package keg.examplemod.items.armor;

import com.google.common.collect.Multimap;
import keg.examplemod.Reference;
import keg.examplemod.init.TutorialItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SuperCheatyBoots extends BaseArmor {

    private static final Float BASE_SPEED = 0.3f;
    private static final String RECOURE_NAME = "super_cheaty_boots";
    private static final EntityEquipmentSlot EQUIPMENT_SLOT = EntityEquipmentSlot.FEET;

    public SuperCheatyBoots() {
        super(TutorialItems.cheaty_armor_material,
                EQUIPMENT_SLOT, RECOURE_NAME, RECOURE_NAME);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);

        if (slot == EQUIPMENT_SLOT) {
            addModifier(modifiers, SharedMonsterAttributes.MOVEMENT_SPEED, MOVEMENT_SPEED, BASE_SPEED * 0.5);
            addModifier(modifiers, SharedMonsterAttributes.MAX_HEALTH, MAX_HEALTH, 26);

            modifiers.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getAttributeUnlocalizedName(),
                    new AttributeModifier(SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getAttributeUnlocalizedName(), (double)20, 0));

        }

        return modifiers;
    }

}
