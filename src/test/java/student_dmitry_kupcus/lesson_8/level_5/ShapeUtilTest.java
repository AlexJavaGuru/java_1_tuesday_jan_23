package student_dmitry_kupcus.lesson_8.level_5;

import student_dmitry_kupcus.lesson_8.level_4.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ShapeUtilTest {
    private ShapeUtil shapeUtil;

    @Test
    void testCalculateArea() {
        shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double firstShape = shape[0].calculateArea();
        double secondShape = shape[1].calculateArea();
        double thirdShape = shape[2].calculateArea();
        double fourthShape = shape[3].calculateArea();
        double expectedResult = firstShape + secondShape + thirdShape + fourthShape;
        double actualResult = shapeUtil.calculateArea(shape);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCalculatePerimeter() {
        shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();;
        shape[3] = shapeUtil.createRandomTriangle();
        double firstShape = shape[0].calculatePerimeter();
        double secondShape = shape[1].calculatePerimeter();
        double thirdShape = shape[2].calculatePerimeter();
        double fourthShape = shape[3].calculatePerimeter();
        double expectedResult = firstShape + secondShape + thirdShape + fourthShape;
        double actualResult = shapeUtil.calculatePerimeter(shape);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}