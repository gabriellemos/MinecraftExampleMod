package keg.examplemod.items.armor;

import keg.examplemod.Reference;
import keg.examplemod.init.TutorialItems;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SuperCheatyBoots extends ItemArmor {

    public SuperCheatyBoots() {
        super(TutorialItems.cheaty_armor_material, 1, EntityEquipmentSlot.FEET);

        this.setUnlocalizedName("super_cheaty_boots");
        this.setRegistryName("super_cheaty_boots");
    }

    //@Override
    //public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
    //    return Reference.MODID + ":textures/models/armor/" + this.getArmorMaterial().getName() + "_" + this.renderIndex + ".png";
    //}
}
