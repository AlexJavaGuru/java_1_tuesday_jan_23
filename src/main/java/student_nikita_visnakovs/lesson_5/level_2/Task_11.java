package student_nikita_visnakovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        int[] userNum = new int[3];
        System.out.println("Enter three numbers...");

        Scanner userInput = new Scanner(System.in);

        userNum[0] = userInput.nextInt();
        userNum[1] = userInput.nextInt();
        userNum[2] = userInput.nextInt();

        System.out.println(Arrays.toString(userNum));

    }
}
