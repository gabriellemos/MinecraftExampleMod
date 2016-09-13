package keg.examplemod.init;

import keg.examplemod.Reference;
import keg.examplemod.blocks.SuperCheatyBlock;
import keg.examplemod.blocks.TutorialBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialBlocks {

    public static TutorialBlock custom_block;
    public static SuperCheatyBlock super_cheaty_block;

    public static void init() {
        custom_block = new TutorialBlock(Material.CLOTH, "custom_block", "custom_block");
        super_cheaty_block = new SuperCheatyBlock(Material.GROUND, "super_cheaty_block", "super_cheaty_block");
    }

    public static void register() {
        GameRegistry.register(custom_block);
        GameRegistry.register(super_cheaty_block);
    }

    public static void registerRenders() {
        registerRender(custom_block);
        registerRender(super_cheaty_block);
    }

    private static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        ModelResourceLocation resourceLocation = new ModelResourceLocation(getBlockRecourceName(block), "inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, resourceLocation);
    }

    private static String getBlockRecourceName(Block block) {
        String recourceName = Reference.MODID + ":";
        recourceName += block.getUnlocalizedName().substring(5);

        return recourceName;
    }

}
