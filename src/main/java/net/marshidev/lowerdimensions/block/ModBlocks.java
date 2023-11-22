package net.marshidev.lowerdimensions.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.marshidev.lowerdimensions.LowerDimensions;
import net.marshidev.lowerdimensions.block.custom.CorruptedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block WALLPAPER_BLOCK = registerBlock("wallpaper_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WET_CARPET = registerBlock("wet_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WET_SPONGE)));
    public static final Block WET_WOOL = registerBlock("wet_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.WET_SPONGE)));
    public static final Block CONCRETE_TILE = registerBlock("concrete_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block CORRUPTED_DIRT = registerBlock("corrupted_dirt",
            new CorruptedBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(LowerDimensions.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(LowerDimensions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        LowerDimensions.LOGGER.info("Registering ModBlocks for " + LowerDimensions.MOD_ID);
    }
}
