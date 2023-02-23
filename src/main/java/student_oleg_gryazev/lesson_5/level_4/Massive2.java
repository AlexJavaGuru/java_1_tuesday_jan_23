package student_oleg_gryazev.lesson_5.level_4;

import java.util.Arrays;

class Massive2 {
    static int[] num = new int[]{3, 10, 45, 16, 77, 2};

    Massive2() {
    }

    static int largest() {
        int max = num[0];

        for (int i = 1; i < num.length; ++i) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("Massive = " + Arrays.toString(num));
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Largest in given array is " + largest());
    }
}
