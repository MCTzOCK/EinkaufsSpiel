package net.craftions.game.gui;

import net.craftions.game.main.Main;

import javax.swing.*;


public class Ingame extends Screen{

    private JFrame f;

    @Override
    public void init() {

        this.f = new JFrame(Main.g.getName() + " " + Main.g.getVersion());
        this.f.setUndecorated(true);
        this.f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.f.requestFocus();
        this.f.setVisible(true);
        super.init();
    }
}
