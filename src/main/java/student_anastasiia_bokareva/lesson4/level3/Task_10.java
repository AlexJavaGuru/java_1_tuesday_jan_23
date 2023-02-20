package student_anastasiia_bokareva.lesson4.level3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
        int maxNumber = 0;

        if (maxNumber < firstNumber) {
            maxNumber = firstNumber;
        }
        if (maxNumber < secondNumber) {
            maxNumber = secondNumber;
        }
        if (maxNumber < thirdNumber) {
            maxNumber = thirdNumber;
        }

        System.out.println("Max number = " + maxNumber);
    }
}