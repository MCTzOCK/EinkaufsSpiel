package de.feja111.game;

import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;

public class DrPC {
    //public static DiscordRichPresence rich = new DiscordRichPresence.Builder("fwhf").setDetails("details").build();

    /*
    public static void start() {
        DiscordRPC.discordInitialize("752562436871159844", null, true);
        rich.setAutoSynch(true);
        DiscordRPC.discordUpdatePresence(rich);
    }
     */
    public static void startup(){
        DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler((user) -> {
            System.out.println("Welcome " + user.username + "#" + user.discriminator + "!");
        }).build();
        DiscordRPC.discordInitialize("752562436871159844", handlers, true);
    }

}
