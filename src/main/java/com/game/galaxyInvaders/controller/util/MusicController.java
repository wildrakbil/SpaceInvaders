package com.game.galaxyInvaders.controller.util;

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

    private static MusicController _musicController;
    private Clip _clip;


    public void MusicController() {
        _musicController = new MusicController();
    }

    public static MusicController getInstance() {
        createIntance();
        return _musicController;
    }

    private synchronized static void createIntance() {
        if (_musicController == null) {
            _musicController = new MusicController();
        }
    }

    public void addSong(File file) {
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream(file)));
            _clip = AudioSystem.getClip();
            _clip.open(audioIn);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void play() {
        _clip.start();
    }


    public void stop() {
        _clip.stop();
    }
}
