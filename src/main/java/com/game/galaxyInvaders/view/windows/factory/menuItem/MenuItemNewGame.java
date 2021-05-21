package com.game.galaxyInvaders.view.windows.factory.menuItem;

import com.game.galaxyInvaders.controller.GameContext;
import com.game.galaxyInvaders.view.windows.factory.dialog.DialogNewGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AnDrEy on 4/29/2021.
 */
public class MenuItemNewGame implements IMenuItem, ActionListener {
    private MenuItem _menuItem;

    public MenuItemNewGame() {
        this._menuItem = new MenuItem();
        this._menuItem.setText("CREAR PARTIDA");
        this._menuItem.setFont(new Font("ArcadeClassic", Font.PLAIN, 30));
        this._menuItem.setActionCommand("CREAR PARTIDA");

        this._menuItem.addActionListener(this);
    }

    @Override
    public MenuItem getMenuItem() {
        return _menuItem;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (GameContext.getInstance().getPlayer() == null) {
            JOptionPane.showMessageDialog(this.getMenuItem(), "Para crear una partida debes crear o seleccionar un jugador primero",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            new DialogNewGame().show();
        }
    }
}
