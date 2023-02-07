package student_aleksandrs_lezhennikovs.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest testFizzBuzz = new FizzBuzzTest();
        System.out.println(testFizzBuzz.check(1, "1"));
        System.out.println(testFizzBuzz.check(2, "2"));
        System.out.println(testFizzBuzz.check(3, "Fizz"));
        System.out.println(testFizzBuzz.check(4, "4"));
        System.out.println(testFizzBuzz.check(5, "Buzz"));
        System.out.println(testFizzBuzz.check(6, "Fizz"));
        System.out.println(testFizzBuzz.check(7, "7"));
        System.out.println(testFizzBuzz.check(8, "8"));
        System.out.println(testFizzBuzz.check(9, "Fizz"));
        System.out.println(testFizzBuzz.check(10, "Buzz"));
        System.out.println(testFizzBuzz.check(11, "11"));
        System.out.println(testFizzBuzz.check(12, "Fizz"));
        System.out.println(testFizzBuzz.check(13, "13"));
        System.out.println(testFizzBuzz.check(14, "14"));
        System.out.println(testFizzBuzz.check(15, "FizzBuzz"));
    }

    String check(int number, String expectedResult) {
        FizzBuzz object = new FizzBuzz();
        String realResult = object.detect(number);
        if (realResult.equals(expectedResult)) {
            return "Test is OK for number " + number;
        } else {
            return "Test is FAIL for number " + number;
        }
    }
}
