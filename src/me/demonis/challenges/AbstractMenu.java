package me.demonis.challenges;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;

public abstract class AbstractMenu {

	private static final HashMap<String, AbstractMenu> MENUS = new HashMap<String, AbstractMenu>();

	protected String name;
	protected int rows;
	protected String title;
	protected Plugin plugin;

	public AbstractMenu(String name, Plugin plugin) {
		this(name, plugin, null, 6);
	}

	public AbstractMenu(String name, Plugin plugin, String title) {
		this(name, plugin, title, 6);
	}

	public AbstractMenu(String name, Plugin plugin, String title, int rows) {
		this.name = name != null? name.toLowerCase().replace(' ', '_') : "null";
		this.plugin = plugin;
		setSize(rows);
		setTitle(title);

		Bukkit.getPluginManager().registerEvents(new Listener() {

			@EventHandler
			private void onInventoryClick(InventoryClickEvent event) {
				if ((event.getInventory().getTitle() == null) != (title == null)) return;
				if (title != null && !event.getInventory().getTitle().equals(title)) return;
				if (event.getInventory().getSize() != rows * 9) return;
				if (!event.getInventory().getHolder().equals(event.getWhoClicked())) return;
				if (!AbstractMenu.this.onInventoryClick(event))
					event.setCancelled(true);
			}

		}, plugin);

		MENUS.put(name, this);
	}

	public void setTitle(String title) {
		this.title = title == null? null : ChatColor.translateAlternateColorCodes('&', title); // S'il y a un titre, on remplace les couleurs
	}

	public void setSize(int rows) {
		this.rows = Math.min(Math.max(rows, 0), 6); // Il doit y avoir entre 0 et 54 slots sinon le GUI est buggué
	}

	public void open(Player player) {
		if (player == null) return; // Si le joueur est null, on fait rien (au cas où)
		Inventory gui;
		if (title == null) gui = Bukkit.createInventory(player, rows * 9); // S'il le titre est null, on créé l'inv sans titre (celui par défaut)
		else gui = Bukkit.createInventory(player, rows * 9, title); // Sinon, on créé l'inv avec le bon titre
		player.openInventory(populate(gui, player)); // On rajoute les items dans le GUI et on l'ouvre au joueur
	}

	protected abstract Inventory populate(Inventory gui, Player player);

	protected abstract boolean onInventoryClick(InventoryClickEvent event);

	public static void open(Player player, String name) {
		if (player == null) return; // Si le joueur est null, on fait rien (au cas où)
		name = name != null? name.toLowerCase().replace(' ', '_') : "null"; // On formatte bien l'id de l'inv
		if (!MENUS.containsKey(name)) return; // Si aucun inv avec cet id n'existe, on fait rien
		MENUS.get(name).open(player); // Sinon, on ouvre l'inv avec cet id à ce joueur
	}

	public static AbstractMenu get(String name) {
		name = name != null? name.toLowerCase().replace(' ', '_') : "null"; // On formatte bien l'id de l'inv
		return MENUS.containsKey(name)? MENUS.get(name) : null; // On retourne l'inv avec cet id s'il existe
	}

}
