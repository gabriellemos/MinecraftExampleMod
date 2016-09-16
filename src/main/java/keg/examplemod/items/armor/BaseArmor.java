package keg.examplemod.items.armor;

import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import java.util.Collection;
import java.util.UUID;

public abstract class BaseArmor extends ItemArmor {

    protected final UUID MOVEMENT_SPEED = UUID.fromString("91AEAA56-376B-4498-935B-2F7F68070635");
    protected final UUID MAX_HEALTH = UUID.fromString("5D6F0BA2-1186-46AC-B896-C61C5CEE99CC");
    protected final UUID KNOCKBACK_RESISTANCE = UUID.fromString("5D6F0BA2-1186-46AC-B896-C61C5CEE99CC");

    public BaseArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn,
                     String unlocalizedName, String registryName) {
        super(materialIn, 1, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(registryName);
    }

    /**
     * Replace a modifier in the {@link Multimap} with a copy that's had {@code multiplier} applied to its value.
     *
     * @param modifierMultimap The MultiMap
     * @param attribute        The attribute being modified
     * @param id               The ID of the modifier
     * @param multiplier       The multiplier to apply
     */
    protected void replaceModifier(Multimap<String, AttributeModifier> modifierMultimap,
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

    /**
     * Add a modifier (if not exists) in the {@link Multimap}.
     *
     * @param modifierMultimap The MultiMap
     * @param attribute        The attribute being modified
     * @param id               The ID of the modifier
     * @param amount            The multiplier to apply
     */
    protected void addModifier(Multimap<String, AttributeModifier> modifierMultimap,
                                   IAttribute attribute, UUID id, double amount) {
        // Get the modifiers for the specified attribute
        final Collection<AttributeModifier> modifiers = modifierMultimap.get(attribute.getAttributeUnlocalizedName());

        for (AttributeModifier modifier: modifiers) {
            if (modifier.getID().equals(id)) {
                return;
            }
        }

        modifiers.add(new AttributeModifier(id, "Armor modifier", amount, 0));
    }
}
