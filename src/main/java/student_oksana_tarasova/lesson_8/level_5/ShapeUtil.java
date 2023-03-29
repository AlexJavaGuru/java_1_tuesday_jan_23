package student_oksana_tarasova.lesson_8.level_5;

import student_oksana_tarasova.lesson_8.level_4.*;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        Circle circle = new Circle("circle", random.nextDouble(10));
        return circle;
    }

    Square createRandomSquare() {
        Random random = new Random();
        Square square = new Square("square", random.nextDouble(10));
        return square;
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        Rectangle rectangle = new Rectangle("rectangle", random.nextDouble(10), random.nextDouble(10));
        return rectangle;
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        Triangle triangle = new Triangle("triangle", random.nextDouble(10));
        return triangle;
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        return switch (randomNumber) {
            case 0 -> createRandomCircle();
            case 1 -> createRandomSquare();
            case 2 -> createRandomRectangle();
            default -> createRandomTriangle();
        };
    }

    double calculateArea(Shape[] shapes) {
        double totalAreaOfTheArray = 0;
        for (Shape shape : shapes) {
            totalAreaOfTheArray += shape.calculateArea();
        }
        return totalAreaOfTheArray;
    }

    double calculatePerimeter(Shape[] shapes) {
        double totalPerimeterFromTheArray = 0;
        for (Shape shape : shapes) {
            totalPerimeterFromTheArray += shape.calculatePerimeter();
        }
        return totalPerimeterFromTheArray;
    }

    static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    static double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
