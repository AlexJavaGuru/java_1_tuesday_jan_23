package student_daniels_belejuns.lesson_2.level_3;

import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 1 число");
int firstNumber = input.nextInt();
        System.out.println("Введите 2 число");
int secondNumber = input.nextInt();
        System.out.println("Введите 3 число");
int thirdNumber = input.nextInt();

double result = ( ((double) firstNumber+ secondNumber + thirdNumber) / 3);
System.out.println("Average result" +result);



    }
}