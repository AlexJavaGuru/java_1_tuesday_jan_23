package student_romualds_leitans.lesson_4.level_7;

class FizzBuzzTest {


    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.notFizzBuzzTest();


    }
    public void fizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(3).equals("Fizz"), " Fizz ");
    }

    public void buzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(5).equals("Buzz"), " Buzz ");
    }
    public void fizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(30).equals("FizzBuzz"), " FizzBuzz ");
    }
    public void notFizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(4).equals("4"), "Not FizzBuzz ");

    }
    private void check(boolean condition, String testName){
        if (condition) {
            System.out.println(testName + "= TEST OK");
        } else {
            System.out.println(testName + "= TEST FAIL");
        }

    }

}
