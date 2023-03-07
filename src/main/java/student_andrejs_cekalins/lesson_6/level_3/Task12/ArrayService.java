package student_andrejs_cekalins.lesson_6.level_3.Task12;

class ArrayService {
    boolean contains(int[] array, int numberToSearch) {
        for (int number : array) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }
}
