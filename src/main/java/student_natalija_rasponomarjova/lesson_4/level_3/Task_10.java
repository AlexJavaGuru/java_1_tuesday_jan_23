package student_natalija_rasponomarjova.lesson_4.level_3;

import java.util.Scanner;
/* Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.*/

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int max;

        max = number1;
        if (number2 > max) {
            max = number2;
        }
        max = number2;
        if(number3 > max) {
            max = number3;
        }
        max = number3;
        if (number1 > max) {
            max = number1;
        }
        System.out.println("Maximal number is: " + max);
    }
}