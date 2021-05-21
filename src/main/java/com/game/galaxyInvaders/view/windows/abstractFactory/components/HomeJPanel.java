package com.game.galaxyInvaders.view.windows.abstractFactory.components;

import com.game.galaxyInvaders.view.windows.factory.label.LabelBackGroundGif;
import com.game.galaxyInvaders.view.windows.factory.panel.PanelHome;
import com.game.galaxyInvaders.view.windows.factory.panel.PanelTitle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 4/22/2021.
 */
public class HomeJPanel extends JPanel implements IJPanel {

    public HomeJPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(21, 22, 25));
        setName("home");

        add(new PanelTitle().getPanel(), BorderLayout.NORTH);
        add(new LabelBackGroundGif("./src/main/resources/gif/menuinicio.gif").getLabel(), BorderLayout.CENTER);
        add(new PanelHome().getPanel(), BorderLayout.SOUTH);
    }

    @Override
    public JPanel create() {
        return new HomeJPanel();
    }
}
