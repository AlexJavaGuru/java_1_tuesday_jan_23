package student_nikita_visnakovs.lesson_4.level_7;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.notOneOf();

    }

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(30).equals("FizzBuzz"), "FizzBuzz Test");

    }

    private void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(9).equals("Fizz"), "Fizz Test");
    }

    private void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(10).equals("Buzz"), "Buzz Test");
    }

    private void notOneOf() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(17).equals("17") , "Not one of test");
    }

    public void checkResult(boolean numValue, String testName) {
        if (numValue) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");

        }
    }
}