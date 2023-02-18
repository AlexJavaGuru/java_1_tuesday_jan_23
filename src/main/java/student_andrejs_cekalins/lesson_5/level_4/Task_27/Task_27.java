package student_andrejs_cekalins.lesson_5.level_4.Task_27;


import java.util.Arrays;
import java.util.Random;

class Task_27 {
    public static void main(String[] args) {
        int[] results = new int[7];
        Random random = new Random();
        for (int i = 0; i < results.length; i++) {
            results[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(results));
        int maxNumber = results[0];
        for (int y = 0; y < results.length; y++) {
            if (results[y] > maxNumber) {
                maxNumber = results[y];
            }
        }
        System.out.println("Smallest number is: " + maxNumber);
    }
}



