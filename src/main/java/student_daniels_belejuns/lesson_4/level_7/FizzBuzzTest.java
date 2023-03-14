package student_daniels_belejuns.lesson_4.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        fizzBuzzTest();
        fizzTest();
        buzzTest();

    }

    static void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedMessage = "FizzBuzz";
        String actualMessage = fizzBuzz.detect(25);
        if (actualMessage.equals(expectedMessage)) {
            System.out.println("FizzBuzz passed");
        } else {
            System.out.println("FizzBuzz failed");
        }
    }

    static void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedMessage = "Fizz";
        String actualMessage = fizzBuzz.detect(5);
        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Fizz passed");
        } else {
            System.out.println("Fizz failed");
        }
    }

    static void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedMessage = "Buzz";
        String actualMessage = fizzBuzz.detect(9);
        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Buzz passed");
        } else {
            System.out.println("Buzz failed");
        }

    }
}
