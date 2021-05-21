package com.game.galaxyInvaders.controller.threads;

import com.game.galaxyInvaders.desacople.IGameController;
import com.game.galaxyInvaders.controller.impl.GameController;
import com.game.galaxyInvaders.controller.iterator.IIterator;
import com.game.galaxyInvaders.controller.GameContext;
import com.game.galaxyInvaders.models.prototype.Enemy;

/**
 * Created by AnDrEy on 5/17/2021.
 */
public class MoveEnemyThread extends Thread {

    IGameController gameController = new GameController();

    @Override
    public void run() {
        try {
            IIterator iterador = GameContext.getInstance().getEnemies().getIterador();
            while (GameContext.getInstance().isStart()) {
                while (iterador.hayMas()) {
                    Enemy enemy = (Enemy) iterador.siguiente();
                    if (!enemy.isDirection()) {
                        enemy.setPosX(enemy.getPosX() + enemy.getSpeed());
                    }else{
                        enemy.setPosX(enemy.getPosX() - enemy.getSpeed());
                    }
                    if (enemy.getPosX() > 770 || enemy.getPosX() < 0) {
                        enemy.setPosY(enemy.getPosY() + 20);
                        enemy.setDirection(!enemy.isDirection());
                    }
                }
                iterador.primero();
                sleep(80);
                gameController.updateWindow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
