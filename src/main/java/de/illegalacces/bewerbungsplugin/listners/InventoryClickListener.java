package de.illegalacces.bewerbungsplugin.listners;

import de.illegalacces.bewerbungsplugin.BewerbungsPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event){
        if (event.getView().getTitle().equals("§7» §4Controlle Center")){
            event.setCancelled(true);
            if (event.getCurrentItem().getType() == Material.CLOCK){
                if (event.getRawSlot() == 10){
                    event.getWhoClicked().getWorld().setTime(1000);
                    event.getWhoClicked().sendMessage("§b§cDu hast die Zeit auf Tag gestellt");
                    if (BewerbungsPlugin.cach.containsKey(event.getWhoClicked())){
                        BewerbungsPlugin.cach.remove(event.getWhoClicked());
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 1);
                    }else {
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 1);
                    }
                }
                if (event.getRawSlot() == 12){
                    event.getWhoClicked().getWorld().setTime(18000);
                    event.getWhoClicked().sendMessage("§b§cDu hast die Zeit auf Mitternacht gestellt");
                    if (BewerbungsPlugin.cach.containsKey(event.getWhoClicked())){
                        BewerbungsPlugin.cach.remove(event.getWhoClicked());
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 2);
                    }else {
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 2);
                    }
                }
                if (event.getRawSlot() == 28){
                    event.getWhoClicked().getWorld().setTime(13000);
                    event.getWhoClicked().sendMessage("§b§cDu hast die Zeit auf Nacht gestellt");
                    if (BewerbungsPlugin.cach.containsKey(event.getWhoClicked())){
                        BewerbungsPlugin.cach.remove(event.getWhoClicked());
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 3);
                    }else {
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 3);
                    }
                }
                if (event.getRawSlot() == 30){
                    event.getWhoClicked().getWorld().setTime(6000);
                    event.getWhoClicked().sendMessage("§b§cDu hast die Zeit auf Abend gestellt");
                    if (BewerbungsPlugin.cach.containsKey(event.getWhoClicked())){
                        BewerbungsPlugin.cach.remove(event.getWhoClicked());
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 4);
                    }else {
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 4);
                    }
                }
            }

            if (event.getCurrentItem().getType() == Material.HEART_OF_THE_SEA){
                if (event.getRawSlot() == 14){
                    event.getWhoClicked().getWorld().setStorm(false);
                    event.getWhoClicked().getWorld().setWeatherDuration(4000);
                    event.getWhoClicked().sendMessage("§b§cDu hast das Wetter auf Sonne gestellt");
                    if (BewerbungsPlugin.cach.containsKey(event.getWhoClicked())){
                        BewerbungsPlugin.cach.remove(event.getWhoClicked());
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 5);
                    }else {
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 5);
                    }
                }
                if (event.getRawSlot() == 16){
                    event.getWhoClicked().getWorld().setStorm(true);
                    event.getWhoClicked().getWorld().setWeatherDuration(4000);
                    event.getWhoClicked().sendMessage("§b§cDu hast das Wetter auf Regen gestellt");
                    if (BewerbungsPlugin.cach.containsKey(event.getWhoClicked())){
                        BewerbungsPlugin.cach.remove(event.getWhoClicked());
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 6);
                    }else {
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 6);
                    }
                }
                if (event.getRawSlot() == 32){
                    event.getWhoClicked().getWorld().setThundering(false);
                    event.getWhoClicked().getWorld().setThunderDuration(4000);
                    event.getWhoClicked().sendMessage("§b§cDu hast das Wetter auf Gewitter gestellt");
                    if (BewerbungsPlugin.cach.containsKey(event.getWhoClicked())){
                        BewerbungsPlugin.cach.remove(event.getWhoClicked());
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 7);
                    }else {
                        BewerbungsPlugin.cach.put((Player) event.getWhoClicked(), 7);
                    }
                }

            }

        }
    }
}
