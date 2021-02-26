package com.game.galaxyInvaders.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 2/25/2021.
 * Singleton class
 */

public class BaseApplicationClass extends JFrame {

    private BaseApplicationClass(){
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    private static class BaseApplicationClassHolder {
        private static final BaseApplicationClass INSTANCE = new BaseApplicationClass();
    }

    public static BaseApplicationClass getInstance() {
        return BaseApplicationClassHolder.INSTANCE;
    }
}
