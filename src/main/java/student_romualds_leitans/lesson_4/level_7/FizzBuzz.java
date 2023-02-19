package student_romualds_leitans.lesson_4.level_7;

class FizzBuzz {

    private boolean isDividedBy3(int number) {
        return number % 3 == 0;
    }

    private boolean isDividedby5(int number) {
        return number % 5 == 0;
    }

    public String detect(int number) {
        if (isDividedBy3(number)) {
            return "Fizz";
        }
        if (isDividedby5(number)) {
            return "Buzz";
        }
        if (isDividedBy3(number) && isDividedby5(number)) {
            return "FizzBuzz";
        }
        return "" + number;

    }
}