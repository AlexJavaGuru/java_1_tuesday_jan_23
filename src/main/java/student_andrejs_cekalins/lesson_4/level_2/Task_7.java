package student_andrejs_cekalins.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter first integer number: ");
        int firstIntegerNumber = number.nextInt();
        System.out.print("Please enter second integer number: ");
        int secondIntegerNumber = number.nextInt();
        if (firstIntegerNumber == secondIntegerNumber) {
            System.out.print("Numbers are equals");
        } else {
            System.out.print("Numbers are different");
        }
    }
}
