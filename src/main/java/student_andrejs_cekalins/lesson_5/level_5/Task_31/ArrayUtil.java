package student_andrejs_cekalins.lesson_5.level_5.Task_31;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] results = new int[arrayLength];
        return results;
    }

    public void fillArrayWithIntegerNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
