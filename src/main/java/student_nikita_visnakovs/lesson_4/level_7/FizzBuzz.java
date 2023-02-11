package student_nikita_visnakovs.lesson_4.level_7;


public class FizzBuzz {

    public String detect(int number) {

        if (numDivThree(number) && numDivFive(number)) {
            return "FizzBuzz";
        }
        if (numDivThree(number)) {
            return "Fizz";
        }
        if (numDivFive(number)) {
            return "Buzz";
        }
        return "" + number;
    }
    private boolean numDivThree(int number) {
        return number % 3 == 0;
    }
    private boolean numDivFive(int number) {
        return number % 5 == 0;
    }
}
