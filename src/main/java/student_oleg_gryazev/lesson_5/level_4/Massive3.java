package student_oleg_gryazev.lesson_5.level_4;


import java.util.Arrays;

class Massive3 {
    static int[] num = new int[]{3, 10, 45, 16, 77, 2};

    Massive3() {
    }

    static int smallest() {
        int min = num[0];

        for (int i = 1; i < num.length; ++i) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("Massive = " + Arrays.toString(num));
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Smallest in given array is " + smallest());
    }
}
