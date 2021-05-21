package com.game.galaxyInvaders.controller.impl;

import com.game.galaxyInvaders.desacople.IShotControler;
import com.game.galaxyInvaders.controller.iterator.IIterator;
import com.game.galaxyInvaders.controller.threads.PlayerShotThread;
import com.game.galaxyInvaders.controller.util.AppSystemProperties;
import com.game.galaxyInvaders.controller.GameContext;
import com.game.galaxyInvaders.models.Nave;
import com.game.galaxyInvaders.models.Shot;
import com.game.galaxyInvaders.models.prototype.Enemy;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 5/19/2021.
 */
public class ShotControler implements IShotControler {

    @Override
    public void shot(Nave nave) {
        if (nave != null) {
            if (nave.getShot() == null) {
                nave.setShot(new Shot(nave.getPosX(), 410));
                GameContext.getInstance().setPlayerShotThreads(new PlayerShotThread());
                GameContext.getInstance().getPlayerShotThreads().start();
            }
        }
    }

    @Override
    public void shotEnemy(Enemy enemy) {
        if (enemy != null) {
            if (enemy.getShot() == null) {
                enemy.setShot(new Shot(enemy.getPosX(), enemy.getPosY()));
            }
        }
    }


    @Override
    public boolean hitsEnemy(Enemy enemy) {
        int r = 8;
        if (enemy != null) {
            int cateto = GameContext.getInstance().getPlayer().getNave().getShot().getPosX() - enemy.getPosX();
            int cateto2 = GameContext.getInstance().getPlayer().getNave().getShot().getPosY() - enemy.getPosY();
            double d = Math.sqrt((cateto * cateto) + (cateto2 * cateto2));
            if (d < (r + enemy.getWidth())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hitsNave(Enemy enemy) {
        int r = 8;
        if (enemy != null) {
            int cateto = enemy.getShot().getPosX() - GameContext.getInstance().getPlayer().getNave().getPosX();
            int cateto2 = enemy.getShot().getPosY() - GameContext.getInstance().getPlayer().getNave().getPosY();
            double d = Math.sqrt((cateto * cateto) + (cateto2 * cateto2));
            if (d < (r + GameContext.getInstance().getPlayer().getNave().getWidth())) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void paintPlayerShot(Graphics g) {
        if (GameContext.getInstance().getPlayer().getNave().getShot() != null) {
            g.setColor(Color.WHITE);
            g.fillOval(
                    GameContext.getInstance().getPlayer().getNave().getShot().getPosX() + 13,
                    GameContext.getInstance().getPlayer().getNave().getShot().getPosY(),
                    7, 7);
            if (GameContext.getInstance().getPlayer().getNave().getShot().getPosY() == 0
                    || GameContext.getInstance().getPlayer().getNave().getShot().isImpact()) {
                g.drawImage(new ImageIcon(AppSystemProperties.getPropertie("path.enemy.death")).getImage(),
                        GameContext.getInstance().getPlayer().getNave().getShot().getPosX(),
                        GameContext.getInstance().getPlayer().getNave().getShot().getPosY() - 6,
                        null);
            }
        }
    }

    @Override
    public void paintEnemiesShot(Graphics g) {
        IIterator iterador = GameContext.getInstance().getEnemies().getIterador();
        while (iterador.hayMas()) {
            Enemy enemy = (Enemy) iterador.siguiente();
            if (enemy.getShot() != null) {
                g.setColor(Color.RED);
                g.fillOval(enemy.getShot().getPosX(), enemy.getShot().getPosY(), 7, 7);
            }
        }
        iterador.primero();
    }
}
