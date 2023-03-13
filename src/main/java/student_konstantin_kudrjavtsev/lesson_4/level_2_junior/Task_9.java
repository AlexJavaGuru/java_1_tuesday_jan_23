package student_konstantin_kudrjavtsev.lesson_4.level_2_junior;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three integer");
        int number = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if (number > number2 && number2 < number3) {
            System.out.println("numbers are in increasing order");
        } else if (number != number2 && number2 != number3) {
            System.out.println("numbers are in decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}