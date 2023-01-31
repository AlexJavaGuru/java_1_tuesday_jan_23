package student_natalija_rasponomarjova.lesson_2.level_3_junior;
/*Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        for (int i = 1; i <=10 ; i++) {
            int output = inputNumber*i;
            System.out.println(output);
        }
    }
}
