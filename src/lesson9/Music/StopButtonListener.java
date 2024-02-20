package lesson9.Music;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.Clip;

public class StopButtonListener implements ActionListener {

    private Clip clip;
    public long clipPosition;

    public StopButtonListener(Clip clip, long clipPosition) {
        this.clip = clip;
        this.clipPosition = clipPosition;
    }

    public void actionPerformed(ActionEvent e) {
        if (clip != null) {
            clip.stop();
            clipPosition = 0;
        }
    }
}
