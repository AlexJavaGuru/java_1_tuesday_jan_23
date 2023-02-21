package student_daniels_belejuns.lesson_2.level_1;

import java.util.Scanner;

public class lv1task1 {
    public static void main (String... args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result = firstNumber * secondNumber;
        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);


    }
}


