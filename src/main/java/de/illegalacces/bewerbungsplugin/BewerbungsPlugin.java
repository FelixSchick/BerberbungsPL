package de.illegalacces.bewerbungsplugin;

import de.illegalacces.bewerbungsplugin.listners.DoubleJumpListner;
import de.illegalacces.bewerbungsplugin.listners.InventoryClickListener;
import de.illegalacces.bewerbungsplugin.listners.PlayerInterectListner;
import de.illegalacces.bewerbungsplugin.listners.PlayerJoinListner;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class BewerbungsPlugin extends JavaPlugin {
    public static HashMap< Player, Integer > cach= new HashMap<>();
    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new DoubleJumpListner(), this);
        Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerInterectListner(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListner(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        cach.clear();
    }
}
