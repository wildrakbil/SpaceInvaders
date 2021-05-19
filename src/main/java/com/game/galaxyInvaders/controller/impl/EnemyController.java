package com.game.galaxyInvaders.controller.impl;

import com.game.galaxyInvaders.controller.IEnemyController;
import com.game.galaxyInvaders.controller.iterator.IIterator;
import com.game.galaxyInvaders.models.GameContext;
import com.game.galaxyInvaders.models.prototype.Enemy;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 5/19/2021.
 */
public class EnemyController implements IEnemyController{
    @Override
    public void paintEnemies(Graphics g) {
        IIterator iterador = GameContext.getInstance().getEnemies().getIterador();
        while (iterador.hayMas()) {
            Enemy enemy = (Enemy) iterador.siguiente();
            if (enemy.getLive() > 0) {
                ImageIcon icono = new ImageIcon(enemy.getPathImg());
                g.drawImage(icono.getImage(), enemy.getPosX(), enemy.getPosY(), null);
            }
        }
    }
}
