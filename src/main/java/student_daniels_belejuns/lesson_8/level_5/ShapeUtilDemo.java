package student_daniels_belejuns.lesson_8.level_5;

import student_daniels_belejuns.lesson_8.level_4.Shape;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle area = " + circleArea);
        System.out.println("Circle perimeter = " + circlePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square area = " + squareArea);
        System.out.println("Square perimeter = " + squarePerimeter);

        Shape rectangle=shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Rectangle area = " + rectangleArea);
        System.out.println("Rectangle perimeter = " + rectanglePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Triangle area = " + triangleArea);
        System.out.println("Triangle perimeter = "+  trianglePerimeter);
    }
}