package student_aleksandrs_lezhennikovs.lesson_7.level_5;

class PowerCalculator {

    int power(int number, int pow) {
        int result = 1;
        if (pow == 0) {
            result = 1;
        } else if (number != 0) {
            for (int i = 1; i <= pow; i++) {
                result = result * number;
            }
        } else {
            result = 0;
        }
        return result;
    }
}
