package lesson9.WeatherApp;

//final code

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class WeatherApp extends JFrame {
    private JLabel weatherTitle;
    private JLabel weatherLocation;
    private JLabel temperatureLabel;
    private JLabel humidityLabel;

    public WeatherApp() {
        setTitle("Weather");
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();

        // label
        weatherTitle = new JLabel("Today's Weather: ");
        weatherLocation = new JLabel("Choose Location:");
        temperatureLabel = new JLabel("Temperature: N/A");
        humidityLabel = new JLabel("Humidity: N/A");

        // buttons
        JButton loadKTButton = new JButton("Kuala Terengganu");
        loadKTButton.addActionListener(e -> loadKTWeatherData());

        JButton loadKLButton = new JButton("Kuala Lumpur");
        loadKLButton.addActionListener(e -> loadKLWeatherData());

        JButton loadKBButton = new JButton("Kota Bharu");
        loadKBButton.addActionListener(e -> loadKBWeatherData());

        // buttons panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 3));
        buttonsPanel.add(loadKTButton);
        buttonsPanel.add(loadKLButton);
        buttonsPanel.add(loadKBButton);

        // main panel
        panel.add(weatherTitle);
        panel.add(weatherLocation);
        panel.add(buttonsPanel);
        panel.add(temperatureLabel);
        panel.add(humidityLabel);
        
        add(panel);

    }

    // load data from WeatherKT.txt
    private void loadKTWeatherData() {
        String filePath = "KualaTerengganu.txt";

        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("[") && line.endsWith("]")) {

                    // these code assume that line 0, 1, 2 are... 
                    // ...city line, temperature line and humidity line respectively
                    String city = line.substring(1, line.length() - 1);
                    String tempLine = reader.readLine().trim();
                    String humLine = reader.readLine().trim();

                    // extract and convert the string to double data type 
                    // Line.substring = extracts a substring from line
                    // + 2: adds 2 to the index obtained from indexOf(":")
                    // to skip the colon and the space following it
                    double temperature = Double.parseDouble(tempLine.substring(tempLine.indexOf(":") + 2));
                    double humidity = Double.parseDouble(humLine.substring(humLine.indexOf(":") + 2));

                    weatherLocation.setText(city);
                    temperatureLabel.setText("Temperature in " + ": " + temperature + " °C");
                    humidityLabel.setText("Humidity in " + ": " + humidity + "%");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    // load data from WeatherKL.txt
    private void loadKLWeatherData() {
        String filePath = "KualaLumpur.txt";

        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("[") && line.endsWith("]")) {

                    String city = line.substring(1, line.length() - 1);
                    String tempLine = reader.readLine().trim();
                    String humLine = reader.readLine().trim();

                    double temperature = Double.parseDouble(tempLine.substring(tempLine.indexOf(":") + 2));
                    double humidity = Double.parseDouble(humLine.substring(humLine.indexOf(":") + 2));

                    weatherLocation.setText(city);
                    temperatureLabel.setText("Temperature in " + ": " + temperature + " °C");
                    humidityLabel.setText("Humidity in " + ": " + humidity + "%");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    // load data from WeatherKB.txt
    private void loadKBWeatherData() {
        String filePath = "KotaBahru.txt";

        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("[") && line.endsWith("]")) {

                    String city = line.substring(1, line.length() - 1);
                    String tempLine = reader.readLine().trim();
                    String humLine = reader.readLine().trim();

                    double temperature = Double.parseDouble(tempLine.substring(tempLine.indexOf(":") + 2));
                    double humidity = Double.parseDouble(humLine.substring(humLine.indexOf(":") + 2));

                    weatherLocation.setText(city);
                    temperatureLabel.setText("Temperature in " + ": " + temperature + " °C");
                    humidityLabel.setText("Humidity in " + ": " + humidity + "%");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WeatherApp app = new WeatherApp();
            app.setVisible(true);
        });
    }

}