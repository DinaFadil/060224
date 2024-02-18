package lesson9.ToDoListManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Todo List Manager: Develop a GUI application for managing 
//a todo list with features like adding tasks, marking them as completed, 
//and deleting them.


public class ToDoListManager extends JFrame{

    private JTextField taskTextField; //This variable is likely used to get user input for adding tasks to the todo list
    @SuppressWarnings("rawtypes")
    private JList todoList; // it's a list that will contain strings representing tasks.
    @SuppressWarnings("rawtypes")
    private DefaultListModel todoListModel; //model for a list component and is used to manage the data (tasks in this case) displayed in the JList.
    

    //constructor 
    @SuppressWarnings ("unchecked")
    public ToDoListManager() {
        setTitle ("To Do List");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //creating object for the panel
        JPanel panel = new JPanel();

        //begin with the user interface
        
        //textField
        JPanel inputJPanel = new JPanel();
        JLabel todoLabel = new JLabel("Task");
        taskTextField = new JTextField(20);


        //add button
        
        JButton addButton = new JButton("Add task");
        addButton.addActionListener(new AddButtonListener());
        panel.add(todoLabel);
        panel.add(taskTextField);
        panel.add(addButton);
        add(panel);

        //scroll list
        todoListModel = new DefaultListModel<>();
        todoList = new JList <> (todoListModel);
        JScrollPane scrollPane = new JScrollPane(todoList);

        //complete button
                                                                        //This line creates a new JButton instance with the label "Mark as Completed".
        JButton completeButton = new JButton(" Mark as Completed"); // This button will be used to trigger the action of marking a task as completed.
        completeButton.addActionListener(new CompleteButtonListener()); //create a new instance of the. 
        panel.add(inputJPanel); 
        panel.add(scrollPane); //3 These lines add components to the
        panel.add(completeButton);
        add(panel); //Adds the panel (containing various components) to the JFrame.

        //delete button
        JButton deleteButton = new JButton("Delete task");
        deleteButton.addActionListener(new DeleteButtonListener());

        //action for the interface
        panel.add(inputJPanel);
        panel.add(scrollPane);
        panel.add(deleteButton);
        add(panel);
    
    }  //begin with the method
    private class AddButtonListener implements ActionListener {

        @SuppressWarnings("unchecked")
        @Override
        public void actionPerformed(ActionEvent e) { 
            String task = taskTextField.getText().trim();
            if (!task.isEmpty()) {
                todoListModel.addElement(task);
                taskTextField.setText("");
            }
        }
    }
    private class CompleteButtonListener implements ActionListener {

        @SuppressWarnings("unchecked")
        @Override
        public void actionPerformed(ActionEvent e) { //this is the constructor for the complete button method
            int selectTask = todoList.getSelectedIndex(); //This line retrieves the index of the selected item in the JList.
            if (selectTask != -1) { //Checks if an item is selected 
                todoListModel.setElementAt("[Completed]" + todoListModel.getElementAt(selectTask), selectTask);
            }
        }
        
    }
    class DeleteButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           int selectTask = todoList.getSelectedIndex();
           if (selectTask != -1) {
            todoListModel.remove(selectTask);
           }
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ToDoListManager app = new ToDoListManager();
            app.setVisible(true);
        });
    }
    
} 
