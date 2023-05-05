package student_natalija_rasponomarjova.lesson_8.level_5;

import student_natalija_rasponomarjova.lesson_8.level_4.Circle;
import student_natalija_rasponomarjova.lesson_8.level_4.Triangle;
import student_natalija_rasponomarjova.lesson_8.level_4.Square;
import student_natalija_rasponomarjova.lesson_8.level_4.Rectangle;
import student_natalija_rasponomarjova.lesson_8.level_4.Shape;

import java.util.Random;

class ShapeUtil {
    Circle createRandomCircle() {
        Random random = new Random();
        double radiusRandom = random.nextDouble();
        return new Circle("Circle", radiusRandom);
    }

    Square createRandomSquare() {
        Random random = new Random();
        double sideRandom = random.nextDouble();
        return new Square("Square", sideRandom);
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        double lengthRandom = random.nextDouble();
        double widthRandom = random.nextDouble();
        return new Rectangle("Rectangle", lengthRandom, widthRandom);
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        double sideRandom = random.nextDouble();
        return new Triangle("Triangle", sideRandom);
    }

    Shape createRandomShape() {
        Random random = new Random();
        int randomNumber = random.nextInt();
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
        double totalArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].calculateArea();
        }
        return totalArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalPerimeter += shapes[i].calculatePerimeter();
        }
        return totalPerimeter;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}






