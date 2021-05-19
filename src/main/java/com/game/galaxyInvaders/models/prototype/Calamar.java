package com.game.galaxyInvaders.models.prototype;

import com.game.galaxyInvaders.controller.util.AppSystemProperties;

/**
 * Created by AnDrEy on 5/9/2021.
 */
public class Calamar extends Enemy {

    public Calamar(int posX, int posY, int live, int width, int high, int speed) {
        super(posX, posY, live, width, high, speed);
        this.setPathImg(AppSystemProperties.getPropertie("path.enemy.calamar.false"));
    }
}
