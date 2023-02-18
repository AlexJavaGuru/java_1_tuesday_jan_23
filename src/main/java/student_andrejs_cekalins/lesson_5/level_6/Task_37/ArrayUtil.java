package student_andrejs_cekalins.lesson_5.level_6.Task_37;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] result = new int[arrayLength];
        return result;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}
