package lesson9.Music;

// MusicPlayerHelper interface
interface MusicPlayerHelper {
    void playMusic(String filePath); // Method to play music
    void stopMusic(); // Method to stop music
    void skipMusic(long milliseconds); // Method to skip music
    void adjustVolume(int volume); // Method to adjust volume
}
