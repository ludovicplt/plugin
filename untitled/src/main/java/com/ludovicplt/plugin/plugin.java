package com.ludovicplt.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import com.ludovicplt.plugin.Events;

public class plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
    }
    @Override
    public void onDisable() {

    }


}