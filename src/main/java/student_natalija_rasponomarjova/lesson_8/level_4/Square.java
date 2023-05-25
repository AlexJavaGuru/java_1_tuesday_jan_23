package student_natalija_rasponomarjova.lesson_8.level_4;

public class Square extends Shape {
    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.round(side * side);
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(side * 4);
    }
}
