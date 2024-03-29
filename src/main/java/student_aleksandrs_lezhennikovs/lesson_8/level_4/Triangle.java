package student_aleksandrs_lezhennikovs.lesson_8.level_4;

public class Triangle extends Shape {

    private int side;

    public Triangle(String title, int side) {
        super(title);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                '}';
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.pow(side, 2) * Math.sqrt(3) / 4);
    }

    @Override
    public double calculatePerimeter() {
        return side * 3;
    }
}
