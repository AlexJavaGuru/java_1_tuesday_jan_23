package teacher.lesson_6_arrays_while_loop.lessoncode;

import java.util.Arrays;

public class DoubleDemArray {

    public static void main(String[] args) {

//        String[][] strings = new String[2][2];
        String[][] strings = {{"A", "B"},
                              {"C", "D"},
                              {"E", "F"}};

        /*
        ij
        00
        01
        10
        11

         */
//        System.out.println(strings.length); = 3
//        System.out.println(strings[0].length); = 2
        System.out.println(Arrays.deepToString(strings));
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i][j] + " ");
            }
            System.out.println();
        }
    }
}
