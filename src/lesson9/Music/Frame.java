package lesson9.Music;

//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
//import java.io.File;

public abstract class Frame extends JFrame implements ActionListener{
    private JButton playButton, pauseButton, stopButton, skipButton;
    private JSlider volumeSlider;
    private Clip clip;
    //private long clipPosition;

    public Frame() {
        setTitle("Music Player");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        playButton = new JButton("Play");
        pauseButton = new JButton("Pause");
        stopButton = new JButton("Stop");
        skipButton = new JButton("Skip");
        volumeSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);

        playButton.addActionListener(this);
        pauseButton.addActionListener(this);
        stopButton.addActionListener(this);
        skipButton.addActionListener(this);

        volumeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                adjustVolume(volumeSlider.getValue());
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(playButton);
        buttonPanel.add(pauseButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(skipButton);

        JPanel volumePanel = new JPanel();
        volumePanel.setLayout(new BorderLayout());
        volumePanel.add(new JLabel("Volume:"), BorderLayout.WEST);
        volumePanel.add(volumeSlider, BorderLayout.CENTER);

        add(buttonPanel);
        add(volumePanel);
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

    public abstract void playMusic(String i);
    public abstract void stopMusic();
    public abstract void skipMusic(long m);
    
}
