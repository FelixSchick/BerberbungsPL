package de.illegalacces.bewerbungsplugin.listners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListner implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        event.getPlayer().setAllowFlight(true);
        event.getPlayer().setFlying(false);
    }
}
