package student_anastasiia_bokareva.lesson6.level4;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray arr = new TwoDimensionalArray();
        Scanner scan = new Scanner(System.in);
        int arrayLengthOne = scan.nextInt();
        int arrayLengthTwo = scan.nextInt();
        int[][] array = new int[arrayLengthOne][arrayLengthTwo];
        arr.createArray(array,arrayLengthOne,arrayLengthTwo);
        int counterArray = arr.counter(array,arrayLengthOne,arrayLengthTwo);
        System.out.println(counterArray);
    }


    public void createArray(int[][]array , int arrayLengthOne,int arrayLengthTwo){
        Random random = new Random();
        for (int i = 0; i<arrayLengthOne;i++) {
            for (int t = 0; t < arrayLengthTwo; t++) {
                array[i][t] = random.nextInt(30);
            }
        }
    }
    public int counter (int[][] array, int arrayLengthOne, int arrayLengthTwo) {
        int counter = 0;
        for (int i = 0; i < arrayLengthOne; i++) {
            for (int t = 0; t < arrayLengthTwo; t++) {
                counter = array[i][t] + counter;
            }
        }
        return counter;
    }
}
