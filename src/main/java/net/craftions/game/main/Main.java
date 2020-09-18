package net.craftions.game.main;

import de.mctzock.game.api.Account;
import net.craftions.game.Game;

public class Main {

    public static Game g;
    public static Account a;

    public static void main(String[] args) {
        Boolean debug = false;
        Game game = new Game("Game", "v1.0-SNAPSHOT", debug);
        g = game;
        System.out.println("Welcome to " + game.getName() + " " + game.getVersion());
        System.out.println("Debug Mode: " + String.valueOf(debug));
        a = new Account("Dev", "1");
        a.verify();
        System.out.println("Setting Account to " + a.getName());
        game.start();
    }
}
