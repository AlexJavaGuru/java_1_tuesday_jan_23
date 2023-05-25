package student_dmitry_kupcus.lesson_8.level_4;

public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;
    public Triangle(String title, double side1, double side2, double side3) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
