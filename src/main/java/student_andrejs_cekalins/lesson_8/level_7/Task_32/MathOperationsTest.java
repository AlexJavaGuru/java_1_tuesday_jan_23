package student_andrejs_cekalins.lesson_8.level_7.Task_32;

class MathOperationsTest {
    public static void main(String[] args) {
        MathOperationsTest test = new MathOperationsTest();
        test.subtraction();
        test.divide();
        test.multiply();
    }
    public void subtraction () {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        Subtraction subtraction = new Subtraction(arg1,arg2);
        double expectedResult = 5.0;
        double realResult = subtraction.calculate();
        checkResult(expectedResult, realResult, "Subtraction test ");
    }
    public void divide() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        Divide divide = new Divide(arg1,arg2);
        double expectedResult = 2.0;
        double realResult = divide.calculate();
        checkResult(expectedResult, realResult, "Divide test");
    }
    public void multiply() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        Multiply multiply = new Multiply(arg1, arg2);
        double expectedResult = 50.0;
        double realResult = multiply.calculate();
        checkResult(expectedResult, realResult, "Multiply test");
    }

    private static void checkResult(double expectedResult, double realResult, String testName) {
        if (expectedResult==realResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
