package com.lennertsoffers.customsticks.events;

import com.lennertsoffers.customsticks.CustomSticks;
import com.lennertsoffers.customsticks.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class ClickEvents implements Listener {
    private CustomSticks plugin;

    public ClickEvents(CustomSticks plugin) {
        this.plugin = plugin;
    }

    private void placePillar(Location location) {
        for (int i = 0; i < 3; i++) {
            location.setY(location.getY() + 1.0);
            location.getBlock().setType(Material.STONE);
        }
    }

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

        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (player.getInventory().getItemInMainHand().equals(ItemManager.explosionStick)) {
                player.getWorld().createExplosion(event.getClickedBlock().getLocation(), 1.5f);
            }
            else if (player.getInventory().getItemInMainHand().equals(ItemManager.earthStick)) {
                Location location = event.getClickedBlock().getLocation();
                int playerX = (int) player.getLocation().getX();
                int playerZ = (int) player.getLocation().getZ();
                int blockX = (int) location.getX();
                int blockZ = (int) location.getZ() + 1;

                if (playerX == blockX && playerZ == blockZ) {
                    player.setVelocity(new Vector(0, 1 ,0));
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, () -> {
                        placePillar(location);
                    }, 3L);
                } else {
                    placePillar(location);
                }
            }
        }
    }
}
