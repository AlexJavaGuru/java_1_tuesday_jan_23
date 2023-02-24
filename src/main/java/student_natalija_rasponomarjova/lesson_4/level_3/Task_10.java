package student_natalija_rasponomarjova.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();


        if ((number1 >= number2 && number1 >= number3)) {
            System.out.println("Maximal number is: " + number1);
        } else if ((number2 >= number1 && number2 >= number3)) {
            System.out.println("Maximal number is: " + number2);
        } else {
            System.out.println("Maximal number is: " + number3);
        }
    }
}

