package student_ilya_tihonov.lesson_6.level_4;

import java.util.Random;


public class TwoDimensionalArray {


    public static void main(String[] args) {
        int[][] array = new int[3][3];
        arrayWithRandomValues(array);
        printArray(array);
        int sum = sumArray(array);
        System.out.println("Sum: " + sum);
    }
    public static void arrayWithRandomValues(int[][] array){
        Random random = new Random();
        for( int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(10);
            }
        }
    }
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; i < array[i].length; j++){
                System.out.println(array[i][j] + " ");
            }
        } System.out.println();
    }
    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
