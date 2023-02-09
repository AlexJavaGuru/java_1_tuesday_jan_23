package student_natalija_rasponomarjova.lesson_4.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0){
            System.out.println("The number is positive");
        }
        else if (number < 0){
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is 0");
        }
    }
}
