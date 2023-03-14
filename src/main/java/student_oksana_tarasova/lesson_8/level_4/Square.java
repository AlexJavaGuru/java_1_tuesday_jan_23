package student_oksana_tarasova.lesson_8.level_4;

public class Square extends Shape {

    private double sideLength;

    public Square(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }


    @Override
    public double calculateArea() {
       double area = sideLength * sideLength;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = sideLength * 4;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                "} " + super.toString();
    }
}
