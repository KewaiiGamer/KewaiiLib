package info.kewaiigamer.kewaiilib.custom;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomBlockContainer extends BlockContainer {

    public CustomBlockContainer(String modId, String name, CreativeTabs tab, Material material) {
        super(material);
        setUnlocalizedName(modId + ":" + name);
        setRegistryName(name);
        setCreativeTab(tab);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return null;
    }
}