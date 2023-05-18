package student_natalija_rasponomarjova.lesson_7.level_5;

class PowerCalculator {

    public double getPowerPositive(int number, int power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }

    public double getPowerNegative(int number, int power) {
        double result = 1;
        for (int i = 1; i < power * -1; i++) {
            result = result * number;
        }
        return 1 / result;
    }
}
