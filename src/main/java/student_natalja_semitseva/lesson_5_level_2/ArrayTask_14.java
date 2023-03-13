package student_natalja_semitseva.lesson_5_level_2;

import java.util.Arrays;

public class ArrayTask_14 {
    public static void main(String[] args) {
        double[] numbers = new double[3];
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 10;
        double average = (double) ((numbers[0] + numbers[1] + numbers[2]) / 3);

        System.out.println(Arrays.toString(numbers));
        System.out.println("Average = " + average);
    }
}
