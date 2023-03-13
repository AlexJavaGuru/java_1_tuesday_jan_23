package student_daniels_belejuns.lesson_6.level_3.task_12;

public class ArrayService {
    boolean contains(int[] array, int numberToSearch) {
        for (int number : array) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }
}
