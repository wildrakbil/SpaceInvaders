package com.game.galaxyInvaders.controller.threads;

import com.game.galaxyInvaders.controller.IShotControler;
import com.game.galaxyInvaders.controller.impl.ShotControler;
import com.game.galaxyInvaders.controller.iterator.IIterator;
import com.game.galaxyInvaders.controller.state.context.AlertStateContext;
import com.game.galaxyInvaders.controller.state.impl.DeadState;
import com.game.galaxyInvaders.controller.state.impl.Survival2State;
import com.game.galaxyInvaders.controller.state.impl.SurvivalState;
import com.game.galaxyInvaders.models.GameContext;
import com.game.galaxyInvaders.models.prototype.Enemy;

/**
 * Created by AnDrEy on 5/10/2021.
 */
public class EnemiesShotThread extends Thread {

    IShotControler shotControler = new ShotControler();

    @Override
    public void run() {
        try {
            IIterator iterador = null;
            while (GameContext.getInstance().isStart()) {
                if (GameContext.getInstance().getEnemies() != null) {
                    iterador = GameContext.getInstance().getEnemies().getIterador();
                    while (iterador.hayMas()) {
                        Enemy enemy = (Enemy) iterador.siguiente();
                        if (enemy.getShot() != null) {
                            int newPosY = enemy.getShot().getPosY() + 5;
                            if (newPosY <= 500) {
                                enemy.getShot().setPosY(newPosY);
                                if (shotControler.hitsNave(enemy)) {
                                    if (GameContext.getInstance().getPlayer().getNave().getLive() > 0) {
                                        GameContext.getInstance().getPlayer().getNave().setLive(
                                                GameContext.getInstance().getPlayer().getNave().getLive() - 1);
                                        AlertStateContext stateContext = new AlertStateContext();
                                        if (GameContext.getInstance().getPlayer().getNave().getLive() == 2) {
                                            stateContext.setState(new SurvivalState());
                                        } else if (GameContext.getInstance().getPlayer().getNave().getLive() == 1) {
                                            stateContext.setState(new Survival2State());
                                        } else if (GameContext.getInstance().getPlayer().getNave().getLive() == 0) {
                                            stateContext.setState(new DeadState());
                                            AnimationPlayerDeadThread animationPlayerThread = new AnimationPlayerDeadThread();
                                            animationPlayerThread.start();
                                        }
                                        stateContext.alert();
                                    }
                                    enemy.setShot(null);
                                }
                            } else {
                                enemy.setShot(null);
                            }
                        }
                    }
                    iterador.primero();
                    sleep(60);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
