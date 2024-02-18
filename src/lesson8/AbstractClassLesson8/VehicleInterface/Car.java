package lesson8.AbstractClassLesson8.VehicleInterface;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car engine is starting!");
    }

    @Override
    public void stop() {
        System.out.println("Car engine is stopping");
    }

    //declare the default speed
    private double currentSpeed = 0;

    @Override
    public void accelerate(double speed) {
            currentSpeed += speed;
            System.out.println("Car is speeding, current speed:" + currentSpeed + "km/hour");
    
        }

    @Override
    public void brake(double speed) {
            currentSpeed -= speed;
            System.out.println("Car is braking, current speed:" + currentSpeed + "km/hour");
        }
        
    }
    