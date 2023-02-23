package student_oksana_tarasova.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {

        int[] array = {3, 5, 7, 1, 3, 9, 11, 13};
        System.out.println(Arrays.toString(array));
        int givenNumber = 2;


        for (int numberArray : array) {
            if (givenNumber == numberArray) {
                System.out.println("yes");

            } continue;
        }

    }

}

