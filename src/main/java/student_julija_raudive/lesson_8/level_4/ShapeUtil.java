package student_julija_raudive.lesson_8.level_4;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        double radius = random.nextDouble();
        return new Circle(radius, "circle");
    }

    Square createRandomSquare() {
        Random random = new Random();
        double lengthOfSide = random.nextDouble();
        return new Square("Square", lengthOfSide);
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        double lengthOfSide1 = random.nextDouble();
        double lengthOfSide2 = random.nextDouble();
        return new Rectangle("rectangle", lengthOfSide1, lengthOfSide2);
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        double lengthOfSide = random.nextDouble();
        return new Triangle("triangle", lengthOfSide);
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

    double calculateArea(Shape[] shapes){

        double sumArea = 0;
        for (int i=0; i<shapes.length; i++){
               double area =  shapes[i].calculateArea();
                sumArea +=area;
        }
        return sumArea;
    }

    double calculatePerimeter(Shape[] shapes){

        double sumPerimeter = 0;
        for (int i=0; i<shapes.length; i++){
            double area =  shapes[i].calculatePerimeter();
            sumPerimeter +=area;
        }
        return sumPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
