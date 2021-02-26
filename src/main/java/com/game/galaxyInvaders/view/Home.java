package com.game.galaxyInvaders.view;

import com.game.galaxyInvaders.controller.SpaceInvadersWindowsController;
import com.game.galaxyInvaders.models.SpaceInvadersDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by AnDrEy on 2/19/2021.
 */
public class Home extends JPanel implements KeyListener {

    private SpaceInvadersWindowsController spaceInvadersWindowsController;
    private SpaceInvadersDAO spaceInvadersDAO;


    public Home(SpaceInvadersDAO spaceInvadersDAO){
        this.spaceInvadersDAO = spaceInvadersDAO;
        setLayout(new BorderLayout());
        ImageIcon icono = new ImageIcon("./src/main/resources/gif/menuinicio.gif");
        JLabel jLabel = new JLabel(icono);
        Color fondo = new Color(21, 22, 25);
        setBackground(fondo);
        add(jLabel, BorderLayout.CENTER);
    }


    /**
     * While the key is pressed
     * @param e
     */
    public void keyTyped(KeyEvent e) {

    }


    /**
     * When the key goes down
     * @param e
     */
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!spaceInvadersDAO.isStarted()) {
                BaseApplicationClass baseApplicationClass = BaseApplicationClass.getInstance();
                CardLayout car = (CardLayout) baseApplicationClass.getContentPane().getLayout();
                car.show(baseApplicationClass.getContentPane(),"Menu");
            }
        }
    }

    /**
     * when the key comes up
     * @param e
     */
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            BaseApplicationClass baseApplicationClass = BaseApplicationClass.getInstance();
            CardLayout card = (CardLayout) baseApplicationClass.getContentPane().getLayout();
            card.show(baseApplicationClass.getContentPane(), "Menu");
        }

    }
}
