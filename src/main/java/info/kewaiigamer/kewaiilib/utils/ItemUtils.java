package info.kewaiigamer.kewaiilib.utils;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemUtils {

    /** Renders all MetaItems variants */
    public static void registerMetaItemRender(String modId, Item item, String name, int variants) {
        for (int i = 1; i <= variants; i++)
            ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(modId + ":" + name + "_" + i, "inventory"));
    }

    /** Renders all non-MetaItems */
    public static void registerItemRender(String modId, Item item, String name) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(modId + ":" + name, "inventory" ));
    }
}