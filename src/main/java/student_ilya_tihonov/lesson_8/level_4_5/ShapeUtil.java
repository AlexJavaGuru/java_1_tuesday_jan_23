package student_ilya_tihonov.lesson_8.level_4_5;

import java.util.Random;

public class ShapeUtil{
    private static final Random random = new Random();

    public static Circle createRandomCircle() {
        double radius = random.nextInt(20);
        return new Circle(radius, "Random Circle");
    }
    public static Square createRandomSquare() {
        int side = random.nextInt(100) + 1;
        return new Square(side, "Random Square");
    }
    public static Rectangle createRandomRectangle() {
        int longSide = random.nextInt(100);
        int shirtSide = random.nextInt(50);
        return new Rectangle( longSide, shirtSide, "Random Rectangle");
    }
    public static Triangle createRandomTriangle() {
        int side = random.nextInt(30);
        return new Triangle(side, 10, "Random Triangle");
    }
    public static Shape createRandomShape() {
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
    public static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public static double calculatePerimeter(Shape shape) {
        return shape.perimeterCount();
    }
    public static double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
    public static double calculatePerimeter(Shape[] shapes) {
        double perimeterCount = 0.0;
        for (Shape shape : shapes) {
            perimeterCount += shape.perimeterCount();
        }
        return perimeterCount;
    }


}
