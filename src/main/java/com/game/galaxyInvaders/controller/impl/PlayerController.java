package com.game.galaxyInvaders.controller.impl;

import com.game.galaxyInvaders.controller.IPlayerController;
import com.game.galaxyInvaders.controller.state.context.AlertStateContext;
import com.game.galaxyInvaders.models.GameContext;
import com.game.galaxyInvaders.models.Nave;
import com.game.galaxyInvaders.models.Player;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 5/9/2021.
 */
public class PlayerController implements IPlayerController {

    @Override
    public void newPlayer(String name, String nickName) {
        Player player = new Player(name, nickName);
        player.setNave(new Nave(320, 410, 3, 20, 32));
        GameContext.getInstance().setPlayer(player);
    }

    @Override
    public void paintHeart(Graphics g) {
        ImageIcon heart = new ImageIcon(GameContext.getInstance().getPlayer().getState());
        g.drawImage(heart.getImage(), 40, 455, 25, 25, null);
    }


}
