package student_daniels_belejuns.les2_lev3;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input the number");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(n + "*" + i + "=" + (n * i));
        }


    }
}