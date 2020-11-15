package fr.namu.ss.commands;

import fr.namu.ss.SeleniumSystem;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HubCMD implements CommandExecutor {

    private SeleniumSystem ss;

    public HubCMD(SeleniumSystem ss) {
        this.ss = ss;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player) {
            this.ss.bungee.connectServer.sendToServer((Player)sender, "lobby1", null);
        }

        return true;
    }
}

