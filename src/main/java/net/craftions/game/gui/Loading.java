package net.craftions.game.gui;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Loading extends Screen {

    private JFrame f;

    @Override
    public void init() {
        final Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.f = new JFrame("Loading...");
        this.f.setAlwaysOnTop(true);
        this.f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.f.setSize(((int) (d.getWidth() / 3)), ((int) (d.getHeight() / 2)));
        this.f.setLocationRelativeTo(null);
        this.f.setLayout(null);
        this.f.setUndecorated(true);
        this.f.setBackground(new Color(255, 255, 255, 1));
        JLabel l0 = new JLabel();
        l0.setIcon(new ImageIcon(getClass().getResource("/assets/logos/craftions.png")));
        l0.setBounds(this.f.getWidth() / 3, ((int) (this.f.getHeight() / 3)), 256, 256);
        this.f.add(l0);
        this.f.setVisible(true);
        try {
            TimeUnit.SECONDS.sleep(2);
            l0.setIcon(new ImageIcon(getClass().getResource("/assets/logos/mctzock.png")));
            this.f.repaint();
            new Thread(new Runnable() {
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                        Ingame i = new Ingame();
                        f.setVisible(false);
                        i.init();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.init();
    }
}
