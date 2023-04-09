package student_julija_raudive.lesson_8.level_4;

class Rectangle extends Shape {

    private double lengthOfSide1;
    private double lengthOfSide2;

    public Rectangle(String title, double lengthOfSide1, double lengthOfSide2) {
        super(title);
        this.lengthOfSide1 = lengthOfSide1;
        this.lengthOfSide2 = lengthOfSide2;
    }

    @Override
    double calculateArea() {
        return lengthOfSide1 * lengthOfSide2;
    }

    @Override
    double calculatePerimeter() {
        return (lengthOfSide1 + lengthOfSide2) * 2;
    }
}
