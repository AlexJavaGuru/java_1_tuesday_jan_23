package student_ilya_tihonov.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if (firstNumber == secondNumber && firstNumber == thirdNumber){
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }

}
