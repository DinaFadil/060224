package lesson9.ToDoList;

import java.awt.Dimension;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class ToDoListManagerApp extends JFrame {
    private JTextField inputField;
    private JTextField inputFieldDesc;
    private JComboBox<String> dayComboBox;
    private JList<ToDo> todoList;
    private DefaultListModel<ToDo> listModel;

    ToDoListManagerApp(){

        // Basic setup
        setTitle("To-Do List Manager App");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel();
        JPanel textPanel = new JPanel();
        JPanel descPanel = new JPanel();
        // JPanel isCompletedPanel = new JPanel();
        JPanel dayPanel = new JPanel();
        JPanel displayPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        // Add label and title input
        JLabel inputLabel = new JLabel("Enter Todo: ");
        inputField = new JTextField(20);
        textPanel.add(inputLabel);
        textPanel.add(inputField);

        // Add day selection combo box
        JLabel dayLabel = new JLabel("Enter Due Date: ");
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        dayComboBox = new JComboBox<>(daysOfWeek);
        dayPanel.add(dayLabel);
        dayPanel.add(dayComboBox);

        // Add label and description input
        JLabel descLabel = new JLabel("Enter Description: ");
        inputFieldDesc = new JTextField(20);
        descPanel.add(descLabel);
        descPanel.add(inputFieldDesc);

        // Add display panel
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(todoList);
        scrollPane.setPreferredSize(new Dimension(300, 200));
        displayPanel.add(scrollPane);

        // Add add button
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener(inputField, inputFieldDesc, dayComboBox, listModel));

        // delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener(inputField, inputFieldDesc, dayComboBox, listModel, todoList));
        buttonPanel.add(deleteButton);

        JButton printButton = new JButton("Print list");
        printButton.addActionListener(new PrintButtonListener(inputField, inputFieldDesc, dayComboBox, listModel));
        buttonPanel.add(printButton);

        // add all to main panel
        mainPanel.add(textPanel);
        mainPanel.add(descPanel);
        mainPanel.add(dayPanel);
        mainPanel.add(addButton);
        mainPanel.add(displayPanel);
        mainPanel.add(buttonPanel);

        add(mainPanel);
    }

}