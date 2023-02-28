package student_daniels_belejuns.lesson_5.level_6;


class ArrayUtil {
    public int[] printArrayToConsole(int array) {
        int[] newArray = new int[array];
        return newArray;
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}