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

		for (OfflinePlayer offPlayer : Bukkit.getServer().getOfflinePlayers()) {
			getLogger().info(offPlayer.getName());
		}
	}

	@Override
    public void onDisable()
    {
		getLogger().info("See you again, SpigotMC!");
    }
}
