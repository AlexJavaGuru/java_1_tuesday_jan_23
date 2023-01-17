package student_oleg_gryazev._lesson_2_allLevels;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 digits for math operation");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("Result of two digits adding  = " + (firstNumber + secondNumber));
        System.out.println("Result of two digits subtruction  = " + (firstNumber - secondNumber));
        System.out.println("Result of two digits multiplication  = " + (firstNumber * secondNumber));
        System.out.println("Result two digits of division = " + (firstNumber/secondNumber));

    }

}


/*1. Создать класс с нужным именем;
2. Создать описать main метод;
3. Воспользуйтесь специальным классом Scanner и его методом nextInt()
 для получения ввода с клавиатуры
          Scanner scanner = new Scanner(System.in);
          int firstNumber = scanner.nextInt();

4. Запишите полученные результаты в переменные;
5. При помощи System.out.println() выведите на консоль полученные результаты
 сложения, вычитания, умножения и деления.
 (каждый результат на новой строке отдельно).*/