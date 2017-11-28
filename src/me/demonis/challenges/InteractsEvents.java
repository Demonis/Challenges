package me.demonis.challenges;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Dispenser;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class InteractsEvents implements Listener{


	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerInteract(PlayerInteractEvent event) {
		if(event.getClickedBlock() != null && event.getClickedBlock().getType().equals(Material.WORKBENCH)) {
			Block blockDown = event.getClickedBlock().getRelative(BlockFace.DOWN);
			if (blockDown.getType() == Material.DISPENSER) {
				Dispenser dispenser = (Dispenser) blockDown.getState();
				if (((org.bukkit.material.Dispenser) blockDown.getState().getData()).getFacing() == BlockFace.UP) {
					Inventory dispenserInv = dispenser.getInventory();
					if (dispenserInv.getItem(0) == null && dispenserInv.getItem(2) == null && dispenserInv.getItem(3) == null && dispenserInv.getItem(5) == null && dispenserInv.getItem(6) == null && dispenserInv.getItem(8) == null) {
						if (dispenserInv.getItem(1) != null && dispenserInv.getItem(1).getType().equals(Material.LOG) && dispenserInv.getItem(4) != null && dispenserInv.getItem(4).getType().equals(Material.LOG) && dispenserInv.getItem(7) != null && dispenserInv.getItem(7).getType().equals(Material.LOG)) {
							if (Main.plugin.getConfig().getBoolean("challenges." + event.getPlayer().getName() + ".sfc14", false)) {
								int slimePoint = Main.plugin.getConfig().getInt("SlimePoint." + event.getPlayer().getName());
								Main.plugin.getConfig().set("SlimePoint" + event.getPlayer().getName(), slimePoint + 1);
								event.getPlayer().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Stick!");
								event.getPlayer().sendMessage(ChatColor.GREEN + "Tu viens de gagner 1 SlimePoint!");
							} else {
								if (Main.plugin.getConfig().getBoolean("challenges." + event.getPlayer().getName() + ".sfc13", false)) {
									int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getPlayer().getName());
									int slimePoint = Main.plugin.getConfig().getInt("SlimePoint." + event.getPlayer().getName());
									Main.plugin.getConfig().set("SkyCoins." + event.getPlayer().getName(), skycoins + 3);
									Main.plugin.getConfig().set("SlimePoint" + event.getPlayer().getName(), slimePoint + 1);
									Main.plugin.getConfig().set("challenges." + event.getPlayer().getName() + ".sfc14", true);
									Main.plugin.saveConfig();
									event.getPlayer().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Stick! pour la première fois!");
									event.getPlayer().sendMessage(ChatColor.GREEN + "Tu viens de gagner 3 SkyCoins!");
									event.getPlayer().sendMessage(ChatColor.GREEN + "Tu viens de gagner 1 SlimePoint!");
									Bukkit.broadcastMessage(ChatColor.BLUE + event.getPlayer().getName() + " vient de completer le challenge Stick! pour la première fois!");
								} else {
									event.getPlayer().sendMessage(ChatColor.RED + "Tu dois d'abord compléter le challenge précédent!");
								}
							}
							return;
						}
					} 
					if (dispenserInv.getItem(3) == null && dispenserInv.getItem(5) == null && dispenserInv.getItem(6) == null && dispenserInv.getItem(8) == null) {
						if (dispenserInv.getItem(2) != null && dispenserInv.getItem(2).getType().equals(Material.LEATHER) && dispenserInv.getItem(0) != null && dispenserInv.getItem(0).getType().equals(Material.LEATHER) && dispenserInv.getItem(1) != null && dispenserInv.getItem(1).getType().equals(Material.LOG) && dispenserInv.getItem(4) != null && dispenserInv.getItem(4).getType().equals(Material.LOG) && dispenserInv.getItem(7) != null && dispenserInv.getItem(7).getType().equals(Material.LOG)) {
							if (Main.plugin.getConfig().getBoolean("challenges." + event.getPlayer().getName() + ".sfc15", false)) {
								int slimePoint = Main.plugin.getConfig().getInt("SlimePoint." + event.getPlayer().getName());
								Main.plugin.getConfig().set("SlimePoint" + event.getPlayer().getName(), slimePoint + 1);
								event.getPlayer().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Stick!");
								event.getPlayer().sendMessage(ChatColor.GREEN + "Tu viens de gagner 1 SlimePoint!");
							} else {
								if (Main.plugin.getConfig().getBoolean("challenges." + event.getPlayer().getName() + ".sfc14", false)) {
									int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getPlayer().getName());
									int slimePoint = Main.plugin.getConfig().getInt("SlimePoint." + event.getPlayer().getName());
									Main.plugin.getConfig().set("SkyCoins." + event.getPlayer().getName(), skycoins + 3);
									Main.plugin.getConfig().set("SlimePoint" + event.getPlayer().getName(), slimePoint + 1);
									Main.plugin.getConfig().set("challenges." + event.getPlayer().getName() + ".sfc15", true);
									Main.plugin.saveConfig();
									event.getPlayer().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Stick! pour la première fois!");
									event.getPlayer().sendMessage(ChatColor.GREEN + "Tu viens de gagner 3 SkyCoins!");
									event.getPlayer().sendMessage(ChatColor.GREEN + "Tu viens de gagner 1 SlimePoint!");
									Bukkit.broadcastMessage(ChatColor.BLUE + event.getPlayer().getName() + " vient de completer le challenge Stick! pour la première fois!");
								} else {
									event.getPlayer().sendMessage(ChatColor.RED + "Tu dois d'abord compléter le challenge précédent!");
								}
							}
							return;
						}
					}
				}
			}
		}
	}
}
