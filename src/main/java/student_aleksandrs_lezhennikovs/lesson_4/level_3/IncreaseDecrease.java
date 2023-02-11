package student_aleksandrs_lezhennikovs.lesson_4.level_3;

class IncreaseDecrease {

    String checkNumber(int firstNumber, int secondNumber, int thirdNumber) {
        String result;

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            result = "Decreasing";
        } else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            result = "Increasing";
        } else {
            result = "Neither increasing or decreasing order";
        }
        return result;
    }
}
