package us.tailstar.reverstone;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;

    @SuppressWarnings("WeakerAccess")
    public static float xpChance;

    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    private static void syncConfig() {
        String category;

        category = "XP";
        xpChance = config.getFloat("xpChance", category, 0.0F, 0.0F, 1.0F, "The chance of receiving experience from smelting.");
        config.save();
    }
}