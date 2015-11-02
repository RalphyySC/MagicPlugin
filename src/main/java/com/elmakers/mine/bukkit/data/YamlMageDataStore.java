package com.elmakers.mine.bukkit.data;

import com.elmakers.mine.bukkit.api.data.MageData;
import com.elmakers.mine.bukkit.api.magic.MageController;
import com.elmakers.mine.bukkit.utilities.YamlDataFile;
import org.apache.commons.multiverse.io.FilenameUtils;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class YamlMageDataStore extends ConfigurationMageDataStore {
    private File playerDataFolder;
    private File migratedDataFolder;

    @Override
    public void initialize(MageController controller, ConfigurationSection configuration) {
        super.initialize(controller, configuration);
        Plugin plugin = controller.getPlugin();
        String playerFolder = configuration.getString("folder", "players");
        String migrateFolder = configuration.getString("migration_folder", "migrated");
        playerDataFolder = new File(plugin.getDataFolder(), playerFolder);
        playerDataFolder.mkdirs();
        migratedDataFolder = new File(plugin.getDataFolder(), migrateFolder);
    }

    @Override
    public void save(MageData mage) {
        File playerData = new File(playerDataFolder, mage.getId() + ".dat");
        YamlDataFile saveFile = new YamlDataFile(controller.getLogger(), playerData);
        save(mage, saveFile);
        saveFile.save();
    }

    @Override
    public MageData load(String id) {
        final File playerFile = new File(playerDataFolder, id + ".dat");
        if (!playerFile.exists()) return null;
        YamlConfiguration saveFile = YamlConfiguration.loadConfiguration(playerFile);
        return load(id, saveFile);
    }

    @Override
    public void delete(String id) {
        File playerData = new File(playerDataFolder, id + ".dat");
        if (playerData.exists()) {
            playerData.delete();
        }
    }

    @Override
    public Collection<String> getAllIds() {
        List<String> ids = new ArrayList<String>();
        File[] files = playerDataFolder.listFiles();
        for (File file : files) {
            ids.add(FilenameUtils.removeExtension(file.getName()));
        }
        return ids;
    }

    @Override
    public void migrate(String id) {
        File playerData = new File(playerDataFolder, id + ".dat");
        if (playerData.exists()) {
            migratedDataFolder.mkdir();
            File migratedData = new File(migratedDataFolder, id + ".dat.migrated");
            playerData.renameTo(migratedData);
        }
    }
}
