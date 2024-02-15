package lesson4.FinalClass;

public final class CircleFinal {
    private final double radius;
    private final double PI = 3.14159;
    
    public CircleFinal(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return PI * radius * radius;
    }
}
