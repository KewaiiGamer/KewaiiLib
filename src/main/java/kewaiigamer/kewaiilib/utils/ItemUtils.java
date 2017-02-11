package kewaiigamer.kewaiilib.utils;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemUtils {

    /** Registers all MetaItems variants*/
    public static void registerItemVariants(String modId, String name, Item item, int variants) {
        ResourceLocation itemRes;
        itemRes = new ResourceLocation(modId + ":" + name + "_");
        switch(variants) {
            case 2:
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "1"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "2"));
                break;
            case 3:
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "1"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "2"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "3"));
                break;
            case 4:
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "1"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "2"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "3"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "4"));
                break;
            case 5:
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "1"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "2"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "3"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "4"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "5"));
                break;
            case 6:
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "1"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "2"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "3"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "4"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "5"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "6"));
                break;
            case 7:
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "1"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "2"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "3"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "4"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "5"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "6"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "7"));
                break;
            case 8:
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "1"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "2"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "3"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "4"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "5"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "6"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "7"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "8"));
                break;
            case 9:
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "1"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "2"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "3"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "4"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "5"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "6"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "7"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "8"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "9"));
                break;
            case 10:
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "1"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "2"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "3"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "4"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "5"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "6"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "7"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "8"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "9"));
                ModelBakery.registerItemVariants(item, new ResourceLocation(itemRes + "10"));
                break;
        }
    }
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