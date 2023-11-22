package net.marshidev.lowerdimensions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.marshidev.lowerdimensions.block.ModBlocks;
import net.marshidev.lowerdimensions.item.ModItemGroups;
import net.marshidev.lowerdimensions.item.ModItems;
import net.marshidev.lowerdimensions.world.dimension.ModDimensions;
import net.minecraft.block.Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class LowerDimensions implements ModInitializer {
	public static final String MOD_ID = "lower-dimensions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModDimensions.register();

		PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> {
			if (!world.isClient) {
				if (state.getBlock() == Blocks.DIRT || state.getBlock() == Blocks.GRASS_BLOCK) {
					Random rand = new Random();
					int chance = rand.nextInt(20);
					if (chance == 0) {
						world.setBlockState(pos, ModBlocks.CORRUPTED_DIRT.getDefaultState());
					}
				}
			}
		});
	}
}