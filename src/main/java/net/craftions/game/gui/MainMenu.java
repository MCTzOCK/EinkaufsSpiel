package net.craftions.game.gui;

import de.mctzock.game.api.Language;
import net.craftions.game.main.Main;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends Screen{

    private JFrame f;
    private String n;

    @Override
    public void init() {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.n = "Main Menu";
        this.f = new JFrame(this.n);
        this.f.setLayout(null);
        this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.f.setSize(d.width / 4, d.height / 2);
        this.f.setLocationRelativeTo(null);
        this.f.setResizable(false);

        // content
        JLabel l0 = new JLabel(Main.g.getName());
        l0.setBounds(((int) (this.f.getWidth() - (this.f.getWidth() / 1.65))), ((int) (this.f.getHeight() - (this.f.getHeight() / 1))), ((int) (this.f.getWidth() / 2.5)), ((int) (this.f.getHeight() / 5)));
        Integer s1 = 35 - Main.g.getName().length();
        l0.setFont(new Font("X-Files", 0, s1));
        JButton b0 = new JButton(Language.de_main_button_play);
        b0.setBounds(((int)(this.f.getWidth() - (this.f.getWidth() / 1.5))), ((int) (this.f.getHeight() - (this.f.getHeight() / 5.1))), ((int) (this.f.getWidth() / 3)), ((int) (this.f.getHeight() / 10)));
        Integer s0 = b0.getHeight() / 3;
        b0.setFont(new Font("X-Files", 0, s0));
        this.f.add(b0);
        this.f.add(l0);
        this.f.setVisible(true);
    }
}
