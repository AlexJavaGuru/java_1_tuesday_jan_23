package student_oleg_gryazev.lesson_4.level_1;

import java.util.Scanner;

class DifferentTasks {
    void typeInOneDigit() {
        System.out.println("Enter any simple number.");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        TestingClassDifferentTask ts = new TestingClassDifferentTask();
        ts.a = digit;
    }

}
class TestingClassDifferentTask {
    static int a;

    public static void main(String[] args) {
        DifferentTasks dt = new DifferentTasks();

        dt.typeInOneDigit();
        if (a % 2 == 0) {
            System.out.println("The digit is even");
        } else {
            System.out.println("The digit is odd");

        }

        if (a < 0) {

            System.out.println("The digit is negative and = " + a);
        } else if (a > 0) {
            System.out.println("The digit is positive and = " + a);
        } else System.out.println("The digit is = 0");

        dt.typeInOneDigit();
        int firstNumber = a;
        dt.typeInOneDigit();
        int secondNumber = a;
        System.out.println("comparing of 2 entered digits. ");
        if (firstNumber > secondNumber) {
            System.out.println("First number is bigger the second, " + firstNumber + " > " + secondNumber + ".");
        }
        if (firstNumber < secondNumber) {
            System.out.println("First number is smaller the second, " + firstNumber + " < " + secondNumber + ".");
        }
        if (firstNumber == secondNumber) {
            System.out.println("Both numbers are equal, " + firstNumber + " = " + secondNumber + ".");
        }

    }
}



