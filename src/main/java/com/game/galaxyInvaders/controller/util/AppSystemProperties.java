package com.game.galaxyInvaders.controller.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by AnDrEy on 3/24/2021.
 * Pattren Singleton
 * la aplicacion solo requiere un unico JFrame durante su ejecucion
 */
public class AppSystemProperties {

    private String _propFileName = "config.properties";

    private static AppSystemProperties _appSystemProperties;
    private static Properties _properties = new Properties();
    private InputStream _inputStream;

    public AppSystemProperties() {
        _inputStream = getClass().getClassLoader().getResourceAsStream(_propFileName);
        try {
            _properties.load(_inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertie(String name){
        createIntance();
        return  _properties.getProperty(name);
    }

    private synchronized static void createIntance() {
        if (_appSystemProperties == null) {
            _appSystemProperties = new AppSystemProperties();
        }
    }
}
