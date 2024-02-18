package lesson8.AbstractClassLesson8.VehicleInterface;

public class Bicycle implements Vehicle{

    
    @Override
    public void start() {
       System.out.println("Bicycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle is stopping");
        currentSpeed = 0;
    }

    //declare the default speed 
    private double currentSpeed = 0;

    @Override
    public void accelerate(double speed) {
       currentSpeed += speed;
       System.out.println("Bicycle is speeding:" + currentSpeed + "km/hour");
    }

    @Override
    public void brake(double speed) {
        currentSpeed -= speed;
       System.out.println("Bicycle is stopping:" + currentSpeed + "km/hour");
    }
    
}
