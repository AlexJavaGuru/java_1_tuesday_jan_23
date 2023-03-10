package student_nikita_visnakovs.lesson_4.level_7;


public class FizzBuzz {

    public String detect(int number) {

        if (numDivThree(number) && numDivFive(number)) {
            return "FizzBuzz";
        } else if
        (numDivThree(number)) {
            return "Fizz";
        } else if (numDivFive(number)) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }

    private boolean numDivThree(int number) {
        return number % 3 == 0;
    }

    private boolean numDivFive(int number) {
        return number % 5 == 0;
    }
}
