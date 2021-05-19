package com.game.galaxyInvaders.controller;

import com.game.galaxyInvaders.models.prototype.Enemy;

import java.awt.*;

/**
 * Created by AnDrEy on 5/9/2021.
 */
public interface INaveController {

    void move(int i);
    void paintNave(Graphics g);
}
