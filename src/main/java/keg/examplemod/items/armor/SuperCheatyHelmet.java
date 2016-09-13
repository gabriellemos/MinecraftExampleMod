package keg.examplemod.items.armor;

import keg.examplemod.Reference;
import keg.examplemod.init.TutorialItems;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SuperCheatyHelmet extends ItemArmor {

    public SuperCheatyHelmet() {
        super(TutorialItems.cheaty_armor_material, 1, EntityEquipmentSlot.HEAD);

        this.setUnlocalizedName("super_cheaty_helmet");
        this.setRegistryName("super_cheaty_helmet");
    }

    //@Override
    //public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
    //    return Reference.MODID + ":textures/models/armor/" + this.getArmorMaterial().getName() + "_" + this.renderIndex + ".png";
    //}
}
