package student_oksana_maksimova.lesson_4.level_7;

public class FizzBuzz {

    public String detect(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }

        return "" +  number;

    }
}

