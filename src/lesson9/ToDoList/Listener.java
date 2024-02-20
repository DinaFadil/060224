package lesson9.ToDoList;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public abstract class Listener {

    private JTextField inputField;
    private JTextField inputFieldDesc;
    private JComboBox<String> dayComboBox;
    private DefaultListModel<ToDo> listModel;

    public Listener(JTextField inputField, JTextField inputFieldDesc , JComboBox<String> dayComboBox, DefaultListModel<ToDo> listModel) {
        this.inputField = inputField;
        this.dayComboBox = dayComboBox;
        this.listModel = listModel;
        this.inputFieldDesc = inputFieldDesc;
    }

    public JTextField getInputField() {
        return inputField;
    }

    public JComboBox<String> getDayComboBox() {
        return dayComboBox;
    }

    public DefaultListModel<ToDo> getListModel() {
        return listModel;
    }

    public JTextField getInputFieldDesc() {
        return inputFieldDesc;
    }

    
}