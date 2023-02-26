package student_ilya_tihonov.lesson_4.level_3.task_10;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args){

        Finder finder = new Finder();
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println(finder.maxOfThree(firstNumber , secondNumber , thirdNumber));

    }

}
