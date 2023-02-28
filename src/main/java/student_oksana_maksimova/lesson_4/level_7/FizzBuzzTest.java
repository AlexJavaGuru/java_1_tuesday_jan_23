package student_oksana_maksimova.lesson_4.level_7;

public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(15).equals("FizzBuzz"),"FizzBuzz Test =");
    }
    public void fizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(9).equals("Fizz"),"Fizz Test =");
    }
    public void buzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(10).equals("Buzz"), "Buzz Test =" );
    }
    public void notFizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(11).equals("11"), "Test Not FizzBuzz =");
    }
    public void checkResult(boolean status, String testName) {
        if (status) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}

