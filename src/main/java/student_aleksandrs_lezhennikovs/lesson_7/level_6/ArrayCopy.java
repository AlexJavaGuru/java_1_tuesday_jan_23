package student_aleksandrs_lezhennikovs.lesson_7.level_6;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int lengthOfArray = lengthForResultArray(in, numberFrom, numberTo);
        int[] resulArray = new int[lengthOfArray];
        int index = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                resulArray[index] = number;
                index++;
            }
        }
        return resulArray;
    }

    public int lengthForResultArray(int[] in, int numberFrom, int numberTo) {
        int counter = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                counter++;
            }
        }
        return counter;
    }

}
