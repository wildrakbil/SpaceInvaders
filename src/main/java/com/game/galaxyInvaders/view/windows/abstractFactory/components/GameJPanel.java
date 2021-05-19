package com.game.galaxyInvaders.view.windows.abstractFactory.components;

import com.game.galaxyInvaders.controller.*;
import com.game.galaxyInvaders.controller.impl.*;
import com.game.galaxyInvaders.controller.threads.EnemiesCreateShotThread;
import com.game.galaxyInvaders.controller.threads.EnemiesShotThread;
import com.game.galaxyInvaders.models.GameContext;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 5/7/2021.
 */
public class GameJPanel extends JPanel implements IJPanel {

    INaveController naveController = new NaveController();
    IShotControler shotControler = new ShotControler();
    IGameController gameController = new GameController();
    IEnemyController enemyController = new EnemyController();
    IPlayerController playerController = new PlayerController();

    public GameJPanel() {
        setPreferredSize(new Dimension(800, 500));
        setName("game");
        setLayout(null);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        gameController.paintBackground(g, getSize().width, getSize().height);
        naveController.paintNave(g);
        shotControler.paintPlayerShot(g);
        enemyController.paintEnemies(g);
        playerController.paintHeart(g);
        shotControler.paintEnemiesShot(g);
    }

    @Override
    public JPanel create() {
        return new GameJPanel();
    }

}
