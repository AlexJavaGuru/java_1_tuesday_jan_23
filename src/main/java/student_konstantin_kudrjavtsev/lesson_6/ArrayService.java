package student_konstantin_kudrjavtsev.lesson_6;

class ArrayService {

    boolean containsAnArrayOfNumbers(int[] array, int numberToSearch) {
        for (int numberArray : array) {
            if (numberToSearch == numberArray) {
                return true;
            }
        }
        return false;

    }

    int occurrenceCount(int[] array, int numberToSearch) {
        for (int numberArray : array) {
            if (numberToSearch == numberArray) {
            }
        }
        return numberToSearch;
    }

    boolean replacingTheFirstOccurrence(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    boolean replacingAllOccurrence(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
        return true;
    }
    void reversingAnArrayOfIntegers(int[] array) {

    }
    void sortingAnArrayOfIntegers(int[] array) {
    }
}