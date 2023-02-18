package student_oksana_tarasova.lesson_4.level_1;

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number...");
        EvenOrOdd.isEven(input.nextInt());
    }

    static void isEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}

