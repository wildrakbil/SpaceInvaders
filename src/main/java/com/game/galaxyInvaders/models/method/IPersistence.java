package com.game.galaxyInvaders.models.method;

import java.util.ArrayList;

/**
 * Created by AnDrEy on 5/17/2021.
 */
public interface IPersistence {

    ArrayList<String> loadData(String pathFile);
}
