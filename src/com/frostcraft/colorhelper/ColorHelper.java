package com.frostcraft.colorhelper;

import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.ChatColor;


public class ColorHelper extends JavaPlugin {

	
	public void onEnable() {
		this.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[ColorHelper] Plugin enabled.");
		return;
			
	}

	public void onDisable() {
		this.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[ColorHelper] Plugin disabled.");
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		Player p;
		try {
			p = this.getServer().getPlayer(sender.getName());	
		}
		catch (Exception e) {
			return true;
		}
		
		
		if (cmd.getName().equalsIgnoreCase("color") ) 
		{	
			p.sendMessage(ChatColor.WHITE + "&0 " + ChatColor.BLACK + "Black");
			p.sendMessage(ChatColor.WHITE + "&1 " + ChatColor.DARK_BLUE + "Dark Blue");
			p.sendMessage(ChatColor.WHITE + "&2 " + ChatColor.DARK_GREEN + "Dark Green");
			p.sendMessage(ChatColor.WHITE + "&3 " + ChatColor.DARK_AQUA + "Dark Aqua");
			p.sendMessage(ChatColor.WHITE + "&4 " + ChatColor.DARK_RED + "Dark Red");
			p.sendMessage(ChatColor.WHITE + "&5 " + ChatColor.DARK_PURPLE + "Dark Purple");
			p.sendMessage(ChatColor.WHITE + "&6 " + ChatColor.GOLD + "Gold");
			p.sendMessage(ChatColor.WHITE + "&7 " + ChatColor.GRAY + "Gray");
			p.sendMessage(ChatColor.WHITE + "&8 " + ChatColor.DARK_GRAY + "Dark Gray");
			p.sendMessage(ChatColor.WHITE + "&9 " + ChatColor.BLUE + "Blue");
			p.sendMessage(ChatColor.WHITE + "&a " + ChatColor.GREEN + "Green");
			p.sendMessage(ChatColor.WHITE + "&b " + ChatColor.AQUA + "Aqua");
			p.sendMessage(ChatColor.WHITE + "&c " + ChatColor.RED + "Red");
			p.sendMessage(ChatColor.WHITE + "&d " + ChatColor.LIGHT_PURPLE + "Light Purple");
			p.sendMessage(ChatColor.WHITE + "&e " + ChatColor.YELLOW + "Yellow");
			p.sendMessage(ChatColor.WHITE + "&f " + ChatColor.WHITE + "White");
			p.sendMessage(ChatColor.WHITE + "&k " + ChatColor.MAGIC + "Magic");
			p.sendMessage(ChatColor.WHITE + "&l " + ChatColor.BOLD + "Bold");
			p.sendMessage(ChatColor.WHITE + "&m " + ChatColor.STRIKETHROUGH + "Strikethrough");
			p.sendMessage(ChatColor.WHITE + "&u " + ChatColor.UNDERLINE + "Underline");
			p.sendMessage(ChatColor.WHITE + "&i " + ChatColor.ITALIC + "Italic");
		}
		
		return true;
	}



}
