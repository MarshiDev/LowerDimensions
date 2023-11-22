package net.marshidev.lowerdimensions.util;

import net.marshidev.lowerdimensions.LowerDimensions;
import net.marshidev.lowerdimensions.LowerDimensionsDataGenerator;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(LowerDimensions.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(LowerDimensions.MOD_ID, name));
        }
    }
}
