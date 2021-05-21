package com.game.galaxyInvaders.controller.threads;

import com.game.galaxyInvaders.desacople.IGameController;
import com.game.galaxyInvaders.controller.impl.GameController;
import com.game.galaxyInvaders.controller.iterator.IIterator;
import com.game.galaxyInvaders.controller.util.AppSystemProperties;
import com.game.galaxyInvaders.controller.GameContext;
import com.game.galaxyInvaders.models.prototype.Calamar;
import com.game.galaxyInvaders.models.prototype.Cangrejo;
import com.game.galaxyInvaders.models.prototype.Enemy;
import com.game.galaxyInvaders.models.prototype.Pulpo;

/**
 * Created by AnDrEy on 5/17/2021.
 */
public class AnimationEnemyThread extends Thread {

    IGameController gameController = new GameController();

    @Override
    public void run() {
        try {
            IIterator iterador = GameContext.getInstance().getEnemies().getIterador();
            boolean img = true;
            while (GameContext.getInstance().isStart()) {
                sleep(500 + 500 * GameContext.getInstance().getLevel().getLevel());
                while (iterador.hayMas()) {
                    Enemy enemy = (Enemy) iterador.siguiente();
                    if (enemy.getLive() > 0) {
                        if (enemy instanceof Calamar) {
                            String pat = String.format("path.enemy.calamar.%s", String.valueOf(img));
                            enemy.setPathImg(AppSystemProperties.getPropertie(pat));
                        } else if (enemy instanceof Pulpo) {
                            enemy.setPathImg(AppSystemProperties.getPropertie(String.format("path.enemy.pulpo.%s", String.valueOf(img))));
                        } else if (enemy instanceof Cangrejo) {
                            enemy.setPathImg(AppSystemProperties.getPropertie(String.format("path.enemy.cangrejo.%s", String.valueOf(img))));
                        }
                    }
                }
                img = !img;
                iterador.primero();
                gameController.updateWindow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
