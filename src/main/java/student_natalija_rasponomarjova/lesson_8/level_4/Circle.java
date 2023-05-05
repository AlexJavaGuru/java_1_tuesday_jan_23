package student_natalija_rasponomarjova.lesson_8.level_4;

public class Circle extends Shape {
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public double calculatePerimeter() {

        return Math.round(2 * Math.PI * radius);
    }
}

