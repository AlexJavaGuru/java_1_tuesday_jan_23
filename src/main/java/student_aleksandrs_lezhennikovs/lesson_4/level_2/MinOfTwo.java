package student_aleksandrs_lezhennikovs.lesson_4.level_2;

class MinOfTwo {

    String checkMin(int firstNumber, int secondNumber) {
        String result;

        if (firstNumber > secondNumber) {
            result = "Second number: " + secondNumber + " is smaller than first";
        } else if (firstNumber < secondNumber) {
            result = "First number: " + firstNumber + " is smaller than second";
        } else {
            result = "Numbers are equal!";
        }
        return  result;
    }
}
