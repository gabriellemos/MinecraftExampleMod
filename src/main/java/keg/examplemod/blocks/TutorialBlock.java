package keg.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialBlock extends Block {

    public TutorialBlock(Material material, String unlocalizedName, String registryName) {
        super(material);

        setUnlocalizedName(unlocalizedName);
        setRegistryName(registryName);

        ItemBlock itemBlock = new ItemBlock(this);
        itemBlock.setRegistryName(getRegistryName());
        GameRegistry.register(itemBlock);
    }

}
