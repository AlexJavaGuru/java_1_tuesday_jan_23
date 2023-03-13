package student_natalja_semitseva.level_4;

import java.util.Arrays;

public class TwoDimensionalArray {

    public int sum() {
        int[][] arr = new int[][]{{0, 1, 2},
                {5, 6, 7}};


        int sum = 0;
        for (int[] value : arr) {
            for (int i : value) {
                sum += i;
                System.out.println(sum);
            }
        }
            return sum;
        }
}

