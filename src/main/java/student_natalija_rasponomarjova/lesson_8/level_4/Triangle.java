package student_natalija_rasponomarjova.lesson_8.level_4;

public class Triangle extends Shape {
    private double side;
    private double height;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;

    }
    @Override
    public double calculatePerimeter() {

        return Math.round(side * 3);
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(3)/4 * side * side;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle", 10);
        System.out.println(triangle.calculateArea());
    }
}

