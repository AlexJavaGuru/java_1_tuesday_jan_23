package student_andrejs_cekalins.lesson_5.level_6.Task_35;

class ArrayUnit {
    public int[] createArray(int arrayLength) {
        int[] result = new int[arrayLength];
        return result;
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
