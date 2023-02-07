package student_aleksandrs_lezhennikovs.lesson_4.level_7;

class FizzBuzz {
    public String detect(int number) {
        int divOn3 = number % 3;
        int divOn5 = number % 5;
        if (divOn3 == 0 && divOn5 == 0) {
            return "FizzBuzz";
        } else if (divOn3 == 0 && divOn5 != 0) {
            return "Fizz";
        } else if (divOn3 != 0 && divOn5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}
