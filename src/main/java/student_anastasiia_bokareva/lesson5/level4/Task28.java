package student_anastasiia_bokareva.lesson5.level4;

import java.util.Random;
import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Task27 task27 = new Task27();

        int massivLength = scanner.nextInt();
        int[] numbers = new int[massivLength];

        for (int i =0; i<massivLength; i++){
            numbers[i]=random.nextInt();
        }
        for (int i =0; i<massivLength; i++){
            System.out.println(numbers[i]);
        }

        int min = numbers[0];
        for (int i =0; i<massivLength; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println(min);

    }
}
