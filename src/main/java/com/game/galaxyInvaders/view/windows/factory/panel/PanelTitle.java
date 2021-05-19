package com.game.galaxyInvaders.view.windows.factory.panel;

import com.game.galaxyInvaders.view.windows.factory.label.LabelText;

import java.awt.*;

/**
 * Created by AnDrEy on 5/1/2021.
 */
public class PanelTitle implements IPanel {

    private Panel _panel;

    public PanelTitle() {
        this._panel = new Panel(new FlowLayout());
        this._panel.setBackground(new Color(21, 22, 25));
        this._panel.add(new LabelText("Space Invaders", 82, Color.WHITE).getLabel());
    }

    @Override
    public Panel getPanel() {
        return _panel;
    }
}
