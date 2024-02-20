package lesson9.Music;

//import javax.sound.sampled.Clip;
//import javax.sound.sampled.Clip;
//import javax.sound.sampled.FloatControl;
import javax.swing.*;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;
import java.awt.*;
//import java.awt.event.*;

public class MusicPlayerGUIApp extends JFrame {
    private JButton playButton, pauseButton, stopButton, skipButton;
    //private Clip clip;
    //private long clipPosition;

    public MusicPlayerGUIApp() { // Corrected constructor name
        setTitle("Music Player");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        playButton = new JButton("Play");
        pauseButton = new JButton("Pause");
        stopButton = new JButton("Stop");
        skipButton = new JButton("Skip");

        PlayButtonListener playListener = new PlayButtonListener("DinaMusicGUI2.wav");
        playButton.addActionListener(playListener);

        StopButtonListener stopListener = new StopButtonListener(playListener.getClip(), playListener.getClipPosition());
        stopButton.addActionListener(stopListener);

        //playButton.addActionListener(new PlayButtonListener("DinaMusicGUI2.wav"));
        //pauseButton.addActionListener(new PauseButtonListener());
        //stopButton.addActionListener(new StopButtonListener(clip, clipPosition));
        //skipButton.addActionListener(new SkipButtonListener());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(playButton);
        buttonPanel.add(pauseButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(skipButton);

        add(buttonPanel);
    }

}

