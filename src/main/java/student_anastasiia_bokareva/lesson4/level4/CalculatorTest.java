package student_anastasiia_bokareva.lesson4.level4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.minusTest();
        calculatorTest.divTest();
        calculatorTest.multiTest();
        calculatorTest.isEvenTest();
        calculatorTest.firstNumberBigger();
        calculatorTest.secondNumberBigger();
        calculatorTest.bothNumbersAreEqual();
        calculatorTest.firstNumberIsBiggest();
        calculatorTest.secondNumberIsBiggest();
        calculatorTest.thirdNumberIsBiggest();
        calculatorTest.firstAndSecondNumbersAreBigger();
        calculatorTest.firstAndThirdNumbersAreBigger();
        calculatorTest.secondAndThirdNumbersAreBigger();
        calculatorTest.allThreeNumbersAreEqual();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void minusTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.minus(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Minus test = OK");
        } else {
            System.out.println("Minus test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divided test = OK");
        } else {
            System.out.println("Divided test = FAIL");
        }
    }
    public void multiTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multi(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }
    public void isEvenTest() {
        int firstNumber = 5;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("Is even test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }
    public void firstNumberBigger () {
        int firstNumber = 7;
        int secondNumber = 5;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realresult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (realresult==expectedResult) {
            System.out.println("First number is Bigger test = OK");
        } else {
            System.out.println("First number is Bigger = FAIL");
        }

    }
    public void secondNumberBigger () {
        int firstNumber = 7;
        int secondNumber = 12;
        int expectedResult = 12;
        Calculator calculator = new Calculator();
        int realresult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (realresult==expectedResult) {
            System.out.println("Second number is Bigger test = OK");
        } else {
            System.out.println("Second number is Bigger = FAIL");
        }

    }
    public void bothNumbersAreEqual () {
        int firstNumber = 7;
        int secondNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realresult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (realresult==expectedResult) {
            System.out.println("Both  numbers are equal test = OK");
        } else {
            System.out.println("Both numbers are equal = FAIL");
        }

    }
    public void firstNumberIsBiggest() {
        int firstNumber =10;
        int secondNumber=4;
        int thirdNumber = 7;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber, thirdNumber);
        if ( expectedResult == realResult) {
            System.out.println("First number is biggest  = OK");
        } else {
            System.out.println("First number is biggest = FAIL");
        }
    }
    public void secondNumberIsBiggest() {
        int firstNumber =10;
        int secondNumber=14;
        int thirdNumber = 7;
        int expectedResult = 14;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber, thirdNumber);
        if ( expectedResult == realResult) {
            System.out.println("Second number is biggest  = OK");
        } else {
            System.out.println("Second number is biggest = FAIL");
        }
    }
    public void thirdNumberIsBiggest() {
        int firstNumber =10;
        int secondNumber=14;
        int thirdNumber = 17;
        int expectedResult = 17;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber, thirdNumber);
        if ( expectedResult == realResult) {
            System.out.println("Third number is biggest  = OK");
        } else {
            System.out.println("Third number is biggest = FAIL");
        }
    }
    public void firstAndSecondNumbersAreBigger() {
        int firstNumber =10;
        int secondNumber=10;
        int thirdNumber = 7;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber, thirdNumber);
        if ( expectedResult == realResult) {
            System.out.println("First and second  numbers are bigger  = OK");
        } else {
            System.out.println("First and second  numbers are biggest  = FAIL");
        }
    }
    public void firstAndThirdNumbersAreBigger() {
        int firstNumber =10;
        int secondNumber=7;
        int thirdNumber = 10;
        int  expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber, thirdNumber);
        if ( expectedResult == realResult) {
            System.out.println("First and third  numbers are bigger  = OK");
        } else {
            System.out.println("First and third  numbers are biggest  = FAIL");
        }
    }
    public void secondAndThirdNumbersAreBigger() {
        int firstNumber =4;
        int secondNumber=7;
        int thirdNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber, thirdNumber);
        if ( expectedResult == realResult) {
            System.out.println("Second and third  numbers are bigger  = OK");
        } else {
            System.out.println("Second and third  numbers are biggest  = FAIL");
        }
    }
    public void allThreeNumbersAreEqual() {
        int firstNumber =7;
        int secondNumber=7;
        int thirdNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber, thirdNumber);
        if ( expectedResult == realResult) {
            System.out.println("All three numbers are equal  = OK");
        } else {
            System.out.println("All three numbers are equal  = FAIL");
        }
    }
}
