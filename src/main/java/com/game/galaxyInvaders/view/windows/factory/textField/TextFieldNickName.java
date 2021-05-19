package com.game.galaxyInvaders.view.windows.factory.textField;

import com.game.galaxyInvaders.view.windows.factory.label.ILabel;
import com.game.galaxyInvaders.view.windows.factory.label.LabelName;
import com.game.galaxyInvaders.view.windows.factory.label.LabelNickName;

import java.awt.*;

/**
 * Created by AnDrEy on 4/28/2021.
 */
public class TextFieldNickName implements ITextField {
    private TextField _textField;

    public TextFieldNickName() {
        this._textField = new TextField();
        this._textField.setName("nickName");
        this._textField.setBackground(Color.ORANGE);
        this._textField.setBounds(10, 180, 150, 25);
        this._textField.setForeground(Color.BLUE);
        this._textField.setFont(new Font("ArcadeClassic", Font.PLAIN, 22));
    }

    @Override
    public TextField getTextField() {
        return _textField;
    }
}
