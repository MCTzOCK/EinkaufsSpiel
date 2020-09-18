package net.craftions.game.gui;

import de.mctzock.game.api.Account;
import net.craftions.game.main.Main;

import javax.swing.*;
import java.awt.*;


public class Ingame extends Screen {

    private JFrame f;

    @Override
    public void init() {
        Account acc = Main.a;
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.f = new JFrame(Main.g.getName() + " " + Main.g.getVersion());
        this.f.setUndecorated(true);
        this.f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.f.setLayout(null);

        if(!acc.isActive()){
            JLabel verify = new JLabel("Your Account is not verified! Please verify the account at http://verify.craftions.net");
            verify.setFont(new Font("sans-serif", 0, (int) d.getHeight() / 75));
            verify.setBounds(100,((int) (d.getHeight() - (d.getHeight()))),((int) d.getWidth() / 2),((int) d.getHeight() / 10));
            this.f.add(verify);
            System.out.println("Added 'not-verified' label to frame!");
        }

        this.f.requestFocus();
        this.f.setVisible(true);
        super.init();
    }
}
