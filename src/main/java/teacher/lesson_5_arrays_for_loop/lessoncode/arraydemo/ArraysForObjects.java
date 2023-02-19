package teacher.lesson_5_arrays_for_loop.lessoncode.arraydemo;

import teacher.lesson_5_arrays_for_loop.lessoncode.stockcheck.Stock;

import java.util.Arrays;

public class ArraysForObjects {

    public static void main(String[] args) {
        String[] strings = new String[5];

        strings[2] = "Hello";
        strings[3] = "My Name Is";
        strings[4] = "Alex";

        System.out.println(Arrays.toString(strings));

        strings[0] = "A";
        strings[1] = "B";
        strings[4] = "?";

        String stringUnderIndex = strings[4];
        System.out.println(stringUnderIndex);
        System.out.println(Arrays.toString(strings));
    }
}
