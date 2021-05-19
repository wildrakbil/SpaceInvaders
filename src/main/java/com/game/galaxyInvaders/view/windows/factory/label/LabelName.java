package com.game.galaxyInvaders.view.windows.factory.label;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 4/28/2021.
 */
public class LabelName implements ILabel {
    private Label _label;

    public LabelName(String s) {
        this._label = new Label();
        this._label .setText(s);
        this._label .setBounds( 10, 60, 350, 20);
        this._label .setFont(new Font("ArcadeClassic", Font.PLAIN, 23));
        this._label .setForeground(Color.RED);
    }

    @Override
    public Label getLabel() {
        return _label;
    }
}
