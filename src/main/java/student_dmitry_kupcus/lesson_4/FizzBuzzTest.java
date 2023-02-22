package student_dmitry_kupcus.lesson_4;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(15).equals("FizzBuzz"), "Test FizzBuzz");
    }
    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(6).equals("Fizz"), "Test Fizz");
    }
    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(20).equals("Buzz"), "Test Buzz");
    }
    public void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(8).equals("8"), "Test NotFizzBuzz");
    }
    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " Passed");
        } else {
            System.out.println(testName + " Failed");
        }
    }
}
