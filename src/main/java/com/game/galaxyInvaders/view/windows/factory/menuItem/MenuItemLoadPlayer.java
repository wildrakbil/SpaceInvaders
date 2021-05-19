package com.game.galaxyInvaders.view.windows.factory.menuItem;

import com.game.galaxyInvaders.view.windows.factory.dialog.DialogLoadPlayer;
import com.game.galaxyInvaders.view.windows.factory.dialog.IDialog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AnDrEy on 4/29/2021.
 */
public class MenuItemLoadPlayer implements IMenuItem, ActionListener {
    private MenuItem _menuItem;

    public MenuItemLoadPlayer() {
        this._menuItem = new MenuItem();
        this._menuItem.setText("SELECCIONAR JUGADOR");
        this._menuItem.setFont(new Font("ArcadeClassic", Font.PLAIN, 30));
        this._menuItem.setActionCommand("SELECCIONAR JUGADOR");
        this._menuItem.addActionListener(this);
    }

    @Override
    public MenuItem getMenuItem() {
        return _menuItem;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new DialogLoadPlayer().show();
    }
}
