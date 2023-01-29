package student_anastasiia_bokareva.lesson2.level3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber = scan.nextInt();
        double secondNumber = scan.nextInt();
        double thirdNumber = scan.nextInt();
        double result = (firstNumber+secondNumber+thirdNumber)/3;
        System.out.println(result);
    }
}
