package student_daniels_belejuns.lesson_8.level_4;

public class Rectangle extends Shape {

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
        return 2 * (sideB * sideA);
    }
}
