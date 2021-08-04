package com.lennertsoffers.customsticks.items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack baconStick;
    public static ItemStack enderStick;
    public static ItemStack fireStick;
    public static ItemStack strongHoldStick;
    public static ItemStack explosionStick;
    public static ItemStack earthStick;
    public static ItemStack experienceStick;
    public static ItemStack waterBreathingStick;

    public static void init() {
        createBeaconStick();
        createEnderStick();
        createFireStick();
        createStrongHoldStick();
        createExplosionStick();
        createEarthStick();
        createExperienceStick();
        createWaterBreathingStick();
    }

    private static void createBeaconStick() {
        ItemStack stick = new ItemStack(Material.STICK, 1);
        ItemMeta meta = stick.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_BLUE + "Bacon Stick");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Attack an enemy to inflict knockback 300");
        lore.add(ChatColor.YELLOW + "Roughly equal to instantly despawning mobs");
        lore.add(ChatColor.YELLOW + "(on flat terrain)");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.KNOCKBACK, 300, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        stick.setItemMeta(meta);

        baconStick = stick;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("bacon-stick"), stick);
        recipe.shape("T  ", " P ", "  P");
        recipe.setIngredient('T', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('P', Material.PORKCHOP);
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createEnderStick() {
        ItemStack stick = new ItemStack(Material.STICK, 1);
        ItemMeta meta = stick.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Ender Stick");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Right click to throw an enderpearl");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS );
        stick.setItemMeta(meta);

        enderStick = stick;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("ender-stick"), stick);
        recipe.shape("T  ", " E ", "  E");
        recipe.setIngredient('T', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('E', Material.ENDER_PEARL);
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createFireStick() {
        ItemStack stick = new ItemStack(Material.STICK, 1);
        ItemMeta meta = stick.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Fire Stick");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Right click to fire a fireball");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        stick.setItemMeta(meta);

        fireStick = stick;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("fire-stick"), stick);
        recipe.shape("T  ", " B ", "  B");
        recipe.setIngredient('T', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('B', Material.BLAZE_ROD);
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createStrongHoldStick() {
        ItemStack stick = new ItemStack(Material.STICK, 1);
        ItemMeta meta = stick.getItemMeta();
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Strqonghold Stick");
        List<String> lore =  new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Right click to locate the nearest stronghold");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        stick.setItemMeta(meta);

        strongHoldStick = stick;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("stronghold-stick"), stick);
        recipe.shape("T  ", " E ", "  E");
        recipe.setIngredient('T', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('E', Material.ENDER_EYE);
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createExplosionStick() {
        ItemStack stick = new ItemStack(Material.STICK, 1);
        ItemMeta meta = stick.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "Explosion Stick");
        List<String> lore = new ArrayList<>();
        lore.add("Right click block with Explosion Stick");
        lore.add("to create an explosion");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        stick.setItemMeta(meta);

        explosionStick = stick;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("explosion-stick"), stick);
        recipe.shape("T  ", " E ", "  E");
        recipe.setIngredient('T', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('E', Material.END_CRYSTAL);
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createEarthStick() {
        ItemStack stick = new ItemStack(Material.STICK, 1);
        ItemMeta meta = stick.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GREEN + "Earth Stick");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Right click the ground to create a pillar");
        lore.add(ChatColor.YELLOW + "of stone right beneath you");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        stick.setItemMeta(meta);

        earthStick = stick;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("earth-stick"), stick);
        recipe.shape("t  ", " s ", "  c");
        recipe.setIngredient('t', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('s', Material.STONE);
        recipe.setIngredient('c', Material.COBBLESTONE);
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createExperienceStick() {
        ItemStack stick = new ItemStack(Material.STICK, 1);
        ItemMeta meta = stick.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Experience Stick");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Hold this stick in your offhand or main");
        lore.add(ChatColor.YELLOW + " hand to increase experience with 100%");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        stick.setItemMeta(meta);

        experienceStick = stick;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("experience-stick"), stick);
        recipe.shape("T  ", " N ", "  N");
        recipe.setIngredient('T', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('N', Material.NETHER_STAR);
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createWaterBreathingStick() {
        ItemStack stick = new ItemStack(Material.STICK, 1);
        ItemMeta meta = stick.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Water Breathing Stick");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Hold this stick in your offhand or main");
        lore.add(ChatColor.YELLOW + "hand to have an infinite breath underwater");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        stick.setItemMeta(meta);

        waterBreathingStick = stick;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("water-breathing-stick"), stick);
        recipe.shape("T  ", " H ", "  H");
        recipe.setIngredient('T', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('H', Material.HEART_OF_THE_SEA);
        Bukkit.getServer().addRecipe(recipe);
    }
}
