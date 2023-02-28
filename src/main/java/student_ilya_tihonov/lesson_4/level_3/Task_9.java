package student_ilya_tihonov.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if ( firstNumber < secondNumber && secondNumber < thirdNumber){
            System.out.println("Increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber){
            System.out.println("decreasing");
        } else {System.out.println("Neither increasing or decreasing order");
        }
    }

}
