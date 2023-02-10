package student_oksana_tarasova.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.differenceTest();
        calculatorTest.mulTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.twoNumbersTest1();
        calculatorTest.twoNumbersTest2();
        calculatorTest.twoNumbersTest3();
        calculatorTest. threeNumbers1();
        calculatorTest. threeNumbers2();
        calculatorTest. threeNumbers3();
        calculatorTest. threeNumbers4();
        calculatorTest. threeNumbers5();
        calculatorTest. threeNumbers6();
        calculatorTest. threeNumbers7();

    }

    public void sumTest() {
        int a = 10;
        int b = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(a, b);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void differenceTest() {
        int a = 10;
        int b = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.difference(a, b);
        if (realResult == expectedResult) {
            System.out.println("Difference test = OK");
        } else {
            System.out.println("Difference test = FAIL");
        }
    }

    public void mulTest() {
        int a = 10;
        int b = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(a, b);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divisionTest() {
        int a = 10;
        int b = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(a, b);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTest() {
        int a = 7;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(a);
         if (expectedResult == realResult) {
             System.out.println("IsEvenTest = OK");
         } else {
             System.out.println("IsEvenTest = FAIL");
         }
    }

    public void twoNumbersTest1() {
        int a = 6;
        int b = 5;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(a, b);
        if (expectedResult == realResult) {
            System.out.println("MaxOfTwoNumbers = OK");
        } else {
            System.out.println("maxOfTwoNumbers = FAIL");
        }
    }
    public void twoNumbersTest2() {
        int a = 5;
        int b = 6;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(a, b);
        if (expectedResult == realResult) {
            System.out.println("MaxOfTwoNumbers = OK");
        } else {
            System.out.println("maxOfTwoNumbers = FAIL");
        }
    }
    public void twoNumbersTest3() {
        int a = 6;
        int b = 6;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(a, b);
        if (expectedResult == realResult) {
            System.out.println("MaxOfTwoNumbers = OK");
        } else {
            System.out.println("maxOfTwoNumbers = FAIL");
        }
    }

    public void threeNumbers1() {
        int a = 6;
        int b = 5;
        int c = 4;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (expectedResult == realResult) {
            System.out.println("maxOfThreeNumbers = OK");
        } else {
            System.out.println("maxOfThreeNumbers = FAIL");
        }
    }
    public void threeNumbers2() {
        int a = 5;
        int b = 6;
        int c = 4;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (expectedResult == realResult) {
            System.out.println("maxOfThreeNumbers = OK");
        } else {
            System.out.println("maxOfThreeNumbers = FAIL");
        }
    }

    public void threeNumbers3() {
        int a = 4;
        int b = 5;
        int c = 6;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (expectedResult == realResult) {
            System.out.println("maxOfThreeNumbers = OK");
        } else {
            System.out.println("maxOfThreeNumbers = FAIL");
        }
    }

    public void threeNumbers4() {
        int a = 6;
        int b = 6;
        int c = 4;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (expectedResult == realResult) {
            System.out.println("maxOfThreeNumbers = OK");
        } else {
            System.out.println("maxOfThreeNumbers = FAIL");
        }
    }

    public void threeNumbers5() {
        int a = 4;
        int b = 6;
        int c = 6;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (expectedResult == realResult) {
            System.out.println("maxOfThreeNumbers = OK");
        } else {
            System.out.println("maxOfThreeNumbers = FAIL");
        }
    }
    public void threeNumbers6() {
        int a = 6;
        int b = 4;
        int c = 6;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (expectedResult == realResult) {
            System.out.println("maxOfThreeNumbers = OK");
        } else {
            System.out.println("maxOfThreeNumbers = FAIL");
        }
    }
    public void threeNumbers7() {
        int a = 6;
        int b = 6;
        int c = 6;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (expectedResult == realResult) {
            System.out.println("maxOfThreeNumbers = OK");
        } else {
            System.out.println("maxOfThreeNumbers = FAIL");
        }
    }
}

