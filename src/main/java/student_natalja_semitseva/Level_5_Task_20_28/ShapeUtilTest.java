package student_natalja_semitseva.Level_5_Task_20_28;
import student_natalja_semitseva.Level_4_Task_15_16_17_18_19.Shape;

import java.util.Arrays;
public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.testCalculateArea();
        test.testCalculatePerimeter();

    }
    public void testCalculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            sum+=shape[i].calculateArea();

        }
        double expectedResult = sum;
        double realResult = shapeUtil.calculateArea(shape);
        checkResult(expectedResult, realResult, "TestCalculateArea");
    }

    public void testCalculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double sum =0;
        for (int i = 0; i < shape.length; i++) {
            sum+=shape[i].calculatePerimeter();
        }
        double expectedResult = sum;
        double realResult = shapeUtil.calculatePerimeter(shape);
        checkResult(expectedResult, realResult, "TestCalculatePerimeter");
    }
    private static void checkResult(double expectedResult, double realResult, String testName) {
        if (expectedResult==realResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }

}
