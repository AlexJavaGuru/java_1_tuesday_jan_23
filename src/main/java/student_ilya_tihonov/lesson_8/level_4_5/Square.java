package student_ilya_tihonov.lesson_8.level_4_5;

public class Square extends Shape{

    private int side;

    Square(int side, String title) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.pow (side, 2);
    }

    @Override
    double perimeterCount() {
        return side * 4;
    }
}
