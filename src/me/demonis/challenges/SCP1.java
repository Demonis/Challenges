package me.demonis.challenges;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Dispenser;

public class SCP1 extends AbstractMenu{

	public static SCP1 instance;

	public SCP1() {
		super("SlimefunChallengePack1", Main.plugin, ChatColor.GRAY + "Challenge", 2);
		instance = this;
	}

	@Override
	protected Inventory populate(Inventory gui, Player player) {

		ItemStack sfc11 = new ItemStack(Material.WORKBENCH);
		ItemMeta sfc11Meta = sfc11.getItemMeta();
		sfc11Meta.setDisplayName(ChatColor.GRAY + "Préparation I");
		List<String> sfc11Lore = new ArrayList<String>();
		sfc11Lore.add("");
		sfc11Lore.add(ChatColor.GRAY + "Requis:");
		sfc11Lore.add(ChatColor.GRAY + "- 1 Table de craft");
		sfc11Lore.add(ChatColor.GRAY + "- 1 Dispenser");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".sfc11", false)) {
			sfc11Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			sfc11Lore.add("");
			sfc11Lore.add(ChatColor.RED + "Tu ne peux pas recommencer ce challenge!");
		} else {
			sfc11Lore.add("");
			sfc11Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			sfc11Lore.add(ChatColor.GOLD + "- 4 SkyCoins");
		}
		sfc11Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		sfc11Meta.setLore(sfc11Lore);
		sfc11.setItemMeta(sfc11Meta);
		gui.setItem(2, sfc11);

		ItemStack sfc12 = new ItemStack(Material.WORKBENCH);
		ItemMeta sfc12Meta = sfc12.getItemMeta();
		sfc12Meta.setDisplayName(ChatColor.GRAY + "Table de craft magique!");
		List<String> sfc12Lore = new ArrayList<String>();
		sfc12Lore.add("");
		sfc12Lore.add(ChatColor.GRAY + "Requis:");
		sfc12Lore.add(ChatColor.GRAY + "- Construire la table de craft magique");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".sfc12", false)) {
			sfc12Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			sfc12Lore.add("");
			sfc12Lore.add(ChatColor.RED + "Tu ne peux pas recommencer ce challenge!");
		} else {
			sfc12Lore.add("");
			sfc12Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			sfc12Lore.add(ChatColor.GOLD + "- 4 SkyCoins");
			sfc12Lore.add(ChatColor.GOLD + "- 4 Blocks de terre");
		}
		sfc12Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		sfc12Meta.setLore(sfc12Lore);
		sfc12.setItemMeta(sfc12Meta);
		gui.setItem(3, sfc12);

		ItemStack sfc13 = new ItemStack(Material.EXP_BOTTLE);
		ItemMeta sfc13Meta = sfc13.getItemMeta();
		sfc13Meta.setDisplayName(ChatColor.GRAY + "XP I");
		List<String> sfc13Lore = new ArrayList<String>();
		sfc13Lore.add("");
		sfc13Lore.add(ChatColor.GRAY + "Requis:");
		sfc13Lore.add(ChatColor.GRAY + "- 3 niveau d'xp");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".sfc13", false)) {
			sfc13Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			sfc13Lore.add("");
			sfc13Lore.add(ChatColor.RED + "Tu ne peux pas recommencer ce challenge!");
		} else {
			sfc13Lore.add("");
			sfc13Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			sfc13Lore.add(ChatColor.GOLD + "- 1 SkyCoins");
		}
		sfc13Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		sfc13Meta.setLore(sfc13Lore);
		sfc13.setItemMeta(sfc13Meta);
		gui.setItem(4, sfc13);
		
		ItemStack sfc14 = new ItemStack(Material.STICK);
		ItemMeta sfc14Meta = sfc14.getItemMeta();
		sfc14Meta.setDisplayName(ChatColor.GRAY + "Stick !");
		List<String> sfc14Lore = new ArrayList<String>();
		sfc14Lore.add("");
		sfc14Lore.add(ChatColor.GRAY + "Requis:");
		sfc14Lore.add(ChatColor.GRAY + "- Crafter un Grandmas Walking Stick !");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".sfc14", false)) {
			sfc14Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			sfc14Lore.add("");
			sfc14Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			sfc14Lore.add(ChatColor.GOLD + "- 1 SlimePoint");
		} else {
			sfc14Lore.add("");
			sfc14Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			sfc14Lore.add(ChatColor.GOLD + "- 3 SkyCoins");
			sfc14Lore.add(ChatColor.GOLD + "- 1 SlimePoint");
		}
		sfc14Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		sfc14Meta.setLore(sfc14Lore);
		sfc14.setItemMeta(sfc14Meta);
		gui.setItem(5, sfc14);
		
		ItemStack sfc15 = new ItemStack(Material.STICK);
		ItemMeta sfc15Meta = sfc15.getItemMeta();
		sfc15Meta.setDisplayName(ChatColor.GRAY + "Stick II !");
		List<String> sfc15Lore = new ArrayList<String>();
		sfc15Lore.add("");
		sfc15Lore.add(ChatColor.GRAY + "Requis:");
		sfc15Lore.add(ChatColor.GRAY + "- Crafter un Grandpas Walking Stick !");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".sfc15", false)) {
			sfc15Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			sfc15Lore.add("");
			sfc15Lore.add(ChatColor.RED + "Tu ne peux pas recommencer ce challenge!");
			sfc14Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			sfc14Lore.add(ChatColor.GOLD + "- 1 SlimePoint");
		} else {
			sfc15Lore.add("");
			sfc15Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			sfc15Lore.add(ChatColor.GOLD + "- 4 SkyCoins");
			sfc15Lore.add(ChatColor.GOLD + "- 2 SlimePoint");
		}
		sfc15Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		sfc15Meta.setLore(sfc15Lore);
		sfc15.setItemMeta(sfc15Meta);
		gui.setItem(6, sfc15);

		return gui;
	}
	
	
	@Override
	protected boolean onInventoryClick(InventoryClickEvent event) {

		if (event.getCurrentItem().getType() == Material.WORKBENCH) {
			if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Préparation I")) {
				event.getWhoClicked().closeInventory();
				if (event.getWhoClicked().getInventory().contains(Material.WORKBENCH, 1)) {
					if (event.getWhoClicked().getInventory().contains(Material.DISPENSER, 1)) {
						if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".sfc11", false)) {
							event.getWhoClicked().sendMessage(ChatColor.RED + "Tu ne peux pas refaire ce challenge!");
							// event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
						} else {
							int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
							Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 4);
							Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".sfc11", true);
							Main.plugin.saveConfig();
							event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Préparation I pour la première fois!");
							event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 4 SkyCoins!");
							Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge Préparation I pour la première fois!");
						}
					}
				}
			}
		}

		if (event.getCurrentItem().getType() == Material.WORKBENCH) {
			if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Table de craft magique!")) {
				event.getWhoClicked().closeInventory();
				int r = 10;
				for (int x = -r; x <= r; x++) {
					for (int y = -r; y <= r; y++) {
						for (int z = -r; z <= r; z++) {
							Block block = (event.getWhoClicked()).getLocation().add(x, y, z).getBlock();
							if (block.getType() == Material.DISPENSER) {
								Dispenser dispenser = (Dispenser) block.getState().getData();
								if (dispenser.getFacing() == BlockFace.UP) {
									Block blockUp = block.getRelative(BlockFace.UP);
									if (blockUp.getType() == Material.WORKBENCH) {
										if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".sfc12", false)) {
											event.getWhoClicked().sendMessage(ChatColor.RED + "Tu ne peux pas refaire ce challenge!");
											// event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
										} else {
											if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".sfc11", false)) {
												int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
												Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 4);
												Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".sfc12", true);
												Main.plugin.saveConfig();
												event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Table de craft magique! pour la première fois!");
												event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 4 SkyCoins!");
												Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge Table de craft magique! pour la première fois!");
												event.getWhoClicked().getInventory().addItem(new ItemStack(Material.DIRT, 4));
											} else {
												event.getWhoClicked().sendMessage(ChatColor.RED + "Tu dois d'abord compléter le challenge précédent!");
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (event.getCurrentItem().getType() == Material.EXP_BOTTLE) {
			if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "XP I")) {
				event.getWhoClicked().closeInventory();
				if (((Player) event.getWhoClicked()).getLevel() >= 3) {
					if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".sfc13", false)) {
						event.getWhoClicked().sendMessage(ChatColor.RED + "Tu ne peux pas refaire ce challenge!");
						// event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
					} else {
						if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".sfc12", false)) {
							int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
							Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 1);
							Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".sfc13", true);
							Main.plugin.saveConfig();
							event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge XP I pour la première fois!");
							event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 1 SkyCoins!");
							Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge XP I pour la première fois!");
						} else {
							event.getWhoClicked().sendMessage(ChatColor.RED + "Tu dois d'abord compléter le challenge précédent!");
						}
					}
				}
			}
		}

		return false;
	}
}