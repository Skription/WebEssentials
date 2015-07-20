package net.Skription.WebEssentials;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Forums
  extends JavaPlugin
{
  public void onEnable()
  {
    getLogger().info("WebEssentials has been enabled!");
  }
  
  public void onDisable()
  {
    getLogger().info("WebEssentials has been disabled!");
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("forums"))
    {
      Player p = (Player)sender;
      p.sendMessage(getConfig().getString("forumslink"));
    }
    return false;
  }
}
