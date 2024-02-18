package lesson9.TemperatureConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {

    // Declare instance variables for the input and output text fields, button, and
    // labels
    private JTextField textFieldInput, textFieldOutput; // Text fields for user input and output
    private JButton buttonConvert; // Button to trigger temperature conversion
    private JLabel labelInput, labelOutput; // Labels for input and output components

    // Constructor for the TemperatureConverter class
    public TemperatureConverter() {
        
        setTitle("Temperature Converter");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Create input components
        labelInput = new JLabel("Enter Temperature (Celsius): ");
        add(labelInput);
        textFieldInput = new JTextField();
        textFieldInput.setFont(new Font("Arial", Font.PLAIN, 30)); // Set font size to 16
        add(textFieldInput);

        // Create output components
        labelOutput = new JLabel("Temperature (Fahrenheit): ");

        add(labelOutput);
        textFieldOutput = new JTextField();
        textFieldOutput.setEditable(false); // Output field is not editable
        add(textFieldOutput);

        add(new JLabel());

        // Create button
        buttonConvert = new JButton("Convert");
        buttonConvert.addActionListener(this); // Add action listener to the button
        buttonConvert.setBackground(Color.GREEN);
        buttonConvert.setForeground(Color.WHITE);
        add(buttonConvert);
    }

    // Action listener method for button click
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonConvert) {
            // Convert temperature from Celsius to Fahrenheit
            try {
                double celsius = Double.parseDouble(textFieldInput.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                textFieldOutput.setFont(new Font("Arial", Font.PLAIN, 30));
                textFieldOutput.setText(String.format("%.2f", fahrenheit)); // Display result with 2 decimal places
            } catch (NumberFormatException ex) {
                textFieldOutput.setText("Invalid Input");
            }
        }
    }

    // Main method to create and display the GUI
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverter().setVisible(true);
            }
        });
    }
}
