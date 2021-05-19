package com.game.galaxyInvaders.controller.iterator.impl;

import com.game.galaxyInvaders.controller.iterator.IIterator;

/**
 * Created by AnDrEy on 5/18/2021.
 */
public class IteratorConcrete implements IIterator {

    private AgregateConcrete _agregado;
    private int _actualPos = 0;

    public IteratorConcrete(AgregateConcrete agregado) {
        this._agregado = agregado;
    }

    @Override
    public Object primero() {
        Object obj = null;
        if (this._agregado.enemies.isEmpty() == false) {
            this._actualPos = 0;
            obj = this._agregado.enemies.firstElement();
        }
        return obj;
    }

    @Override
    public Object siguiente() {
        Object obj = null;
        if ((this._actualPos) < this._agregado.enemies.size()) {
            obj = this._agregado.enemies.elementAt(this._actualPos);
            this._actualPos = this._actualPos + 1;
        }
        return obj;
    }

    @Override
    public boolean hayMas() {
        boolean ok = false;
        if (this._actualPos < (this._agregado.enemies.size())) {
            ok = true;
        }
        return ok;
    }

    @Override
    public Object actual() {
        Object obj = null;
        if (this._actualPos < this._agregado.enemies.size()) {
            obj = this._agregado.enemies.elementAt(this._actualPos);
        }
        return obj;
    }

    @Override
    public Object ultimo() {
        Object obj = null;
        if (this._agregado.enemies.isEmpty() == false) {
            this._actualPos = 0;
            obj = this._agregado.enemies.lastElement();
        }
        return obj;
    }

    @Override
    public Object getByPos(int posEnemy) {
        Object obj = null;
        if (posEnemy < this._agregado.enemies.size() && posEnemy >= 0) {
            obj = this._agregado.enemies.elementAt(posEnemy);
        }
        return obj;
    }
}
