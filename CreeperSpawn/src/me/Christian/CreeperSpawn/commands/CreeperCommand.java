package me.Christian.CreeperSpawn.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import me.Christian.CreeperSpawn.Main;

public class CreeperCommand implements CommandExecutor{
	@SuppressWarnings("unused")
	private Main plugin;

	public CreeperCommand (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("creepspawn").setExecutor(this);;
	}

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		Player p = (Player) arg0;
		Location loc = p.getLocation();
		int numCreepers = Integer.parseInt(arg3[0]);
		
		if (arg3.length == 1) {
			for (int i = 0; i < numCreepers; i++) {
				World w = p.getWorld();
				w.spawnEntity(loc, EntityType.CREEPER);
			}
		}
		else {
			Player t = Bukkit.getServer().getPlayer(arg3[1]);
			Location tLoc = t.getLocation();
			for (int i = 0; i < numCreepers; i++) {
				World w = t.getWorld();
				w.spawnEntity(tLoc, EntityType.CREEPER);
			}
		}
		return false;
	}

}
