package com.game.galaxyInvaders.view.windows.factory.button;

import java.awt.*;

/**
 * Created by AnDrEy on 5/3/2021.
 */
public class ButtonOrder implements IButton {
    private Button _button;

    public ButtonOrder(int x, int y) {
        this._button = new Button();
        this._button.setText("Ordenar");
        this._button.setActionCommand("Ordenar");
        this._button.setBounds(x, y, 130, 25);
        this._button.setBackground(Color.BLACK);
        this._button.setForeground(Color.YELLOW);
        this._button.setFont(new Font("ArcadeClassic", Font.PLAIN, 20));
    }

    @Override
    public Button getButton() {
        return _button;
    }
}
