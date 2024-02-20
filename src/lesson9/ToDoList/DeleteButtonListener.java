package lesson9.ToDoList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class DeleteButtonListener extends Listener implements ActionListener {

    private JList<ToDo> todoList;

    public DeleteButtonListener(JTextField inputField, JTextField inputFieldDesc, JComboBox<String> dayComboBox, DefaultListModel<ToDo> listModel,JList<ToDo> todoList) {
        super(inputField, inputFieldDesc, dayComboBox, listModel);
        this.todoList = todoList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectIndex = todoList.getSelectedIndex();
        if (selectIndex != -1) {
            super.getListModel().remove(selectIndex);
        } else {
            // Display an error message if no item is selected
            JOptionPane.showMessageDialog(null, "Please select an item to delete.", "No Item Selected", JOptionPane.WARNING_MESSAGE);
        }

    }

}
