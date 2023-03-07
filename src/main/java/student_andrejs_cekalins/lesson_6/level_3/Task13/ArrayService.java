package student_andrejs_cekalins.lesson_6.level_3.Task13;

class ArrayService {
    int countOccurrences(int[] array, int numberToSearch) {
        int occurrencesCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                occurrencesCounter++;
            }
        }
        return occurrencesCounter;
    }
}
