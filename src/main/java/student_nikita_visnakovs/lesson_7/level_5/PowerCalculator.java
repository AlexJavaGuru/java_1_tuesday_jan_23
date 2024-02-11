package student_nikita_visnakovs.lesson_7.level_5;

public class PowerCalculator {

    public double raisePower (int value, int power) {
        double result = 1;
        if (power == 0) {
            return result;
        } else if (power > 0) {
            return positive(value, power, result);
        } else {
            return negative(value, power, result);
        }
    }

    private double positive(int value, int power, double result) {
        for (int i = 0; i < power; i++) {
            return result * value;
        }
        return result;
    }

    private double negative(int value, int power, double result) {
        for (int i = 0; i < -power; i++) {
            return result * value;
        }
        return 1 / result;
    }
}
