package student_vladislav_romanov.lesson_6.level_3;

class ArrayService {

    boolean contain(int[] array, int numberToSearch) {
        for (int number : array) {
            if (number == numberToSearch) {
                return true;
            }
        }

        return false;
    }

}
