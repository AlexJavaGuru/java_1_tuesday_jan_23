package student_vladislav_romanov.lesson_8.level_4;

class Square extends Shape {

    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }
}
