package net.Skription.WebEssentials;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Website
  extends JavaPlugin
{
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("website"))
    {
      Player p = (Player)sender;
      p.sendMessage(getConfig().getString("websitelink"));
    }
    return false;
  }
}
