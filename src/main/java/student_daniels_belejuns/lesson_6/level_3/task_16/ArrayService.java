package student_daniels_belejuns.lesson_6.level_3.task_16;

public class ArrayService {
    void revert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int result = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = result;
        }
    }
}
