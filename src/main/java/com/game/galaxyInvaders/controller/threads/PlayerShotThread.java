package com.game.galaxyInvaders.controller.threads;

import com.game.galaxyInvaders.controller.IGameController;
import com.game.galaxyInvaders.controller.IShotControler;
import com.game.galaxyInvaders.controller.impl.GameController;
import com.game.galaxyInvaders.controller.impl.ShotControler;
import com.game.galaxyInvaders.controller.iterator.IIterator;
import com.game.galaxyInvaders.models.GameContext;
import com.game.galaxyInvaders.models.prototype.Enemy;

/**
 * Created by AnDrEy on 5/10/2021.
 */
public class PlayerShotThread extends Thread {

    IGameController gameController = new GameController();
    IShotControler shotControler = new ShotControler();

    @Override
    public void run() {
        IIterator iterador = GameContext.getInstance().getEnemies().getIterador();
        while (GameContext.getInstance().getPlayer().getNave().getShot() != null) {
            try {
                int newPosY = GameContext.getInstance().getPlayer().getNave().getShot().getPosY() - 1;
                if (newPosY <= 0 && !GameContext.getInstance().getPlayer().getNave().getShot().isImpact()) {
                    GameContext.getInstance().getPlayer().getNave().setShot(null);
                } else {
                    GameContext.getInstance().getPlayer().getNave().getShot().setPosY(newPosY);
                    while (iterador.hayMas()) {
                        Enemy enemy = (Enemy) iterador.siguiente();
                        if (enemy.getLive() > 0) {
                            if (GameContext.getInstance().getPlayer().getNave().getShot() != null && shotControler.hitsEnemy(enemy)) {
                                GameContext.getInstance().getPlayer().getNave().getShot().setImpact(true);
                                enemy.setLive(enemy.getLive() - 1);
                                iterador.ultimo();
                                sleep(80);
                                GameContext.getInstance().getPlayer().getNave().setShot(null);
                            }
                        }
                    }
                    iterador.primero();
                }
                sleep(2);
                gameController.updateWindow();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
