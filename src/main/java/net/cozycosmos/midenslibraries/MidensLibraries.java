package net.cozycosmos.midenslibraries;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MidensLibraries extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Miden's Libraries Loaded");

    }

    @Override
    public void onDisable() {

    }
}
