package student_romualds_leitans.lesson_8.level_5;

import student_romualds_leitans.lesson_8.level_4.Shape;
import student_romualds_leitans.lesson_8.level_4.Circle;
import student_romualds_leitans.lesson_8.level_4.Square;
import student_romualds_leitans.lesson_8.level_4.Triangle;
import student_romualds_leitans.lesson_8.level_4.Rectangle;


import java.util.Random;

class ShapeUtil {
    Circle createRandomCircle() {
        Random rnd = new Random();
        double radius = rnd.nextDouble();
        return new Circle(radius);
    }

    Square createRandomSquare() {
        Random rnd = new Random();
        double side = rnd.nextDouble();
        return new Square(side);

    }

    Rectangle createRandomRectangle() {
        Random rnd = new Random();
        double width = rnd.nextDouble();
        double height = rnd.nextDouble();
        return new Rectangle(width, height);
    }

    Triangle createRandomTriangle() {
        Random rnd = new Random();
        double side = rnd.nextDouble();
        return new Triangle(side);
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

    public double calculateArea(Shape[] shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes){
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
    public double calculatePerimeter(Shape[] shapes){
        double totalPerimeter = 0.0;
        for (Shape shape : shapes){
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
