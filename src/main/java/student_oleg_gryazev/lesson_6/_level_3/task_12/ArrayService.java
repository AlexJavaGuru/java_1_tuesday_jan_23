package student_oleg_gryazev.lesson_6._level_3.task_12;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int number : arr)
            if (number == numberToSearch) {
                return true;
            }

        return false;
    }


}
