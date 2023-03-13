package student_natalja_semitseva.lesson_5_level_2;

import java.util.Arrays;

class ArrayTask_13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        int sum = numbers[0] + numbers[1] + numbers[2];
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum = " + sum);
    }
}
