package firstshittyplugin.firstshittyplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class OnLeaveBedListener implements Listener {

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();

        player.sendMessage("Whoops was it not supposed to be day now?");
        player.setHealth(19);}
    // This file is not really needed.

    {

    }
}
