package com.game.galaxyInvaders.controller.threads;

import com.game.galaxyInvaders.controller.util.AppSystemProperties;
import com.game.galaxyInvaders.controller.GameContext;

/**
 * Created by AnDrEy on 5/19/2021.
 */
public class AnimationPlayerDeadThread extends Thread {

    @Override
    public void run() {
        try {
            int cout = 10;
            boolean img = true;
            while (cout > 0) {
                GameContext.getInstance().getPlayer().setPathImgNave(
                        AppSystemProperties.getPropertie(String.format("path.ally1.%s", String.valueOf(img))));
                sleep(100);
                img = !img;
                cout--;
            }


            GameContext.getInstance().getPlayer().setPathImgNave("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
