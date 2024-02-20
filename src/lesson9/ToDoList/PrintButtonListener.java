package lesson9.ToDoList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PrintButtonListener extends Listener implements ActionListener {

    public PrintButtonListener(JTextField inputField, JTextField inputFieldDesc, JComboBox<String> dayComboBox, DefaultListModel<ToDo> listModel) {
        super(inputField, inputFieldDesc, dayComboBox, listModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        saveToFile("to_do_list_output.txt");
    }

    private void saveToFile(String filename) {
        // No buffer reader since there is no file to read
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < super.getListModel().getSize(); i++) {
                writer.write(super.getListModel().getElementAt(i).toString());
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "To-Do items successfully saved to file.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving to file: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}