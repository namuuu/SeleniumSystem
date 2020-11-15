package fr.namu.ss;

import fr.namu.ss.bungeecord.Bungee;
import fr.namu.ss.util.SetupUtil;
import org.bukkit.plugin.java.JavaPlugin;

public class SeleniumSystem extends JavaPlugin {

    public SetupUtil setup = new SetupUtil(this);

    public Bungee bungee = new Bungee(this);



    @Override
    public void onEnable() {
        setup.setup();
    }

    @Override
    public void onDisable() {

    }
}
