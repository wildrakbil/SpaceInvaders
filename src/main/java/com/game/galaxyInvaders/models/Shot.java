package com.game.galaxyInvaders.models;

import java.io.Serializable;

/**
 * Created by AnDrEy on 5/10/2021.
 */
public class Shot implements Serializable {


    private static final long serialVersionUID = 1L;

    private boolean _impact;
    private int _posX;
    private int _posY;

    public Shot(int posX, int posY) {
        this._posX = posX;
        this._posY = posY;
        this._impact = false;
    }

    public boolean isImpact() {
        return _impact;
    }

    public void setImpact(boolean impact) {
        this._impact = impact;
    }

    public int getPosX() {
        return _posX;
    }

    public void setPosX(int posX) {
        this._posX = posX;
    }

    public int getPosY() {
        return _posY;
    }

    public void setPosY(int posY) {
        this._posY = posY;
    }
}
