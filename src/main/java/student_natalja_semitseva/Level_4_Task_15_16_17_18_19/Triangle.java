package student_natalja_semitseva.Level_4_Task_15_16_17_18_19;

public class Triangle extends Shape{


    public Triangle(String title, double side, double sideARandom, double sideBRandom, double sideCRandom) {
        super(title);


    }
    private double sideA;
    private double sideB;
    private double sideC;
    private double base;
    private double height;

    public Triangle(String title, double sideA, double sideB, double sideC, double base, double height) {
        super (title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 *base * height;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }


}
