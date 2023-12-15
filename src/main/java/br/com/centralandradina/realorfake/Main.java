package br.com.centralandradina.realorfake;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 
 */
public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Hello, SpigotMC!");

		MinecraftServer server = ((CraftServer)Bukkit.getServer()).getServer();
	WorldServer world = ((CraftWorld)Bukkit.getWorlds().get(0)).getHandle();
	}

	@Override
    public void onDisable()
    {
		getLogger().info("See you again, SpigotMC!");
    }
}
