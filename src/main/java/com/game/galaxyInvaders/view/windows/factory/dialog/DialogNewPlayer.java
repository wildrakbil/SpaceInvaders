package com.game.galaxyInvaders.view.windows.factory.dialog;

import com.game.galaxyInvaders.controller.IPlayerController;
import com.game.galaxyInvaders.controller.impl.PlayerController;
import com.game.galaxyInvaders.view.windows.factory.button.ButtonAccept;
import com.game.galaxyInvaders.view.windows.factory.button.ButtonCancel;
import com.game.galaxyInvaders.view.windows.factory.panel.PanelNewPlayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AnDrEy on 4/28/2021.
 */
public class DialogNewPlayer implements IDialog, ActionListener {

    private Dialog _dialog;

    IPlayerController playerController = new PlayerController();

    public DialogNewPlayer() {
        super();
        this._dialog = new Dialog();
        this._dialog.setLayout(null);
        this._dialog.setTitle("Crear Jugador");
        this._dialog.setUndecorated(true);

        this._dialog.getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE));

        JButton buttonAccept = new ButtonAccept(10, 300).getButton();
        JButton buttonCancel = new ButtonCancel(10, 350).getButton();
        buttonAccept.addActionListener(this);
        buttonCancel.addActionListener(this);
        JPanel newplayer = new PanelNewPlayer(buttonAccept, buttonCancel).getPanel();
        this._dialog.add(newplayer);
        this._dialog.setSize(this._dialog.getRootPane().getContentPane().getComponent(0).getWidth(),
                this._dialog.getRootPane().getContentPane().getComponent(0).getHeight());
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
            String name = "";
            String nickName = "";
            JRootPane rootPane = this._dialog.getRootPane();
            Container contentPanel = rootPane.getContentPane();
            Component[] component = contentPanel.getComponents();
            for (Component comp : component) {
                if (comp instanceof JPanel) {
                    JPanel panel = (JPanel) comp;
                    for (Component comp1 : panel.getComponents()) {
                        if (comp1 instanceof JTextField) {
                            JTextField textField = (JTextField) comp1;
                            if (textField.getName().equals("name")) {
                                name = textField.getText();
                            } else if (textField.getName().equals("nickName")) {
                                nickName = textField.getText();
                            } else {
                            }
                        }
                    }
                }
            }
            playerController.newPlayer(name, nickName);
        }
        this._dialog.dispose();
    }
}
