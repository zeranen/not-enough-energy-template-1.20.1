package net.verzex.notenoughenergy;

import net.fabricmc.api.ModInitializer;

import net.verzex.notenoughenergy.block.ModBlocks;
import net.verzex.notenoughenergy.item.ModItems;
import net.verzex.notenoughenergy.item.ModItemsGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotEnoughEnergy implements ModInitializer {
public static final String MOD_ID = "not_enough_energy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.RegisterItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}