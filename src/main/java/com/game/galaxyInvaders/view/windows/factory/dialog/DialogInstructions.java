package com.game.galaxyInvaders.view.windows.factory.dialog;

import com.game.galaxyInvaders.view.windows.factory.button.ButtonAccept;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AnDrEy on 5/3/2021.
 */
public class DialogInstructions extends JDialog implements ActionListener {

    public DialogInstructions() {
        this.setLayout(null);
        this.setUndecorated(true);

        this.getContentPane().setBackground(new Color(28, 28, 28));
        this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE));

        JButton buttonAceptar = new ButtonAccept(235, 270).getButton();
        buttonAceptar.addActionListener(this);

        this.add(buttonAceptar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
    }

    public void mostrar() {
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.BLACK);

        // Dibujo de las teclas del teclado.
        g2.fillRect(50, 150, 50, 50);
        g2.fillRect(110, 150, 50, 50);
        g2.fillRect(170, 150, 50, 50);
        g2.fillRect(110, 90, 50, 50);

        // Dibuja la nave
        ImageIcon icono = new ImageIcon("./src/main/resources/img/nave1.png");
        g2.drawImage(icono.getImage(), 110, 40, 50, 30, null);

        // Dibuja las flechas de la nave que indica movimiento
        g2.setColor(Color.GRAY);
        int[] x4 = {75, 55, 75};
        int[] y4 = {40, 55, 70};
        g2.fillPolygon(x4, y4, 3);

        int[] x5 = {195, 215, 195};
        int[] y5 = {40, 55, 70};
        g2.fillPolygon(x5, y5, 3);

        int[] x6 = {75, 105, 105, 75};
        int[] y6 = {47, 47, 63, 63};
        g2.fillPolygon(x6, y6, 4);

        int[] x7 = {165, 195, 195, 165};
        int[] y7 = {47, 47, 63, 63};
        g2.fillPolygon(x7, y7, 4);

        // Intruccion para mover
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("ArcadeClassic", Font.PLAIN, 18));
        g2.drawString("USE LAS FLECHAS DE", 60, 230);
        g2.drawString("DIRRECION PARA MOVERSE", 35, 250);

        // Dibuja las flechas
        g2.setColor(Color.WHITE);

        int[] x2 = {85, 65, 85};
        int[] y2 = {160, 175, 190};
        g2.fillPolygon(x2, y2, 3);

        int[] x3 = {185, 205, 185};
        int[] y3 = {160, 175, 190};
        g2.fillPolygon(x3, y3, 3);

        g2.setColor(Color.GRAY);

        int[] x = {120, 135, 150};
        int[] y = {125, 105, 125};
        g2.fillPolygon(x, y, 3);

        int[] x1 = {120, 135, 150};
        int[] y1 = {165, 185, 165};
        g2.fillPolygon(x1, y1, 3);

        // Dibujo de la barra espaceadora
        g2.setColor(Color.BLACK);
        g2.fillRect(320, 150, 260, 50);

        // Nombre de la barra espaceadora
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("ArcadeClassic", Font.PLAIN, 25));
        g2.drawString("SPACE", 340, 190);

        // Intruccion para disparar
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("ArcadeClassic", Font.PLAIN, 18));
        g2.drawString("DISPARA CON LA", 390, 230);
        g2.drawString("BARRA ESPACEADORA", 365, 250);

        // Dibuja la nave con el disparo
        g2.drawImage(icono.getImage(), 425, 100, 50, 30, null);
        g2.setStroke(new BasicStroke(4.0f));
        g2.drawLine(450, 80, 450, 90);
        g2.drawLine(460, 55, 460, 65);

    }
}
