package info.kewaiigamer.kewaiilib.custom;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomItem extends Item {

    public CustomItem(String modId, String name, CreativeTabs tab) {
        super();
        setUnlocalizedName(modId + ":" + name);
        setCreativeTab(tab);
        setRegistryName(name);
        GameRegistry.register(this);
    }
}