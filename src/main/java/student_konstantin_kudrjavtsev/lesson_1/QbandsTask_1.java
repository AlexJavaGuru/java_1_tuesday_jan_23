package student_konstantin_kudrjavtsev.lesson_1;

import java.util.Scanner;

public class QbandsTask_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two integers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + secondNumber);

        System.out.println("enter two integers");
        int thirdNumber = scanner.nextInt();
        int fourNumber = scanner.nextInt();
        System.out.println(thirdNumber - fourNumber);

        System.out.println("enter two integers");
        int fiveNumber = scanner.nextInt();
        int sixNumber = scanner.nextInt();
        System.out.println(fiveNumber * sixNumber);

        System.out.println("enter two integers");
        int sevenNumber = scanner.nextInt();
        int eightNumber = scanner.nextInt();
        System.out.println(sevenNumber / eightNumber);
    }
}
