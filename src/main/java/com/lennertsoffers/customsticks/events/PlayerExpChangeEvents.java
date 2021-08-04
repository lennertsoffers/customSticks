package com.lennertsoffers.customsticks.events;

import com.lennertsoffers.customsticks.items.ItemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class PlayerExpChangeEvents implements Listener {

    @EventHandler
    public void onExpChange(PlayerExpChangeEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getItemInOffHand().equals(ItemManager.experienceStick) || player.getInventory().getItemInMainHand().equals(ItemManager.experienceStick)) {
            player.giveExp(event.getAmount());
        }
    }

}
