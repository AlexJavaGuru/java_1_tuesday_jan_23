package student_natalija_rasponomarjova.lesson_8.level_4;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String title, double length, double width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return Math.round (length * width);
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(length+width) * 2;
    }
}
