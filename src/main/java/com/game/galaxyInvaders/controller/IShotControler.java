package com.game.galaxyInvaders.controller;

import com.game.galaxyInvaders.models.Nave;
import com.game.galaxyInvaders.models.prototype.Enemy;

import java.awt.*;

/**
 * Created by AnDrEy on 5/19/2021.
 */
public interface IShotControler {

    void shot(Nave nave);

    void shotEnemy(Enemy enemy);

    boolean hitsEnemy(Enemy enemy);

    boolean hitsNave(Enemy enemy);

    void paintPlayerShot(Graphics g);

    void paintEnemiesShot(Graphics g);
}
