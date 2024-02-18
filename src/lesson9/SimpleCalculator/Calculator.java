package lesson9.SimpleCalculator;

/*Simple Calculator: Create a basic calculator with addition,
 subtraction, multiplication, and division functionality.
 */

 import javax.swing.*;
 
 import java.awt.GridLayout;
 import java.awt.event.*;
 
 public class Calculator extends JFrame implements ActionListener {
 
     // GUI components
     private JTextField textField; // Text field to display input and results
     private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals, buttonClear; // Buttons for
                                                                                                         // operations
     private double num1, num2; // Operands
     private char operator; // Operator for the current operation
 
     public Calculator() {
         // Setting up JFrame interface
         setTitle("Simple Calculator");
         setSize(600, 300);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLayout(new GridLayout(5, 1)); // (null);
 
         // Create and add the text field
         textField = new JTextField();
         add(textField);
 
         // Create a panel for the operation buttons
         JPanel buttonPanel = new JPanel();
         buttonPanel.setLayout(new GridLayout(1, 50)); // Layout with 1 row and 5 columns
 
         // Create buttons for each operation and add action listeners
         buttonAdd = new JButton("+");
         buttonAdd.addActionListener(this);
         buttonPanel.add(buttonAdd);
 
         buttonSubtract = new JButton("-");
         buttonSubtract.addActionListener(this);
         buttonPanel.add(buttonSubtract);
 
         buttonMultiply = new JButton("*");
         buttonMultiply.addActionListener(this);
         buttonPanel.add(buttonMultiply);
 
         buttonDivide = new JButton("/");
         buttonDivide.addActionListener(this);
         buttonPanel.add(buttonDivide);
 
         buttonEquals = new JButton("=");
         buttonEquals.addActionListener(this);
         buttonPanel.add(buttonEquals);
 
         // Add the button panel to the frame
         add(buttonPanel);
 
         // Create a clear button and add an action listener
         buttonClear = new JButton("C");
         buttonClear.addActionListener(this);
         add(buttonClear);
     }
 
      // Method to handle button clicks
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();
         if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
             // Set the operator and store the first number
             operator = command.charAt(0);
             num1 = Double.parseDouble(textField.getText());
             textField.setText(""); // Clear the text field for the next input
         } else if (command.equals("=")) {
             // Perform the arithmetic operation when equals is clicked
             num2 = Double.parseDouble(textField.getText());
             double result = 0;
             switch (operator) {
                 case '+':
                     result = num1 + num2;
                     break;
                 case '-':
                     result = num1 - num2;
                     break;
                 case '*':
                     result = num1 * num2;
                     break;
                 case '/':
                     if (num2 != 0) {
                         result = num1 / num2;
                     } else {
                         textField.setText("Error: Division by zero");
                         return;
                     }
                     break;
             }
             textField.setText(String.valueOf(result)); // Display the result in the text field
         } else if (command.equals("C")) {
             textField.setText(""); // Clear the text field
         }
     }
 
     // Main method to create and display the GUI
     public static void main(String[] args) {
         // Run the GUI creation on the event dispatch thread
         SwingUtilities.invokeLater(new Runnable() {
             public void run() {
                 new Calculator().setVisible(true);
             }
         });
     }
 
 }
