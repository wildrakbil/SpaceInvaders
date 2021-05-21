package com.game.galaxyInvaders.controller.state.impl;

import com.game.galaxyInvaders.controller.state.IAlertState;
import com.game.galaxyInvaders.controller.state.context.AlertStateContext;
import com.game.galaxyInvaders.controller.util.AppSystemProperties;
import com.game.galaxyInvaders.controller.GameContext;

/**
 * Created by AnDrEy on 5/19/2021.
 */
public class HealthyState implements IAlertState {

    @Override
    public void alert(AlertStateContext ctx) {
        GameContext.getInstance().getPlayer().setState(AppSystemProperties.getPropertie("path.player.heart1"));
    }
}
