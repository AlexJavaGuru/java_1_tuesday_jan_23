package student_romualds_leitans.lesson_7.lesson_5;

public class PowerCalculator {

    public static double numberPower(int value, int powValue) {
        double result = 1;
        if (powValue > 0) {
            for (int i = 1; i <= powValue; i++) {
                result = result * value;
            }
            return result;
        } else if (powValue < 0) {
            for (int i = 0; i < powValue * -1; i++) {
                result = result * value;
            }
            return 1 / result;
        }
        return result;
    }
}