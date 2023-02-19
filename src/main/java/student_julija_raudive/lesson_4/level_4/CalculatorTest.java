package student_julija_raudive.lesson_4.level_4;

 class CalculatorTest {

     private Calculator calculator = new Calculator();

     public static void main(String[] args) {
         CalculatorTest calculatorTest = new CalculatorTest();
         calculatorTest.sumTest();
         calculatorTest.subtractionTest();
         calculatorTest.multiplicationTest();
         calculatorTest.divisionTest();
         calculatorTest.isEvenTest();

         calculatorTest.maxOfTwoNumbersTest1();
         calculatorTest.maxOfTwoNumbersTest2();
         calculatorTest.maxOfTwoNumbersTest3();

         calculatorTest.maxOfThreeNumbersTest1();
         calculatorTest.maxOfThreeNumbersTest2();
         calculatorTest.maxOfThreeNumbersTest3();
         calculatorTest.maxOfThreeNumbersTest4();
         calculatorTest.maxOfThreeNumbersTest5();
         calculatorTest.maxOfThreeNumbersTest6();
         calculatorTest.maxOfThreeNumbersTest7();



     }

     public void sumTest() {
         int firstNumber = 10;
         int secondNumber = 5;
         int realResult = calculator.sum(firstNumber, secondNumber);
         checkResults(realResult == 15, "Sum test");
     }

     public void subtractionTest(){
         int firstNumber = 10;
         int secondNumber = 5;
         int realResult = calculator.subtraction(firstNumber, secondNumber);
         checkResults(realResult == 5, "Subtraction test");
     }

     public void multiplicationTest(){
         int firstNumber = 10;
         int secondNumber = 5;
         int realResult = calculator.multiplication(firstNumber, secondNumber);
         checkResults(realResult == 50, "Multiplication test");
     }

     public void divisionTest(){
         int firstNumber = 5;
         int secondNumber = 2;
         double realResult = calculator.division(firstNumber, secondNumber);
         checkResults(realResult == 2.5, "Division test");

     }

     public void isEvenTest(){
         int EvenNumber = 10;
         int OddNumber = 15;

         boolean realResult1 = calculator.isEven(EvenNumber);
         boolean realResult2 = calculator.isEven(OddNumber);
         checkResults(realResult1, "Is even test");
         checkResults(!realResult2, "Is even test");

     }

     public void maxOfTwoNumbersTest1(){
         int firstNumber = 10;
         int secondNumber = 9;
         int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
         checkResults(realResult == 10, "First number is larger than second test");
     }

     public void maxOfTwoNumbersTest2(){
         int firstNumber = 8;
         int secondNumber = 9;
         int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
         checkResults(realResult == 9, "Second number is larger than first test");

     }

     public void maxOfTwoNumbersTest3(){
         int firstNumber = 7;
         int secondNumber = 7;
         int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
         checkResults(realResult == 7, "Numbers are equal test");

     }

     public void maxOfThreeNumbersTest1(){
         int firstNumber = 8;
         int secondNumber = 7;
         int thirdNumber = 6;
         int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         checkResults(realResult == 8, "Second number is larger than first and third test");
     }

     public void maxOfThreeNumbersTest2(){
         int firstNumber = 8;
         int secondNumber = 9;
         int thirdNumber = 7;
         int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         checkResults(realResult == 9, "Second number is larger than first and third test");

     }

     public void maxOfThreeNumbersTest3(){
         int firstNumber = 8;
         int secondNumber = 9;
         int thirdNumber = 10;
         int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         checkResults(realResult == 10, "Third number is larger than first and second test");

     }

     public void maxOfThreeNumbersTest4(){
         int firstNumber = 10;
         int secondNumber = 10;
         int thirdNumber = 9;
         int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         checkResults(realResult == 10, "First and second numbers are equal and larger than third test");

     }

     public void maxOfThreeNumbersTest5(){
         int firstNumber = 9;
         int secondNumber = 10;
         int thirdNumber = 10;
         int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         checkResults(realResult == 10, "Second and third numbers are equal and larger than first test");

     }

     public void maxOfThreeNumbersTest6(){
         int firstNumber = 10;
         int secondNumber = 9;
         int thirdNumber = 10;
         int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         checkResults(realResult == 10, "First and third numbers are equal and larger than second test");

     }

     public void maxOfThreeNumbersTest7(){
         int firstNumber = 10;
         int secondNumber = 10;
         int thirdNumber = 10;
         int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         checkResults(realResult == 10, "All numbers are equal");

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
