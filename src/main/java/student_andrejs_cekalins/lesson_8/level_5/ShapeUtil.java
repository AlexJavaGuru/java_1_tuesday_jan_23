package student_andrejs_cekalins.lesson_8.level_5;

import student_andrejs_cekalins.lesson_8.level_4.Circle;
import student_andrejs_cekalins.lesson_8.level_4.Rectangle;
import student_andrejs_cekalins.lesson_8.level_4.Square;
import student_andrejs_cekalins.lesson_8.level_4.Triangle;
import student_andrejs_cekalins.lesson_8.level_4.Shape;

import java.util.Random;

class ShapeUtil {
   Circle createRandomCircle() {
        Random random = new Random();
        double radiusRandom =random.nextDouble();
        return new Circle("Circle",radiusRandom);
    }
    Square createRandomSquare() {
       Random random = new Random();
       double sideRandom = random.nextDouble();
       return new Square(" Square", sideRandom);
    }
    Rectangle createRandomRectangle() {
       Random random =new Random();
       double lengthRandom = random.nextDouble();
       double widthRandom = random.nextDouble();
       return new Rectangle("Rectangle", lengthRandom,widthRandom);
    }
    Triangle createRandomTriangle() {
       Random random = new Random();
       double sideRandom = random.nextDouble();
       return  new Triangle("Triangle", sideRandom);
    }
    Shape createRandomShape() {
        Random random = new Random();
        int randomNumber = random.nextInt();
        if (randomNumber == 0) {
            return createRandomShape();
        } else if (randomNumber == 1) {
            return createRandomShape();
        } else if (randomNumber == 2) {
            return createRandomShape();
        } else {
            return createRandomShape();
        }
    }
    double calculateArea(Shape[] shapes) {
       double totalShapesArea = 0;
        for (int i = 0; i < shapes.length; i++) {
           totalShapesArea += shapes[i].calculateArea();
        }
        return totalShapesArea;
    }
    double calculatePerimeter(Shape[] shapes) {
       double totalShapesPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalShapesPerimeter += shapes[i].calculatePerimeter();
        }
        return totalShapesPerimeter;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}


