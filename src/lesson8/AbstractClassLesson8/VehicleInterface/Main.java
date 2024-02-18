package lesson8.AbstractClassLesson8.VehicleInterface;

public class Main {
    public static void main(String[] args) {
        
        //create instance of car and bicycle
        Car myCar = new Car();
        Bicycle myBicycle = new Bicycle();

        //car behaviour
        System.out.println("My Car Behaviour:");
        myCar.start();
        myCar.stop();
        myCar.accelerate(100);
        myCar.brake(40);

        //bicycle behaviour
        System.out.println("My Bicycle Behaviour:");
        myBicycle.start();
        myBicycle.stop();
        myBicycle.accelerate(30);
        myBicycle.brake(5);
    }
}