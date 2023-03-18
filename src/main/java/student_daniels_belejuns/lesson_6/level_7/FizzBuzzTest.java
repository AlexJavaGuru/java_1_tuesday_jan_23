package student_daniels_belejuns.lesson_6.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        checkFizzResult();
        checkBuzzResult();
        checkFizzBuzzResult();
        checkNotFizzBuzzResult();
    }

    private static void printMessage(boolean condition, String testMethod) {
        if (condition) {
            System.out.println(testMethod + " is OK");
        } else {
            System.out.println(testMethod + " is FAIL");
        }
    }

    private static void checkFizzResult() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String methodName= "Fizz test";
        String expectedResult = "Fizz";
        int number = 3;
        String calculatedResult = fizzBuzz.detect(number);
        printMessage(expectedResult.equals(calculatedResult), methodName);
    }

    private static void checkBuzzResult() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String methodName= "Buzz test";
        String expectedResult = "Buzz";
        int number = 5;
        String calculatedResult = fizzBuzz.detect(number);
        printMessage(expectedResult.equals(calculatedResult), methodName);
    }

    private static void checkFizzBuzzResult() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String methodName= "FizzBuzz test";
        String expectedResult = "FizzBuzz";
        int number = 15;
        String calculatedResult = fizzBuzz.detect(number);
        printMessage(expectedResult.equals(calculatedResult), methodName);
    }

    private static void checkNotFizzBuzzResult() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String methodName= "NOT FizzBuzz test";
        String expectedResult = "4";
        int number = 4;
        String calculatedResult = fizzBuzz.detect(number);
        printMessage(expectedResult.equals(calculatedResult), methodName);
    }
}

