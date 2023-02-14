package student_ilya_tihonov.level_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] agrs){

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Write three numbers");
        double number1 = Scanner.nextDouble();
        double number2 = Scanner.nextDouble();
        double number3 = Scanner.nextDouble();
        double number4 = number1 + number2 + number3;
        double answer = number4 / 3;
        System.out.println("Average = " +answer);



    }

}
