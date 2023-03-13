package student_andrejs_cekalins.lesson_6.level_7.Task_32;


class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.isFizzBuzz();
        test.notFizzBuzz();
        test.isFizz();
        test.notFizz();
        test.isBuzz();
        test.notBuzz();
        test.returnNumber();
        test.notReturnNumber();
    }

    public void isFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.detect(15);
        checkResult(expectedResult.equals(realResult), "FizzBuzz test ");
    }

    public void notFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.detect(4);
        checkResult(!(expectedResult.equals(realResult)), "Not FizzBuzz test ");
    }

    public void isFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz";
        String realResult = fizzBuzz.detect(9);
        checkResult(expectedResult.equals(realResult), "Fizz test");
    }

    public void notFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz";
        String realResult = fizzBuzz.detect(5);
        checkResult(!(expectedResult.equals(realResult)), "Not Fizz test");
    }

    public void isBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Buzz";
        String realResult = fizzBuzz.detect(20);
        checkResult(expectedResult.equals(realResult), "Buzz test");
    }

    public void notBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Buzz";
        String realResult = fizzBuzz.detect(18);
        checkResult(!(expectedResult.equals(realResult)), "Not Buzz test");
    }

    public void returnNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "1";
        String realResult = fizzBuzz.detect(1);
        checkResult(expectedResult.equals(realResult), "Is number test");
    }

    public void notReturnNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "15";
        String realResult = fizzBuzz.detect(30);
        checkResult(!(expectedResult.equals(realResult)), "Not number test");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
