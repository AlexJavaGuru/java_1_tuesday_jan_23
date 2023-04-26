package student_daniels_belejuns.lesson_8.level_5;

import student_daniels_belejuns.lesson_8.level_4.*;

import java.util.Random;

public class ShapeUtil {


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
        double sideARandom = random.nextDouble();
        double sideBRandom = random.nextDouble();
        double sideCRandom = random.nextDouble();
        return new Triangle("Triangle", sideRandom, sideARandom, sideBRandom, sideCRandom);
    }

    Shape createRandomShape() {
        Random random = new Random();
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
        double sumAllShapesAreas = 0;
        for (int i = 0; i < shapes.length; i++) {
            sumAllShapesAreas += shapes[i].calculateArea();
        }
        return sumAllShapesAreas;
    }

    double calculatePerimeter(Shape[] shapes) {
        double sumAllShapesAreas = 0;
        for (int i = 0; i < shapes.length; i++) {
            sumAllShapesAreas += shapes[i].calculatePerimeter();
        }
        return sumAllShapesAreas;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}