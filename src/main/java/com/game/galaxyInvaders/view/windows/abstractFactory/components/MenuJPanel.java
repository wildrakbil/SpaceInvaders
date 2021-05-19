package com.game.galaxyInvaders.view.windows.abstractFactory.components;

import com.game.galaxyInvaders.view.windows.factory.label.*;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 4/22/2021.
 */
public class MenuJPanel extends JPanel implements IJPanel {

    public MenuJPanel() {
        setPreferredSize(new Dimension(800, 500));
        setName("menu");
        setLayout(null);
        setOpaque(false);

        add(new LabelPlayer().getLabel());
        add(new LabelGame().getLabel());
        add(new LabelLogin().getLabel());
        add(new LabelInstructions().getLabel());
        add(new LabelScore().getLabel());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        ImageIcon background = new ImageIcon("./src/main/resources/img/menuBackground.png");
        g2.drawImage(background.getImage(), 0, 0, getSize().width, getSize().height, null);
        g2.setColor(Color.GREEN);
        g2.setFont(new Font("ArcadeClassic", Font.PLAIN, 24));
        g2.drawString("NICKNAME", 30, 40);
        g2.drawString("JUGADOR", 170, 40);
        g2.setColor(Color.GREEN);
    }

    @Override
    public JPanel create() {
        return new MenuJPanel();
    }
}
