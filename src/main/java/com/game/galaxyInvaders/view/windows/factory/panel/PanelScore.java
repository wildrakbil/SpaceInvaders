package com.game.galaxyInvaders.view.windows.factory.panel;

import com.game.galaxyInvaders.view.windows.factory.label.LabelScoreText;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 4/30/2021.
 */
public class PanelScore implements IPanel {

    private Panel _panel;

    public PanelScore(JButton b) {
        this._panel = new Panel();
        this._panel.setLayout(null);
        this._panel.setSize(600, 400);
        this._panel.setBackground(Color.BLACK);



        this._panel.add(new LabelScoreText("POSICION", Color.GREEN, 10, 10, 100, 25, 20).getLabel());
        this._panel.add(new LabelScoreText("PUNTAJE", Color.GREEN, 140, 10, 200, 25, 20).getLabel());
        this._panel.add(new LabelScoreText("NICKNAME", Color.GREEN, 260, 10, 300, 25, 20).getLabel());
        this._panel.add(new LabelScoreText("PARTIDA", Color.GREEN, 390, 10, 400, 25, 20).getLabel());

        this._panel.add(b);

    }

    @Override
    public Panel getPanel() {
        return _panel;
    }
}



