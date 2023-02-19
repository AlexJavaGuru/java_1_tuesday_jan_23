package student_aleksandrs_lezhennikovs.lesson_4.level_3;

class CheckThreeNumbers {
    String checkNumber(int firstNumber, int secondNumber, int thirdNumber) {
        String result;

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            result = "All three numbers are equal";
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            result = "All three numbers are different";
        } else {
            result = "Neither all are equal or different";
        }
        return  result;
    }
}
