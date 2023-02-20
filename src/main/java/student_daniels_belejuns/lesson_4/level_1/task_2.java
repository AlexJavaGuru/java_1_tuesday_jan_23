package student_daniels_belejuns.lesson_4.level_1;
import java.util.Scanner;

public class task_2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("целое число:");
        int input = scan.nextInt();
        if (input > 0){
            System.out.println("положительное");
        }
        else if (input < 0) {
            System.out.println("отрицательное");
        }
        else {
            System.out.println("Равно нулю");
        }
    }
}
