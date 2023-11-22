package net.marshidev.lowerdimensions.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.marshidev.lowerdimensions.LowerDimensions;
import net.marshidev.lowerdimensions.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LOWER_DIMENSIONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LowerDimensions.MOD_ID, "wallpaper"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lowerdimensions"))
                    .icon(() -> new ItemStack(ModItems.WALLPAPER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ALMOND_WATER);
                        entries.add(ModItems.WALLPAPER);
                        entries.add(ModBlocks.WALLPAPER_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        LowerDimensions.LOGGER.info("Registering Item Groups for " + LowerDimensions.MOD_ID);
    }
}
