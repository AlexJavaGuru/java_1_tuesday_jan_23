package student_natalja_semitseva.Level_4_Task_15_16_17_18_19;

public class Circle extends Shape {
    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI * radius;
    }

    private double radius;


}
