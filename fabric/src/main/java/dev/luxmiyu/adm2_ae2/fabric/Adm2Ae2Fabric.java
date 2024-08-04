package dev.luxmiyu.adm2_ae2.fabric;

import net.fabricmc.api.ModInitializer;

import dev.luxmiyu.adm2_ae2.Adm2Ae2;

public final class Adm2Ae2Fabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Adm2Ae2.init();
    }
}
