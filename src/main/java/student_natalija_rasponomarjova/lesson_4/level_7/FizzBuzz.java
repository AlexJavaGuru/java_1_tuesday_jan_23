package student_natalija_rasponomarjova.lesson_4.level_7;

class FizzBuzz {

    private boolean isDividedBy3(int number) {
        return (number % 3 == 0);
    }

    private boolean isDividedBy5(int number) {
        return (number % 5 == 0);
    }

    public String detectNumber(int number) {
        if (isDividedBy3(number) && number % 5 != 0) {
            return "Fizz";
        }
        if (isDividedBy5(number) && number % 3 != 0) {
            return "Buzz";
        }
        if (isDividedBy3(number) && isDividedBy5(number)) {
            return "FizzBuzz";

        } else {
            return "" + number;
        }
    }
}
