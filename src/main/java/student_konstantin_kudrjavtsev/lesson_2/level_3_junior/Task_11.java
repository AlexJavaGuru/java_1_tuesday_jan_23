package student_konstantin_kudrjavtsev.lesson_2.level_3_junior;

import java.util.Scanner;
public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three integers");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        double result = (firstNumber + secondNumber + (double)thirdNumber) / 3;
        System.out.println("output arithmetic mean" + result);
    }
}
