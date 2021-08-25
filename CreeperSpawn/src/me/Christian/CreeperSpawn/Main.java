package me.Christian.CreeperSpawn;

import org.bukkit.plugin.java.JavaPlugin;

import me.Christian.CreeperSpawn.commands.CreeperCommand;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new CreeperCommand(this);
	}

}
