package com.game.galaxyInvaders.models;

import com.game.galaxyInvaders.controller.util.AppSystemProperties;
import com.game.galaxyInvaders.models.method.IPersistence;
import com.game.galaxyInvaders.models.method.Persistence;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by AnDrEy on 5/9/2021.
 */
public class Level implements Serializable {


    private static final long serialVersionUID = 1L;
    private int _level;
    private int _rows;
    private int _columns;
    private int _liveEnemy;
    private int _amountEnemies;
    private int _speedEnemy;
    private int _posInitX;
    private int _posInitY;
    private int _width;
    private int _high;


    IPersistence persistence = new Persistence();

    public Level(int level) {
        if (level >= 1 && level <= 3) {
            ArrayList<String> data = persistence.loadData(AppSystemProperties.getPropertie("path.db.level"));
            String[] values = data.get(level).split(";");
            this._level = Integer.parseInt(values[0]);
            this._rows = Integer.parseInt(values[1]);
            this._columns = Integer.parseInt(values[2]);
            this._liveEnemy = Integer.parseInt(values[3]);
            this._amountEnemies = Integer.parseInt(values[4]);
            this._speedEnemy = Integer.parseInt(values[5]);
            this._posInitX = Integer.parseInt(values[6]);
            this._posInitY = Integer.parseInt(values[7]);
            this._width = Integer.parseInt(values[8]);
            this._high = Integer.parseInt(values[9]);
        }
    }

    public int getLevel() {
        return _level;
    }

    public void setLevel(int level) {
        this._level = level;
    }

    public int getSpeedEnemy() {
        return _speedEnemy;
    }

    public void setSpeedEnemy(int speedEnemy) {
        this._speedEnemy = speedEnemy;
    }

    public int getPosInitX() {
        return _posInitX;
    }

    public void setPosInitX(int posInitX) {
        this._posInitX = posInitX;
    }

    public int getPosInitY() {
        return _posInitY;
    }

    public void setPosInitY(int posInitY) {
        this._posInitY = posInitY;
    }

    public int getLiveEnemy() {
        return _liveEnemy;
    }

    public void setLiveEnemy(int liveEnemy) {
        this._liveEnemy = liveEnemy;
    }

    public int getColumns() {
        return _columns;
    }

    public void setColumns(int columns) {
        this._columns = columns;
    }

    public int getRows() {
        return _rows;
    }

    public void setRows(int rows) {
        this._rows = rows;
    }

    public int getAmountEnemies() {
        return _amountEnemies;
    }

    public void setAmountEnemies(int amountEnemies) {
        this._amountEnemies = amountEnemies;
    }

    public int getWidth() {
        return _width;
    }

    public void setWidth(int _width) {
        this._width = _width;
    }

    public int getHigh() {
        return _high;
    }

    public void setHigh(int _high) {
        this._high = _high;
    }
}
