package student_oleg_gryazev.lesson_5.level_4;

import java.util.Random;

class Massive5 {
    static int[] num = new int[5];
    static Random random = new Random();

    Massive5() {
    }

    static void randomMassive() {
        for(int i = 0; i < num.length; ++i) {
            num[i] = random.nextInt(100);
            int numberOfMassiveElement = num[i];
            System.out.print("randomMassive = " + numberOfMassiveElement + "; ");
        }

    }

    static void oddNumber() {
        for (int j : num) {
            if (j % 2 != 0) {
                System.out.print("\nOdd numbers of random massive = " + j);
            }
        }

    }

    public static void main(String[] args) {
        randomMassive();
        oddNumber();
    }
}
