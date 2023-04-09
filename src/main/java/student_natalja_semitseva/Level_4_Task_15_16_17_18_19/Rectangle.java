package student_natalja_semitseva.Level_4_Task_15_16_17_18_19;

public class Rectangle extends Shape{

   public double sideA;
    public double sideB;
   public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;


    }


    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(sideB*sideA);
    }
}
