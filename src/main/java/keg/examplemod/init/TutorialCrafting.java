package keg.examplemod.init;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.UUID;

public class TutorialCrafting {

    public static void register() {

        String[] customItemCraft = {"ODO", "D D", "ODO"};
        GameRegistry.addShapedRecipe(
                new ItemStack(TutorialItems.custom_item), customItemCraft[0],
                customItemCraft[1], customItemCraft[2], 'O', Blocks.OBSIDIAN, 'D', Blocks.DIRT);

        String[] customBlockCraft = {"CCC", "CCC", "CCC"};
        GameRegistry.addShapedRecipe(
                new ItemStack(TutorialBlocks.custom_block), customBlockCraft[0],
                customBlockCraft[1], customBlockCraft[2], 'C', TutorialItems.custom_item);

        //ItemStack swordStack = new ItemStack(TutorialItems.super_cheaty_sword);
        //swordStack.setStackDisplayName("Not a cheaty sword");
        //final UUID ATTACK_DAMAGE_MODIFIER = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
        //final UUID ATTACK_SPEED_MODIFIER = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
        //swordStack.addAttributeModifier(SharedMonsterAttributes.ATTACK_DAMAGE.getAttributeUnlocalizedName(),
        //        new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)40, 0),
        //        EntityEquipmentSlot.MAINHAND);
//
        //swordStack.addAttributeModifier(SharedMonsterAttributes.ATTACK_SPEED.getAttributeUnlocalizedName(),
        //        new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double)10, 0),
        //        EntityEquipmentSlot.MAINHAND);
//
        //String[] cheatySwordCraft = {"CCC", "CDC", "CCC"};
        //GameRegistry.addShapedRecipe(swordStack, cheatySwordCraft[0],
        //        cheatySwordCraft[1], cheatySwordCraft[2], 'C', TutorialItems.custom_item, 'D', Items.DIAMOND_SWORD);
    }

}
