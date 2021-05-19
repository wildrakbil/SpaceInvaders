package com.game.galaxyInvaders.view.windows.factory.label;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AnDrEy on 4/27/2021.
 */
public class LabelLogin implements ILabel, ActionListener {
    private Label _label;

    public LabelLogin() {
        this._label = new Label();
        this._label.setText("LOGIN RAPIDO");
        this._label.setBounds(290, 360, 250, 23);
        this._label.setFont(new Font("ArcadeClassic", Font.BOLD, 30));
        this._label.setForeground(Color.GREEN);
        //this._label.setAlignmentX(this._label.RIGHT_ALIGNMENT);
        this._label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String respuesta = JOptionPane.showInputDialog(null, "Por favor ingresa tu nickname", "Login rapido", JOptionPane.DEFAULT_OPTION);
                if (respuesta == null || respuesta.equals("")) {
                    JOptionPane.showMessageDialog(null, "Por favor ingresar un nickname valido",
                            "Error al escribir el nickname", JOptionPane.ERROR_MESSAGE);
                } else if (respuesta.length() != 5) {
                    JOptionPane.showMessageDialog(null, "Recuerde que el nickname contiene 5 di     gitos",
                            "Error al escribir el nickname", JOptionPane.ERROR_MESSAGE);
                } else {
                }
            }
        });
    }

    @Override
    public Label getLabel() {
        return _label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
