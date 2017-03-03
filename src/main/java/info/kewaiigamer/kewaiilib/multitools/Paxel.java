package info.kewaiigamer.kewaiilib.multitools;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import java.util.HashSet;
import java.util.Set;

public class Paxel extends ItemPickaxe {
    private static HashSet<Block> effectiveAgainst = Sets.newHashSet(new Block[]{Blocks.GRASS, Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL, Blocks.SNOW_LAYER, Blocks.SNOW, Blocks.CLAY, Blocks.FARMLAND, Blocks.SOUL_SAND, Blocks.MYCELIUM, Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN});
    public Paxel(String modId, String name, Item.ToolMaterial material, EnumVanillaMaterial vanilla) {
        super(material);
        this.setUnlocalizedName(modId + ":" + name + "_" + vanilla.suffix);
        this.setRegistryName(name + "_" + vanilla.suffix);
    }

    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("pickaxe", "spade");
    }

    public boolean canHarvestBlock(IBlockState blockIn) {
        if (effectiveAgainst.contains(blockIn)) {
            return true;
        }
        boolean bl = super.canHarvestBlock(blockIn);
        return bl;
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state) {
        float f;
        if (state.getMaterial() == Material.WOOD) return this.efficiencyOnProperMaterial;
        if (state.getMaterial() == Material.VINE) return this.efficiencyOnProperMaterial;
        if (state.getMaterial() == Material.PLANTS) return this.efficiencyOnProperMaterial;
        if (state.getMaterial() == Material.GROUND) return this.efficiencyOnProperMaterial;
        if (state.getMaterial() == Material.GRASS) return this.efficiencyOnProperMaterial;
        if (state.getMaterial() == Material.SAND) {
            return this.efficiencyOnProperMaterial;
        }
        if (effectiveAgainst.contains(state)) {
            f = this.efficiencyOnProperMaterial;
            return f;
        }
        f = super.getStrVsBlock(stack, state);
        return f;
    }
}