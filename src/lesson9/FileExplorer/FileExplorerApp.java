package lesson9.FileExplorer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class FileExplorerApp extends JFrame {

    public FileExplorerApp() {

        // Basic setup
        setTitle("File Explorer App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel();

        // Button
        // create a button object
        JButton openFileExplorerButton = new JButton("Open File Explorer");
        // assigned what the button do
        openFileExplorerButton.addActionListener(new OpenFileListener());

        // add button to main panel
        mainPanel.add(openFileExplorerButton);
        // add main panel to the body
        add(mainPanel);
    }

    private class OpenFileListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            // Standard Swing component for file and directory selection
            JFileChooser fileChooser = new JFileChooser();
            // Control file selection mode (access level)
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            
            // show pop-ups and return int
            // returns an integer value representing the user's choice
            int option = fileChooser.showOpenDialog(null);

            // Check whether the choice equal to approve or cancel
            if (option == JFileChooser.APPROVE_OPTION) {
                // assign the selected file to a File class type object 
                File selectedDirectory = fileChooser.getSelectedFile();
                // show the path of selected files
                System.out.println("Selected Directory: " + selectedDirectory.getAbsolutePath());
                // perform further actions with the selected directory here
            } else {
                System.out.println("No directory selected.");
            }
        }

    }

    public static void main(String[] args) {
        // Using this method to generate GUI
        SwingUtilities.invokeLater(() -> {
            FileExplorerApp app = new FileExplorerApp();
            app.setVisible(true);
        });
    }

}
