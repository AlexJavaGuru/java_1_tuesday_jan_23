package student_vladislav_romanov.lesson_4.level_7;

class FizzBuzzTest {

    public static void main(String[] args) {
        fizzTest();
        buzzTest();
        fizzBuzzTest();
        numberTest();
    }

    static void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedMessage = "Fizz";

        String actualMessage = fizzBuzz.detect(6);

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Fizz test PASSED");
        } else {
            System.out.println("Fizz test FAILED");
        }
    }

    static void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedMessage = "Buzz";

        String actualMessage = fizzBuzz.detect(10);

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Buzz test PASSED");
        } else {
            System.out.println("Buzz test FAILED");
        }
    }

    static void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedMessage = "FizzBuzz";

        String actualMessage = fizzBuzz.detect(15);

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("FizzBuzz test PASSED");
        } else {
            System.out.println("FizzBuzz test FAILED");
        }
    }

    static void numberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedMessage = "7";

        String actualMessage = fizzBuzz.detect(7);

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Number test PASSED");
        } else {
            System.out.println("Number test FAILED");
        }
    }

}
