package com.game.galaxyInvaders.controller;

import com.game.galaxyInvaders.models.SpaceInvadersDAO;
import com.game.galaxyInvaders.view.BaseApplicationClass;
import com.game.galaxyInvaders.view.Home;
import com.game.galaxyInvaders.view.Menu;

import java.awt.*;
import java.io.File;

/**
 * Created by AnDrEy on 2/19/2021.
 */
public class SpaceInvadersWindowsController {

    private SpaceInvadersDAO spaceInvadersDAO;

    public void startApplication() {
        BaseApplicationClass baseApplicationClass = BaseApplicationClass.getInstance();
        spaceInvadersDAO = new SpaceInvadersDAO(false);//TODO: improvement oportunit

        baseApplicationClass.getContentPane().setLayout(new CardLayout());

        Home home = new Home(spaceInvadersDAO);
        Menu menu = new Menu(spaceInvadersDAO);

        baseApplicationClass.addKeyListener(home); // add home KeyListener in baseApplicationClass

        baseApplicationClass.getContentPane().add(home);
        baseApplicationClass.getContentPane().add(menu);
        baseApplicationClass.getContentPane().getLayout().addLayoutComponent("Home",home);
        baseApplicationClass.getContentPane().getLayout().addLayoutComponent("Menu",menu);

        CardLayout card = (CardLayout) baseApplicationClass.getContentPane().getLayout();
        card.show(baseApplicationClass.getContentPane(), "Home");

        baseApplicationClass.setVisible(true);

        File file = new File("./src/main/resources/wav/spaceinvaders.wav");
        MusicController musicController = new MusicController();
        musicController.playMusic(file);
    }
}
