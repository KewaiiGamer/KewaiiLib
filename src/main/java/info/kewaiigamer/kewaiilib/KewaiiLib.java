package info.kewaiigamer.kewaiilib;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;

@Mod(modid = Ref.MODID, name = Ref.NAME, version = Ref.VERSION_MAJOR + "." + Ref.VERSION_MINOR + "." + Ref.VERSION_PATCH + "." + Ref.VERSION_BUILD, acceptedMinecraftVersions = Ref.ACCEPTED_VERSIONS)
public class KewaiiLib {

    @Instance
    public static KewaiiLib instance;
}