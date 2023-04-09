package student_julija_raudive.lesson_8.level_7.task_32;

 class MathOperationTest {

     public static void main(String[] args) {
         MathOperationTest test = new MathOperationTest();
         test.additionTest();
         test.subtractionTest();
         test.multiplyTest();
         test.divideTest();

     }

     public void additionTest(){
         Argument arg1 = new Argument(47);
         Argument arg2 = new Argument(15);
         MathOperation result = new Addition(arg1, arg2);
         double expectedResult = 62;
         checkResults(result.calculate()==expectedResult, "Addition test");

     }

     public void subtractionTest(){
         Argument arg1 = new Argument(86);
         Argument arg2 = new Argument(25);
         MathOperation result = new Subtraction(arg1, arg2);
         double expectedResult = 61;
         checkResults(result.calculate()==expectedResult, "Subtraction test");

     }

     public void multiplyTest(){
         Argument arg1 = new Argument(10);
         Argument arg2 = new Argument(11);
         MathOperation result = new Multiply(arg1, arg2);
         double expectedResult = 110;
         checkResults(result.calculate()==expectedResult, "Multiply test");

     }

     public void divideTest(){
         Argument arg1 = new Argument(27);
         Argument arg2 = new Argument(3);
         MathOperation result = new Divide(arg1, arg2);
         double expectedResult = 9;
         checkResults(result.calculate()==expectedResult, "Divide test");

     }

     private void checkResults(boolean condition, String testName) {
         if (condition) {
             System.out.println(testName + " = OK");
         } else {
             System.out.println(testName + " = FAIL");
         }
     }
}
