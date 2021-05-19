package com.game.galaxyInvaders.controller.threads;

import com.game.galaxyInvaders.controller.IShotControler;
import com.game.galaxyInvaders.controller.impl.ShotControler;
import com.game.galaxyInvaders.controller.iterator.IIterator;
import com.game.galaxyInvaders.models.GameContext;
import com.game.galaxyInvaders.models.prototype.Enemy;

/**
 * Created by AnDrEy on 5/10/2021.
 */
public class EnemiesCreateShotThread extends Thread {
    IShotControler shotControler = new ShotControler();

    @Override
    public void run() {
        try {
            while (GameContext.getInstance().isStart()) {
                if (GameContext.getInstance().getEnemies() != null) {
                    IIterator iterador = GameContext.getInstance().getEnemies().getIterador();
                    int posEnemy = (int) (Math.random() * 49);
                    Enemy enemy = (Enemy) iterador.getByPos(posEnemy);
                    shotControler.shotEnemy(enemy);
                    sleep(800);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
}
