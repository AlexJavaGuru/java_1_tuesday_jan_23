package student_dmitry_kupcus.lesson_4;

class FizzBuzz {

    public String detect(int number) {

        if (isDividedBy3(number) && isDividedBy5(number)) {
            return "FizzBuzz";
        } else if (isDividedBy3(number)) {
            return "Fizz";
        } else if (isDividedBy5(number)) {
            return "Buzz";
        }
        return "" + number;
    }
    private boolean isDividedBy3(int number) {
            return number % 3 == 0;
    }
    private boolean isDividedBy5(int number) {
            return number % 5 == 0;
    }

}