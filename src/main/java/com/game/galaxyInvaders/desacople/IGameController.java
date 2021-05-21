package com.game.galaxyInvaders.desacople;

import com.game.galaxyInvaders.view.windows.factory.dialog.IDialog;

import java.awt.*;

/**
 * Created by AnDrEy on 5/9/2021.
 */
public interface IGameController {

    void newGame(IDialog d);

    void updateWindow();

    void startGame();

    void paintBackground(Graphics g, int width, int height);
}
