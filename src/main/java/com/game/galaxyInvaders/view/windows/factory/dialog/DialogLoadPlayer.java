package com.game.galaxyInvaders.view.windows.factory.dialog;

import com.game.galaxyInvaders.view.windows.factory.button.ButtonAccept;
import com.game.galaxyInvaders.view.windows.factory.button.ButtonCancel;
import com.game.galaxyInvaders.view.windows.factory.button.ButtonOrder;
import com.game.galaxyInvaders.view.windows.factory.panel.PanelLoadPlayer;
import com.game.galaxyInvaders.view.windows.factory.scrollPane.ScrollPanelList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AnDrEy on 4/28/2021.
 */
public class DialogLoadPlayer implements IDialog, ActionListener {

    private Dialog _dialog;

    public DialogLoadPlayer() {
        JList list = new JList();
        //TODO:cargar la lista de jugadores
        this._dialog = new Dialog();
        this._dialog.setSize(412, 400);
        this._dialog.setTitle("Jugadores");
        this._dialog.setLayout(new BorderLayout());
        this._dialog.setBackground(Color.BLACK);

        this._dialog.add(new ScrollPanelList(list).getScrollPane(), BorderLayout.CENTER);

        JButton buttonAccept = new ButtonAccept(5, 2).getButton();
        JButton buttonCancel = new ButtonCancel(140, 2).getButton();
        JButton buttonOrder = new ButtonOrder(275, 2).getButton();

        buttonAccept.addActionListener(this);
        buttonCancel.addActionListener(this);
        buttonOrder.addActionListener(this);

        JPanel panelLoadPlayernew = new PanelLoadPlayer().getPanel();
        panelLoadPlayernew.add(buttonAccept);
        panelLoadPlayernew.add(buttonCancel);
        panelLoadPlayernew.add(buttonOrder);

        this._dialog.add(panelLoadPlayernew, BorderLayout.SOUTH);

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
        } else {
            this._dialog.dispose();
        }
    }

}
