package keg.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nullable;

public class SuperCheatyBlock extends Block{

    public SuperCheatyBlock(Material material, String unlocalizedName, String registryName) {
        super(material);

        setUnlocalizedName(unlocalizedName);
        setRegistryName(registryName);

        ItemBlock itemBlock = new ItemBlock(this);
        itemBlock.setRegistryName(getRegistryName());
        GameRegistry.register(itemBlock);
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        ItemStack reward = new ItemStack(Items.DIAMOND, 1);
        Item dirtItem = ItemBlock.getItemFromBlock(Blocks.DIRT);

        if (playerIn != null) {
            heldItem = playerIn.getHeldItem(EnumHand.MAIN_HAND);
            if (heldItem != null && dirtItem == heldItem.getItem()) {
                // Check if world is remote: avoid ghost block
                if (!worldIn.isRemote) {
                    heldItem.stackSize -= 1;
                    if (!playerIn.inventory.addItemStackToInventory(reward)) {
                        worldIn.spawnEntityInWorld(new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, reward));
                    }
                }
                return true;
            }
        }
        // Allow block placement
        return false;
    }

}
