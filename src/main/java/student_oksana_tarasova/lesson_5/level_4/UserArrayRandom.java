package student_oksana_tarasova.lesson_5.level_4;

import java.util.Scanner;
import java.util.Random;

class UserArrayRandom {
    public static void main(String[] args) {
        Scanner userArray = new Scanner(System.in);
        System.out.println("Input length array..");
        int l = userArray.nextInt();

        System.out.println("Array length = " + l);

        int[] array = new int[l];
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            array[i] = random.nextInt(150);
            System.out.println("cell [" + i + "] = " + array[i]);
        }
    }
}
