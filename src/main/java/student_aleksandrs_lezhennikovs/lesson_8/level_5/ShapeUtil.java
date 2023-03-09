package student_aleksandrs_lezhennikovs.lesson_8.level_5;

import student_aleksandrs_lezhennikovs.lesson_8.level_4.*;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        int radiusRandom = random.nextInt(10);
        return new Circle("Circle", radiusRandom);
    }

    Square createRandomSquare() {
        Random random = new Random();
        int sideRandom = random.nextInt(10);
        return new Square("Square", sideRandom);
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        int sideARandom = random.nextInt(10);
        int sideBRandom = random.nextInt(10);
        return new Rectangle("Rectangle", sideARandom, sideBRandom);
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        int sideRandom = random.nextInt(10);
        return new Triangle("Triangle", sideRandom);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        switch (randomNumber) {
            case 0 :
                return createRandomCircle();
            case 1 :
                return createRandomSquare();
            case 2 :
                return createRandomRectangle();
            default :
                return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
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
