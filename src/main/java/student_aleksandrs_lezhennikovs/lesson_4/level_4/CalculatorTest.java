package student_aleksandrs_lezhennikovs.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
       CalculatorTest calculatorTest = new CalculatorTest();
       calculatorTest.sumTest();
       calculatorTest.subtractTest();
       calculatorTest.multiplyTest();
       calculatorTest.divideTest();
       calculatorTest.isEvenTest();
       calculatorTest.isFirstNumberMax();
       calculatorTest.isSecondNumberMax();
       calculatorTest.isFirstSecondEqual();
       calculatorTest.isFirstOfThreeMax();
       calculatorTest.isSecondOfThreeMax();
       calculatorTest.isThirdOfThreeMax();
       calculatorTest.isFourthOfThreeMax();
       calculatorTest.isFifthOfThreeMax();
       calculatorTest.isSixthOfThreeMax();
       calculatorTest.isSeventhThreeMax();
       calculatorTest.isEightOfThreeMax();
    }

    void sumTest() {
        int firstNum = 10;
        int secondNum = 5;
        int exceptedRes = 15;

        Calculator calc = new Calculator();
        int realResult = calc.sumNumbers(firstNum, secondNum);
        if (realResult == exceptedRes) {
            System.out.println("sumTest result = OK");
        } else {
            System.out.println("sumTest result = FAIL");
        }
    }

    void subtractTest() {
        int firstNum = 20;
        int secondNum = 15;
        int expectRes = 5;

        Calculator calc = new Calculator();
        int realResult = calc.subtract(firstNum, secondNum);
        if (realResult == expectRes) {
            System.out.println("subtract Test result = OK");
        } else {
            System.out.println("subtract Test result = FAIL");
        }
    }

    void multiplyTest() {
        int firstNum = 7;
        int secondNum = 10;
        int expectRes = 70;

        Calculator calc = new Calculator();
        int realResult = calc.multiply(firstNum, secondNum);
        if (realResult == expectRes) {
            System.out.println("multiply Test result = OK");
        } else {
            System.out.println("multiply Test result = FAIL");
        }
    }

    void divideTest() {
        int firstNum = 40;
        int secondNum = 10;
        double expectRes = 4;

        Calculator calc = new Calculator();
        double realResult = calc.divide(firstNum, secondNum);
        if (realResult == expectRes) {
            System.out.println("divide Test result = OK");
    } else {
            System.out.println("divide Test result = FAIL");
        }
    }

    void isEvenTest() {
        int checkNumber = 50;
        boolean expectResult = true;

        Calculator calc = new Calculator();
        boolean realResult = calc.isEven(checkNumber);
        if (realResult == expectResult) {
            System.out.println("isEven Test result = OK");
        } else {
            System.out.println("isEven Test result = FAIL");
        }
    }

    void isFirstNumberMax() {
        int firstNum = 100;
        int secondNum = 50;
        int expectResult = 100;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfTwoNumbers(firstNum, secondNum);
        if (realResult == expectResult) {
            System.out.println("First part of check max number = OK ");
        } else {
            System.out.println("First part of check max number = FAIL");
        }
    }

    void isSecondNumberMax() {
        int firstNum = 10;
        int secondNum = 50;
        int exceptResult = 50;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfTwoNumbers(firstNum, secondNum);
        if (realResult == exceptResult) {
            System.out.println("Second part of check max number = OK");
        } else {
            System.out.println("Second part of check max number = FAIL");
        }
    }

    void isFirstSecondEqual() {
        int firstNum = 45;
        int secondNum = 45;
        int expectResult = 45;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfTwoNumbers(firstNum, secondNum);
        if (realResult == expectResult) {
            System.out.println("Third part of test max of two = OK");
        } else {
            System.out.println("Third part of test max of two = FAIL");
        }
    }

    void isFirstOfThreeMax() {
        int firstNum = 100;
        int secondNum = 75;
        int thirdNum = 50;
        int expectResult = 100;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectResult) {
            System.out.println("First part of Max of Three numbers Test = OK");
        } else {
            System.out.println("First part of Max of Three numbers Test = FAIL");
        }
    }

    void isSecondOfThreeMax() {
        int firstNum = 50;
        int secondNum = 100;
        int thirdNum = 75;
        int expectResult = 100;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectResult) {
            System.out.println("Second part of Max of Three numbers Test = OK");
        } else {
            System.out.println("Second part of Max of Three numbers Test = FAIL");
        }
    }

    void isThirdOfThreeMax() {
       int firstNum = 50;
       int secondNum = 75;
       int thirdNum = 100;
       int expectedResult = 100;

       Calculator calc = new Calculator();
       int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
       if (realResult == expectedResult) {
           System.out.println("Third part of Max of Three numbers test = OK");
       } else {
           System.out.println("Third part of Max of Three numbers test = FAIL");
       }
    }

    void isFourthOfThreeMax() {
        int firstNum = 100;
        int secondNum = 100;
        int thirdNum = 50;
        int expectNum = 100;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectNum) {
            System.out.println("Fourth part of Max of Three numbers test = OK");
        } else {
            System.out.println("Fourth part of Max of Three numbers test = FAIL");
        }
    }

    void isFifthOfThreeMax() {
        int firstNum = 10;
        int secondNum = 50;
        int thirdNum = 50;
        int expectResult = 50;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectResult) {
            System.out.println("Fifth part of Max of Three numbers test = OK");
        } else {
            System.out.println("Fifth part of Max of Tree numbers test = FAIL");
        }
    }

    void isSixthOfThreeMax() {
        int firstNum = 150;
        int secondNum = 5;
        int thirdNum = 150;
        int expectResult = 150;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectResult) {
            System.out.println("Sixth part of Max of Three numbers test = OK");
        } else {
            System.out.println("Sixth part of Max of Three numbers test = FAIL");
        }
    }

    void isSeventhThreeMax() {
        int firstNum = 1;
        int secondNum = 200;
        int thirdNum = 200;
        int expectedResult = 200;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectedResult) {
            System.out.println("Seventh part of Max of Three numbers test = OK");
        } else {
            System.out.println("Seventh part of Max of Three numbers test = FAIL");
        }
    }

    void isEightOfThreeMax() {
        int firstNum = 100;
        int secondNum = 100;
        int thirdNum = 100;
        int expectedResult = 100;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectedResult) {
            System.out.println("Eight part of Max of Three numbers test = OK");
        } else {
            System.out.println("Eight part of Max of Three numbers test = FAIL");
        }
    }
}
