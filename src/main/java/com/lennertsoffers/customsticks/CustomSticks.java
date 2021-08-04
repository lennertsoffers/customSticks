package com.lennertsoffers.customsticks;

import com.lennertsoffers.customsticks.events.ClickEvents;
import com.lennertsoffers.customsticks.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomSticks extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemManager.init();
        getServer().getPluginManager().registerEvents(new ClickEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
