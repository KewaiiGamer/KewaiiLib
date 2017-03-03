package info.kewaiigamer.kewaiilib.multitools;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import exter.substratum.material.EnumMaterialEquipment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

import java.util.HashSet;
import java.util.Set;

public class MetalUniversalTool
extends ItemPickaxe {
    private static HashSet<Block> effectiveAgainst = Sets.newHashSet(new Block[]{Blocks.GRASS, Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL, Blocks.SNOW_LAYER, Blocks.SNOW, Blocks.CLAY, Blocks.FARMLAND, Blocks.SOUL_SAND, Blocks.MYCELIUM, Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN});

    public MetalUniversalTool(String modId, String name, EnumMaterialEquipment equipment) {
        super(equipment.tool);
        this.setUnlocalizedName(modId + ":" + name + "_" +equipment.material.suffix.toLowerCase()   );
        this.setRegistryName(name + "_" + equipment.material.suffix.toLowerCase());
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

    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!playerIn.canPlayerEdit(pos.offset(facing), facing, stack)) {
            return EnumActionResult.FAIL;
        }
        int hook = ForgeEventFactory.onHoeUse(stack, playerIn, worldIn, pos);
        if (hook != 0) {
            EnumActionResult enumActionResult;
            if (hook > 0) {
                enumActionResult = EnumActionResult.SUCCESS;
                return enumActionResult;
            }
            enumActionResult = EnumActionResult.FAIL;
            return enumActionResult;
        }
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();
        if (facing == EnumFacing.DOWN) return EnumActionResult.PASS;
        if (!worldIn.isAirBlock(pos.up())) return EnumActionResult.PASS;
        if (block == Blocks.GRASS || block == Blocks.GRASS_PATH) {
            this.setBlock(stack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
            return EnumActionResult.SUCCESS;
        }
        if (block != Blocks.DIRT) return EnumActionResult.PASS;
        switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT)) {
            case DIRT: {
                this.setBlock(stack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                return EnumActionResult.SUCCESS;
            }
            case COARSE_DIRT: {
                this.setBlock(stack, playerIn, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty((IProperty) BlockDirt.VARIANT, (Comparable) BlockDirt.DirtType.DIRT));
                return EnumActionResult.SUCCESS;
            }
        }
        return EnumActionResult.PASS;
    }

    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state) {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0f, 1.0f);
        if (worldIn.isRemote) return;
        worldIn.setBlockState(pos, state, 11);
        stack.damageItem(1, (EntityLivingBase)player);
    }

}