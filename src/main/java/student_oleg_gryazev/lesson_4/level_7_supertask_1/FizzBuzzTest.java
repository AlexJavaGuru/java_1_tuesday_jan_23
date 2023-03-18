package student_oleg_gryazev.lesson_4.level_7_supertask_1;


class FizzBuzzTest {
    FizzBuzzTest() {
    }

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }

    }

    void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        this.check(fizzBuzz.detect(15).equals("FizzBuzz"), "TEST FIZZBUZZ");
    }
}

