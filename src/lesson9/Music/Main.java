package lesson9.Music;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MusicPlayerGUI app = new MusicPlayerGUI();
            app.setVisible(true);
        });
    }
    
}
