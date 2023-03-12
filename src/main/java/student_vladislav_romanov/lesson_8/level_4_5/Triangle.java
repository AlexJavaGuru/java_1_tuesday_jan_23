package student_vladislav_romanov.lesson_8.level_4_5;

class Triangle extends Shape {

    private double side;
    private double height;

    Triangle(String title, double side, double height) {
        super(title);
        this.side = side;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * side * height;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }

}
