package student_ilya_tihonov.lesson_8.level_4_5;

class Triangle extends Shape{

    double side;
    double height;

    Triangle(double side, double height, String title) {
        super(title);
        this.side = side;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return side * height / 2;
    }

    @Override
    double perimeterCount() {
        return side * 3;
    }
}
