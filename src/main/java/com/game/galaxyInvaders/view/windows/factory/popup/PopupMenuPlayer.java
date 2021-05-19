package com.game.galaxyInvaders.view.windows.factory.popup;

import com.game.galaxyInvaders.view.windows.factory.menuItem.IMenuItem;
import com.game.galaxyInvaders.view.windows.factory.menuItem.MenuItemLoadPlayer;
import com.game.galaxyInvaders.view.windows.factory.menuItem.MenuItemNewPlayer;

/**
 * Created by AnDrEy on 4/27/2021.
 */
public class  PopupMenuPlayer implements IPopupMenu{

    private PopupMenu _popupMenu;

    public PopupMenuPlayer() {
        this._popupMenu = new PopupMenu();
        this._popupMenu.add(new MenuItemNewPlayer().getMenuItem());
        this._popupMenu.add(new MenuItemLoadPlayer().getMenuItem());
    }

    @Override
    public PopupMenu getPopupMenu() {
        return _popupMenu;
    }
}
