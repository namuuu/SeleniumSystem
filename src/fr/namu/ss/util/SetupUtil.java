package fr.namu.ss.util;

import fr.namu.ss.SeleniumSystem;
import fr.namu.ss.commands.HubCMD;

public class SetupUtil {

    public SeleniumSystem ss;

    public SetupUtil(SeleniumSystem ss) {
        this.ss = ss;
    }

    public void setup() {
        setPluginChannel();
        enableCommands();
    }

    private void enableCommands() {
        ss.getCommand("hub").setExecutor(new HubCMD(this.ss));
    }

    private void setPluginChannel() {
        this.ss.getServer().getMessenger().registerOutgoingPluginChannel(this.ss, "BungeeCord");
        this.ss.getServer().getMessenger().registerIncomingPluginChannel(this.ss, "BungeeCord", this.ss.bungee);
    }
}
