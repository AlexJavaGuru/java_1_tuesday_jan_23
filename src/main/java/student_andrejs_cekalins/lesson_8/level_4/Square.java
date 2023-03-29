package student_andrejs_cekalins.lesson_8.level_4;

public class Square extends Shape {
    private double side;
    public Square(String title, double side) {
        super(title);
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
