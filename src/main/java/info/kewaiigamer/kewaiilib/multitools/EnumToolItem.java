package info.kewaiigamer.kewaiilib.multitools;

import com.google.common.collect.ImmutableList;
import exter.substratum.material.EnumMaterial;

public enum EnumToolItem {
    PAXEL("paxel", ImmutableList.of(EnumMaterial.ALUMINIUM, EnumMaterial.BRONZE, EnumMaterial.COPPER, EnumMaterial.ELECTRUM, EnumMaterial.ENDERIUM, EnumMaterial.INVAR, EnumMaterial.LUMIUM, EnumMaterial.SIGNALUM, EnumMaterial.SILVER, EnumMaterial.STEEL));
    
    public final ImmutableList<EnumMaterial> materials;
    public final String prefix;

    private EnumToolItem(String prefix, ImmutableList<EnumMaterial> materials) {
        this.materials = materials;
        this.prefix = prefix;
    }
}