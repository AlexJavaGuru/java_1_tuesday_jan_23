package student_ilya_tihonov.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if (firstNumber == secondNumber){
            System.out.println("Numbers are equals");
        } else {System.out.println("Numbers are different");
        }

    }

}
