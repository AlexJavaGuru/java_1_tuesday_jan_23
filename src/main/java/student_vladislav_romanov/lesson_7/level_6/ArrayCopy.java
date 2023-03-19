package student_vladislav_romanov.lesson_7.level_6;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int trimLength = 0;

        for (int number : in) {
            if (isNumberInRange(number, numberFrom, numberTo)) {
                trimLength++;
            }
        }

        return fillTemporaryArray(in, trimLength, numberFrom, numberTo);
    }

    boolean isNumberInRange(int number, int numberFrom, int numberTo) {
        return number >= numberFrom && number <= numberTo;
    }

    int[] fillTemporaryArray(int[] in, int trimLength, int numberFrom, int numberTo) {
        int[] trim = new int[trimLength];
        int j = 0;

        for (int number : in) {
            if (isNumberInRange(number, numberFrom, numberTo)) {
                trim[j] = number;
                j++;
            }
        }

        return trim;
    }

}
