package com.game.galaxyInvaders.models.prototype;

import com.game.galaxyInvaders.models.Nave;

/**
 * Created by AnDrEy on 5/9/2021.
 */
public abstract class Enemy extends Nave implements Cloneable {

    private String _pathImg;
    private int _speed;
    private boolean _direction;

    public Enemy(int posX, int posY, int live, int width, int high,int speed) {
        super(posX, posY, live, width, high);
        this._speed = speed;
    }

    public String getPathImg() {
        return _pathImg;
    }

    public void setPathImg(String pathImg) {
        this._pathImg = pathImg;
    }

    public int getSpeed() {
        return _speed;
    }

    public void setSpeed(int speed) {
        this._speed = speed;
    }

    public boolean isDirection() {
        return _direction;
    }

    public void setDirection(boolean direction) {
        this._direction = direction;
    }
}
