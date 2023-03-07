package student_anastasiia_bokareva.lesson4.level1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int ostatok = number%2;

        if (ostatok != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}

