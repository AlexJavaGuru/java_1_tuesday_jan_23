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

    int replace(int[] array, int entry, int replace) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == entry) {
                array[i] = replace;
                counter++;
            }
        }

        return counter;
    }

    void reverse(int[] array) {
        int[] auxArray = array.clone();
        int i = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            array[i] = auxArray[j];
            i++;
        }
    }

    void sort(int[] array) {
        int counter = array.length;
        while(counter >= 0) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            counter--;
        }
    }

}
