package lesson10.ToDoList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddButtonListener extends Listener implements ActionListener {


    public AddButtonListener(JTextField inputField, JTextField inputFieldDesc, JComboBox<String> dayComboBox, DefaultListModel<ToDo> listModel) {
        super(inputField, inputFieldDesc, dayComboBox, listModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String todoTitle = super.getInputField().getText().trim();
        String todoDue = (super.getDayComboBox().getSelectedItem()).toString();
        String todoDesc = super.getInputFieldDesc().getText().trim();

        if (!todoTitle.isEmpty() && !todoDesc.isEmpty()) {
            ToDo todoObj = new ToDo(todoTitle, todoDue, new ToDo.TaskDetails(todoDesc));
            super.getListModel().addElement(todoObj);
            super.getInputField().setText("");
            super.getInputFieldDesc().setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid to-do item.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}