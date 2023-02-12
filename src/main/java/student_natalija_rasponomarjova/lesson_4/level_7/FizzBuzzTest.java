package student_natalija_rasponomarjova.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzztest = new FizzBuzzTest();
        fizzBuzztest.fizzTest();
        fizzBuzztest.buzzTest();


    }

    public void fizzTest() {
        int number = 333;
        String correctResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detectNumber(number);
        if (realResult.equals(correctResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void buzzTest() {
        int number = 250;
        String correctResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detectNumber(number);
        if (realResult.equals(correctResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }

}


