package student_oksana_tarasova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class UserArrayRandom {
    public static void main(String[] args) {
        UserArrayRandom userArrayRandom = new UserArrayRandom();
        int[] arrayRandomUser = userArrayRandom.createArray();
        userArrayRandom.fillArrayRandom(arrayRandomUser);
        userArrayRandom.printArray(arrayRandomUser);

    }


    public int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length array..");
        int length = scanner.nextInt();
        return new int[length];
    }

    public int[] fillArrayRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150);
        }
        return array;
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
