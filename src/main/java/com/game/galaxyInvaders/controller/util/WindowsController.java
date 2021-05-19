package com.game.galaxyInvaders.controller.util;

import com.game.galaxyInvaders.view.WindowSingleton;
import com.game.galaxyInvaders.view.gameboard.GameWindow;
import com.game.galaxyInvaders.view.windows.abstractFactory.factories.GameFactory;
import com.game.galaxyInvaders.view.windows.abstractFactory.factories.HomeFactory;
import com.game.galaxyInvaders.view.windows.abstractFactory.factories.IGUIFactory;
import com.game.galaxyInvaders.view.windows.abstractFactory.factories.MenuFactory;

import java.awt.*;
import java.io.File;

/**
 * Created by AnDrEy on 2/19/2021.
 */
public class WindowsController {

    public static CardLayout _card = new CardLayout();

    public void startApplication() {
        WindowSingleton windows = WindowSingleton.getInstance();
        Container container = windows.getContentPane();
        container.setLayout(_card);

        IGUIFactory home = new HomeFactory();
        GameWindow gameHomeWindow = new GameWindow(home);
        container.add(gameHomeWindow.getjPanel());
        _card.addLayoutComponent(gameHomeWindow.getjPanel(), "home");
        windows.addKeyListener(gameHomeWindow.getKeyListener());

        IGUIFactory menu = new MenuFactory();
        GameWindow gameMenuWindow = new GameWindow(menu);
        container.add(gameMenuWindow.getjPanel());
        _card.addLayoutComponent(gameMenuWindow.getjPanel(), "menu");

        IGUIFactory game = new GameFactory();
        GameWindow gameGameWindow = new GameWindow(game);
        container.add(gameGameWindow.getjPanel());
        _card.addLayoutComponent(gameGameWindow.getjPanel(), "game");
        windows.addKeyListener(gameGameWindow.getKeyListener());

        _card.show(container, "home");
        container.setLayout(_card);

        MusicController.getInstance().addSong(new File(AppSystemProperties.getPropertie("music.home")));
        MusicController.getInstance().play();
        windows.setVisible(true);
    }
}
