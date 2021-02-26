package com.game.galaxyInvaders;

import com.game.galaxyInvaders.controller.SpaceInvadersWindowsController;
import com.game.galaxyInvaders.models.SpaceInvadersDAO;
import com.game.galaxyInvaders.view.BaseApplicationClass;
import com.game.galaxyInvaders.view.Home;

import java.awt.*;

/**
 * Created by AnDrEy on 2/19/2021.
 */
public class Main {

    /*public static void main(String[] args) {
        SpaceInvadersWindowsController window = new SpaceInvadersWindowsController(new SpaceInvadersDAO(false));
        window.setVisible(true);
    }*/
    //public static  BaseApplicationClass baseApplicationClass = BaseApplicationClass.getInstance();
    public static void main(String[] args) {
        SpaceInvadersWindowsController window = new SpaceInvadersWindowsController();
        window.startApplication();
    }
}
