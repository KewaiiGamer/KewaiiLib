package kewaiigamer.kewaiilib.utils;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class BlockUtils {

    /** Renders all non-MetaBlocks */
    public static void registerBlockRender(String modId, Block block, String name) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modId + ":" + name, "inventory"));
    }
}