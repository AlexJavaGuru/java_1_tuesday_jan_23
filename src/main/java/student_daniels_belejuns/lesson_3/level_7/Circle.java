package student_daniels_belejuns.lesson_3.level_7;

public class Circle {
    private double diameter;
    private double radius;

    public Circle(double radius) {
        this.diameter = 2 * radius;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getLength() {
        return diameter * Math.PI;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {
        return radius;
    }
    public String toString() {
        return "Circle {diameter = " + diameter +
                ", radius = " + radius + '}';
    }
}