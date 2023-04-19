package student_ilya_tihonov.lesson_8.level_4_5;

class Rectangle extends Shape{

    double longSide;
    double shirtSide;

    Rectangle(double longSide, double shirtSide, String title) {
        super(title);
        this.longSide = longSide;
        this.shirtSide = shirtSide;
    }

    @Override
    double calculateArea() {
        return longSide * shirtSide;
    }

    @Override
    double perimeterCount() {
        return (longSide * 2) + (shirtSide * 2);
    }
}
