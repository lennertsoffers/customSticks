package com.lennertsoffers.customsticks;

import com.lennertsoffers.customsticks.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomSticks extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemManager.init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
