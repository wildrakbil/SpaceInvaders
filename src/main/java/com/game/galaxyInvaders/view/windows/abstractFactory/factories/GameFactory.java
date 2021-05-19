package com.game.galaxyInvaders.view.windows.abstractFactory.factories;

import com.game.galaxyInvaders.controller.keyWindows.GameKeyListener;
import com.game.galaxyInvaders.view.windows.abstractFactory.components.GameJPanel;
import com.game.galaxyInvaders.view.windows.abstractFactory.components.IJPanel;

import java.awt.event.KeyListener;

/**
 * Created by AnDrEy on 5/7/2021.
 */
public class GameFactory implements IGUIFactory {
    @Override
    public IJPanel createCardLayout() {
        return new GameJPanel();
    }

    @Override
    public KeyListener createKeyListener() {
        return new GameKeyListener();
    }
}
