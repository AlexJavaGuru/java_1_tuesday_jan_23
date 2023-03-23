package student_vladislav_romanov.lesson_7.level_5;

class PowerCalculator {

    public double pow(double value, int level) {
        double result = 1;
        for (int i = 1; i <= level; i++) {
            result *= value;
        }
        return result;
    }

}
