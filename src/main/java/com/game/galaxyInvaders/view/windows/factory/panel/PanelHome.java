package com.game.galaxyInvaders.view.windows.factory.panel;

import com.game.galaxyInvaders.view.windows.factory.label.LabelText;

import java.awt.*;

/**
 * Created by AnDrEy on 5/1/2021.
 */
public class PanelHome implements IPanel {
    private Panel _panel;

    public PanelHome() {
        this._panel = new Panel(new FlowLayout());
        this._panel.setBackground(new Color(21, 22, 25));
        this._panel.add(new LabelText("Para ", 30, Color.CYAN).getLabel());
        this._panel.add(new LabelText("continuar ", 30, Color.PINK).getLabel());
        this._panel.add(new LabelText("PRESIONE ", 40, Color.WHITE).getLabel());
        this._panel.add(new LabelText("la tecla ", 30, Color.BLUE).getLabel());
        this._panel.add(new LabelText("ENTER ", 40, Color.YELLOW).getLabel());
    }

    @Override
    public Panel getPanel() {
        return _panel;
    }
}
