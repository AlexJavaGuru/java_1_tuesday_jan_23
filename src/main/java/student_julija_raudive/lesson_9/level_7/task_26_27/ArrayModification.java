package student_julija_raudive.lesson_9.level_7.task_26_27;


class ArrayModification implements MyList {


    @Override
    public int[] increaseArraySize(int[] array) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;

    }

    @Override
    public int[] removeValueFromArrayAndReduceArraySize(int[] array, int valueToDelete) {
        int numberOfValuesToDelete = checkValue(array, valueToDelete);
        int[] newArray = new int[array.length - numberOfValuesToDelete];
        int newArrayIndex = 0;
        for (int value : array) {
            if (!(value == valueToDelete)) {
                newArray[newArrayIndex] = value;
                newArrayIndex++;
            }
        }
        return newArray;
    }

    @Override
    public int[] addValueToArray(int[] array, int value) {
        array = increaseArraySize(array);
        array[array.length - 1] = value;
        return array;
    }


    private int checkValue(int[] array, int toCheckValue) {
        int counter = 0;
        for (int element : array) {
            if (element == toCheckValue) {
                counter++;
            }
        }
        return counter;
    }
}
