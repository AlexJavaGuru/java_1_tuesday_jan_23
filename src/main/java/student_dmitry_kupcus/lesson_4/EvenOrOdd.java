package student_dmitry_kupcus.lesson_4;

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {

        System.out.println("Please write a number...");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println(number + " It's Even");
        } else {
            System.out.println(number + " It's Odd");
        }
    }
}
