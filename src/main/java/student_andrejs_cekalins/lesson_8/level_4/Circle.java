package student_andrejs_cekalins.lesson_8.level_4;

public class Circle extends Shape{
    private double radius;
    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(radius * this.radius * Math.PI);
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(2 * Math.PI * this.radius);
    }
}
