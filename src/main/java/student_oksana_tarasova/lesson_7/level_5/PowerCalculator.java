package student_oksana_tarasova.lesson_7.level_5;

import student_andrejs_cekalins.lesson_5.level_3.Task16.ForLoopDefinition1;

class PowerCalculator {

    public int raisingANumberToAPower(int number, int powerOf) {
        int result = 1;
        int i = 1;
        while (i <= powerOf) {
            result *= number;
            i++;
        }
        return result;
    }

    public double raisingANumberToANegativePower(int number, int powerOf) {
        double result = 1.0;
        int i = -1;
        while (i >= powerOf) {
            result *= number;
            i--;
        }
        return 1 / result;
    }
}
