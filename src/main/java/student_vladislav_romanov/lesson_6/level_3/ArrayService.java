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

    int countEntries(int[] array, int numberToSearch) {
        int counter = 0;
        for (int number : array) {
            if (number == numberToSearch) {
                counter++;
            }
        }

        return counter;
    }

    boolean replaceFirstEntry(int[] array, int entry, int replace) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == entry) {
                array[i] = replace;
                return true;
            }
        }

        return false;
    }

}
