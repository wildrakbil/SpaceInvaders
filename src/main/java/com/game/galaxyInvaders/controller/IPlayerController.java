package com.game.galaxyInvaders.controller;

import java.awt.*;

/**
 * Created by AnDrEy on 5/9/2021.
 */
public interface IPlayerController {

    void newPlayer(String name, String nickName);

    void paintHeart(Graphics g);
}
