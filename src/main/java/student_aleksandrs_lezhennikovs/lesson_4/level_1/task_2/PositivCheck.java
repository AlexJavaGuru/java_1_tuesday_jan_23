package student_aleksandrs_lezhennikovs.lesson_4.level_1.task_2;

class PositivCheck {

    String isPositiv(int number) {

        String result;
        if (number > 0) {
            result = "Your number is Positive";
        } else if (number < 0) {
            result = "Yor number is Negative";
        } else {
            result = "Your number is equal to zero";
        }
        return result;
    }
}
