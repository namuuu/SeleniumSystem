package fr.namu.ss.bungeecord;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import fr.namu.ss.SeleniumSystem;
import org.bukkit.entity.Player;

public class BCConnectServer {

    private Bungee bungee;

    public BCConnectServer(Bungee bungee) {
        this.bungee = bungee;
    }

    public void sendToServer(Player player, String server, String reason) {

        if(reason != null)
            player.sendMessage(reason);

        ByteArrayDataOutput output = ByteStreams.newDataOutput();
        output.writeUTF("Connect");
        output.writeUTF(server);
        player.sendPluginMessage(bungee.ss, "BungeeCord", output.toByteArray());

    }
}
