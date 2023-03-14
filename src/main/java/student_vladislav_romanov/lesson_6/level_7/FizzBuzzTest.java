package student_vladislav_romanov.lesson_6.level_7;

public class FizzBuzzTest {

    public static void main(String[] args) {
        fizzBuzzTestSucceed();
        fizzBuzzTestFailed();
        fizzTestSucceed();
        fizzTestFailed();
        buzzTestSucceed();
        buzzTestFailed();
        numberTestSucceed();
        numberTestFailed();
    }

    public static void fizzBuzzTestSucceed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";
        String current = fizzBuzz.detect(15);
        checkTestResult(current.equals(expected), "fizzBuzzTestSucceed test");
    }

    public static void fizzBuzzTestFailed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";
        String current = fizzBuzz.detect(14);
        checkTestResult(!current.equals(expected), "fizzBuzzTestFailed test");
    }

    public static void fizzTestSucceed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        String current = fizzBuzz.detect(3);
        checkTestResult(current.equals(expected), "fizzTestSucceed test");
    }

    public static void fizzTestFailed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        String current = fizzBuzz.detect(2);
        checkTestResult(!current.equals(expected), "fizzTestFailed test");
    }

    public static void buzzTestSucceed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        String current = fizzBuzz.detect(5);
        checkTestResult(current.equals(expected), "buzzTestSucceed test");
    }

    public static void buzzTestFailed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        String current = fizzBuzz.detect(4);
        checkTestResult(!current.equals(expected), "buzzTestFailed test");
    }

    public static void numberTestSucceed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "4";
        String current = fizzBuzz.detect(4);
        checkTestResult(current.equals(expected), "numberTestSucceed test");
    }

    public static void numberTestFailed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "4";
        String current = fizzBuzz.detect(2);
        checkTestResult(!current.equals(expected), "numberTestFailed test");
    }

    private static void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
        }
    }

}
