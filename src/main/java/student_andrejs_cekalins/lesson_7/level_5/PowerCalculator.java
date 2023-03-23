package student_andrejs_cekalins.lesson_7.level_5;

class PowerCalculator {
    public int power(int number, int powerValue) {
        int result = 1;
        for (int i = 1; i <= powerValue; i++) {
            result = result * number;
        }
        return result;
    }
}

