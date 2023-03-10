package student_daniels_belejuns.lesson_7.level_5;

public class PowerCalculator {
    public static double calculate(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            return 1 / calculate(base, -exponent);
        } else if (exponent % 2 == 0) {
            double temp = calculate(base, exponent / 2);
            return temp * temp;
        } else {
            return base * calculate(base, exponent - 1);
        }
    }
}
