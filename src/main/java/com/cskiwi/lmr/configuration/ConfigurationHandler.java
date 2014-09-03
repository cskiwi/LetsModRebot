package com.cskiwi.lmr.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Author: Glenn
 * Date: 9/2/2014
 * Edit:
 */
public class ConfigurationHandler {
    public static void init(File configFile) {
        // Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try {
            // Load the configuration file
            configuration.load();

            // Read in properties from configuration file
            configValue = configuration.get("ForgeCraft", "configValue", true, "This is an example config value").getBoolean(true);
        } catch (Exception e) {
            // Log the exception

        } finally {
            // Save the configuration file
            configuration.save();
        }

        System.out.println("Configuration test: " + configValue);
    }
}
