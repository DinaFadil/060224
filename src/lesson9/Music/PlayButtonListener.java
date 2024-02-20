package lesson9.Music;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlayButtonListener extends Listener implements ActionListener {
    private String filePath;
    private Clip clip;
    private long clipPosition;

    public PlayButtonListener(String filename) {
        super(filename);
        this.filePath = filename;
    }

    public void actionPerformed(ActionEvent e) {
        if (clip == null) {
            playm(filePath);
        } else {
            clip.setMicrosecondPosition(clipPosition);
            clip.start();
        }
    }

    public void playm(String filePath) {
        try {
            File musicFile = new File(filePath);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicFile);
            clip = AudioSystem.getClip(); // Initialize the class-level clip variable
            clip.open(audioInput);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}



/*package lesson9.Music;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlayButtonListener extends Listener implements ActionListener {
    private String filePath;
    public Clip clip;
    public long clipPosition;

    public PlayButtonListener(String filename) {
        super(filename);
        this.filePath = filename;
    }

    public void actionPerformed(ActionEvent e) {
        if (clip == null) {
            playm(filePath);
        } else {
            clip.setMicrosecondPosition(clipPosition);
            clip.start();
        }
    }

    public void playm(String filePath) {
        try {
            File musicFile = new File(filePath);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicFile);
            clip = AudioSystem.getClip(); // Initialize the class-level clip variable
            clip.open(audioInput);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
 */

