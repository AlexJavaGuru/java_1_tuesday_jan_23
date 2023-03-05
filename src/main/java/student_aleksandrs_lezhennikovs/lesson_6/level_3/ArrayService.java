package student_aleksandrs_lezhennikovs.lesson_6.level_3;

public class ArrayService {

    boolean isNumberInArray(int[] intArray, int findNumber) {

        for (int number : intArray) {
            if(findNumber == number) {
                return true;
            }
        }
        return false;
    }

    int numberOfOccurrencesInArray(int[] intArray, int checkNumber) {

        int counter = 0;
        for (int number : intArray) {
            if (checkNumber == number) {
                counter++;
            }
        }
        return counter;
    }

    boolean replaceNumberInArray(int[] intArray, int findNumber, int replaceNumber) {

        for (int i = 0; i < intArray.length; i++) {
            if (findNumber == intArray[i]) {
                intArray[i] = replaceNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAllNumberInArray(int[] intArray, int findNumber, int replaceNumber) {

        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (findNumber == intArray[i]) {
                intArray[i] = replaceNumber;
                count++;
            }
        }
        return count;
    }

    void flipArray(int[] intArray) {

        int fromEnd = intArray.length - 1;
        int buffer;
        for (int i = 0; i < intArray.length / 2; i++) {
            buffer = intArray[i];
            intArray[i] = intArray[fromEnd];
            intArray[fromEnd] = buffer;
            fromEnd--;
        }
    }

    void sortArray(int[] intArray) {
        
        int buffer;
        for (int j = intArray.length - 1; j > 0; j--) {
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    buffer = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = buffer;
                }
            }
        }
    }
}
