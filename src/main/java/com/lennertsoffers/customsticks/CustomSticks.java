package com.lennertsoffers.customsticks;

import com.lennertsoffers.customsticks.events.ClickEvents;
import com.lennertsoffers.customsticks.events.PlayerExpChangeEvents;
import com.lennertsoffers.customsticks.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class CustomSticks extends JavaPlugin {
    @Override
    public void onEnable() {
        ItemManager.init();
        getServer().getPluginManager().registerEvents(new ClickEvents(this), this);
        getServer().getPluginManager().registerEvents(new PlayerExpChangeEvents(), this);

        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                if ((player.getInventory().getItemInOffHand().equals(ItemManager.waterBreathingStick) || player.getInventory().getItemInMainHand().equals(ItemManager.waterBreathingStick)) && (player.getWorld().getBlockAt(player.getLocation()).getType().equals(Material.WATER))) {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER, 220, 0));
                }
            }
        }, 0L, 200L);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
