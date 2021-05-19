package com.game.galaxyInvaders.view.windows.factory.scrollPane;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 4/29/2021.
 */
public class ScrollPanelList implements IScrollPane {
    private ScrollPane _scrollPane;

    public ScrollPanelList(JList l) {
        this._scrollPane = new ScrollPane();
        this._scrollPane.setPreferredSize(new Dimension(240, 200));
        this._scrollPane.setBackground(Color.BLACK);
        this._scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this._scrollPane.getViewport().add(l);
    }

    @Override
    public ScrollPane getScrollPane() {
        return _scrollPane;
    }
}
