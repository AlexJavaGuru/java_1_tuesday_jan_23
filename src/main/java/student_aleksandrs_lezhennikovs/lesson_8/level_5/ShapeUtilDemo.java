package student_aleksandrs_lezhennikovs.lesson_8.level_5;

import student_aleksandrs_lezhennikovs.lesson_8.level_4.Shape;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle radius " + circle);
        System.out.println("Shape area " + circleArea);
        System.out.println("Shape perimeter " + circlePerimeter);
        System.out.println("");

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = square.calculateArea();
        double squarePerimeter = square.calculatePerimeter();
        System.out.println("Square " + square);
        System.out.println("Square area " + squareArea);
        System.out.println("Square perimeter " + squarePerimeter);
        System.out.println("");

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("Rectangle " + rectangle);
        System.out.println("Rectangle area " + rectangleArea);
        System.out.println("Rectangle perimeter " + rectanglePerimeter);
        System.out.println("");

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = triangle.calculateArea();
        double trianglePerimeter = triangle.calculatePerimeter();
        System.out.println("Triangle " + triangle);
        System.out.println("Triangle area " + triangleArea);
        System.out.println("Triangle perimeter " + trianglePerimeter);
    }

}
