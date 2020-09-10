package de.feja111.game;


import com.github.psnrigner.discordrpcjava.*;

import java.util.Scanner;


public class DrPC {

    public static DiscordRpc discordRpc = new DiscordRpc();

    public static void startup() {


        DiscordEventHandler discordEventHandler = new DiscordEventHandler() {
            @Override
            public void ready() {
                System.err.println("READY");
            }


            @Override
            public void disconnected(ErrorCode errorCode, String message) {
                System.err.println("DISCONNECTED : " + errorCode + " " + message);
            }

            @Override
            public void errored(ErrorCode errorCode, String message) {
                System.err.println("ERRORED : " + errorCode + " " + message);
            }

            @Override
            public void joinGame(String joinSecret) {
                System.err.println("JOIN GAME : " + joinSecret);
            }

            @Override
            public void spectateGame(String spectateSecret) {
                System.err.println("SPECTATE GAME : " + spectateSecret);
            }


            @Override
            public void joinRequest(DiscordJoinRequest joinRequest) {
                System.err.println("JOIN REQUEST : " + joinRequest);
            }
        };

        try {
            discordRpc.init("752562436871159844", discordEventHandler, true, null);

            Thread.sleep(5000L);
            discordRpc.runCallbacks();

            long start = System.currentTimeMillis() / 1000L;
            long end = System.currentTimeMillis() / 1000L + 300L;

            for (int i = 0; i < 60; ++i) {
                DiscordRichPresence discordRichPresence = new DiscordRichPresence();
                discordRichPresence.setState("Developing");
                discordRichPresence.setDetails("Java | Discord RPC API");
                discordRichPresence.setStartTimestamp(start);
                discordRichPresence.setEndTimestamp(end);
                discordRichPresence.setLargeImageKey("icon-large");
                discordRichPresence.setSmallImageKey("icon-small");
                discordRichPresence.setPartyId("ALONE");
                discordRichPresence.setPartySize(1);
                discordRichPresence.setPartyMax(3);
                discordRichPresence.setMatchSecret("hello");
                discordRichPresence.setJoinSecret("join");
                discordRichPresence.setSpectateSecret("look");
                discordRichPresence.setInstance(false);

                discordRpc.updatePresence(discordRichPresence);

                Thread.sleep(5000L);

                discordRpc.runCallbacks();

                Thread.sleep(5000L);
            }
        } catch (InterruptedException ignored) {
        } finally {
            discordRpc.shutdown();

        }
    }

}
