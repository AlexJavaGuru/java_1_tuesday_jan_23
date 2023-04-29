package student_julija_raudive.lesson_7.level_5;

class PowerCalculator {

    public double raisingNumberToAPower(double number, int power) {
        double result = number;

        if (power == 0) {
            return 1;
        } else if (power < 0) {

            double AbsoluteValue = Math.abs(power);
            for (int i = 2; i <= AbsoluteValue; i++) {
                result *= number;

            }
            result = 1 / result;
        } else {

            for (int i = 2; i <= power; i++) {
                result *= number;
            }
        }
        return result;

    }


}
