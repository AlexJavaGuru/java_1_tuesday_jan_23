package student_konstantin_kudrjavtsev.lesson_2.level_3_junior;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter integer");
        int number = input.nextInt();
        for (int counter = 1; counter <= 10; counter++) {
            int result = number * counter;
            System.out.println(number + "*" + counter + "=" + result);
        }
    }
}
