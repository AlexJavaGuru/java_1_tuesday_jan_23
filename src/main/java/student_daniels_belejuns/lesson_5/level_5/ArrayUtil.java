package student_daniels_belejuns.lesson_5.level_5;

import java.util.Random;


class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        return newArray;
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
           array[i] = random.nextInt();
       }
    }

}
