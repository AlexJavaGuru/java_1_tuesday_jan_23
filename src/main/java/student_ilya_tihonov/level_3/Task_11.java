package student_ilya_tihonov.level_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] agrs){

        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("Write three numbers");
        double number1 = a.nextDouble();
        double number2 = b.nextDouble();
        double number3 = c.nextDouble();
        double number4 = number1 + number2 + number3;
        double answer = number4 / 3;
        System.out.println("Average = " +answer);



    }

}
