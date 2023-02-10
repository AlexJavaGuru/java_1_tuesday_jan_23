package student_natalija_rasponomarjova.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.evenNumberTest();
        calculatorTest.number1BiggerTest();
        calculatorTest.number2LessTest();
        calculatorTest.numberEqualityTest();
        calculatorTest.number1BiggestFrom3Test();
        calculatorTest.number2BiggestFrom3Test();
        calculatorTest.number3BiggestFrom3Test();
        calculatorTest.number1and2EqualBiggerThan3Test();
        calculatorTest.allNumbersAreEqualTest();
        calculatorTest.number2and3EqualBiggerThan1Test();

    }

    public void sumTest() {
        int number1 = 20;
        int number2 = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(number1, number2);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subtractionTest() {
        int number1 = 20;
        int number2 = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(number1, number2);
        if(realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        }
        else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplicationTest() {
        int number1 = 3;
        int number2 = 10;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(number1, number2);
        if(realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        }
        else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divisionTest() {
        int number1 = 30;
        int number2 = 3;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(number1, number2);
        if(realResult == expectedResult) {
            System.out.println("Division test = OK");
        }
        else {
            System.out.println("Division test = FAIL");
        }
    }

    public void evenNumberTest() {
        int number = 77;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if(realResult == expectedResult) {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
    }

    public void number1BiggerTest () {
        int number1 = 18;
        int number2 = 8;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfTwoNumbers(number1, number2);
        if(expectedResult == number1) {
            System.out.println("TEST OK: Number 1 is bigger than number 2");
        } else {
            System.out.println("Test failed");
        }
       }
    public void number2LessTest() {
        int number1 = 8;
        int number2 = 888;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfTwoNumbers(number1, number2);
        if(expectedResult == number2) {
            System.out.println("TEST OK: Number 2 is bigger than number 1");
        }
        else {
            System.out.println("Test failed");
        }
    }
   public void numberEqualityTest(){

        int number1 = 10;
        int number2 = 10;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfTwoNumbers(number1, number2);
        if(number1 == number2) {
           System.out.println("TEST OK: The numbers are equal");
        }
        else {
           System.out.println("Test failed");
       }
   }

    public void number1BiggestFrom3Test() {
        int number1 = 80;
        int number2 = 70;
        int number3 = 30;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);
        if (expectedResult == number1) {
            System.out.println("Test OK: Number 1 is bigger than number 2 and 3");
        } else {
            System.out.println("Test failed");
        }
    }
    public void number2BiggestFrom3Test() {
        int number1 = 80;
        int number2 = 170;
        int number3 = 30;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);
        if (expectedResult == number2) {
            System.out.println("Test OK: Number 2 is bigger than number 1 and 3");
        } else {
            System.out.println("Test failed");
        }
    }
    public void number3BiggestFrom3Test() {
        int number1 = 80;
        int number2 = 170;
        int number3 = 300;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);
        if (expectedResult == number3) {
            System.out.println("Test OK: Number 3 is bigger than number 1 and 2");
        } else {
            System.out.println("Test failed");
        }
    }

    public void number1and2EqualBiggerThan3Test() {
        int number1 = 50;
        int number2 = 50;
        int number3 = 40;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);
        if (expectedResult == number1 && expectedResult == number2) {
            if (expectedResult > number3) {
            }
            System.out.println("Test OK: Number 1 and 2 are equal and bigger than number 3");
        } else {
            System.out.println("Test failed");
        }
    }
        public void allNumbersAreEqualTest() {
            int number1 = 80;
            int number2 = 80;
            int number3 = 80;
            Calculator calculator = new Calculator();
            int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);
            if (expectedResult == number1) {
                if (expectedResult == number2) {
                    if (expectedResult == number3) {
                    }
                }
                System.out.println("Test OK: All these numbers are equal");
            } else {
                System.out.println("Test failed");
            }
        }

    public void number2and3EqualBiggerThan1Test() {
        int number1 = 30;
        int number2 = 80;
        int number3 = 80;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);
        if (expectedResult == number2 && expectedResult == number3) {
            if (expectedResult > number1) {
            }
            System.out.println("Test OK: Number 2 and 3 are equal and bigger than number 1");
        } else {
            System.out.println("Test failed");
        }
    }

    }


