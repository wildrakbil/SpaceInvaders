package com.game.galaxyInvaders.view.windows.factory.panel;

import com.game.galaxyInvaders.view.windows.factory.label.LabelText;

import java.awt.*;

/**
 * Created by AnDrEy on 5/1/2021.
 */
public class PanelInstructions implements IPanel {
    private Panel _panel;

    public PanelInstructions() {
        this._panel = new Panel(new FlowLayout());
        this._panel.setBackground(new Color(21, 22, 25));
        this._panel.add(new LabelText("PRESIONE ", 49, Color.WHITE).getLabel());
        this._panel.add(new LabelText("LA TECLA ", 49, Color.BLUE).getLabel());
        this._panel.add(new LabelText("ENTER ", 49, Color.YELLOW).getLabel());
    }

    @Override
    public Panel getPanel() {
        return _panel;
    }
}
