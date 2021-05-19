package com.game.galaxyInvaders.models.method;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by AnDrEy on 5/17/2021.
 */
public class Persistence implements IPersistence{

    @Override
    public ArrayList<String> loadData(String pathFile) {
        ArrayList<String> out = new ArrayList<String>();
        BufferedReader objReader = null;
        try {
            File archivo = new File(pathFile);
            FileReader fr = new FileReader(archivo);
            objReader = new BufferedReader(fr);
            String strCurrentLine;
            while ((strCurrentLine = objReader.readLine()) != null) {
                out.add(strCurrentLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return out;
    }
}
