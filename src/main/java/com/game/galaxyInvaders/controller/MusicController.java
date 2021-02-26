package com.game.galaxyInvaders.controller;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by AnDrEy on 2/25/2021.
 */
public class MusicController {

    private Clip clip;


    public void playMusic(File file) {
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream(file)));
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopMusic(){
        clip.toString();
    }


}
