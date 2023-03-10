package student_natalija_rasponomarjova.lesson_6.level_7;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    public void fizzBuzzTest() {

        String expected = "FizzBuzz";
        String fact = fizzBuzz.detect(15);
        checkResult(expected.equals(fact), "fizzBuzzTest ");
    }

    public void fizzTest() {
        String expected = "Fizz";
        String fact = fizzBuzz.detect(39);
        checkResult(expected.equals(fact), "fizzTest");

    }

    public void buzzTest() {
        String expected = "Buzz";
        String fact = fizzBuzz.detect(50);
        checkResult(expected.equals(fact), "buzzTest");
    }

    public void nonFizzBuzz() {
        String expected = "2";
        String fact = fizzBuzz.detect(2);
        checkResult(expected.equals(fact), "nonFizzBuzz");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - Failed");
        }
    }

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.nonFizzBuzz();
    }
}
