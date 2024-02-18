package lesson9.Music;

import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MusicPlayerGUI extends JFrame implements ActionListener {
    private JButton playButton, pauseButton, stopButton, skipButton;
    private JSlider volumeSlider;
    private Clip clip;
    private long clipPosition;

    public MusicPlayerGUI() {
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

    @Override
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

    private void playMusic(String filePath) {
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

    private void stopMusic() {
        if (clip != null) {
            clip.stop();
            clipPosition = 0;
        }
    }

    private void skipMusic(long milliseconds) {
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

    private void adjustVolume(int volume) {
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MusicPlayerGUI app = new MusicPlayerGUI();
            app.setVisible(true);
        });
    }

    /*public static void main(String[] args) {
        SwingUtilities.invokeLater(MusicPlayerGUI::new);
    } */

}

