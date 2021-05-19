package com.game.galaxyInvaders.view.windows.factory.panel;

import com.game.galaxyInvaders.view.windows.factory.button.ButtonAccept;
import com.game.galaxyInvaders.view.windows.factory.button.ButtonCancel;
import com.game.galaxyInvaders.view.windows.factory.button.ButtonOrder;

import java.awt.*;

/**
 * Created by AnDrEy on 4/29/2021.
 */
public class PanelLoadPlayer implements IPanel {
    private Panel _panel;

    public PanelLoadPlayer() {
        this._panel = new Panel();
        this._panel.setPreferredSize(new Dimension(240, 28));
        this._panel.setLayout(null);
        this._panel.setBackground(Color.BLACK);
    }

    @Override
    public Panel getPanel() {
        return this._panel;
    }
}
