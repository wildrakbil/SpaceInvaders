package com.game.galaxyInvaders.view.windows.factory.label;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 5/1/2021.
 */
public class LabelBackGroundGif implements ILabel {
    private Label _label;

    public LabelBackGroundGif(String path) {
        this._label = new Label();
        ImageIcon backgroundImage = new ImageIcon(path);
        this._label.setIcon(backgroundImage);
        this._label.setHorizontalAlignment(JLabel.CENTER);
    }

    @Override
    public Label getLabel() {
        return _label;
    }
}
