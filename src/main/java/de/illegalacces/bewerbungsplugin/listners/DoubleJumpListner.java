package de.illegalacces.bewerbungsplugin.listners;

import de.illegalacces.bewerbungsplugin.BewerbungsPlugin;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class DoubleJumpListner implements Listener {
    @EventHandler
    public void trytoFly(PlayerToggleFlightEvent event) {
        Player player = event.getPlayer();
            if (player.hasPermission("systeme.cach")){
                if (BewerbungsPlugin.cach.containsKey(player)){
                    int input = BewerbungsPlugin.cach.get(player);
                    switch (input){
                        case 1:
                            player.getWorld().setTime(1000);
                            player.sendMessage("§b§cDu hast die Zeit auf Tag gestellt");
                            break;
                        case 2:
                            player.getWorld().setTime(18000);
                            player.sendMessage("§b§cDu hast die Zeit auf Mitternacht gestellt");
                            break;
                        case 3:
                            player.getWorld().setTime(13000);
                            player.sendMessage("§b§cDu hast die Zeit auf Nacht gestellt");
                            break;
                        case 4:
                            player.getWorld().setTime(6000);
                            player.sendMessage("§b§cDu hast die Zeit auf Abend gestellt");
                            break;
                        case 5:
                            player.getWorld().setStorm(false);
                            player.getWorld().setWeatherDuration(4000);
                            player.sendMessage("§b§cDu hast das Wetter auf Sonne gestellt");
                            break;
                        case 6:
                            player.getWorld().setStorm(true);
                            player.getWorld().setWeatherDuration(4000);
                            player.sendMessage("§b§cDu hast das Wetter auf Regen gestellt");
                            break;
                        case 7:
                            player.getWorld().setThundering(false);
                            player.getWorld().setThunderDuration(4000);
                            player.sendMessage("§b§cDu hast das Wetter auf Gewitter gestellt");
                            break;

                    }
                }
            }
        }

}
