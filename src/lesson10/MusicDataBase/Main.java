package lesson10.MusicDataBase;

import java.sql.SQLException;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MusicPlayerGUI3 app = new MusicPlayerGUI3();
            app.setVisible(true);
        });
    }
    
}
