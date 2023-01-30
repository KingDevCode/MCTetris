package entertainer.entertainments.configuration;

import entertainer.entertainments.Entertainments;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Configs {

    public static File customConfigFile1;
    private static FileConfiguration customConfig1;

    private static final Entertainments plugin = Entertainments.getPlugin(Entertainments.class);

    public static FileConfiguration getCustomConfig1() {
        return customConfig1;
    }

    public static void createCustomConfig1() {
        customConfigFile1 = new File(plugin.getDataFolder(), "Messages.yml");
        if (!customConfigFile1.exists()) {
            customConfigFile1.getParentFile().mkdirs();
            plugin.saveResource("Messages.yml", false);
        }

        customConfig1 = new YamlConfiguration();

        try {
            customConfig1.load(customConfigFile1);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static File customConfigFile2;
    private static FileConfiguration customConfig2;

    public static FileConfiguration getCustomConfig2() {
        return customConfig2;
    }

    public static void createCustomConfig2() {
        customConfigFile2 = new File(plugin.getDataFolder(), "TetrisData.yml");
        if (!customConfigFile2.exists()) {
            customConfigFile2.getParentFile().mkdirs();
            plugin.saveResource("TetrisData.yml", false);
        }

        customConfig2 = new YamlConfiguration();

        try {
            customConfig2.load(customConfigFile2);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}