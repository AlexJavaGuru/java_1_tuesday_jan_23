package student_natalija_rasponomarjova.lesson_7.level_6;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int numbers = newArrayLength(in, numberFrom, numberTo);
        int[] numbersCopy = new int[numbers];
        int i = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                numbersCopy[i] = number;
                i++;
            }
        }
        return numbersCopy;
    }

    public int newArrayLength(int[] in, int numberFrom, int numberTo) {
        int length = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                length++;
            }
        }
        return length;
    }
}

