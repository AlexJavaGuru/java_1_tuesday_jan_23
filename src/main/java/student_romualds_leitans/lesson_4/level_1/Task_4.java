package student_romualds_leitans.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number: ");
        int userInput = scanner.nextInt();

        if (userInput % 2 == 0){
            System.out.println(userInput + " is even number");
        } else if (userInput % 1 == 0){
            System.out.println(userInput + " is not even number");
        }
    }
}
