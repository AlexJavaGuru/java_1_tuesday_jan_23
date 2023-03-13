package student_oksana_tarasova.lesson_5.level_2;


import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        System.out.println("Input three whole numbers...");
        Scanner number = new Scanner(System.in);

        int[] array = new int[3];
        array[0] = number.nextInt();
        array[1] = number.nextInt();
        array[2] = number.nextInt();

        System.out.println("Array cell 0 = " + array[0]);
        System.out.println("Array cell 1 = " + array[1]);
        System.out.println("Array cell 3 = " + array[2]);
    }
}
