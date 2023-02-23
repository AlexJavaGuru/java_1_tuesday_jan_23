package student_oleg_gryazev.lesson_5.level_4;

import java.util.Random;

class Massive4 {
    static int[] num = new int[4];
    static Random random = new Random();

    static void randomMassive() {
        for (int i = 0; i < num.length; ++i) {
            num[i] = random.nextInt(100);
            int numberOfMassiveElement = num[i];
            System.out.print("\nYour numbers are in order of array elements:\nelement massive num [" + i + "] =  " + numberOfMassiveElement + "; ");
        }

    }

    static void evenNumber() {
        for (int j : num) {
            if (j % 2 == 0) {
                System.out.println(" ");
                System.out.println("Even number of random massive = " + j + " ;");
            }
        }

    }

    public static void main(String[] args) {
        randomMassive();
        evenNumber();
    }
}
