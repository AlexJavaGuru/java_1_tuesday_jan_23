package student_oksana_tarasova.lesson_7.level_5;

class PowerCalculator {

    static int raisingANumberToAPower(int number, int powerOf) {
        int result = 1;
        int i = 1;
        while (i <= powerOf) {
            result *= number;
            i++;
        }
        return result;
    }

    static double raisingANumberToANegativePower(int number, int powerOf) {
        double result = 1.0;
        int i = -1;
        while (i >= powerOf) {
            result *= number;
            i--;
        }
        return 1 / result;
    }
}