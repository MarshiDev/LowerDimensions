package net.marshidev.lowerdimensions.world.dimension;

import net.marshidev.lowerdimensions.LowerDimensions;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> BRDIM_DIMENSION_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(LowerDimensions.MOD_ID, "brdim"));
    public static final RegistryKey<DimensionType> BRDIM_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            BRDIM_DIMENSION_KEY.getValue());


    public static void register() {
        LowerDimensions.LOGGER.debug("Registering ModDimensions for " + LowerDimensions.MOD_ID);
    }
}