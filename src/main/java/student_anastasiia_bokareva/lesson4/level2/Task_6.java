package student_anastasiia_bokareva.lesson4.level2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int seconNumber = scan.nextInt();

        if (firstNumber < seconNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(seconNumber);
        }
    }
}
