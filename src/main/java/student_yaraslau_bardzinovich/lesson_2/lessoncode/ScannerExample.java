package student_yaraslau_bardzinovich.lesson_2.lessoncode;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }
}
