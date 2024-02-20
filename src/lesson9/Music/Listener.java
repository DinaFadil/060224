package lesson9.Music;

import javax.sound.sampled.Clip;

public abstract class Listener {
    private String filename;
    private Clip clip;
    private long clipPosition;

    public Listener(String fileName){
        this.filename = fileName;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Clip getClip() {
        return clip;
    }

    public long getClipPosition() {
        return clipPosition;
    }

    public void setClipPosition(long clipPosition) {
        this.clipPosition = clipPosition;
    }

}
