package com.game.galaxyInvaders.view;

import com.game.galaxyInvaders.models.SpaceInvadersDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AnDrEy on 2/25/2021.
 */
public class Menu extends JPanel implements ActionListener {

    private final static String NEW_PLAYER = "NEW_PLAYER";
    private final static String SELECT_PLAYER = "SELECT_PLAYER";

    private NewPayerOptions newPayerOptions;
    private JPopupMenu newPlayerPopupMenu;

    public Menu(SpaceInvadersDAO spaceInvadersDAO) {

        Color optionsColor = Color.GREEN;
        setPreferredSize(new Dimension(800, 500));
        setLayout(null);
        setOpaque(false);

        int y = 270;
        final int playerY = 1 * 30 + y;
        final int playerX = 320;

        // Titulo
        JLabel space = new JLabel("SPACE INVADERS");
        space.setForeground(Color.RED);
        space.setFont(new Font("ArcadeClassic", Font.PLAIN, 40));
        space.setBounds(5, 75, 560, 80);
        //add(space);

        newPayerOptions = new NewPayerOptions();

        JMenuItem newPlayerOption = new JMenuItem("NUEVO JUGADOR");
        newPlayerOption.setFont(new Font("ArcadeClassic", Font.PLAIN, 30));
        newPlayerOption.addActionListener(this);
        newPlayerOption.setActionCommand(NEW_PLAYER);

        newPlayerPopupMenu = new JPopupMenu();
        newPlayerPopupMenu.add(newPlayerOption);

        JLabel menuPayerOptions = new JLabel("JUGADOR");
        menuPayerOptions.setBounds(playerX, playerY, 190, 23);
        menuPayerOptions.setFont(new Font("ArcadeClassic", Font.BOLD, 30));
        menuPayerOptions.setForeground(optionsColor);
        menuPayerOptions.setAlignmentX(RIGHT_ALIGNMENT);
        menuPayerOptions.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //newPlayerPopupMenu.show(e.getComponent(), playerX * -1 , playerX * -1 );
                newPlayerPopupMenu.show(e.getComponent(), -60, 0 );
            }
        });

        add(menuPayerOptions);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals(NEW_PLAYER)) {
            newPayerOptions.showpayerOptions();
        } else {// code block
        }

    }

    /**
     * When Menu being hidden by other frames to be re-painted black-box
     *
     * @param g
     */
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

    private void payerOptions() {

    }
}
