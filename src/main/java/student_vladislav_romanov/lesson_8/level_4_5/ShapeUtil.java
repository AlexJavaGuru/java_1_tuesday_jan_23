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

    Shape createRandomShape() {
        int randomNumber = random.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double sumOfAllShapesAreas = 0;
        for (Shape shape : shapes) {
            sumOfAllShapesAreas += shape.calculateArea();
        }
        return sumOfAllShapesAreas;
    }

    double calculatePerimeter(Shape[] shapes) {
        double sumOfAllShapesPerimeters = 0;
        for (Shape shape : shapes) {
            sumOfAllShapesPerimeters += shape.calculatePerimeter();
        }
        return sumOfAllShapesPerimeters;
    }

}
