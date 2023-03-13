package student_daniels_belejuns.lesson_6.level_3.task_13;

public class ArrayService {
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
