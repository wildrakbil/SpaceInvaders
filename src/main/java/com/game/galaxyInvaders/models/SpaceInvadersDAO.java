package com.game.galaxyInvaders.models;

/**
 * Created by AnDrEy on 2/19/2021.
 */
public class SpaceInvadersDAO {

    private boolean started;

    public SpaceInvadersDAO(boolean started) {
        this.started = started;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
}
