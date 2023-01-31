package student_romualds_leitans.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number = ");
        int xValue = input.nextInt();
        System.out.print("Input second number = ");
        int yValue = input.nextInt();
        System.out.print("Input third number = ");
        int zVAlue = input.nextInt();

        double averageValue = ( xValue + yValue + zVAlue ) / 3.0;

        System.out.println("Average =" + averageValue );


    }
}
