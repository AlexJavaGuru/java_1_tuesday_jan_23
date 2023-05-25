package student_natalija_rasponomarjova.lesson_8.level_7.task_32;

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();
        test.additionTest();
        test.subtractionTest();
        test.divisionTest();
        test.multiplyTest();
    }

    Argument arg1 = new Argument(100);
    Argument arg2 = new Argument(45);

    public void additionTest() {
        Addition addition = new Addition(arg1, arg2);
        double expected = 145;
        double real = addition.calculate();
        checkResult(expected, real, "Addition test ");
    }

    public void subtractionTest() {
        Subtraction subtraction = new Subtraction(arg1, arg2);
        double expected = 55;
        double real = subtraction.calculate();
        checkResult(expected, real, "Subtraction test ");
    }

    public void divisionTest() {
        Divide divide = new Divide(arg1, arg2);
        double expected = 2.22222222222222222;
        double real = divide.calculate();
        checkResult(expected, real, "Division test ");
    }
    public void multiplyTest() {
        Multiply multiply = new Multiply(arg1, arg2);
        double expected = 4500;
        double real = multiply.calculate();
        checkResult(expected, real, "Multiply test ");
    }

    public static void checkResult(double expected, double real, String testName) {
        if (expected == real) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - Failed");
        }
    }
}


