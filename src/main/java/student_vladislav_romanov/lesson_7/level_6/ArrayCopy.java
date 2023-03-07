package student_vladislav_romanov.lesson_7.level_6;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] trim = new int[0];

        for (int number : in) {
            if (isNumberInRange(number, numberFrom, numberTo)) {
                trim = fillTemporaryArray(trim, number);
            }
        }

        return trim;
    }

    boolean isNumberInRange(int number, int numberFrom, int numberTo) {
        return number >= numberFrom && number <= numberTo;
    }

    int[] fillTemporaryArray(int[] trim, int number) {
        int[] temp = new int[trim.length + 1];

        temp = fillTemporaryArrayWithElementsFromOrigin(temp, trim);
        temp[trim.length] = number;

        return temp;
    }

    int[] fillTemporaryArrayWithElementsFromOrigin(int[] temp, int[] trim) {
        for (int j = 0; j < trim.length; j++) {
            temp[j] = trim[j];
        }

        return temp;
    }

}
