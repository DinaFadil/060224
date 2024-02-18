package lesson8.AbstractClassLesson8.RemoteSensingSystem;

public class PressureSensor implements Sensor{
    private double offset = 1.0;
    private double pressure = Math.random()*100 + offset;

    @Override
    public void measure() {
        System.out.printf("Pressure: %.1fPa\n", pressure);
    }

    @Override
    public void calibrate() {
        double calibrated = pressure - offset;
        System.out.println("The sensor is calibrated");
        System.out.printf("Calibrated pressure: %.1fC\n", calibrated);
        System.out.printf("Offset: %.1fPa\n", offset);
    }
    
}