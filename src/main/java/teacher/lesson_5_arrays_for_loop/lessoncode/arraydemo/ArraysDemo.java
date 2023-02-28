package teacher.lesson_5_arrays_for_loop.lessoncode.arraydemo;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
//        int[] leapYears = new int[3];
        int[] leapYears = {2020, 2016, 2012};
//        leapYears[0] = 2020;
//        leapYears[1] = 2016;
//        leapYears[2] = 2012;
//
        System.out.println("Leap Years: " + Arrays.toString(leapYears));

        System.out.println(leapYears.length);
        System.out.println(leapYears[2]);
    }

}
