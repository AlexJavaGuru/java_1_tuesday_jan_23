package student_julija_raudive.lesson_8.level_4;

 class CircleTest {

     Circle circle = new Circle(8.6, "Circle");

     public static void main(String[] args) {
         CircleTest test = new CircleTest();
         test.calculateAreaTest();
         test.calculatePerimeterTest();

     }


     public void calculateAreaTest(){
         double expectedResult = 232.3521926595011;
         double result = circle.calculateArea();
         checkResults(result==expectedResult, "Circle area test");

     }

     public void calculatePerimeterTest(){
         double expectedResult = 54.03539364174444;
         double result = circle.calculatePerimeter();
         checkResults(result==expectedResult, "Circle perimeter test");

     }

     private void checkResults(boolean condition, String testName) {
         if (condition) {
             System.out.println(testName + " = OK");
         }
         else {
             System.out.println(testName + " = FAIL");
         }
     }

}
