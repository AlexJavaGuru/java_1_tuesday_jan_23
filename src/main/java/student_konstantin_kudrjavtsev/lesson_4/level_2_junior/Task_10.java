package student_konstantin_kudrjavtsev.lesson_4.level_2_junior;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three integer");
        int number = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if (number > number2 && number2 > number3) {
            System.out.println();
        } else if (number2 > number && number2 > number3) ;
        {
            System.out.println();
        }
    }
}
