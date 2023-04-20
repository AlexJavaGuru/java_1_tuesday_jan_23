package student_julija_raudive.lesson_8.level_4;

 class ShapeUtilDemo {

     public static void main(String[] args) {

         ShapeUtil shapeUtil = new ShapeUtil();

         Shape circle = shapeUtil.createRandomCircle();
         double circleArea = shapeUtil.calculateArea(circle);
         double circlePerimeter = shapeUtil.calculatePerimeter(circle);

         Shape square = shapeUtil.createRandomSquare();
         double squareArea = shapeUtil.calculateArea(square);
         double squarePerimeter = shapeUtil.calculatePerimeter(square);

         Shape rectangle = shapeUtil.createRandomRectangle();
         double rectangleArea = shapeUtil.calculateArea(rectangle);
         double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);

         Shape triangle = shapeUtil.createRandomTriangle();
         double triangleArea = shapeUtil.calculateArea(triangle);
         double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);

     }
}
