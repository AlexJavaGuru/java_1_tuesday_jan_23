package student_andrejs_cekalins.lesson_8.level_4;

public class Triangle extends Shape {
    private double side;

    public Triangle(String title, double side){
        super(title);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.sqrt(Math.pow(side, 2) - (Math.pow(side, 2) / 4)));
    }

    @Override
    public double calculatePerimeter() {
        return 3 * side;
    }
}
