package de.illegalacces.bewerbungsplugin.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MainGUI {
    public static Inventory inventory;

    public static void createMainInventory(Player player) {
        inventory = Bukkit.createInventory(player, 5 * 9, "§7» §4Controlle Center");
        for (int i = 0; i < 5*9; i++){
            inventory.setItem(i, new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname(" ").build());
        }
        inventory.setItem(10, new ItemBuilder(Material.CLOCK).displayname("§7» §eDay").build());
        inventory.setItem(12, new ItemBuilder(Material.CLOCK).displayname("§7» §eMidnight").build());
        inventory.setItem(28, new ItemBuilder(Material.CLOCK).displayname("§7» §eNight").build());
        inventory.setItem(30, new ItemBuilder(Material.CLOCK).displayname("§7» §eNoon").build());


        inventory.setItem(14, new ItemBuilder(Material.HEART_OF_THE_SEA).displayname("§7» §eClear").build());
        inventory.setItem(16, new ItemBuilder(Material.HEART_OF_THE_SEA).displayname("§7» §eRain").build());
        inventory.setItem(32, new ItemBuilder(Material.HEART_OF_THE_SEA).displayname("§7» §eThunder").build());

    }


} 