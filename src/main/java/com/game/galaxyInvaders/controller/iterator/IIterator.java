package com.game.galaxyInvaders.controller.iterator;

/**
 * Created by AnDrEy on 5/18/2021.
 */
public interface IIterator {

    Object primero();

    Object siguiente();

    boolean hayMas();

    Object actual();

    Object ultimo();

    Object getByPos(int posEnemy);
}
