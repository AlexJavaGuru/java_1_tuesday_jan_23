package student_vladislav_romanov.lesson_8.level_4_5;

import java.util.Random;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble(100));
    }

    Square createRandomSquare() {
        return new Square("Square", random.nextDouble(100));
    }

}
