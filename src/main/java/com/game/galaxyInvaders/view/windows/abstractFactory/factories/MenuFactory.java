package com.game.galaxyInvaders.view.windows.abstractFactory.factories;

import com.game.galaxyInvaders.view.windows.abstractFactory.components.IJPanel;
import com.game.galaxyInvaders.view.windows.abstractFactory.components.MenuJPanel;
import com.game.galaxyInvaders.controller.keyWindows.MenuKeyListener;

import java.awt.event.KeyListener;

/**
 * Created by AnDrEy on 4/22/2021.
 */
public class MenuFactory implements IGUIFactory{
    @Override
    public IJPanel createCardLayout() {
        return new MenuJPanel();
    }

    @Override
    public KeyListener createKeyListener() {
        return new MenuKeyListener();
    }
}
