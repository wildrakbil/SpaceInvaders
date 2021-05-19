package com.game.galaxyInvaders.view.windows.factory.label;

import com.game.galaxyInvaders.view.windows.factory.popup.PopupMenuPlayer;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AnDrEy on 4/27/2021.
 */
public class LabelPlayer implements ILabel {
    private Label _label;

    public LabelPlayer() {
        this._label = new Label();
        this._label.setText("JUGADOR");
        this._label.setBounds(320, 300, 190, 23);
        this._label.setFont(new Font("ArcadeClassic", Font.BOLD, 30));
        this._label.setForeground(Color.GREEN);
        this._label.setAlignmentX(this._label.RIGHT_ALIGNMENT);
        this._label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new PopupMenuPlayer().getPopupMenu().show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }

    @Override
    public Label getLabel() {
        return _label;
    }
}
