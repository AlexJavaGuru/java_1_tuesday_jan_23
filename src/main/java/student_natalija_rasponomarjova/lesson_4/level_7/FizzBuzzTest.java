package student_natalija_rasponomarjova.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.nonFizzBuzzTest();

    }

    public void fizzTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detectNumber(333).equals("Fizz")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void buzzTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detectNumber(250).equals("Buzz")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void fizzBuzzTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detectNumber(150).equals("FizzBuzz")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void nonFizzBuzzTest() {
        int number = 11;
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detectNumber(11).equals("11")) {
            System.out.println("The number is: " + number);
        }
    }
}



