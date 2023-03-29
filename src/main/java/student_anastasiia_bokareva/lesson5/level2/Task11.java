package student_anastasiia_bokareva.lesson5.level2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i<3; i++){
            numbers[i] = scan.nextInt();
            System.out.println(numbers[i]);
        }
    }
}

