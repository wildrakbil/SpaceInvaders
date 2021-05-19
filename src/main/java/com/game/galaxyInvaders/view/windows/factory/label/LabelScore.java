package com.game.galaxyInvaders.view.windows.factory.label;

import com.game.galaxyInvaders.view.windows.factory.dialog.DialogInstructions;
import com.game.galaxyInvaders.view.windows.factory.dialog.DialogScore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AnDrEy on 4/27/2021.
 */
public class LabelScore implements ILabel {
    private Label _label;

    public LabelScore() {
        this._label = new Label();
        this._label .setText("MEJORES PUNTAJES");
        this._label .setBounds( 245, 420, 340, 23);
        this._label .setFont(new Font("ArcadeClassic", Font.BOLD, 30));
        this._label .setForeground(Color.GREEN);
        this._label .setAlignmentX(this._label .RIGHT_ALIGNMENT);
        this._label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new DialogScore().show();
            }
        });
    }

    @Override
    public Label getLabel() {
        return _label;
    }
}
