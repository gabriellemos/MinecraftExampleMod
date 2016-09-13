package keg.examplemod.items.armor;

import keg.examplemod.Reference;
import keg.examplemod.init.TutorialItems;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SuperCheatyLeggings extends ItemArmor {

    public SuperCheatyLeggings() {
        super(TutorialItems.cheaty_armor_material, 2, EntityEquipmentSlot.LEGS);

        this.setUnlocalizedName("super_cheaty_leggings");
        this.setRegistryName("super_cheaty_leggings");
    }

    //@Override
    //public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
    //    return Reference.MODID + ":textures/models/armor/" + this.getArmorMaterial().getName() + "_" + this.renderIndex + ".png";
    //}
}
