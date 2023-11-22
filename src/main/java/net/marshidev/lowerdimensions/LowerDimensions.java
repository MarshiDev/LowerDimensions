package net.marshidev.lowerdimensions;

import net.fabricmc.api.ModInitializer;

import net.marshidev.lowerdimensions.block.ModBlocks;
import net.marshidev.lowerdimensions.item.ModItemGroups;
import net.marshidev.lowerdimensions.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LowerDimensions implements ModInitializer {
	public static final String MOD_ID = "lower-dimensions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}