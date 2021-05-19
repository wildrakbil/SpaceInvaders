package com.game.galaxyInvaders.view.windows.factory.dialog;

import com.game.galaxyInvaders.controller.impl.GameController;
import com.game.galaxyInvaders.controller.IGameController;
import com.game.galaxyInvaders.view.WindowSingleton;
import com.game.galaxyInvaders.view.windows.factory.button.ButtonAccept;
import com.game.galaxyInvaders.view.windows.factory.button.ButtonCancel;
import com.game.galaxyInvaders.view.windows.factory.panel.PanelNewGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AnDrEy on 4/28/2021.
 */
public class DialogNewGame implements IDialog, ActionListener {

    IGameController gameController = new GameController();

    private Dialog _dialog;

    public DialogNewGame() {
        super();
        this._dialog = new Dialog();
        this._dialog.setLayout(null);
        this._dialog.setTitle("Crear Partida");
        this._dialog.setUndecorated(true);
        this._dialog.getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE));

        JButton buttonAccept = new ButtonAccept(10, 190).getButton();
        JButton buttonCancel = new ButtonCancel(200, 190).getButton();
        buttonAccept.addActionListener(this);
        buttonCancel.addActionListener(this);

        this._dialog.add(new PanelNewGame(buttonAccept, buttonCancel).getPanel());
        this._dialog.setSize(this._dialog.getRootPane().getContentPane().getComponent(0).getWidth(),
                this._dialog.getRootPane().getContentPane().getComponent(0).getHeight());
    }

    public void orden() {
        close();
    }

    @Override
    public Dialog getDialog() {
        return _dialog;
    }

    @Override
    public void show() {
        this._dialog.setLocationRelativeTo(null);
        this._dialog.setVisible(true);
    }

    @Override
    public void close() {
        this._dialog.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Aceptar")) {
            gameController.newGame(this);
            gameController.startGame();
        }
        close();
    }
}
