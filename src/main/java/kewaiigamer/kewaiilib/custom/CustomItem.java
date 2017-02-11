package kewaiigamer.kewaiilib.custom;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomItem extends Item {

    public CustomItem(String modId, String name, CreativeTabs tab) {
        super();
        this.setUnlocalizedName(modId + ":" + name);
        this.setCreativeTab(tab);
        this.setRegistryName(name);
        GameRegistry.register(this);
    }
}
