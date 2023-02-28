package student_oksana_tarasova.lesson_4.levet_7;

class FizzBuzzTest {

   public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    FizzBuzz fizzBuzz = new FizzBuzz();

    public void fizzTest() {

        resultOutput(fizzBuzz.detect(33).equals("Fizz"), "fizzTest");
    }
    public void buzzTest() {
       resultOutput(fizzBuzz.detect(55).equals("Buzz"), "buzzTest");
    }
    public void fizzBuzzTest() {
        resultOutput(fizzBuzz.detect(15).equals("FizzBuzz"), "fizzBuzzTest");
    }
     public void notFizzBuzzTest() {
       resultOutput(fizzBuzz.detect(17).equals("17"), "NotFizzBuzzTest");
    }

    public void resultOutput(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
