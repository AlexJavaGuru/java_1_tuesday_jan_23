package student_anastasiia_bokareva.lesson5.level4;

import java.util.Random;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int massivLength = scanner.nextInt();
        int[] numbers = new int[massivLength];

        for (int i =0; i<massivLength; i++){
            numbers[i]=random.nextInt();
        }

        for (int i =0; i<massivLength; i++){
            System.out.println(numbers[i]);
        }
    }
}

