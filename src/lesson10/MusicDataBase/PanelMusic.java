package lesson10.MusicDataBase;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javafx.event.ActionEvent;

public class PanelMusic extends JFrame {

    private JButton playButton, pauseButton, stopButton, skipButton;
    private JSlider volumeSlider;
    private Clip clip;
    private long clipPosition;

    public PanelMusic() {
        setTitle("Music Player");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        playButton = new JButton("Play");
        pauseButton = new JButton("Pause");
        stopButton = new JButton("Stop");
        skipButton = new JButton("Skip");
        volumeSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        

        playButton.addActionListener(new AddButtonListener());
        pauseButton.addActionListener(new AddButtonListener());
        stopButton.addActionListener(new AddButtonListener());
        skipButton.addActionListener(new AddButtonListener());

        volumeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (clip != null && clip.isRunning()) {
                    System.out.println("Volume slider value changed: " + volumeSlider.getValue());
                    adjustVolume(volumeSlider.getValue());
                }
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

        //setVisible(true);
    }

    private class AddButtonListener implements ActionListener{
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
            skipMusic(10000); // Skip 5 seconds (adjust as needed)
        }
    }
    }
    
}
