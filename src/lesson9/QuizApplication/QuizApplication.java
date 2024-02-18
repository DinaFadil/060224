package lesson9.QuizApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApplication extends JFrame {

    //variables
    private JLabel questionLabel;
    private JRadioButton[] optionButtons;
    private JButton submitButton;
    private int score = 0;
    private int currentQuestionIndex = 0;

    private String[] questions = {
        "Automatic type conversion is possible in which of the possible cases?",
        "What is the size of float and double in java?",
        "Arrays in java are..."
    };

    private String[][] options = {
        {"int to long", "long to int", "short to int"},
        {"32 and 64", "64 and 64", "64 and 32"},
        {"object references", "objects", "primitive data type"}
    };

    private String[] correctAnswers = {"int to long", "32 and 64", "objects"};

     //constructor
    public QuizApplication() {
        setTitle("Quiz Application");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JPanel mainPanel = new JPanel(new BorderLayout());
        questionLabel = new JLabel(questions[currentQuestionIndex]);
        mainPanel.add(questionLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel(new GridLayout(3, 1));
        optionButtons = new JRadioButton[3];
        ButtonGroup buttonGroup = new ButtonGroup();
        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i] = new JRadioButton(options[currentQuestionIndex][i]);
            buttonGroup.add(optionButtons[i]);
            optionsPanel.add(optionButtons[i]);
        }
        mainPanel.add(optionsPanel, BorderLayout.CENTER);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        mainPanel.add(submitButton, BorderLayout.SOUTH);    //submit button positioned at the bottom

        setContentPane(mainPanel);  //to ensure all components displayed within the window
    }

    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Check if an option is selected
            int selectedOption = -1;
            for (int i = 0; i < optionButtons.length; i++) {
                if (optionButtons[i].isSelected()) {
                    selectedOption = i;
                    break;
                }
            }
            if (selectedOption == -1) {
                JOptionPane.showMessageDialog(QuizApplication.this, "Please select an option.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if the selected option is correct
            if (options[currentQuestionIndex][selectedOption].equals(correctAnswers[currentQuestionIndex])) {
                score++;
            }

            // Move to the next question or show the final score
            currentQuestionIndex++;
            if (currentQuestionIndex < questions.length) {
                questionLabel.setText(questions[currentQuestionIndex]);
                for (int i = 0; i < optionButtons.length; i++) {
                    optionButtons[i].setText(options[currentQuestionIndex][i]);
                    optionButtons[i].setSelected(false); // Clear selection
                }
            } else {
                JOptionPane.showMessageDialog(QuizApplication.this, "Quiz completed! Your score: " + score + "/" + questions.length, "Quiz Completed", JOptionPane.INFORMATION_MESSAGE);
                dispose(); // Close the application after quiz completion
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QuizApplication app = new QuizApplication();
            app.setVisible(true);
        });
    }
}
