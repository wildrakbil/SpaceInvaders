package com.game.galaxyInvaders.view.windows.factory.panel;

import com.game.galaxyInvaders.view.windows.factory.label.Label;
import com.game.galaxyInvaders.view.windows.factory.label.LabelImg;
import com.game.galaxyInvaders.view.windows.factory.label.LabelName;
import com.game.galaxyInvaders.view.windows.factory.textField.TextFieldName;

import javax.swing.*;

/**
 * Created by AnDrEy on 4/28/2021.
 */
public class PanelNewGame implements IPanel {

    private Panel _panel;

    public PanelNewGame(JButton buttonAccept , JButton buttonCancel) {

        String path = "fondoAP.jpg";

        this._panel = new Panel();
        this._panel.setLayout(null);
        Label img = new LabelImg(path).getLabel();
        this._panel.setSize(img.getIcon().getIconWidth(), img.getIcon().getIconHeight());

        this._panel.add(new LabelName("NOMBRE DE LA PARTIDA").getLabel());
        this._panel.add(new TextFieldName().getTextField());
        this._panel.add(buttonAccept);
        this._panel.add(buttonCancel);
        this._panel.add(img);
    }

    @Override
    public Panel getPanel() {
        return _panel;
    }
}
