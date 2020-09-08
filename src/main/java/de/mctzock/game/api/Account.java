package de.mctzock.game.api;

public class Account {

    private String name;
    private String password;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean isActive() {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
