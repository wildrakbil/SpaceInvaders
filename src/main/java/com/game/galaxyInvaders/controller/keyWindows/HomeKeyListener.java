package com.game.galaxyInvaders.controller.keyWindows;

import com.game.galaxyInvaders.controller.util.MusicController;
import com.game.galaxyInvaders.view.WindowSingleton;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by AnDrEy on 4/22/2021.
 */
public class HomeKeyListener implements KeyListener {



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            WindowSingleton.getInstance().changePanel("menu");
            MusicController.getInstance().stop();
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
