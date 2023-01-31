package student_natalija_rasponomarjova.lesson_2.level_3_junior;
/* Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.*/

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        double outputAverage = ((double) number1+number2+number3)/3;
        System.out.println(outputAverage);
    }
}
