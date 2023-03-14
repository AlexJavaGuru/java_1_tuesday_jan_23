package student_oksana_tarasova.lesson_8.level_4;

public class Triangle extends Shape {

    private double sideLength;

    public Triangle(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }


    @Override
    public double calculateArea() {
        double halfPerimeter = (sideLength * 3) / 2;
        double halfPerimeterMinusSideLength = halfPerimeter - sideLength;
        double countArea = Math.sqrt(halfPerimeter * halfPerimeterMinusSideLength * halfPerimeterMinusSideLength * halfPerimeterMinusSideLength);
        double area = Math.ceil(countArea);
        return area;

    }

    @Override
    public double calculatePerimeter() {
        double perimeter = sideLength * 3;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideLength=" + sideLength +
                "} " + super.toString();
    }
}
