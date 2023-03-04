package student_konstantin_kudrjavtsev.lesson_4.level_1_intern;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter integer");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }
}
