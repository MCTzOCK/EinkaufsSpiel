package net.craftions.game;

public class Game {

    private String name;
    private String version;
    private Boolean debug;

    public Game(String name, String version, Boolean debug) {
        this.name = name;
        this.version = version;
        this.debug = debug;
    }

    public void start() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getDebug() {
        return debug;
    }
}
