package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class Task_28 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the length of the array: ");
            int[] numbers = new int[scanner.nextInt()];
            Random random = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }

            int min = numbers[0];
            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
            System.out.println("the smallest number in the array: " + min);
        }
    }
