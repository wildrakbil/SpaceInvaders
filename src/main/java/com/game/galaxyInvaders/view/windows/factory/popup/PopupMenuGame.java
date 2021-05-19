package com.game.galaxyInvaders.view.windows.factory.popup;

import com.game.galaxyInvaders.view.windows.factory.menuItem.IMenuItem;
import com.game.galaxyInvaders.view.windows.factory.menuItem.MenuItemLoadGame;
import com.game.galaxyInvaders.view.windows.factory.menuItem.MenuItemNewGame;
import com.game.galaxyInvaders.view.windows.factory.menuItem.MenuItemNewPlayer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 4/27/2021.
 */
public class PopupMenuGame implements IPopupMenu {

    private PopupMenu _popupMenu;

    public PopupMenuGame() {
        this._popupMenu = new PopupMenu();
        IMenuItem newGame = new MenuItemNewGame();
        IMenuItem loadGame = new MenuItemLoadGame();

        this._popupMenu.add(newGame.getMenuItem());
        this._popupMenu.add(loadGame.getMenuItem());
    }

    @Override
    public PopupMenu getPopupMenu() {
        return _popupMenu;
    }
}
