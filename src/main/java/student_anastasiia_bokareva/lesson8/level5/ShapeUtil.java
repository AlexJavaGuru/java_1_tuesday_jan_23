package student_anastasiia_bokareva.lesson8.level5;

import student_anastasiia_bokareva.lesson8.level4.*;

import java.util.Random;

public class ShapeUtil {
    Circle createRandomCircle(){
        Random random = new Random();
        int radiusRandom = random.nextInt(10);
        return new Circle (radiusRandom);
    }
    Square createRandomSquare(){
        Random random = new Random();
        int sideRandom = random.nextInt(10);
        return new Square (sideRandom);
    }
    Rectangle createRandomRectangle(){
        Random random = new Random();
        int sideA = random.nextInt(10);
        int sideB = random.nextInt(10);
        return new Rectangle (sideB,sideA);
    }
    Triangle createRandomTriangle(){
        Random random = new Random();
        int side = random.nextInt(10);
        return new Triangle (side);
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
        double calculateAreaShape = 0;
        for (Shape shape : shapes){
            calculateAreaShape = calculateAreaShape + shape.calculateArea();
        }
        return calculateAreaShape;
    }
    double calculatePerimetr(Shape[] shapes){
        double calculatePerimetrShape =0;
        for (Shape shape: shapes){
            calculatePerimetrShape = calculatePerimetrShape + shape.calculatePerimetr();
        }
        return calculatePerimetrShape;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimetr();
    }
}
