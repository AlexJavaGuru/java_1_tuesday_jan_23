package student_andrejs_cekalins.lesson_5.level_6.Task_34;

class ArrayUnit {
    public int[] createArray(int arraylength) {
        int[] result = new int[arraylength];
        return result;
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
