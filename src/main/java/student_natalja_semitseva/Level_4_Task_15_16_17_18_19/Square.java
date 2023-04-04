package student_natalja_semitseva.Level_4_Task_15_16_17_18_19;

public class Square extends Shape {
    private double radius;

    public Square(String square, double radius) {
        super(square);
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return radius;
    }
}

