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

    int countOccurrences(int[] array, int numberToSearch) {
        int counter = 0;
        for (int number : array) {
            if (number == numberToSearch) {
                counter++;
            }
        }

        return counter;
    }

}
