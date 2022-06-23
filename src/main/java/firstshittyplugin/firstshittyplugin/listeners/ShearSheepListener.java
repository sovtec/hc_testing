package firstshittyplugin.firstshittyplugin.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerShearEntityEvent;

import java.net.http.WebSocket;

public class ShearSheepListener implements WebSocket.Listener {

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event){

        Player player = event.getPlayer();
        Entity entity = event.getEntity();

        if (entity.getType() == EntityType.SHEEP){
            player.sendMessage("SHEEP!");
            event.setCancelled(true);
        }else{
            player.sendMessage("NOT A SHEEP");
        }

    }

}
