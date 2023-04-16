package student_oksana_tarasova.lesson_8.level_5;

import student_oksana_tarasova.lesson_8.level_4.Circle;
import student_oksana_tarasova.lesson_8.level_4.Square;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Circle circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Area circle = " + circleArea);
        System.out.println("Perimeter circle = " + circlePerimeter);

        Square square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Area square = " + squareArea);
        System.out.println("Perimeter square = " + squarePerimeter);

        System.out.println(shapeUtil.createRandomShape());
    }
}
