package student_aleksandrs_lezhennikovs.lesson_8.level_4;

public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    public Rectangle(String title, int sideA, int sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return sideA * 2 + sideB * 2;
    }
 }
