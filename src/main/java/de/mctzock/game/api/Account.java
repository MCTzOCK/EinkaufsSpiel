package de.mctzock.game.api;

public class Account {

    private String name;
    private String password;
    private Boolean active;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void verify() {
        if(this.password.equals("0")) {
            this.active = false;
            System.out.println("[ACCOUNTS] The current account " + this.getName() + " is not verified!");
        }
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
