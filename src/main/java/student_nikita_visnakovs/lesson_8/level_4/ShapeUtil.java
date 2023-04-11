package student_nikita_visnakovs.lesson_8.level_4;

import java.util.Random;

public class ShapeUtil {

    Shape createRandomShape() {
        Random random = new Random();
        int randomNumber = random.nextInt(5);
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

    double calculateCombinedArea(Shape[] shapes) {
        double combinedArea = 0;
        for (Shape shape : shapes) {
            combinedArea += shape.calculateArea();
        }
        return combinedArea;
    }

    double calculateCombinedPerimeter(Shape[] shapes) {
        double combinedPerimeter = 0;
        for (Shape shape : shapes) {
            combinedPerimeter += shape.calculatePerimeter();
        }
        return combinedPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }


    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("Random circle", random.nextInt(5));
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square("Random square", random.nextInt(5));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("Random rectangle", random.nextInt(5), random.nextInt(5));
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle("Random triangle", random.nextInt(5));
    }
}
