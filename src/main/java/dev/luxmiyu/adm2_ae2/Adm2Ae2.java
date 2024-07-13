package dev.luxmiyu.adm2_ae2;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adm2Ae2 implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("adm2-ae2");

	@Override
	public void onInitialize() {
		LOGGER.info("Any Dimension Mod 2 Expansion - Applied Energistics 2 initialized!");
	}
}