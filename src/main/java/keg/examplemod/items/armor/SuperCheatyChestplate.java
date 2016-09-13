package keg.examplemod.items.armor;

import keg.examplemod.Reference;
import keg.examplemod.init.TutorialItems;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SuperCheatyChestplate extends ItemArmor {

    public SuperCheatyChestplate() {
        super(TutorialItems.cheaty_armor_material, 1, EntityEquipmentSlot.CHEST);

        this.setUnlocalizedName("super_cheaty_chestplate");
        this.setRegistryName("super_cheaty_chestplate");
    }

    //@Override
    //public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
    //    return Reference.MODID + ":textures/models/armor/" + this.getArmorMaterial().getName() + "_" + this.renderIndex + ".png";
    //}
}