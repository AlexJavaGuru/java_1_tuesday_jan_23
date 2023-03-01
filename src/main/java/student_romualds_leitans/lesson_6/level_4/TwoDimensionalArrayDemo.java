package student_romualds_leitans.lesson_6.level_4;


import java.util.Arrays;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray array = new TwoDimensionalArray(3,3);
        array.fillRandomNumberArray();
        int sum = array.getSumOfArray();
        System.out.println("Сумма всех чисел в массиве: " + sum);
    }


}
