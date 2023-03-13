package student_oksana_tarasova.lesson_6.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.divisibleByThreeAndFive();
        fizzBuzzTest.divisibleByThree();
        fizzBuzzTest.divisibleByFive();
        fizzBuzzTest.notDivisibleByThreeAndFive();

    }

    public void divisibleByThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.detect(15);
        check(expectedResult == realResult, "divisibleByThreeAndFive");
    }

    public void divisibleByThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz";
        String realResult = fizzBuzz.detect(9);
        check(expectedResult == realResult, "divisibleByThree");
    }

    public void divisibleByFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Buzz";
        String realResult = fizzBuzz.detect(25);
        check(expectedResult == realResult, "divisibleByFive");
    }

    public void notDivisibleByThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "11";
        String realResult = fizzBuzz.detect(11);
        check(expectedResult.equals(realResult), "notDivisibleByThreeAndFive");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
