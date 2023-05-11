package student_dmitry_kupcus.lesson_8.level_5;
import student_dmitry_kupcus.lesson_8.level_4.*;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        double createRandom = random.nextInt(10);
        return new Circle("Circle", createRandom);

    }

    Square createRandomSquare() {
        Random random = new Random();
        double createRandom = random.nextInt(10);
        return new Square("Square", createRandom);
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        double createRandom = random.nextInt(10);
        return new Rectangle("Rectangle", createRandom, createRandom);
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        double createRandom = random.nextInt(10);
        return new Triangle("Triangle", createRandom, createRandom, createRandom);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
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
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
