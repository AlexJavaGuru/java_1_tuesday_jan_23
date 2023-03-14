package student_romualds_leitans.lesson_6.level_7;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.FizzBuzz();
        test.Fizz();
        test.Buzz();
        test.notFizzBuzz();
    }

    public void FizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String testName = "FizzBuzz";
        String expectedResult = "FizzBuzz";
        String result = fizzBuzz.detect(15);
        checkTest(expectedResult.equals(result),testName);

    }
    public void Fizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String testName = "Fizz";
        String expectedResult = "Fizz";
        String result = fizzBuzz.detect(3);
        checkTest(expectedResult.equals(result),testName);


    }
    public void Buzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String testName = "Buzz";
        String expectedResult = "Buzz";
        String result = fizzBuzz.detect(5);
        checkTest(expectedResult.equals(result),testName);

    }
    public void notFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String  testName = "Not FizzBuzz";
        String expectedResult = "4";
        String result = fizzBuzz.detect(8);
        checkTest(!expectedResult.equals(result),testName);

    }


    public void checkTest(boolean condition, String testName){
        if (condition){
            System.out.println(testName + "Test OK");
        }else {
            System.out.println(testName + "Test FAIL");
        }

    }

}
