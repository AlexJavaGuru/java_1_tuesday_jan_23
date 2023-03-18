package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_4_junior;


import java.util.Random;
import java.util.Scanner;

class Task_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        Random random = new Random();
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("isEven in array: " + number);
            } else {
                System.out.println("odd numbers: " + number);
            }
        }
    }
}