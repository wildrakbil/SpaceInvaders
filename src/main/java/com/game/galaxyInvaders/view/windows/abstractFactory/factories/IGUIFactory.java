package com.game.galaxyInvaders.view.windows.abstractFactory.factories;

import com.game.galaxyInvaders.view.windows.abstractFactory.components.IJPanel;

import java.awt.event.KeyListener;

/**
 * Created by AnDrEy on 4/22/2021.
 */
public interface IGUIFactory {
    IJPanel createCardLayout();
    KeyListener createKeyListener();
}
