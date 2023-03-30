package student_romualds_leitans.lesson_8.level_4;

public class Triangle extends Shape {

    private double side;

    public Triangle(double side) {
        super("Triangle");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * side;
    }
}
