package com.game.galaxyInvaders.view;

import com.game.galaxyInvaders.controller.util.WindowsController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 2/25/2021.
 * Pattren class
 * la aplicacion solo requiere un unico JFrame durante su ejecucion
 */
public class WindowSingleton extends JFrame {

    private static WindowSingleton _window;

    private WindowSingleton() {
        setSize(800, 500);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public static WindowSingleton getInstance() {
        createIntance();
        return _window;
    }

    private synchronized static void createIntance() {
        if (_window == null) {
            _window = new WindowSingleton();
        }
    }

    public void changePanel(String name) {
        Container container = this.getContentPane();
        if (name.equals("home")) {
            WindowsController._card.show(container, "home");
        } else if(name.equals("menu")) {
            WindowsController._card.show(container, "menu");
        }else if(name.equals("game")) {
            WindowsController._card.show(container, "game");
        }
        else{}
    }
}
