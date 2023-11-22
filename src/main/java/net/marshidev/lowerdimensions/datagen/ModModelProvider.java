package net.marshidev.lowerdimensions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.marshidev.lowerdimensions.block.ModBlocks;
import net.marshidev.lowerdimensions.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WALLPAPER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CONCRETE_TILE);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WET_WOOL, ModBlocks.WET_CARPET);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CORRUPTED_DIRT);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WALLPAPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALMOND_WATER, Models.GENERATED);
    }
}
