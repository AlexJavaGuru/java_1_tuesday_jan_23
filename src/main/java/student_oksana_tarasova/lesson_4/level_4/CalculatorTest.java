package student_oksana_tarasova.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.differenceTest();
        calculatorTest.mulTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        calculatorTest.twoNumbersTest1();
        calculatorTest.twoNumbersTest2();
        calculatorTest.twoNumbersTest3();
        calculatorTest.threeNumbers1();
        calculatorTest.threeNumbers2();
        calculatorTest.threeNumbers3();
        calculatorTest.threeNumbers4();
        calculatorTest.threeNumbers5();
        calculatorTest.threeNumbers6();
        calculatorTest.threeNumbers7();

    }

    Calculator calculator = new Calculator();

    public void sumTest() {
        outputResult((calculator.sum(5, 6)) == 11, "sumTest");
    }

    public void differenceTest() {
        outputResult((calculator.difference(10, 5)) == 5, "differenceTest");
    }

    public void mulTest() {
        outputResult((calculator.mul(5, 6)) == 30, "mulTest");
    }

    public void divideTest() {
        outputResult((calculator.divide(12, 4)) == 3, "divideTest");
    }

    public void twoNumbersTest1() {
        outputResult((calculator.maxOfTwoNumbers(8, 5)) == 8, "twoNumbersTest1FirstNumber");
    }

    public void twoNumbersTest2() {
        outputResult((calculator.maxOfTwoNumbers(5, 9)) == 9, "twoNumbersTest2SecondNumber");
    }

    public void twoNumbersTest3() {
        outputResult((calculator.maxOfTwoNumbers(9, 9)) == 9, "twoNumbersTest3EqualNumbers");
    }


    public void threeNumbers1() {
        outputResult((calculator.maxOfThreeNumbers(9, 8, 7)) == 9, "ThreeNumbers1TestFirstNumber");
    }

    public void threeNumbers2() {
        outputResult((calculator.maxOfThreeNumbers(4, 10, 7)) == 10, "ThreeNumbers2TestSecondNumber");
    }

    public void threeNumbers3() {
        outputResult((calculator.maxOfThreeNumbers(9, 8, 11)) == 11, "ThreeNumbers3TestThirdNumber");
    }

    public void threeNumbers4() {
        outputResult((calculator.maxOfThreeNumbers(9, 9, 7)) == 9, "ThreeNumbers4TestEqualNumbers");
    }

    public void threeNumbers5() {
        outputResult((calculator.maxOfThreeNumbers(9, 12, 12)) == 12, "ThreeNumbers5TestEqualNumbers");
    }

    public void threeNumbers6() {
        outputResult((calculator.maxOfThreeNumbers(10, 8, 10)) == 10, "ThreeNumbers6TestEqualNumbers");
    }

    public void threeNumbers7() {
        outputResult((calculator.maxOfThreeNumbers(9, 9, 9)) == 9, "ThreeNumbers7TestEqualNumbers");
    }

    public void isEvenTest() {
        outputResult(calculator.isEven(9) == false, "isEvenTest");

    }

    public void outputResult(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = OK");
        } else {
            System.out.println(nameTest + " = FAIL");
        }
    }
}
