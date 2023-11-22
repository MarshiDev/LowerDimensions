package net.marshidev.lowerdimensions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.marshidev.lowerdimensions.block.ModBlocks;
import net.marshidev.lowerdimensions.item.ModItems;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WALLPAPER_BLOCK, drops(ModBlocks.WALLPAPER_BLOCK, ModItems.WALLPAPER));
        addDrop(ModBlocks.CONCRETE_TILE);
        addDrop(ModBlocks.WET_CARPET);
        addDrop(ModBlocks.WET_WOOL);
    }
}
