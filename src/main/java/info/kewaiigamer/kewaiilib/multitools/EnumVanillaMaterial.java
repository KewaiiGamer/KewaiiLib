package info.kewaiigamer.kewaiilib.multitools;

public enum EnumVanillaMaterial {
    WOOD("wood"),
    STONE("stone"),
    IRON("iron"),
    GOLD("gold"),
    DIAMOND("diamond");
    
    public final String suffix;

    private EnumVanillaMaterial(String suffix) {
        this.suffix = suffix;
    }
}