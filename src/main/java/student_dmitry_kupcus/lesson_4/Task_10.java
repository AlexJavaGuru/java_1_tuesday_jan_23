package student_dmitry_kupcus.lesson_4;

import java.util.Scanner;
class Task_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter third number:");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("First number is bigger then others");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Second number is bigger then others");
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Third number is bigger then others");
        }else {
            System.out.println("All number are equal");
        }
    }
}
