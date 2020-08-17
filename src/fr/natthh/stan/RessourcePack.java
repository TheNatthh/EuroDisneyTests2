package fr.natthh.stan;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class RessourcePack implements Listener {
	
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onJoinPriority(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.setResourcePack("https://www.dropbox.com/s/ekvp4vag0s5cafz/AventuraParksMC.zip?dl=1");
       
    }

}
