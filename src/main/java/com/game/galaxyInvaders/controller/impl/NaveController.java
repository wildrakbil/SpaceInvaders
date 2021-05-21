package com.game.galaxyInvaders.controller.impl;

import com.game.galaxyInvaders.desacople.IGameController;
import com.game.galaxyInvaders.desacople.INaveController;
import com.game.galaxyInvaders.controller.GameContext;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 5/9/2021.
 */
public class NaveController implements INaveController {
    IGameController gameController = new GameController();

    @Override
    public void move(int i) {
        int posX = GameContext.getInstance().getPlayer().getNave().getPosX();
        if (i == 1) {
            if (posX <= 765) {
                GameContext.getInstance().getPlayer().getNave().setPosX((int) (posX + (i * 10.0d)));
            }
        } else {
            if (posX >= 1) {
                GameContext.getInstance().getPlayer().getNave().setPosX((int) (posX + (i * 10.0d)));
            }
        }
        gameController.updateWindow();
    }

    @Override
    public void paintNave(Graphics g) {
        ImageIcon nave = new ImageIcon(GameContext.getInstance().getPlayer().getPathImgNave());
        g.drawImage(
                nave.getImage(),
                GameContext.getInstance().getPlayer().getNave().getPosX(),
                GameContext.getInstance().getPlayer().getNave().getPosY(), null);
    }
}
