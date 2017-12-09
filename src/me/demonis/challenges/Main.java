package me.demonis.challenges;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	public static Plugin plugin;


	public void onEnable() {
		plugin = this;
		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents(new InteractsEvents(), this);
		new CP1();
		new CP2();
		new SCP1();
		new SCP2();
		//		ItemStack pumpkinJuice = new ItemStack(Material.POTION, 1, (byte) 8195);
		//		ItemMeta pumpkinJuiceMeta = pumpkinJuice.getItemMeta();
		//		pumpkinJuiceMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Pumpkin Juice");
		//		pumpkinJuice.setItemMeta(pumpkinJuiceMeta);
		//		FurnaceRecipe pumpkinJuiceRecipe = new FurnaceRecipe(pumpkinJuice, Material.PUMPKIN);
		//		Bukkit.addRecipe(pumpkinJuiceRecipe);
		//		Iterator<Recipe> recipeIterator = Bukkit.recipeIterator();
		//		for (Recipe recipe = recipeIterator.next(); recipe != null; recipe = recipeIterator.next()) {
		//			if (recipe instanceof FurnaceRecipe) {
		//				if (recipe.getResult().getType().equals(Material.IRON_INGOT)) {
		//					recipeIterator.remove();
		//				}
		//			}
		//		}
		//		
		//		ItemStack pumpkinJuice2 = new ItemStack(Material.POTION, 1, (byte) 8195);
		//		ItemMeta pumpkinJuice2Meta = pumpkinJuice2.getItemMeta();
		//		pumpkinJuice2Meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Pumpkin Juice");
		//		pumpkinJuice2.setItemMeta(pumpkinJuice2Meta);
		//		@SuppressWarnings("deprecation")
		//		ShapelessRecipe pumpkinJuice2Recipe = new ShapelessRecipe(pumpkinJuice2);
		//		pumpkinJuice2Recipe.addIngredient(Material.PUMPKIN);
		//		pumpkinJuice2Recipe.addIngredient(Material.GLASS_BOTTLE);
		//		Bukkit.addRecipe(pumpkinJuice2Recipe);
		//		recipeIterator = Bukkit.recipeIterator();
		//		for (Recipe recipe = recipeIterator.next(); recipe != null; recipe = recipeIterator.next()) {
		//			if (recipe instanceof ShapelessRecipe || recipe instanceof ShapedRecipe) {
		//				if (recipe.getResult().getType().equals(Material.BEACON)) {
		//					recipeIterator.remove();
		//				}
		//			}
		//		}
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getLabel().equals("challenge")) {
			if (sender instanceof Player) {
				Inventory challenge = Bukkit.createInventory(null, 5*9, ChatColor.GRAY + "Challenges");

				ItemStack challengepack1 = new ItemStack(Material.WOOL);
				ItemMeta challengepack1Meta = challengepack1.getItemMeta();
				challengepack1Meta.setDisplayName(ChatColor.GRAY + "Débutant");
				List<String> challengepack1Lore = new ArrayList<String>();
				challengepack1Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges débutants!");
				challengepack1Meta.setLore(challengepack1Lore);
				challengepack1Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				challengepack1Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				challengepack1.setItemMeta(challengepack1Meta);
				challenge.setItem(4, challengepack1);

				ItemStack challengepack2 = new ItemStack(Material.WOOL, 1, (byte) 1);
				ItemMeta challengepack2Meta = challengepack2.getItemMeta();
				challengepack2Meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Easy [1/3]");
				List<String> challengepack2Lore = new ArrayList<String>();
				challengepack2Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges easy!");
				challengepack2Meta.setLore(challengepack2Lore);
				challengepack2Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				challengepack2Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				challengepack2.setItemMeta(challengepack2Meta);
				challenge.setItem(10, challengepack2);

				ItemStack challengepack3 = new ItemStack(Material.WOOL, 1, (byte) 1);
				ItemMeta challengepack3Meta = challengepack3.getItemMeta();
				challengepack3Meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Easy [2/3]");
				List<String> challengepack3Lore = new ArrayList<String>();
				challengepack3Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges easy!");
				challengepack3Meta.setLore(challengepack3Lore);
				challengepack3Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				challengepack3Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				challengepack3.setItemMeta(challengepack3Meta);
				challenge.setItem(11, challengepack3);

				ItemStack challengepack4 = new ItemStack(Material.WOOL, 1, (byte) 1);
				ItemMeta challengepack4Meta = challengepack4.getItemMeta();
				challengepack4Meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Easy [3/3]");
				List<String> challengepack4Lore = new ArrayList<String>();
				challengepack4Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges easy!");
				challengepack4Meta.setLore(challengepack4Lore);
				challengepack4Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				challengepack4Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				challengepack4.setItemMeta(challengepack4Meta);
				challenge.setItem(12, challengepack4);

				ItemStack challengepack5 = new ItemStack(Material.WOOL, 1, (byte) 2);
				ItemMeta challengepack5Meta = challengepack5.getItemMeta();
				challengepack5Meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Normal [1/3]");
				List<String> challengepack5Lore = new ArrayList<String>();
				challengepack5Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges normal!");
				challengepack5Meta.setLore(challengepack5Lore);
				challengepack5Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				challengepack5Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				challengepack5.setItemMeta(challengepack5Meta);
				challenge.setItem(14, challengepack5);

				ItemStack challengepack6 = new ItemStack(Material.WOOL, 1, (byte) 2);
				ItemMeta challengepack6Meta = challengepack6.getItemMeta();
				challengepack6Meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Normal [2/3]");
				List<String> challengepack6Lore = new ArrayList<String>();
				challengepack6Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges normal!");
				challengepack6Meta.setLore(challengepack6Lore);
				challengepack6Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				challengepack6Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				challengepack6.setItemMeta(challengepack6Meta);
				challenge.setItem(14, challengepack6);

				ItemStack challengepack7 = new ItemStack(Material.WOOL, 1, (byte) 2);
				ItemMeta challengepack7Meta = challengepack7.getItemMeta();
				challengepack7Meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Normal [3/3]");
				List<String> challengepack7Lore = new ArrayList<String>();
				challengepack7Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges normal!");
				challengepack7Meta.setLore(challengepack7Lore);
				challengepack7Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				challengepack7Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				challengepack7.setItemMeta(challengepack7Meta);
				challenge.setItem(14, challengepack7);

				ItemStack sfchallengepack1 = new ItemStack(Material.STAINED_CLAY);
				ItemMeta sfchallengepack1Meta = sfchallengepack1.getItemMeta();
				sfchallengepack1Meta.setDisplayName(ChatColor.GRAY + "Slimefun I");
				List<String> sfchallengepack1Lore = new ArrayList<String>();
				sfchallengepack1Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges Slimefun 1!");
				sfchallengepack1Meta.setLore(sfchallengepack1Lore);
				sfchallengepack1Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				sfchallengepack1Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				sfchallengepack1.setItemMeta(sfchallengepack1Meta);
				challenge.setItem(36, sfchallengepack1);

				ItemStack sfchallengepack2 = new ItemStack(Material.STAINED_CLAY, 1, (byte) 1);
				ItemMeta sfchallengepack2Meta = sfchallengepack2.getItemMeta();
				sfchallengepack2Meta.setDisplayName(ChatColor.GRAY + "Slimefun II");
				List<String> sfchallengepack2Lore = new ArrayList<String>();
				sfchallengepack2Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges Slimefun 2!");
				sfchallengepack2Meta.setLore(sfchallengepack2Lore);
				sfchallengepack2Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				sfchallengepack2Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				sfchallengepack2.setItemMeta(sfchallengepack2Meta);
				challenge.setItem(29, sfchallengepack2);

				ItemStack sfchallengepack3 = new ItemStack(Material.STAINED_CLAY, 1, (byte) 2);
				ItemMeta sfchallengepack3Meta = sfchallengepack3.getItemMeta();
				sfchallengepack3Meta.setDisplayName(ChatColor.GRAY + "Slimefun III");
				List<String> sfchallengepack3Lore = new ArrayList<String>();
				sfchallengepack3Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges Slimefun 3!");
				sfchallengepack3Meta.setLore(sfchallengepack3Lore);
				sfchallengepack3Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				sfchallengepack3Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				sfchallengepack3.setItemMeta(sfchallengepack3Meta);
				challenge.setItem(40, sfchallengepack3);

				ItemStack sfchallengepack4 = new ItemStack(Material.STAINED_CLAY, 1, (byte) 3);
				ItemMeta sfchallengepack4Meta = sfchallengepack4.getItemMeta();
				sfchallengepack4Meta.setDisplayName(ChatColor.GRAY + "Slimefun IV");
				List<String> sfchallengepack4Lore = new ArrayList<String>();
				sfchallengepack4Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges Slimefun 4!");
				sfchallengepack4Meta.setLore(sfchallengepack4Lore);
				sfchallengepack4Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				sfchallengepack4Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				sfchallengepack4.setItemMeta(sfchallengepack4Meta);
				challenge.setItem(33, sfchallengepack4);

				ItemStack sfchallengepack5 = new ItemStack(Material.STAINED_CLAY, 1, (byte) 4);
				ItemMeta sfchallengepack5Meta = sfchallengepack5.getItemMeta();
				sfchallengepack5Meta.setDisplayName(ChatColor.GRAY + "Slimefun V");
				List<String> sfchallengepack5Lore = new ArrayList<String>();
				sfchallengepack5Lore.add(ChatColor.YELLOW + "Clique pour accéder aux challenges Slimefun 5!");
				sfchallengepack5Meta.setLore(sfchallengepack5Lore);
				sfchallengepack5Meta.addEnchant(Enchantment.DURABILITY, 10, true);
				sfchallengepack5Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				sfchallengepack5.setItemMeta(sfchallengepack5Meta);
				challenge.setItem(44, sfchallengepack5);

				((Player) sender).openInventory(challenge);
			} else {
				sender.sendMessage(ChatColor.RED + "Vous devez être un joueur pour faire cela!");
			}
		} else if (command.getLabel().equals("skycoins")) {
			int skycoins = getConfig().getInt("SkyCoins." + sender.getName());
			sender.sendMessage(ChatColor.GOLD + "Tu as " + ChatColor.YELLOW + skycoins + ChatColor.GOLD + " SkyCoins!");
		}

		return true;
	}

	@EventHandler
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
		String message = event.getMessage().split(" ")[0];
		if (message.equalsIgnoreCase("/c")) {
			event.setCancelled(true);
			String[] args = new String[0];
			if (event.getMessage().length() > 3) {
				args = event.getMessage().substring(3).split(" ");
			}
			onCommand(event.getPlayer(), getCommand("challenge"), message.substring(1), args);
		}
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		if (event.getCurrentItem() == null) {
			return;
		}

		if (event.getInventory().getTitle().equals(ChatColor.GRAY + "Challenges")) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.WOOL) {
				if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Débutant")) {
					event.getWhoClicked().closeInventory();
					
					if (event.getWhoClicked().hasPermission("CP1")) {
						CP1.instance.open((Player) event.getWhoClicked());
					}
				}
			}
			if (event.getCurrentItem().getType().equals(Material.WOOL)) {
				if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "" + ChatColor.BOLD + "Easy [1/3]")) {
					event.getWhoClicked().closeInventory();

					if (event.getWhoClicked().hasPermission("CP2")) {
						CP2.instance.open((Player) event.getWhoClicked());
					}
				}
			}
			if (event.getCurrentItem().getType() == Material.STAINED_CLAY) {
				if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Slimefun I")) {
					event.getWhoClicked().closeInventory();
					
					if (event.getWhoClicked().hasPermission("SCP1")) {
						SCP1.instance.open((Player) event.getWhoClicked());
					}
				}
			}
			if (event.getCurrentItem().getType() == Material.STAINED_CLAY) {
				if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Slimefun II")) {
					event.getWhoClicked().closeInventory();
					
					if (event.getWhoClicked().hasPermission("SCP2")) {
						SCP2.instance.open((Player) event.getWhoClicked());
					}
				}
			}
		}
	}



}
