package student_vladislav_romanov.lesson_8.level_4_5;

import java.util.Random;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble(10));
    }

    Square createRandomSquare() {
        return new Square("Square", random.nextDouble(10));
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", random.nextDouble(10), random.nextDouble(10));
    }

    Triangle createRandomTriangle() {
        return new Triangle("Triangle", random.nextDouble(10), random.nextDouble(10));
    }
}
