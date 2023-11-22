package net.marshidev.lowerdimensions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.marshidev.lowerdimensions.block.ModBlocks;
import net.marshidev.lowerdimensions.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WALLPAPER_BLOCK, oreDrops(ModBlocks.WALLPAPER_BLOCK, ModItems.WALLPAPER));
    }
}
