package lesson10.ToDoList;

import javax.swing.SwingUtilities;

public class Main {
     public static void main(String[] args) {
        // Using this method to generate GUI
        SwingUtilities.invokeLater(() -> {
            ToDoListManagerApp app = new ToDoListManagerApp();
            app.setVisible(true);
        });
    }
    
}
