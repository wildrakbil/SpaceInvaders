package com.game.galaxyInvaders.view;

import com.game.galaxyInvaders.controller.SpaceInvadersWindowsController;
import com.game.galaxyInvaders.models.SpaceInvadersDAO;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by AnDrEy on 2/21/2021.
 */
public class Keyboard implements KeyListener {

    private SpaceInvadersWindowsController spaceInvadersWindowsController;
    private SpaceInvadersDAO spaceInvadersDAO;

    public Keyboard(SpaceInvadersWindowsController spaceInvadersWindowsController, SpaceInvadersDAO spaceInvadersDAO) {
        this.spaceInvadersWindowsController = spaceInvadersWindowsController;
        this.spaceInvadersDAO = spaceInvadersDAO;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
