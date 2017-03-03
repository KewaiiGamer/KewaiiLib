package info.kewaiigamer.kewaiilib.utils;

import exter.substratum.material.EnumMaterialEquipment;
import info.kewaiigamer.kewaiilib.multitools.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiToolsUtils {

    private static Map<Item, String> itemRegistry = new HashMap<Item, String>();
    private static Map<Item.ToolMaterial, List<Item>> itemsByMaterial = new HashMap<Item.ToolMaterial, List<Item>>();
    private static Map<EnumMaterialEquipment, List<Item>> itemsByEquipment = new HashMap<EnumMaterialEquipment, List<Item>>();

    public static Item createPaxel(String modId, String name, Item.ToolMaterial material, EnumVanillaMaterial vanilla, CreativeTabs tab) {
        return registerItem((Item)new Paxel(modId, name, material, vanilla), material.name().toLowerCase() + "paxel", material, tab);
    }

    public static Item createMetalPaxel(String modId, String name, EnumMaterialEquipment equipment, CreativeTabs tab) {
        return registerMetalItem((Item)new MetalPaxel(modId, name, equipment), equipment.name().toLowerCase() + "paxel", equipment, tab);
    }

    public static Item createUniversalTool(String modId, String name, Item.ToolMaterial material, EnumVanillaMaterial vanilla, CreativeTabs tab) {
        return registerItem((Item)new UniversalTool(modId, name, material, vanilla), material.name().toLowerCase() + "universaltool", material, tab);
    }

    public static Item createMetalUniversalTool(String modId, String name, EnumMaterialEquipment equipment, CreativeTabs tab) {
        return registerMetalItem((Item)new MetalUniversalTool(modId, name, equipment), equipment.name().toLowerCase() + "universaltool", equipment, tab);
    }

    public static Item registerItem(Item item, String name, Item.ToolMaterial material, CreativeTabs tab) {
        GameRegistry.register((IForgeRegistryEntry)item);
        itemRegistry.put(item, name);
        if (tab != null) {
            item.setCreativeTab(tab);
        }
        if (material == null) return item;
        itemsByMaterial.computeIfAbsent(material, g -> new ArrayList());
        itemsByMaterial.get((Object)material).add(item);
        return item;
    }

    public static Item registerMetalItem(Item item, String name, EnumMaterialEquipment equipment, CreativeTabs tab) {
        GameRegistry.register((IForgeRegistryEntry)item);
        itemRegistry.put(item, name);
        if (tab != null) {
            item.setCreativeTab(tab);
        }
        if (equipment == null) return item;
        itemsByEquipment.computeIfAbsent(equipment, g -> new ArrayList());
        itemsByEquipment.get((Object)equipment).add(item);
        return item;
    }
}