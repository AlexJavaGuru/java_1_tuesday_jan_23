package student_oksana_tarasova.lesson_8.level_4;

 class SquareTest {
     public static void main(String[] args) {
         SquareTest test = new SquareTest();
         test.calculateAreaTest();
         test.calculatePerimeterTest();
     }
     public void calculateAreaTest () {
         Square square = new Square ("square", 3);
         double expectedResult = 9.0;
         double realResult = square.calculateArea();
         check(expectedResult == realResult, "square area");
     }
     public void calculatePerimeterTest () {
         Square square = new Square ("square", 3);
         double expectedResult = 12.0;
         double realResult = square.calculatePerimeter();
         check(expectedResult == realResult, "square perimeter");
     }

     public void check(boolean state, String nameTest) {
         if (state) {
             System.out.println(nameTest + " = ok");
         } else {
             System.out.println(nameTest + " = fail");
         }
     }
}
