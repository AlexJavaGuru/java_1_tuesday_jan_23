package student_ilya_tihonov.lesson_7.level_5;

import java.util.Scanner;

public class PowerCalculator {

    static int exponentiation ( int base, int exponent){
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;

    }
}

