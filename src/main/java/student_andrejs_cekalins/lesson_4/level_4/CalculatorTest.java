package student_andrejs_cekalins.lesson_4.level_4;


class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxFirstNumberOfTwoNumbers();
        calculatorTest.maxSecondNumberOfTwoNumbers();
        calculatorTest.maxBothNumbersOfTwoNumbers();
        calculatorTest.maxFirstNumberOfThreeNumbers();
        calculatorTest.maxSecondNumberOfThreeNumbers();
        calculatorTest.maxThirdNumberOfThreeNumbers();
        calculatorTest.maxFirstAndSecondNumberOfThreeNumbers();
        calculatorTest.maxSecondAndThirdNumberOfThreeNumbers();
        calculatorTest.maxNumbersAreEqualOfThreeNumbers();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 15;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = Fail");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = Fail");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 9;
        int expectedResult = 90;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = Fail");
        }
    }

    public void divTest() {
        int firstNumber = 12;
        int secondNumber = 2;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = Fail");
        }
    }

    public void isEvenTest() {
        int number = 12;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = Fail");
        }
    }

    public void maxFirstNumberOfTwoNumbers() {
        int firstNumber = 10;
        int secondNumber = 6;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxFirstNumberOfTwo test = OK");
        } else {
            System.out.println("MaxFirstNumberOfTwo test = Fail");
        }
    }

    public void maxSecondNumberOfTwoNumbers() {
        int firstNumber = 5;
        int secondNumber = 12;
        int expectedResult = 12;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxSecondNumberOfTwo test = OK");
        } else {
            System.out.println("MaxSecondNumberOfTwo test = Fail");
        }
    }

    public void maxBothNumbersOfTwoNumbers() {
        int firstNumber = 8;
        int secondNumber = 8;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("BothNumbersOfTwoAreEqual test = OK");
        } else {
            System.out.println("BothNumbersOfTwoAreEqual test = Fail");
        }
    }

    public void maxFirstNumberOfThreeNumbers() {
        int firstNumber = 10;
        int secondNumber = 6;
        int thirdNumber = 8;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxFirstNumberOfThree test = OK");
        } else {
            System.out.println("MaxFirstNumberOfThree test = Fail");
        }
    }

    public void maxSecondNumberOfThreeNumbers() {
        int firstNumber = 3;
        int secondNumber = 12;
        int thirdNumber = 9;
        int expectedResult = 12;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxSecondNumberOfThree test = OK");
        } else {
            System.out.println("MaxSecondNumberOfThree test = Fail");
        }
    }

    public void maxThirdNumberOfThreeNumbers() {
        int firstNumber = 1;
        int secondNumber = 4;
        int thirdNumber = 6;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxThirdNumberOfThree test = OK");
        } else {
            System.out.println("MaxThirdNumberOfThree test = Fail");
        }
    }

    public void maxFirstAndSecondNumberOfThreeNumbers() {
        int firstNumber = 6;
        int secondNumber = 6;
        int thirdNumber = 3;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxFirstAndSecondNumbersOfThree test = OK");
        } else {
            System.out.println("MaxFirstAndSecondNumbersOfThree test = Fail");
        }
    }

    public void maxSecondAndThirdNumberOfThreeNumbers() {
        int firstNumber = 3;
        int secondNumber = 7;
        int thirdNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxSecondAndThirdNumbersOfThree test = OK");
        } else {
            System.out.println("MaxSecondAndThirdNumbersOfThree test = Fail");
        }
    }

    public void maxNumbersAreEqualOfThreeNumbers() {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("ThreeNumbersOfThreeAreEqual test = OK");
        } else {
            System.out.println("ThreeNumbersOfThreeAreEqual test = Fail");
        }
    }
}
