package com.game.galaxyInvaders.view.windows.factory.list;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Created by AnDrEy on 4/29/2021.
 */
public class ListPlayer implements IList, ListSelectionListener {

    private List _list;

    public ListPlayer() {
        this._list = new List();
        this._list.addListSelectionListener(this);
        this._list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this._list.setModel(new DefaultListModel());
        this._list.setBackground(Color.BLACK);
        this._list.setFont(new Font("ArcadeClassic", Font.PLAIN, 20));
        this._list.setForeground(Color.BLUE);
    }

    @Override
    public List getList() {
        return _list;
    }


    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
