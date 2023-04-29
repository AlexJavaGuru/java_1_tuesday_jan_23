package student_daniels_belejuns.lesson_8.level_4;

public class Square extends Shape {
    private double radius;

    public Square(String square, double radius) {
        super(square);
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return radius;
    }
}