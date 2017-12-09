package me.demonis.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CP2 extends AbstractMenu{

	public static CP2 instance;
	
	public CP2() {
		super("ChallengePack2", Main.plugin, ChatColor.GRAY + "Challenge", 2);
		instance = this;
	}
	
	@Override
	protected Inventory populate(Inventory gui, Player player) {
		
		ItemStack cobble2 = new ItemStack(Material.COBBLESTONE);
	 	ItemMeta cobble2Meta = cobble2.getItemMeta();
	 	cobble2Meta.setDisplayName(ChatColor.GRAY + "Minage Intense 2");
	 	List<String> cobble2Lore = new ArrayList<String>();
	 	cobble2Lore.add("");
	 	cobble2Lore.add(ChatColor.GRAY + "" + ChatColor.UNDERLINE + "Requis:");
	 	cobble2Lore.add(ChatColor.GRAY + "- 32 Cobblestone");
	 	if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".cobble2", false)) {
	 		cobble2Meta.addEnchant(Enchantment.DURABILITY, 10, true);
	 		cobble2Lore.add("");
	 		cobble2Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
	 		cobble2Lore.add(ChatColor.GOLD + "- 8 SkyCoins");
	 	} else {
	 		cobble2Lore.add("");
	 		cobble2Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
	 		cobble2Lore.add(ChatColor.GOLD + "- 15 SkyCoins");
	 		cobble2Lore.add(ChatColor.GOLD + "- 3 Blocks d'herbe");
	 	}
	 	cobble2Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	 	cobble2Meta.setLore(cobble2Lore);
		cobble2.setItemMeta(cobble2Meta);
		gui.setItem(2, cobble2);
		
		return gui;
		
	}

	@Override
	protected boolean onInventoryClick(InventoryClickEvent event) {
		if (event.getCurrentItem().getType() == Material.COBBLESTONE) {
			event.getWhoClicked().closeInventory();
			if (event.getWhoClicked().getInventory().contains(Material.COBBLESTONE, 32)) {
				int n = 8;
				for (Entry<Integer, ? extends ItemStack> entry : event.getWhoClicked().getInventory().all(Material.COBBLESTONE).entrySet()) {
					if (entry.getValue().getAmount() > n) {
						ItemStack item = entry.getValue();
						item.setAmount(item.getAmount() - n);
						event.getWhoClicked().getInventory().setItem(entry.getKey(), item);
						n = 0;
					} else {    
						n -= entry.getValue().getAmount();
						event.getWhoClicked().getInventory().setItem(entry.getKey(), null);
					}
					if (n == 0) {
						break;
					}
				}
				if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".cobble2", false)) {
                    int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
                    Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 8);
                    Main.plugin.saveConfig();
                    event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Minage Intense 2 !");
                    event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 8 SkyCoins!");
                      event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
                } else {
                    int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
                    Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 15);
                    Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".cobble2", true);
                    Main.plugin.saveConfig();
                    event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Minage Intensif 2 pour la première fois!");
                    event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 15 SkyCoins!");
                    Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge Minage Intensif 2 pour la première fois!");
                    event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS, 3));
                }
            }
        }
		return false;
	}
	
}
