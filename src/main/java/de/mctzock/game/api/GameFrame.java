package de.mctzock.game.api;

import javax.swing.*;

public class GameFrame {

    private String title;
    private Boolean fullscreen;
    private Boolean visible;
    private JFrame f;
    private Integer width, height;

    public GameFrame(String title, Boolean fullscreen, Boolean visible, Integer width, Integer height) {
        this.title = title;
        this.fullscreen = fullscreen;
        this.visible = visible;
        this.width = width;
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(Boolean fullscreen) {
        this.fullscreen = fullscreen;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public void init() {
        this.f = new JFrame(this.title);
        this.f.setVisible(this.visible);

    }

    private void changeFullscreen() {
        if(this.fullscreen) {
            this.f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }else {
            this.f.setSize(this.width, this.height);
        }
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
