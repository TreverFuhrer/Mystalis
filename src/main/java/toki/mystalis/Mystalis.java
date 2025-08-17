package toki.mystalis;

import net.fabricmc.api.ModInitializer;
import toki.mystalis.block.ModBlocks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mystalis implements ModInitializer {
	public static final String MOD_ID = "mystalis";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.register();
	}
}