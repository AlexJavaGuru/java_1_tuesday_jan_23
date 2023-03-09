package student_aleksandrs_lezhennikovs.lesson_8.level_4;


public class Circle extends Shape {

    private int radius;

    public Circle(String title, int radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(2 * Math.PI * radius);
    }

}
