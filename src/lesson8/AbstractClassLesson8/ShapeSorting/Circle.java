package lesson8.AbstractClassLesson8.ShapeSorting;

class Circle implements SortableShape {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double area() {

        return Math.PI * radius * radius;
    }

    @Override
    public String getShapeName() {

        return "Circle";
    }
}