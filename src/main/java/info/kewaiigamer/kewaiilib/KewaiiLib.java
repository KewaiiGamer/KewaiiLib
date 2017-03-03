package info.kewaiigamer.kewaiilib;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;

import static info.kewaiigamer.kewaiilib.Ref.*;

    @Mod(modid = MODID, name = NAME, version = VERSION_MAJOR + VERSION_MINOR + VERSION_PATCH + VERSION_BUILD, acceptedMinecraftVersions = ACCEPTED_VERSIONS)
public class KewaiiLib {

    @Instance
    public static KewaiiLib instance;
}