package firstshittyplugin.firstshittyplugin.HoverCardMain;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class HoverCard implements Listener {

    @EventHandler
    private ItemStack getExampleItemStack() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack meta = (ItemStack) itemStack.getItemMeta();
        List<String> lore = new ArrayList<>();

        ((ItemMeta) meta).setDisplayName(ChatColor.YELLOW + "Test");
        lore.add(ChatColor.RED + "SUPERCOOL dude.. or whatever lol");
        ((ItemMeta) meta).setLore(lore);

        ((ItemMeta) meta).addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        ((ItemMeta) meta).addEnchant(Enchantment.FIRE_ASPECT, 2, true);

        itemStack.setItemMeta((ItemMeta) meta);
        return itemStack;

    }
}
