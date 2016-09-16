package keg.examplemod.items.tools;

import com.google.common.collect.Multimap;
import keg.examplemod.init.TutorialItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

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

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);

        if (slot == EntityEquipmentSlot.MAINHAND) {
            replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_DAMAGE, ATTACK_DAMAGE_MODIFIER, 2);
            replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, 1.5);
        }

        return modifiers;
    }

    /**
     * Replace a modifier in the {@link Multimap} with a copy that's had {@code multiplier} applied to its value.
     *
     * @param modifierMultimap The MultiMap
     * @param attribute        The attribute being modified
     * @param id               The ID of the modifier
     * @param multiplier       The multiplier to apply
     */
    private void replaceModifier(Multimap<String, AttributeModifier> modifierMultimap,
                                 IAttribute attribute, UUID id, double multiplier) {
        // Get the modifiers for the specified attribute
        final Collection<AttributeModifier> modifiers = modifierMultimap.get(attribute.getAttributeUnlocalizedName());

        AttributeModifier selectedModifier = null;
        for (AttributeModifier modifier: modifiers) {
            if (modifier.getID().equals(id)) {
                selectedModifier = modifier;
                break;
            }
        }

        if (selectedModifier != null) {
            modifiers.remove(selectedModifier);
            modifiers.add(new AttributeModifier(selectedModifier.getID(), selectedModifier.getName(),
                    selectedModifier.getAmount() * multiplier, selectedModifier.getOperation()));
        }
    }

}
