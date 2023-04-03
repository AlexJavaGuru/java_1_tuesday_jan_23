package student_anastasiia_bokareva.lesson5.level4;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int massivLength = scanner.nextInt();
        int[] numbers = new int[massivLength];
        for (int i =0; i<massivLength; i++){
            numbers[i]=scanner.nextInt();
        }
        for (int i =0; i<massivLength; i++){
            System.out.println(numbers[i]);
        }
    }
}
