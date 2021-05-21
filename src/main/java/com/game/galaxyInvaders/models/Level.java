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
    private int _speedEnemy;
    private int _posInitX;
    private int _posInitY;


    IPersistence persistence = new Persistence();

    public Level(int level) {
        if (level >= 1 && level <= 3) {
            ArrayList<String> data = persistence.loadData(AppSystemProperties.getPropertie("path.db.level"));
            String[] values = data.get(level).split(";");
            this._level = Integer.parseInt(values[0]);
            this._rows = Integer.parseInt(values[1]);
            this._columns = Integer.parseInt(values[2]);
            this._liveEnemy = Integer.parseInt(values[3]);
            this._speedEnemy = Integer.parseInt(values[5]);
            this._posInitX = Integer.parseInt(values[6]);
            this._posInitY = Integer.parseInt(values[7]);
        }
    }

    public int getLevel() {
        return _level;
    }
    public int getSpeedEnemy() {
        return _speedEnemy;
    }
    public int getPosInitX() {
        return _posInitX;
    }
    public int getPosInitY() {
        return _posInitY;
    }
    public int getLiveEnemy() {
        return _liveEnemy;
    }
    public int getColumns() {return _columns;}
    public int getRows() {
        return _rows;
    }

















}
