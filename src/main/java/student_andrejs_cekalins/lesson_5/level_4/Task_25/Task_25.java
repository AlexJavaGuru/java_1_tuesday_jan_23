package student_andrejs_cekalins.lesson_5.level_4.Task_25;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner arrayLengthInput = new Scanner(System.in);
        System.out.print("Please enter array length: ");
        int arrayLength = arrayLengthInput.nextInt();
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(i);
        }
    }
}
