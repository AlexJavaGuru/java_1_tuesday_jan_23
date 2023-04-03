package student_anastasiia_bokareva.lesson8.level5;

import student_anastasiia_bokareva.lesson8.level4.Shape;

public class ShapeUtilTest {
   public static void main(String[] args) {
      ShapeUtilTest test = new ShapeUtilTest();
      test.checkArea();
      test.checkPerimetr();
   }
   public void checkArea () {
      ShapeUtil shapeUtil = new ShapeUtil();
      Shape[] shapes = new Shape[4];
      shapes[0] = shapeUtil.createRandomCircle();
      shapes[1] = shapeUtil.createRandomSquare();
      shapes[2] = shapeUtil.createRandomRectangle();
      shapes[3] = shapeUtil.createRandomTriangle();
      double expectedResult = shapeUtil.calculateArea(shapes[0]) + shapeUtil.calculateArea(shapes[1]);
      expectedResult += shapeUtil.calculateArea(shapes[2]) + shapeUtil.calculateArea(shapes[3]);
      double realResult = shapeUtil.calculateArea(shapes);
      check(expectedResult,realResult,"Area ");
   }
   public void checkPerimetr () {
      ShapeUtil shapeUtil = new ShapeUtil();
      Shape[] shapes = new Shape[4];
      shapes[0] = shapeUtil.createRandomCircle();
      shapes[1] = shapeUtil.createRandomSquare();
      shapes[2] = shapeUtil.createRandomRectangle();
      shapes[3] = shapeUtil.createRandomTriangle();
      double expectedResult = shapeUtil.calculatePerimeter(shapes[0]) + shapeUtil.calculatePerimeter(shapes[1]);
      expectedResult += shapeUtil.calculatePerimeter(shapes[2]) + shapeUtil.calculatePerimeter(shapes[3]);
      double realResult = shapeUtil.calculatePerimetr(shapes);
      check(expectedResult,realResult,"Perimetr ");
   }

   public void check (double expectedResult, double realResult, String testName) {
      if (realResult == expectedResult){
         System.out.println(" Test " + testName + " is ok");
      } else {
         System.out.println(" Test " + testName + " is fail");
      }
   }

}
