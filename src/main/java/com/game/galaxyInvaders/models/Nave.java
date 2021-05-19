package com.game.galaxyInvaders.models;

import java.io.Serializable;

/**
 * Created by AnDrEy on 4/29/2021.
 */
public class Nave implements Serializable {


    private static final long serialVersionUID = 1L;

    private int _posX;
    private int _posY;
    private int _live;
    private int _width;
    private int _high;

    private Shot _shot;

    public Nave() {
        this._posX = 0;
        this._posY = 0;
        this._live = 0;
        this._width = 0;
        this._high = 0;
    }

    public Nave(int posX, int posY, int live, int width, int high) {
        this._posX = posX;
        this._posY = posY;
        this._live = live;
        this._width = width;
        this._high = high;
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

    public int getLive() {
        return _live;
    }

    public void setLive(int live) {
        this._live = live;
    }

    public int getWidth() {
        return _width;
    }

    public void setWidth(int width) {
        this._width = width;
    }

    public int getHigh() {
        return _high;
    }

    public void setHigh(int high) {
        this._high = high;
    }

    public Shot getShot() {
        return _shot;
    }

    public void setShot(Shot shot) {
        this._shot = shot;
    }
}
