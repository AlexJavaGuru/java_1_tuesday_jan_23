package student_aleksandrs_lezhennikovs.lesson_7.level_6;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int lengthOfArray = lengthForResultArray(in, numberFrom, numberTo);
        int[] resultArray = new int[lengthOfArray];
        int index = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                resultArray[index] = number;
                index++;
            }
        }
        return resultArray;
    }

    int lengthForResultArray(int[] in, int numberFrom, int numberTo) {
        int counter = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                counter++;
            }
        }
        return counter;
    }

}
