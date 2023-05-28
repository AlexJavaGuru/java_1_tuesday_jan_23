package student_konstantin_kudrjavtsev.lesson_7.level_5_middle;

class PowerCalculator {

    public static double raisingAGivenNumberToAPower(double number, int powerOf) {
        double result = 1.0;
        for (int i = 0; i < powerOf; i++) {
            result *= number;
        }
        return result;
    }
}