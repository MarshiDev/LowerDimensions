package net.marshidev.lowerdimensions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.marshidev.lowerdimensions.LowerDimensions;
import net.marshidev.lowerdimensions.item.custom.WallpaperItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WALLPAPER = registerItem("wallpaper", new WallpaperItem(new FabricItemSettings()));
    public static final Item ALMOND_WATER = registerItem("almond_water", new Item(new FabricItemSettings()
            .food(ModFoodComponents.ALMOND_WATER)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LowerDimensions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LowerDimensions.LOGGER.info("Registering Mod Items for " + LowerDimensions.MOD_ID);
    }
}
