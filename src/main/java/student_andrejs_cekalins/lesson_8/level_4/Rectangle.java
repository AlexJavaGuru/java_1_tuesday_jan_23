package student_andrejs_cekalins.lesson_8.level_4;

public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String title, double length, double width) {
        super(title);
        this.length =length;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
