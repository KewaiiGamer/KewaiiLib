package info.kewaiigamer.kewaiilib.custom;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomBlock extends Block {

    public CustomBlock(String modId, String name, CreativeTabs tab, Material material) {
        super(material);
        setUnlocalizedName(modId + ":" + name);
        setRegistryName(name);
        setCreativeTab(tab);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
}