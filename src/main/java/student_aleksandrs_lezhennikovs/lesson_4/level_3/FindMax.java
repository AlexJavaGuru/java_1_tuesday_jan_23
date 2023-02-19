package student_aleksandrs_lezhennikovs.lesson_4.level_3;

class FindMax {
    int checkNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int result;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            result = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            result = secondNumber;
        } else {
            result = thirdNumber;
        }
        return result;
    }
}
