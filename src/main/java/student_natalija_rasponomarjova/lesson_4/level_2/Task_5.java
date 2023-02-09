package student_natalija_rasponomarjova.lesson_4.level_2;
import java.util.Scanner;
class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        }
        else {
            System.out.println(number2);
        }
    }
}
