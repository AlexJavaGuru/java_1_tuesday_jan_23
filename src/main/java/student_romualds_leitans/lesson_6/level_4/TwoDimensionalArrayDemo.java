package student_romualds_leitans.lesson_6.level_4;


import java.util.Arrays;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int [][] array = new int[3][4];
        twoDimensionalArray.fillRandomNumberArray(array,3,4);
        int sum = twoDimensionalArray.getSumOfArray(array,3,4);
        System.out.println("Сумма всех чисел в массиве: " + sum);
    }


}
