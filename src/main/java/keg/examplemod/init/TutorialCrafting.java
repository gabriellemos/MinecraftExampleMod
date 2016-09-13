package keg.examplemod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
    }

}
