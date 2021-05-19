package com.game.galaxyInvaders.controller.iterator.impl;

import com.game.galaxyInvaders.controller.iterator.IAggregate;
import com.game.galaxyInvaders.controller.iterator.IIterator;
import com.game.galaxyInvaders.models.GameContext;
import com.game.galaxyInvaders.models.prototype.Calamar;
import com.game.galaxyInvaders.models.prototype.Cangrejo;
import com.game.galaxyInvaders.models.prototype.Enemy;
import com.game.galaxyInvaders.models.prototype.Pulpo;

import java.util.Vector;

/**
 * Created by AnDrEy on 5/18/2021.
 */
public class AgregateConcrete implements IAggregate {

    protected Vector enemies = new Vector();

    public AgregateConcrete() {
        this.llenar();
    }

    @Override
    public void addEnemi(Enemy enemy) {
        this.enemies.add(enemy);
    }

    @Override
    public IIterator getIterador() {
        return new IteratorConcrete(this);
    }


    public void llenar() {
        for (int i = 0; i < GameContext.getInstance().getLevel().getRows(); i++) {
            for (int j = 0; j < GameContext.getInstance().getLevel().getColumns(); j++) {
                if (i == 0) {
                    this.enemies.add(new Calamar(
                            (GameContext.getInstance().getLevel().getPosInitX() * j) + GameContext.getInstance().getLevel().getPosInitX(),
                            GameContext.getInstance().getLevel().getPosInitY(),
                            GameContext.getInstance().getLevel().getLiveEnemy(),
                            1,
                            1,
                            GameContext.getInstance().getLevel().getSpeedEnemy()));
                } else if (i == 1 || i == 2) {
                    this.enemies.add(new Pulpo(
                            (GameContext.getInstance().getLevel().getPosInitX() * j) + GameContext.getInstance().getLevel().getPosInitX(),
                            (GameContext.getInstance().getLevel().getPosInitY() * i) + GameContext.getInstance().getLevel().getPosInitY(),
                            GameContext.getInstance().getLevel().getLiveEnemy(),
                            1,
                            1,
                            GameContext.getInstance().getLevel().getSpeedEnemy()));
                } else if (i == 3 || i == 4) {
                    this.enemies.add(new Cangrejo(
                            (GameContext.getInstance().getLevel().getPosInitX() * j) + GameContext.getInstance().getLevel().getPosInitX(),
                            (GameContext.getInstance().getLevel().getPosInitY() * i) + GameContext.getInstance().getLevel().getPosInitY(),
                            GameContext.getInstance().getLevel().getLiveEnemy(),
                            1,
                            1,
                            GameContext.getInstance().getLevel().getSpeedEnemy()));
                }
            }
        }
    }
}
