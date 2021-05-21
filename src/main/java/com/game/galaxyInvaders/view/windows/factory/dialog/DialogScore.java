package com.game.galaxyInvaders.view.windows.factory.dialog;

import com.game.galaxyInvaders.view.windows.factory.button.ButtonAccept;
import com.game.galaxyInvaders.view.windows.factory.button.IButton;
import com.game.galaxyInvaders.view.windows.factory.panel.PanelScore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AnDrEy on 4/30/2021.
 */
public class DialogScore implements IDialog, ActionListener {

    private Dialog _dialog;

    public DialogScore() {
        super();
        this._dialog = new Dialog();
        this._dialog.setLayout(null);
        this._dialog.setForeground(Color.RED);
        this._dialog.setTitle("Score");

        this._dialog.setFont(new Font("ArcadeClassic", Font.PLAIN, 20));
        this._dialog.setForeground(Color.RED);

        IButton buttonAccept = new ButtonAccept(235, 360);
        buttonAccept.getButton().addActionListener(this);

        this._dialog.add(new PanelScore(buttonAccept.getButton()).getPanel());

        this._dialog.setUndecorated(true);
        this._dialog.getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE));
        this._dialog.setSize(600, 400);
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
            this._dialog.dispose();
        }
    }
}
