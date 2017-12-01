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

public class SCP2 extends AbstractMenu{

	public static SCP2 instance;

	public SCP2() {
		super("SlimefunChallengePack2", Main.plugin, ChatColor.GRAY + "Challenge", 2);
		instance = this;
	}

	@Override
	protected Inventory populate(Inventory gui, Player player) {

		ItemStack sfc21 = new ItemStack(Material.DISPENSER);
		ItemMeta sfc21Meta = sfc21.getItemMeta();
		sfc21Meta.setDisplayName(ChatColor.GRAY + "Grind Stone !");
		List<String> sfc21Lore = new ArrayList<String>();
		sfc21Lore.add("");
		sfc21Lore.add(ChatColor.GRAY + "Requis:");
		sfc21Lore.add(ChatColor.GRAY + "- Construire un Grind Stone");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".sfc21", false)) {
			sfc21Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			sfc21Lore.add("");
			sfc21Lore.add(ChatColor.RED + "Tu ne peux pas recommencer ce challenge!");
		} else {
			sfc21Lore.add("");
			sfc21Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			sfc21Lore.add(ChatColor.GOLD + "- 6 SkyCoins");
		}
		sfc21Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		sfc21Meta.setLore(sfc21Lore);
		sfc21.setItemMeta(sfc21Meta);
		gui.setItem(3, sfc21);

		ItemStack sfc22 = new ItemStack(Material.DISPENSER);
		ItemMeta sfc22Meta = sfc22.getItemMeta();
		sfc22Meta.setDisplayName(ChatColor.GRAY + "Ore Crusher !");
		List<String> sfc22Lore = new ArrayList<String>();
		sfc22Lore.add("");
		sfc22Lore.add(ChatColor.GRAY + "Requis:");
		sfc22Lore.add(ChatColor.GRAY + "- Construire un Ore Crusher");
		if (Main.plugin.getConfig().getBoolean("challenges." + player.getName() + ".sfc22", false)) {
			sfc22Meta.addEnchant(Enchantment.DURABILITY, 10, true);
			sfc22Lore.add("");
			sfc22Lore.add(ChatColor.RED + "Tu ne peux pas recommencer ce challenge!");
		} else {
			sfc22Lore.add("");
			sfc22Lore.add(ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "Récompenses:");
			sfc22Lore.add(ChatColor.GOLD + "- 6 SkyCoins");
		}
		sfc22Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		sfc22Meta.setLore(sfc22Lore);
		sfc22.setItemMeta(sfc22Meta);
		gui.setItem(3, sfc22);

		return gui;
	}

	@Override
	protected boolean onInventoryClick(InventoryClickEvent event) {
		if (event.getCurrentItem().getType() == Material.DISPENSER) {
			if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Grind Stone !")) {
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
									if (blockUp.getType() == Material.FENCE) {
										if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".sfc21", false)) {
											event.getWhoClicked().sendMessage(ChatColor.RED + "Tu ne peux pas refaire ce challenge!");
											// event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
										} else {

											int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
											Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 6);
											Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".sfc21", true);
											Main.plugin.saveConfig();
											event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Grind Stone ! pour la première fois!");
											event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 6 SkyCoins!");
											Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge Grind Stone ! pour la première fois!");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (event.getCurrentItem().getType() == Material.DISPENSER) {
			if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Ore Crusher !")) {
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
									Block blockEast = block.getRelative(BlockFace.EAST);
									Block blockWest = block.getRelative(BlockFace.WEST);
									Block blockSouth = block.getRelative(BlockFace.SOUTH);
									Block blockNorth = block.getRelative(BlockFace.NORTH);
									if (blockUp.getType() == Material.NETHER_FENCE) {
										if ((blockWest.getType() == Material.IRON_FENCE && blockEast.getType() == Material.IRON_FENCE) || (blockNorth.getType() == Material.IRON_FENCE && blockSouth.getType() == Material.IRON_FENCE)) {
											if (Main.plugin.getConfig().getBoolean("challenges." + event.getWhoClicked().getName() + ".sfc22", false)) {
												event.getWhoClicked().sendMessage(ChatColor.RED + "Tu ne peux pas refaire ce challenge!");
												// event.getWhoClicked().getInventory().addItem(new ItemStack(Material.GRASS));
											} else {

												int skycoins = Main.plugin.getConfig().getInt("SkyCoins." + event.getWhoClicked().getName());
												Main.plugin.getConfig().set("SkyCoins." + event.getWhoClicked().getName(), skycoins + 6);
												Main.plugin.getConfig().set("challenges." + event.getWhoClicked().getName() + ".sfc22", true);
												Main.plugin.saveConfig();
												event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de completer le challenge Ore Crusher ! pour la première fois!");
												event.getWhoClicked().sendMessage(ChatColor.GREEN + "Tu viens de gagner 6 SkyCoins!");
												Bukkit.broadcastMessage(ChatColor.BLUE + event.getWhoClicked().getName() + " vient de completer le challenge Ore Crusher ! pour la première fois!");
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
		return false;
	}

}