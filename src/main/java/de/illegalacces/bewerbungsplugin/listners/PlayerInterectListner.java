package de.illegalacces.bewerbungsplugin.listners;

import de.illegalacces.bewerbungsplugin.utils.MainGUI;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class PlayerInterectListner implements Listener {
    @EventHandler
    public void onInterect(PlayerInteractEvent event){
        if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK){
            if (event.getItem() != null){
                if (Objects.requireNonNull(event.getItem()).getType() == Material.NETHER_STAR){
                    if (event.getPlayer().hasPermission("systeme.controlle")){
                        MainGUI.createMainInventory(event.getPlayer());
                        event.getPlayer().openInventory(MainGUI.inventory);
                    }

                }
            }

        }
    }
}
