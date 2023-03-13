package student_oksana_maksimova.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Is positive!");
        }
        else if (number < 0){
            System.out.println("Is negative!");
        }
    }
}
