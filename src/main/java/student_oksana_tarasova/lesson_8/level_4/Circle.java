package student_oksana_tarasova.lesson_8.level_4;

public class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double areaCircle = 3.14 * (radius * radius);
        return areaCircle;
    }

    @Override
    public double calculatePerimeter() {
        double perimeterCircle = 2 * 3.14 * radius;
        return perimeterCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
