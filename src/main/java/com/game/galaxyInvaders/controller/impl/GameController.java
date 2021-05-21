package com.game.galaxyInvaders.controller.impl;

import com.game.galaxyInvaders.desacople.IGameController;
import com.game.galaxyInvaders.controller.iterator.impl.AgregateConcrete;
import com.game.galaxyInvaders.controller.threads.AnimationEnemyThread;
import com.game.galaxyInvaders.controller.threads.EnemiesCreateShotThread;
import com.game.galaxyInvaders.controller.threads.EnemiesShotThread;
import com.game.galaxyInvaders.controller.threads.MoveEnemyThread;
import com.game.galaxyInvaders.controller.util.AppSystemProperties;
import com.game.galaxyInvaders.controller.GameContext;
import com.game.galaxyInvaders.models.Level;
import com.game.galaxyInvaders.view.WindowSingleton;
import com.game.galaxyInvaders.view.windows.factory.dialog.IDialog;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 5/9/2021.
 */
public class GameController implements IGameController {

    @Override
    public void newGame(IDialog d) {
        JRootPane rootPane = d.getDialog().getRootPane();
        Container contentPanel = rootPane.getContentPane();
        Component[] component = contentPanel.getComponents();
        for (Component comp : component) {
            if (comp instanceof JPanel) {
                JPanel panel = (JPanel) comp;
                for (Component comp1 : panel.getComponents()) {
                    if (comp1 instanceof JTextField) {
                        JTextField textField = (JTextField) comp1;
                        if (textField.getName().equals("name")) {
                            GameContext.getInstance().setName(textField.getText());
                        }
                    }
                }
            }
        }
    }

    @Override
    public void updateWindow() {
        Container container = WindowSingleton.getInstance().getContentPane();
        for (Component comp : container.getComponents()) {
            if (comp instanceof JPanel) {
                JPanel panel = (JPanel) comp;
                if (panel.getName().equals("game")) {
                    panel.updateUI();
                }
            }
        }
    }

    @Override
    public void startGame() {
        GameContext game = GameContext.getInstance();
        game.setLevel(new Level(1));
        game.setEnemies(new AgregateConcrete());
        game.setAnimationEnemyThread(new AnimationEnemyThread());
        game.getAnimationEnemyThread().start();
        game.setMoveEnemyThread(new MoveEnemyThread());
        game.getMoveEnemyThread().start();
        WindowSingleton.getInstance().changePanel("game");
        game.setEnemiesCreateShotThread(new EnemiesCreateShotThread());
        game.setEnemiesShotThread(new EnemiesShotThread());
        game.getEnemiesCreateShotThread().start();
        game.getEnemiesShotThread().start();
    }

    @Override
    public void paintBackground(Graphics g, int width, int height) {
        ImageIcon background = new ImageIcon(AppSystemProperties.getPropertie("path.background.game"));
        g.drawImage(background.getImage(), 0, 0, width, height, null);
    }


}
