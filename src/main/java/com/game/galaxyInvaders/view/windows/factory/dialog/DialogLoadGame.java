package com.game.galaxyInvaders.view.windows.factory.dialog;

import com.game.galaxyInvaders.view.WindowSingleton;
import com.game.galaxyInvaders.view.windows.factory.button.ButtonAccept;
import com.game.galaxyInvaders.view.windows.factory.button.ButtonCancel;
import com.game.galaxyInvaders.view.windows.factory.button.IButton;
import com.game.galaxyInvaders.view.windows.factory.panel.PanelLoadGame;
import com.game.galaxyInvaders.view.windows.factory.scrollPane.ScrollPanelList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AnDrEy on 4/28/2021.
 */
public class DialogLoadGame implements IDialog, ActionListener {
    private Dialog _dialog;

    public DialogLoadGame() {
        JList list = new JList();
        //TODO:cargar la lista de partidas
        this._dialog = new Dialog();
        this._dialog.setTitle("Partidas");
        this._dialog.setBackground(Color.BLACK);
        this._dialog.setSize(400, 400);
        this._dialog.setLayout(new BorderLayout());


        this._dialog.add(new ScrollPanelList(list).getScrollPane(), BorderLayout.CENTER);

        IButton buttonAccept = new ButtonAccept(60, 2);
        IButton buttonCancel = new ButtonCancel(210, 2);
        buttonAccept.getButton().addActionListener(this);
        buttonCancel.getButton().addActionListener(this);

        buttonAccept.getButton().addActionListener(this);
        buttonCancel.getButton().addActionListener(this);

        JPanel PanelLoadGame = new PanelLoadGame().getPanel();
        PanelLoadGame.add(buttonAccept.getButton());
        PanelLoadGame.add(buttonCancel.getButton());

        this._dialog.add(PanelLoadGame, BorderLayout.SOUTH);

        this._dialog.setUndecorated(true);
        this._dialog.getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE));
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
        String comando = e.getActionCommand();
        if (comando.equals("Cancelar")) {
            this._dialog.dispose();
        } else if (comando.equals("Aceptar")) {
            this._dialog.dispose();
            WindowSingleton.getInstance().changePanel("game");
        } else {
        }
    }
}
