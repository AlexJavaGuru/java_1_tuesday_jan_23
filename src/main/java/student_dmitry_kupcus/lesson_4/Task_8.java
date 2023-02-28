package student_dmitry_kupcus.lesson_4;
import java.util.Scanner;

class Task_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter third number:");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == firstNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber || secondNumber != thirdNumber || thirdNumber != firstNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
