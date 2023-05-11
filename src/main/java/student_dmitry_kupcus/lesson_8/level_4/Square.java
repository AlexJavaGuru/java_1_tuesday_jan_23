package student_dmitry_kupcus.lesson_8.level_4;

public class Square extends Shape {
    double side;

    public Square(String title, double side1) {
        super(title);
        this.side = side1;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return (side + side) * 2;
    }
}
