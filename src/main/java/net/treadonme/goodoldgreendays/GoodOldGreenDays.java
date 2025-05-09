package net.treadonme.goodoldgreendays;

import net.fabricmc.api.ModInitializer;

import net.treadonme.goodoldgreendays.block.ModBlocks;
import net.treadonme.goodoldgreendays.item.ModItemGroups;
import net.treadonme.goodoldgreendays.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodOldGreenDays implements ModInitializer {
	public static final String MOD_ID = "goodoldgreendays";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}