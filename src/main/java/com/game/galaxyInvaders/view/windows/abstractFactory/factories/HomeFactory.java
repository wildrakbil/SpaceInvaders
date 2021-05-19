package com.game.galaxyInvaders.view.windows.abstractFactory.factories;

import com.game.galaxyInvaders.view.windows.abstractFactory.components.HomeJPanel;
import com.game.galaxyInvaders.view.windows.abstractFactory.components.IJPanel;
import com.game.galaxyInvaders.controller.keyWindows.HomeKeyListener;

import java.awt.event.KeyListener;

/**
 * Created by AnDrEy on 4/22/2021.
 */
public class HomeFactory implements IGUIFactory {
    @Override
    public IJPanel createCardLayout() {
        return new HomeJPanel();
    }

    @Override
    public KeyListener createKeyListener() {
        return new HomeKeyListener();
    }
}
