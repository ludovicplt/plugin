package com.ludovicplt.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.*;

public class Events implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(String.format("[§b+§r] %s %s/%s", event.getPlayer().getDisplayName(), Bukkit.getOnlinePlayers().size(), Bukkit.getServer().getMaxPlayers()));
    }
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(String.format("[§4-§r] %s", event.getPlayer().getDisplayName()));
    }

}
