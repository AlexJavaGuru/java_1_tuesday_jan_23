package student_anastasiia_bokareva.lesson4.level3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int seconNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();

        if ((firstNumber == seconNumber) && (seconNumber == thirdNumber)) {
            System.out.println("All numbers are equal");
        } else {
            if ((firstNumber != seconNumber) && (seconNumber != thirdNumber) && (firstNumber != thirdNumber)) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}