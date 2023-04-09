package student_julija_raudive.lesson_6.level_4;

import java.util.Arrays;

class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] arr=test.createAnArray(3, 5);
        System.out.println(Arrays.deepToString(arr));

        test.fillAnArray(arr);
        System.out.println(Arrays.deepToString(arr));

        System.out.println(test.arraySum(arr));





    }


}
