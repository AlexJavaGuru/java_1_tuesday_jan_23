package student_daniels_belejuns.lesson_6.level_3.task_17;

public class ArrayService {
    void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int result = array[i];
                    array[i] = array[j];
                    array[j] = result;
                }
            }
        }
    }
}
