package fr.namu.ss.bungeecord;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import fr.namu.ss.SeleniumSystem;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class Bungee implements PluginMessageListener {

    public SeleniumSystem ss;

    public BCConnectServer connectServer = new BCConnectServer(this);

    public Bungee(SeleniumSystem ss) {
        this.ss = ss;
    }

    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] args) {
        if(!channel.equals("BungeeCord"))
            return;

        ByteArrayDataInput input = ByteStreams.newDataInput(args);
        String subchannel = input.readUTF();
    }
}
