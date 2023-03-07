package student_andrejs_cekalins.lesson_6.level_3.Task15;

class ArrayService {
    int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                counter++;
            }
        }
        return counter;
    }
}
