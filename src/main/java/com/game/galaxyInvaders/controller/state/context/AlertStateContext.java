package com.game.galaxyInvaders.controller.state.context;

import com.game.galaxyInvaders.controller.state.IAlertState;
import com.game.galaxyInvaders.controller.state.impl.HealthyState;

/**
 * Created by AnDrEy on 5/19/2021.
 */
public class AlertStateContext {

    private IAlertState _currentState;

    public AlertStateContext() {
        _currentState = new HealthyState();
    }

    public void setState(IAlertState state) {
        _currentState = state;
    }

    public void alert() {
        _currentState.alert(this);
    }
}
