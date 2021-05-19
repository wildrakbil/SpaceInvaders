package com.game.galaxyInvaders.view.windows.factory.label;

import java.awt.*;

/**
 * Created by AnDrEy on 5/1/2021.
 */
public class LabelText implements ILabel {
    private Label _label;

    public LabelText(String s, int size, Color c) {
        this._label = new Label();
        this._label.setText(s);
        this._label.setForeground(c);
        this._label.setFont(new Font("ArcadeClassic", Font.PLAIN, size));
    }

    @Override
    public Label getLabel() {
        return _label;
    }
}
