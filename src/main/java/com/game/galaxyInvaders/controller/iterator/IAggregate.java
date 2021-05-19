package com.game.galaxyInvaders.controller.iterator;

import com.game.galaxyInvaders.models.prototype.Enemy;

/**
 * Created by AnDrEy on 5/18/2021.
 */
public interface IAggregate {
    IIterator getIterador();
    void addEnemi(Enemy enemy);
}
