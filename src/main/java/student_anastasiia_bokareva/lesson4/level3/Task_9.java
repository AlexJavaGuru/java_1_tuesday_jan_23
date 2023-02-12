package student_anastasiia_bokareva.lesson4.level3;

import java.util.Scanner;


public class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int seconNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();

        if ((firstNumber < seconNumber) && (seconNumber < thirdNumber)) {
            System.out.println("increasing");
        } else {
            if ((firstNumber > seconNumber) && (seconNumber > thirdNumber)) {
                System.out.println("decrease");
            } else {
                System.out.println("Neither increase or decrease");
            }
        }
    }
}
