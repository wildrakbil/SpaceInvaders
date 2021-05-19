package com.game.galaxyInvaders.view.windows.factory.label;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 4/28/2021.
 */
public class LabelNickName implements ILabel {
    private Label _label;

    public LabelNickName() {
        this._label = new Label();
        this._label.setText("NICKNAME");
        this._label.setBounds(10, 150, 260, 20);
        this._label.setFont(new Font("ArcadeClassic", Font.PLAIN, 23));
        this._label.setForeground(Color.RED);
    }

    @Override
    public Label getLabel() {
        return _label;
    }
}
