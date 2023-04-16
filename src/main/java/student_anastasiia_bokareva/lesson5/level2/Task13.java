package student_anastasiia_bokareva.lesson5.level2;

import java.util.Random;


public class Task13 {
    public static void main(String[] args) {
        Task13 task = new Task13();
        int[] numbers = new int[3];
        task.fullMassiv(numbers);
        int sum = task.sumArray(numbers);
        System.out.println("Sum = " + sum);
    }

    public void fullMassiv(int[] array) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(5);
        }
    }

    public int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}

