package student_oksana_tarasova.lesson_8.level_7.MathOperation;

public class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();
        test.divideTest();
        test.subtractionTest();
        test.multiplyResultTest();
    }

    // (10 - 5) * (20 / 5)
    void divideTest() {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(20);
        MathOperation divide = new Divide(arg2, arg1);
        double expectedResult = 4.0;
        double realResult = divide.calculate();
        check(expectedResult == realResult, "divide test");
    }

    void subtractionTest() {
        Argument arg1 = new Argument(5);
        Argument arg3 = new Argument(10);
        MathOperation subtraction = new Subtraction(arg3, arg1);
        double expectedResult = 5.0;
        double realResult = subtraction.calculate();
        check(expectedResult == realResult, "subtraction test");
    }

    void multiplyResultTest() {
        Argument arg4 = new Argument(5);
        Argument arg5 = new Argument(4);
        MathOperation multiply = new Multiply(arg4, arg5);
        double expectedResult = 20.0;
        double realResult = multiply.calculate();
        check(expectedResult == realResult, "multiply result test");
    }

    void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
