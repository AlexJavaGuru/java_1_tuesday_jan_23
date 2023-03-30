package student_romualds_leitans.lesson_8.level_5;


import student_romualds_leitans.lesson_8.level_4.Shape;
import student_romualds_leitans.lesson_8.level_4.Triangle;

public class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimetr: " + circlePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimetr: " + squarePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Square Area: " + rectangleArea);
        System.out.println("Square Perimetr: " + rectanglePerimeter);

        Shape triangle = shapeUtil.createRandomRectangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Square Area: " + triangleArea);
        System.out.println("Square Perimetr: " + trianglePerimeter);




















    }
}