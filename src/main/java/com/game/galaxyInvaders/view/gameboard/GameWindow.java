package com.game.galaxyInvaders.view.gameboard;

import com.game.galaxyInvaders.view.windows.abstractFactory.factories.IGUIFactory;

import javax.swing.*;
import java.awt.event.KeyListener;

/**
 * Created by AnDrEy on 4/22/2021.
 */
public class GameWindow {
    private JPanel jPanel;
    private KeyListener keyListener;

    public GameWindow(IGUIFactory iguiFactory) {
        this.jPanel = iguiFactory.createCardLayout().create();
        this.keyListener = iguiFactory.createKeyListener();
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public KeyListener getKeyListener() {
        return keyListener;
    }
}
