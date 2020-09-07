package net.craftions.game.main;

import net.craftions.game.Game;

public class Main {

    public static void main(String[] args) {
        Boolean debug = false;
        Game game = new Game("Game", "v1.0-SNAPSHOT", debug);
        System.out.println("Welcome to " + game.getName() + " " + game.getVersion());
        System.out.println("Debug Mode: " + String.valueOf(debug));
    }
}
