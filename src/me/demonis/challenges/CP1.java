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

public class CP1 extends AbstractMenu{

	public static CP1 instance;

	public CP1() {
		super("ChallengePack1", Main.plugin, ChatColor.GRAY + "Challenge", 2);
		instance = this;
	}

	@Override
	protected Inventory populate(Inventory gui, Player player) {

		ItemStack cobble1 = new ItemStack(Material.COBBLESTONE);
		ItemMeta cobble1Meta = cobble1.getItemMeta();
		cobble1Meta.setDisplayName(ChatColor.GRAY + "Minage Intense");
		List<String> cobble1Lore = new ArrayList<String>();
		cobble1Lore.add("");
		cobble1Lore.add(ChatColor.GRAY + "" + ChatColor.UNDERLINE + "Requis:");
		cobble1Lore.add(ChatColor.GRAY + "- 16 Cobblestone");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".cobble1", false)) {
			cobble1Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			cobble1Lore.add("");
			cobble1Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			cobble1Lore.add(ChatColor.GOLD + "- 4 SkyCoins");
		} else {
			cobble1Lore.add("");
			cobble1Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			cobble1Lore.add(ChatColor.GOLD + "- 8 SkyCoins");
			cobble1Lore.add(ChatColor.GOLD + "- 2 Blocks d'herbe");
		}
		cobble1Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		cobble1Meta.setLore(cobble1Lore);
		cobble1.setItemMeta(cobble1Meta);
		gui.setItem(2, cobble1);

		ItemStack wood1 = new ItemStack(Material.LOG);
		ItemMeta wood1Meta = wood1.getItemMeta();
		wood1Meta.setDisplayName(ChatColor.GRAY + "Bucheron");
		List<String> wood1Lore = new ArrayList<String>();
		wood1Lore.add("");
		wood1Lore.add(ChatColor.GRAY + "Requis:");
		wood1Lore.add(ChatColor.GRAY + "- 8 Bûches de chêne");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".wood1", false)) {
			wood1Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			wood1Lore.add("");
			wood1Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			wood1Lore.add(ChatColor.GOLD + "- 2 SkyCoins");
		} else {
			wood1Lore.add("");
			wood1Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			wood1Lore.add(ChatColor.GOLD + "- 6 SkyCoins");
			wood1Lore.add(ChatColor.GOLD + "- 2 Pousse de bouleau");
			wood1Lore.add(ChatColor.GOLD + "- 2 Pousse de sapin");
		}
		wood1Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		wood1Meta.setLore(wood1Lore);
		wood1.setItemMeta(wood1Meta);
		gui.setItem(3, wood1);

		ItemStack ble1 = new ItemStack(Material.WHEAT);
		ItemMeta ble1Meta = ble1.getItemMeta();
		ble1Meta.setDisplayName(ChatColor.GRAY + "Cultivons pour notre survie");
		List<String> ble1Lore = new ArrayList<String>();
		ble1Lore.add("");
		ble1Lore.add(ChatColor.GRAY + "Requis:");
		ble1Lore.add(ChatColor.GRAY + "- 8 Blés");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".ble1", false)) {
			ble1Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			ble1Lore.add("");
			ble1Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			ble1Lore.add(ChatColor.GOLD + "- 1 SkyCoins");
		} else {
			ble1Lore.add("");
			ble1Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			ble1Lore.add(ChatColor.GOLD + "- 6 SkyCoins");
			ble1Lore.add(ChatColor.GOLD + "- 5 Blocks de terre");
		}
		ble1Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		ble1Meta.setLore(ble1Lore);
		ble1.setItemMeta(ble1Meta);
		gui.setItem(4, ble1);

		ItemStack outils1 = new ItemStack(Material.WOOD_PICKAXE);
		ItemMeta outils1Meta = outils1.getItemMeta();
		outils1Meta.setDisplayName(ChatColor.GRAY + "Premiers outils");
		List<String> outils1Lore = new ArrayList<String>();
		outils1Lore.add("");
		outils1Lore.add(ChatColor.GRAY + "Requis:");
		outils1Lore.add(ChatColor.GRAY + "- 1 Pioche en bois");
		outils1Lore.add(ChatColor.GRAY + "- 1 Hache en bois");
		outils1Lore.add(ChatColor.GRAY + "- 1 Pelle en bois");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".outils1", false)) {
			outils1Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			outils1Lore.add("");
			outils1Lore.add(ChatColor.RED + "Tu ne peux pas recommencer ce challenge!");
		} else {
			outils1Lore.add("");
			outils1Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			outils1Lore.add(ChatColor.GOLD + "- 6 SkyCoins");
			outils1Lore.add(ChatColor.GOLD + "- 1 Pioche en pierre");
			outils1Lore.add(ChatColor.GOLD + "- 1 Pelle en pierre");
			outils1Lore.add(ChatColor.GOLD + "- 1 Hache en pierre");
		}
		outils1Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		outils1Meta.setLore(outils1Lore);
		outils1.setItemMeta(outils1Meta);
		gui.setItem(5, outils1);

		ItemStack crafts1 = new ItemStack(Material.WORKBENCH);
		ItemMeta crafts1Meta = crafts1.getItemMeta();
		crafts1Meta.setDisplayName(ChatColor.GRAY + "Premiers crafts");
		List<String> crafts1Lore = new ArrayList<String>();
		crafts1Lore.add("");
		crafts1Lore.add(ChatColor.GRAY + "Requis:");
		crafts1Lore.add(ChatColor.GRAY + "- 1 Table de craft");
		crafts1Lore.add(ChatColor.GRAY + "- 1 Four");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".crafts1", false)) {
			crafts1Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			crafts1Lore.add("");
			crafts1Lore.add(ChatColor.RED + "Tu ne peux pas recommencer ce challenge!");
		} else {
			crafts1Lore.add("");
			crafts1Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			crafts1Lore.add(ChatColor.GOLD + "- 4 SkyCoins");
			crafts1Lore.add(ChatColor.GOLD + "- 4 Blocks de terre");
		}
		crafts1Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		crafts1Meta.setLore(crafts1Lore);
		crafts1.setItemMeta(crafts1Meta);
		gui.setItem(6, crafts1);

		ItemStack netherStar = new ItemStack(Material.NETHER_STAR);
		ItemMeta netherStarMeta = netherStar.getItemMeta();
		netherStarMeta.setDisplayName(ChatColor.GRAY + "Passage au niveau supérieur !");
		List<String> netherStarLore = new ArrayList<String>();
		netherStarLore.add("");
		netherStarLore.add(ChatColor.GRAY + "" + ChatColor.BOLD + "	➤ Niveau Easy I : 25 SC");
		netherStarMeta.addEnchant(Enchantment.DURABILITY, 10, true);
		netherStarMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		netherStarMeta.setLore(netherStarLore);
		netherStar.setItemMeta(netherStarMeta);
		gui.setItem(13, netherStar);


		return gui;
	}

	@Override
	protected boolean onInventoryClick(InventoryClickEvent event) {
		if (event.getCurrentItem().getType() == Material.COBBLESTONE) {
			event.getWhoClicked().closeInventory();
			if (event.getWhoClicked().getInventory().contains(Material.COBBLESTONE, 8)) {
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
				if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".cobble1", false)) {
					int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
					Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 4);
					Main.plugin.saveConfig();
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Minage Intense!");
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 4 SkyCoins!");
					// event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
				} else {
					int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
					Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 8);
					Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".cobble1", true);
					Main.plugin.saveConfig();
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Minage Intensif pour la première fois!");
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 8 SkyCoins!");
					Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge Minage Intensif pour la première fois!");
					event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS, 2));
				}
			}
		} else if (event.getCurrentItem().getType() == Material.LOG) {
			event.getWhoClicked().closeInventory();
			if (event.getWhoClicked().getInventory().contains(Material.LOG, 8)) {
				int n = 8;
				for (Entry<Integer, ? extends ItemStack> entry : event.getWhoClicked().getInventory().all(Material.LOG).entrySet()) {
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
				if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".wood1", false)) {
					int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
					Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 2);
					Main.plugin.saveConfig();
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Bucheron!");
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 2 SkyCoins!");
					event.getWhoClicked().getInventory().addItem(new ItemStack(Material.SAPLING, 1, (byte) 2));
					event.getWhoClicked().getInventory().addItem(new ItemStack(Material.SAPLING, 1, (byte) 1));
					// event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
				} else {
					int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
					Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 12);
					Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".wood1", true);
					Main.plugin.saveConfig();
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Bois I pour la première fois!");
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 12 SkyCoins!");
					Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge Bois I pour la première fois!");
					event.getWhoClicked().getInventory().addItem(new ItemStack(Material.SAPLING, 2, (byte) 2));
					event.getWhoClicked().getInventory().addItem(new ItemStack(Material.SAPLING, 2, (byte) 1));
				}
			}
		} else if (event.getCurrentItem().getType() == Material.WHEAT) {
			event.getWhoClicked().closeInventory();
			if (event.getWhoClicked().getInventory().contains(Material.WHEAT, 8)) {
				int n = 8;
				for (Entry<Integer, ? extends ItemStack> entry : event.getWhoClicked().getInventory().all(Material.WHEAT).entrySet()) {
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
				if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".ble1", false)) {
					int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
					Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 1);
					Main.plugin.saveConfig();
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Cultivons pour notre Survie!");
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 1 SkyCoins!");
					// event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
				} else {
					int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
					Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 6);
					Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".ble1", true);
					Main.plugin.saveConfig();
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Cultivons pour notre Survie pour la première fois!");
					event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 6 SkyCoins!");
					Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge Cultivons pour notre Survie pour la première fois!");
					event.getWhoClicked().getInventory().addItem(new ItemStack(Material.DIRT, 5));
				}
			}
		} else if (event.getCurrentItem().getType() == Material.WOOD_PICKAXE) {
			event.getWhoClicked().closeInventory();
			if (event.getWhoClicked().getInventory().contains(Material.WOOD_PICKAXE, 1)) {
				if (event.getWhoClicked().getInventory().contains(Material.WOOD_AXE, 1)) {
					if (event.getWhoClicked().getInventory().contains(Material.WOOD_SPADE, 1)) {
						if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".outils1", false)) {
							event.getWhoClicked().sendMessage(ChatColor.RED + "Tu ne peux pas refaire ce challenge!");
							// event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
						} else {
							int n = 1;
							int o = 1;
							int p = 1;
							for (Entry<Integer, ? extends ItemStack> entry : event.getWhoClicked().getInventory().all(Material.WOOD_PICKAXE).entrySet()) {
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
							for (Entry<Integer, ? extends ItemStack> entry2 : event.getWhoClicked().getInventory().all(Material.WOOD_AXE).entrySet()) {
								if (entry2.getValue().getAmount() > o) {
									ItemStack item = entry2.getValue();
									item.setAmount(item.getAmount() - o);
									event.getWhoClicked().getInventory().setItem(entry2.getKey(), item);
									o = 0;
								} else {
									n -= entry2.getValue().getAmount();
									event.getWhoClicked().getInventory().setItem(entry2.getKey(), null);
								}
								if (o == 0) {
									break;
								}
							}
							for (Entry<Integer, ? extends ItemStack> entry3 : event.getWhoClicked().getInventory().all(Material.WOOD_SPADE).entrySet()) {
								if (entry3.getValue().getAmount() > p) {
									ItemStack item = entry3.getValue();
									item.setAmount(item.getAmount() - p);
									event.getWhoClicked().getInventory().setItem(entry3.getKey(), item);
									p = 0;
								} else {
									p -= entry3.getValue().getAmount();
									event.getWhoClicked().getInventory().setItem(entry3.getKey(), null);
								}
								if (p == 0) {
									break;
								}
							}
							int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
							Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 6);
							Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".outils1", true);
							Main.plugin.saveConfig();
							event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Premiers Outils pour la première fois!");
							event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 6 SkyCoins!");
							Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge Premiers Outils pour la première fois!");
							event.getWhoClicked().getInventory().addItem(new ItemStack(Material.STONE_PICKAXE, 1));
							event.getWhoClicked().getInventory().addItem(new ItemStack(Material.STONE_AXE, 1));
							event.getWhoClicked().getInventory().addItem(new ItemStack(Material.STONE_SPADE, 1));
						}
					}
				}
			}
		} else if (event.getCurrentItem().getType() == Material.WORKBENCH) {
			event.getWhoClicked().closeInventory();
			if (event.getWhoClicked().getInventory().contains(Material.WORKBENCH, 1)) {
				if (event.getWhoClicked().getInventory().contains(Material.FURNACE, 1)) {
					if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".crafts1", false)) {
						event.getWhoClicked().sendMessage(ChatColor.RED + "Tu ne peux pas refaire ce challenge!");
						// event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
					} else {
						int n = 1;
						int o = 1;
						for (Entry<Integer, ? extends ItemStack> entry : event.getWhoClicked().getInventory().all(Material.WORKBENCH).entrySet()) {
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
						for (Entry<Integer, ? extends ItemStack> entry2 : event.getWhoClicked().getInventory().all(Material.FURNACE).entrySet()) {
							if (entry2.getValue().getAmount() > o) {
								ItemStack item = entry2.getValue();
								item.setAmount(item.getAmount() - o);
								event.getWhoClicked().getInventory().setItem(entry2.getKey(), item);
								o = 0;
							} else {
								n -= entry2.getValue().getAmount();
								event.getWhoClicked().getInventory().setItem(entry2.getKey(), null);
							}
							if (o == 0) {
								break;
							}
						}
						int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
						Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 4);
						Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".crafts1", true);
						Main.plugin.saveConfig();
						event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Premiers Crafts pour la première fois!");
						event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 4 SkyCoins!");
						Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge Premiers Crafts pour la première fois!");
						event.getWhoClicked().getInventory().addItem(new ItemStack(Material.DIRT, 4));
					}
				}
			}
		} else if (event.getCurrentItem().getType() == Material.NETHER_STAR) {
			event.getWhoClicked().closeInventory();
			if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".crafts1", false)) {
				if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".cobble1", false)) {
					if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".wood1", false)) {
						if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".ble1", false)) {
							if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".outils1", false)) {
								if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".crafts1", false)) {
									if (Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName()) >= 25) {
										int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
										Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins - 25);
										Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de passer Easy I !");
									}
								}
							}
						}
					}
				}
			} else {
				event.getWhoClicked().sendMessage(ChatColor.RED + "Tu as déjà acheté l'amélioration !");
			}
		}
		return false;
	}	
}
