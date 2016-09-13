package keg.examplemod.init;

import keg.examplemod.Reference;
import keg.examplemod.items.armor.SuperCheatyBoots;
import keg.examplemod.items.armor.SuperCheatyChestplate;
import keg.examplemod.items.armor.SuperCheatyHelmet;
import keg.examplemod.items.armor.SuperCheatyLeggings;
import keg.examplemod.items.tools.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class TutorialItems {

    public static Item custom_item;

    public static Item.ToolMaterial cheaty_tool_material;
    public static SuperCheatySword super_cheaty_sword;
    public static SuperCheatyPickaxe super_cheaty_pickaxe;
    public static SuperCheatySpade super_cheaty_spade;
    public static SuperCheatyAxe super_cheaty_axe;
    public static SuperCheatyHoe super_cheaty_hoe;

    public static ItemArmor.ArmorMaterial cheaty_armor_material;
    private static SuperCheatyHelmet super_cheaty_helmet;
    private static SuperCheatyChestplate super_cheaty_chestplate;
    private static SuperCheatyLeggings super_cheaty_leggings;
    private static SuperCheatyBoots super_cheaty_boots;

    public static void init() {
        custom_item = new Item();
        custom_item.setUnlocalizedName("custom_item");
        custom_item.setRegistryName("custom_item");

        cheaty_tool_material = EnumHelper.addToolMaterial("cheaty_tool_material", 3, 10000, 48f, 16f, 0);
        super_cheaty_sword = new SuperCheatySword();
        super_cheaty_pickaxe = new SuperCheatyPickaxe();
        super_cheaty_spade = new SuperCheatySpade();
        super_cheaty_hoe = new SuperCheatyHoe();
        super_cheaty_axe = new SuperCheatyAxe();

        cheaty_armor_material = EnumHelper.addArmorMaterial("cheaty_armor_material", Reference.MODID + ":cheaty_armor_material",
                1000, new int[]{30, 60, 80, 30}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 20.0f);
        super_cheaty_helmet = new SuperCheatyHelmet();
        super_cheaty_chestplate = new SuperCheatyChestplate();
        super_cheaty_leggings = new SuperCheatyLeggings();
        super_cheaty_boots = new SuperCheatyBoots();
    }

    public static void register() {
        GameRegistry.register(custom_item);

        GameRegistry.register(super_cheaty_sword);
        GameRegistry.register(super_cheaty_pickaxe);
        GameRegistry.register(super_cheaty_spade);
        GameRegistry.register(super_cheaty_hoe);
        GameRegistry.register(super_cheaty_axe);

        GameRegistry.register(super_cheaty_helmet);
        GameRegistry.register(super_cheaty_chestplate);
        GameRegistry.register(super_cheaty_leggings);
        GameRegistry.register(super_cheaty_boots);
    }

    public static void registerRenders() {
        refisterRender(custom_item);

        refisterRender(super_cheaty_sword);
        refisterRender(super_cheaty_pickaxe);
        refisterRender(super_cheaty_spade);
        refisterRender(super_cheaty_hoe);
        refisterRender(super_cheaty_axe);

        refisterRender(super_cheaty_helmet);
        refisterRender(super_cheaty_chestplate);
        refisterRender(super_cheaty_leggings);
        refisterRender(super_cheaty_boots);
    }

    public static void refisterRender(Item item) {
        ModelResourceLocation resourceLocation = new ModelResourceLocation(getItemRecourceName(item), "inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, resourceLocation);
    }

    private static String getItemRecourceName(Item item) {
        String recourceName = Reference.MODID + ":";
        recourceName += item.getUnlocalizedName().substring(5);

        return recourceName;
    }

}
