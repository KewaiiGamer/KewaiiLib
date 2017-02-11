package kewaiigamer.kewaiilib.custom;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomBlock extends Block {

    public CustomBlock(String modId, String name, CreativeTabs tab, Material material, float hardness, float resistance) {
        super(material);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(modId + ":" + name);
        this.setRegistryName(name);
        this.setCreativeTab(tab);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    public CustomBlock(String modId, String name, CreativeTabs tab, Material material) {
        super(material);
        this.setUnlocalizedName(modId + ":" + name);
        this.setRegistryName(name);
        this.setCreativeTab(tab);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
}
