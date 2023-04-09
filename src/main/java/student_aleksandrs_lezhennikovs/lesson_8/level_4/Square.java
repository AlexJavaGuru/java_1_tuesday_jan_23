package student_aleksandrs_lezhennikovs.lesson_8.level_4;

public class Square extends Shape {

    private int side;

    public Square(String title, int side) {
        super(title);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

}
