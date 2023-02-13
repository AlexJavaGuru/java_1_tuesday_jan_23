package student_aleksandrs_lezhennikovs.lesson_4.level_2;

class MaxOfTwo {

    String checkMax(int firstNumber, int secondNumber) {
        String result;

        if (firstNumber > secondNumber) {
            result = "First number: " + firstNumber + " is bigger than second";
        } else if (firstNumber < secondNumber) {
            result = "Second number: " + secondNumber + " is bigger than first";
        } else {
            result = "Numbers are equals!";
        }
        return result;
    }
}
