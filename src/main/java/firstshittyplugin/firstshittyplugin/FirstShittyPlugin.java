package firstshittyplugin.firstshittyplugin;

import firstshittyplugin.firstshittyplugin.listeners.XPBottleBreakListener;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstShittyPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Started");
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();

        player.sendMessage("Whoops was it not supposed to be day now?");
        player.setHealth(19);}

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage("HEY u bish >:) Welcome to &4&lCrank&3&lHouse test server");

    }




 //   @EventHandler
 //   public void onPlayerChat(PlayerChatEvent event){
 //
 //       event.setMessage("CrankHouse is the best server everrr!");
 //
 //    }

}
