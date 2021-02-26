package com.game.galaxyInvaders.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AnDrEy on 2/25/2021.
 */
public class NewPayerOptions extends JDialog implements ActionListener {

    private final static String ACCEPT = "Aceptar";
    private final static String CANCEL = "Cancelar";

    private JPanel panel;

    public NewPayerOptions() {
        super(BaseApplicationClass.getInstance(), true);

        JLabel background = new JLabel();
        ImageIcon playerOptionsBackgroud = new ImageIcon("./src/main/resources/img/playerOptionsBackgroud.jpg");
        background.setIcon(playerOptionsBackgroud);
        background.setBounds(0, 0, playerOptionsBackgroud.getIconWidth(), playerOptionsBackgroud.getIconHeight());
        setSize(playerOptionsBackgroud.getIconWidth(), playerOptionsBackgroud.getIconHeight());

        JLabel labName = createLabelName("NOMBRE DEL JUGADOR", 10, 60, new Dimension(350, 20));
        JTextField txtName = createTextField(10, 85, new Dimension(205, 25));

        JLabel labNickname = createLabelName("NICKNAME", 10, 150, new Dimension(260, 20));
        JTextField txtNickame = createTextField(10, 180, new Dimension(150, 25));


        JButton btCancel = createButton(CANCEL, 10, 350, new Dimension(130, 25));

        panel = new JPanel();
        panel.setLayout(null);
        panel.add(labName);
        panel.add(txtName);
        panel.add(labNickname);
        panel.add(txtNickame);
        panel.add(btCancel);
        panel.setSize(playerOptionsBackgroud.getIconWidth(), playerOptionsBackgroud.getIconHeight());
        panel.add(background);

        add(panel);
        setLocationRelativeTo(null);

    }

    private JButton createButton(String mane, int x, int y, Dimension dimension) {
        JButton jButton = new JButton(mane);
        jButton.addActionListener(this);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.GREEN);
        jButton.setFont(new Font("ArcadeClassic", Font.PLAIN, 20));
        jButton.setBounds(x, y, (int) dimension.getWidth(), (int) dimension.getHeight());
        return jButton;

    }

    private JTextField createTextField(int x, int y, Dimension dimension) {
        JTextField jTextField = new JTextField();
        jTextField.setBackground(Color.orange);
        jTextField.setForeground(Color.BLUE);
        jTextField.setFont(new Font("ArcadeClassic", Font.PLAIN, 22));
        jTextField.setBounds(x, y, (int) dimension.getWidth(), (int) dimension.getHeight());
        return jTextField;
    }

    private JLabel createLabelName(String name, int x, int y, Dimension dimension) {
        JLabel jLabel = new JLabel(name);
        jLabel.setForeground(Color.RED);
        jLabel.setFont(new Font("ArcadeClassic", Font.PLAIN, 23));
        jLabel.setBounds(x, y, (int) dimension.getWidth(), (int) dimension.getHeight());
        return jLabel;
    }

    public void showpayerOptions() {
        setLayout(null);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(CANCEL)) {
            dispose();
        }
    }
}
