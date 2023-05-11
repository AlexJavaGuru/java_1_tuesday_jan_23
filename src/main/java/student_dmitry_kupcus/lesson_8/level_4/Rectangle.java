package student_dmitry_kupcus.lesson_8.level_4;

public class Rectangle extends Shape {
    double side1;
    double side2;
    public Rectangle(String title, double side1, double side2) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return (side1 + side2) * 2;
    }
}
