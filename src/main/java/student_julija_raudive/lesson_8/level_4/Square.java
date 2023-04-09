package student_julija_raudive.lesson_8.level_4;

class Square extends Shape {

    private double lengthOfSide;

    public Square(String title, double lengthOfSide) {
        super(title);
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    double calculateArea() {
        return lengthOfSide * lengthOfSide;
    }

    @Override
    double calculatePerimeter() {
        return lengthOfSide * 4;
    }
}
