package student_oksana_tarasova.lesson_5.level_2;


import java.util.Random;

class ArrayRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150);
            System.out.println("Array cell " + i + " = " + array[i]);
        }
    }
}
