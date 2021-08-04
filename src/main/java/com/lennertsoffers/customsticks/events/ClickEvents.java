package com.lennertsoffers.customsticks.events;

import com.lennertsoffers.customsticks.items.ItemManager;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ClickEvents implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (player.getInventory().getItemInMainHand().equals(ItemManager.enderStick)) {
                player.launchProjectile(EnderPearl.class);
            }
            else if (player.getInventory().getItemInMainHand().equals(ItemManager.fireStick)) {
                player.launchProjectile(Fireball.class);
            }
            else if (player.getInventory().getItemInMainHand().equals(ItemManager.strongHoldStick)) {
                event.getPlayer().getWorld().spawnEntity(event.getPlayer().getEyeLocation(), EntityType.ENDER_SIGNAL);
            }

        }
    }
}
