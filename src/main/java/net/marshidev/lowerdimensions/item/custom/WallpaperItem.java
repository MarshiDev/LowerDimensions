package net.marshidev.lowerdimensions.item.custom;

import net.marshidev.lowerdimensions.LowerDimensions;
import net.marshidev.lowerdimensions.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.Objects;

public class WallpaperItem extends Item {
    public WallpaperItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {
            BlockState state = context.getWorld().getBlockState(context.getBlockPos());
            if(state.isOf(Blocks.OAK_PLANKS)) {
                World world = context.getWorld();
                world.setBlockState(context.getBlockPos(), ModBlocks.WALLPAPER_BLOCK.getDefaultState());
                Objects.requireNonNull(context.getPlayer()).clearActiveItem();
                world.playSound(null, context.getBlockPos(),
                        SoundEvents.ITEM_BOOK_PAGE_TURN,
                        SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.FAIL;
    }
}
