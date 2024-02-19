package lesson9.Music;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
//import javax.sound.sampled.FloatControl;
import javax.swing.*;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;
//import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MusicPlayerGUI extends Frame1 implements MusicPlayerHelper{
    private JButton playButton, pauseButton, stopButton, skipButton;
    private JSlider volumeSlider;
    private Clip clip;
    private long clipPosition;

    //@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playButton) {
            if (clip == null) {
                playMusic("DinaMusicGUI2.wav");
            } else {
                clip.setMicrosecondPosition(clipPosition);
                clip.start();
            }
        } else if (e.getSource() == pauseButton) {
            if (clip != null && clip.isRunning()) {
                clipPosition = clip.getMicrosecondPosition();
                clip.stop();
            }
        } else if (e.getSource() == stopButton) {
            stopMusic();
        } else if (e.getSource() == skipButton) {
            skipMusic(10000); // Skip 10 seconds (adjust as needed)
        }
    }

    //@Override
    public void playMusic(String filePath) {
        try {
            File musicFile = new File(filePath);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicFile);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            volumeSlider.setValue(50); // Set initial volume
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //@Override
    public void stopMusic() {
        if (clip != null) {
            clip.stop();
            clipPosition = 0;
        }
    }

    public void adjustVolume(int volume) {
        if (clip != null) {
            try {
                FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                float dB = (float) (Math.log(volume / 100.0) / Math.log(10.0) * 20.0);
                gainControl.setValue(dB);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //@Override
    public void skipMusic(long milliseconds) {
        if (clip != null && clip.isRunning()) {
            long currentPosition = clip.getMicrosecondPosition() / 1000; // Convert to milliseconds
            long newPosition = currentPosition + milliseconds;
            long clipLength = clip.getMicrosecondLength() / 1000; // Convert to milliseconds

            // Ensure the new position is within the bounds of the clip
            if (newPosition < 0) {
                newPosition = 0;
            } else if (newPosition > clipLength) {
                newPosition = clipLength;
            }

            clip.setMicrosecondPosition(newPosition * 1000); // Convert back to microseconds
        }
    }

    
}
