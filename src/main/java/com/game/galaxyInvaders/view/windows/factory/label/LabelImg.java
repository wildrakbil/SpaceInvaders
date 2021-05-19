package com.game.galaxyInvaders.view.windows.factory.label;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 4/28/2021.
 */
public class LabelImg implements ILabel {
    private Label _label;

    public LabelImg(String path) {
        ImageIcon icono = new ImageIcon(String.format("./src/main/resources/img/%s",path));
        this._label = new Label();
        this._label.setIcon(icono);
        this._label.setBounds(0, 0, icono.getIconWidth(), icono.getIconHeight());
    }

    @Override
    public Label getLabel() {
        return _label;
    }
}
