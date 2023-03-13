package student_konstantin_kudrjavtsev.lesson_4.level_1_intern;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter integer from 1 before 7");
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thuesday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
            } else {
            System.out.println("option is not suitable");
        }
    }
}