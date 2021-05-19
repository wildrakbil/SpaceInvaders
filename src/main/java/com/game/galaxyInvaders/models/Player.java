package com.game.galaxyInvaders.models;

import com.game.galaxyInvaders.controller.util.AppSystemProperties;

import java.io.Serializable;

/**
 * Created by AnDrEy on 4/29/2021.
 */
public class Player implements Serializable {


    private static final long serialVersionUID = 1L;

    private String _nickname;
    private String _name;
    private int _shotsCount;
    private Nave _nave;
    private String _state;
    private String _pathImgNave;

    public Player(String nickname, String name) {
        this._nickname = nickname;
        this._name = name;
        this._state = AppSystemProperties.getPropertie("path.player.heart1");
        this._pathImgNave = AppSystemProperties.getPropertie("path.ally1.0");
    }

    public String getNickname() {
        return _nickname;
    }

    public void setNickname(String nickname) {
        this._nickname = nickname;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public int getShotsCount() {
        return _shotsCount;
    }

    public void setShotsCount(int shotsCount) {
        this._shotsCount = shotsCount;
    }

    public Nave getNave() {
        return _nave;
    }

    public void setNave(Nave nave) {
        this._nave = nave;
    }

    public String getState() {
        return _state;
    }

    public void setState(String state) {
        this._state = state;
    }

    public String getPathImgNave() {
        return _pathImgNave;
    }

    public void setPathImgNave(String pathImgNave) {
        this._pathImgNave = pathImgNave;
    }
}
