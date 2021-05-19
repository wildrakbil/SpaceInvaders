package com.game.galaxyInvaders.view.windows.factory.label;

import java.awt.*;

/**
 * Created by AnDrEy on 5/3/2021.
 */
public class LabelScoreText implements ILabel {
    private Label _label;

    public LabelScoreText(String s, Color c, int x, int y, int width, int height, int size) {
        this._label = new Label();
        this._label.setForeground(c);
        this._label.setText(s);
        this._label.setBounds(x, y, width, height);
        this._label.setFont(new Font("ArcadeClassic", Font.BOLD, size));

    }

    @Override
    public Label getLabel() {
        return _label;
    }
}
