package de.feja111.game;

import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;

public class DrPC {
    public static DiscordRichPresence rich = new DiscordRichPresence.Builder("fwhf").setDetails("details").build();

    public static void start() {
        rich.setAutoSynch(true);
        DiscordRPC.discordUpdatePresence(rich);
    }

}
