package com.game.galaxyInvaders.controller.keyWindows;

import com.game.galaxyInvaders.desacople.INaveController;
import com.game.galaxyInvaders.desacople.IShotControler;
import com.game.galaxyInvaders.controller.impl.NaveController;
import com.game.galaxyInvaders.controller.impl.ShotControler;
import com.game.galaxyInvaders.controller.GameContext;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by AnDrEy on 5/7/2021.
 */
public class GameKeyListener implements KeyListener {

    INaveController _naveController = new NaveController();
    IShotControler _shotControler = new ShotControler();

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            _naveController.move(-1);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            _naveController.move(1);
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            _shotControler.shot(GameContext.getInstance().getPlayer().getNave());
        } else {
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
