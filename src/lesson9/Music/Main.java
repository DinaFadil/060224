package lesson9.Music;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MusicPlayerGUIApp app = new MusicPlayerGUIApp();
            app.setVisible(true);
        });
    }
    
}
