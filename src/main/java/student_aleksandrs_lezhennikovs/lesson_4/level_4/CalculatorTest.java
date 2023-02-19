package student_aleksandrs_lezhennikovs.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
       sumTest();
       subtractTest();
       multiplyTest();
       divideTest();
       isEvenTest();
       isFirstNumberMax();
       isSecondNumberMax();
       isFirstSecondEqual();
       isFirstOfThreeMax();
       isSecondOfThreeMax();
       isThirdOfThreeMax();
       isFourthOfThreeMax();
       isFifthOfThreeMax();
       isSixthOfThreeMax();
       isSeventhThreeMax();
    }

    private static void sumTest() {
        int firstNum = 10;
        int secondNum = 5;
        int exceptedRes = 15;

        Calculator calc = new Calculator();
        int realResult = calc.sumNumbers(firstNum, secondNum);
        check("Sum ", realResult, exceptedRes);
    }

    static void subtractTest() {
        int firstNum = 20;
        int secondNum = 15;
        int expectRes = 5;

        Calculator calc = new Calculator();
        int realResult = calc.subtract(firstNum, secondNum);
        check("Subtract ", realResult, expectRes);
    }

    static void multiplyTest() {
        int firstNum = 7;
        int secondNum = 10;
        int expectRes = 70;

        Calculator calc = new Calculator();
        int realResult = calc.multiply(firstNum, secondNum);
        check("Multiply ", realResult, expectRes);
    }

    static void divideTest() {
        int firstNum = 40;
        int secondNum = 10;
        double expectRes = 4;

        Calculator calc = new Calculator();
        double realResult = calc.divide(firstNum, secondNum);
        check("Divide ", realResult, expectRes);
    }

    static void isEvenTest() {
        int checkNumber = 50;
        boolean expectRes = true;

        Calculator calc = new Calculator();
        boolean realResult = calc.isEven(checkNumber);
        check("IsEven ", realResult, expectRes);
    }

    static void isFirstNumberMax() {
        int firstNum = 100;
        int secondNum = 50;
        int expectResult = 100;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfTwoNumbers(firstNum, secondNum);
        check("First of Two is MAX ", realResult, expectResult);
    }

    static void isSecondNumberMax() {
        int firstNum = 10;
        int secondNum = 50;
        int exceptResult = 50;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfTwoNumbers(firstNum, secondNum);
        check("Second of Two is MAX ", realResult, exceptResult);
    }

    static void isFirstSecondEqual() {
        int firstNum = 45;
        int secondNum = 45;
        int expectResult = 45;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfTwoNumbers(firstNum, secondNum);
        check("First and second of two is equal ", realResult, expectResult);
    }

    static void isFirstOfThreeMax() {
        int firstNum = 100;
        int secondNum = 75;
        int thirdNum = 50;
        int expectResult = 100;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        check("First of Trhee is Max ", realResult, expectResult);
    }

    static void isSecondOfThreeMax() {
        int firstNum = 50;
        int secondNum = 100;
        int thirdNum = 75;
        int expectResult = 100;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        check("Second of Tree is Max ", realResult, expectResult);
    }

    static void isThirdOfThreeMax() {
       int firstNum = 50;
       int secondNum = 75;
       int thirdNum = 100;
       int expectRes = 100;

       Calculator calc = new Calculator();
       int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
       check("Third of Three is Max ", realResult, expectRes);
    }

    static void isFourthOfThreeMax() {
        int firstNum = 100;
        int secondNum = 100;
        int thirdNum = 50;
        int expectRes = 100;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        check("First and second of Three are Max ", realResult, expectRes);
    }

    static void isFifthOfThreeMax() {
        int firstNum = 10;
        int secondNum = 50;
        int thirdNum = 50;
        int expectRes = 50;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        check("Second and third of Three are Max ", realResult, expectRes);
    }

    static void isSixthOfThreeMax() {
        int firstNum = 150;
        int secondNum = 5;
        int thirdNum = 150;
        int expectRes = 150;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        check("First and third of Three are Max ", realResult, expectRes);
    }

    static void isSeventhThreeMax() {
        int firstNum = 100;
        int secondNum = 100;
        int thirdNum = 100;
        int expectRes = 100;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        check("All three are equal ", realResult, expectRes);
    }

    private static void check(String functionName, int realResult, int expectRes) {
        if (realResult == expectRes) {
            System.out.println("Test result of " + functionName + "= OK");
        } else {
            System.out.println("Test result of " + functionName + " = FAIL");
        }
    }

    private static void check(String functionName, double realResult, double expectRes) {
        if (realResult == expectRes) {
            System.out.println("Test result of " + functionName + "= OK");
        } else {
            System.out.println("Test result of " + functionName + "= FAIL");
        }
    }

    private static void check(String functionName, boolean realResult, boolean expectRes) {
        if (realResult == expectRes) {
            System.out.println("Test result of " + functionName + "= OK");
        } else {
            System.out.println("Test result of " + functionName + "= FAIL");
        }
    }
}
