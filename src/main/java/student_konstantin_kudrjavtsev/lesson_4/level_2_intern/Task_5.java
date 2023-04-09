package student_konstantin_kudrjavtsev.lesson_4.level_2_intern;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two integer");
        int number = input.nextInt();
        int number2 = input.nextInt();
        if (number > number2) {
            System.out.println(number);
        } else if (number < number2) {
                System.out.println(number2);
        } else {
            System.out.println("number = 0");
        }
    }
}