package student_julija_raudive.lesson_8.level_4;

class Triangle extends Shape {

    private double lengthOfSide;

    public Triangle(String title, double lengthOfSide) {
        super(title);
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    double calculateArea() {
        return (lengthOfSide * lengthOfSide * Math.sqrt(3)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return lengthOfSide * 3;
    }
}
