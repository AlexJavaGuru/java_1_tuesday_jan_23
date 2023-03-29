package student_vladislav_romanov.lesson_8.level_4_5;

import java.util.Random;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble());
    }

    Square createRandomSquare() {
        return new Square("Square", random.nextDouble());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", random.nextDouble(), random.nextDouble());
    }

    Triangle createRandomTriangle() {
        return new Triangle("Triangle", random.nextDouble(), random.nextDouble());
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

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
