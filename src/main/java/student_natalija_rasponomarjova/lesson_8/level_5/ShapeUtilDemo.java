package student_natalija_rasponomarjova.lesson_8.level_5;

import student_natalija_rasponomarjova.lesson_8.level_4.Shape;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Random circle area is " + circleArea);
        System.out.println("Random circle perimeter is " + circlePerimeter);
        System.out.println();

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Random square area is " + squareArea);
        System.out.println("Random square perimeter is " + squarePerimeter);
        System.out.println();

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Random rectangle area is " + rectangleArea);
        System.out.println("Random rectangle perimeter is " + rectanglePerimeter);
        System.out.println();

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Random triangle area is " + triangleArea);
        System.out.println("Random triangle perimeter is " + trianglePerimeter);

    }
}
