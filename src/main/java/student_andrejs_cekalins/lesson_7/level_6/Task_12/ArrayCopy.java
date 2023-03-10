package student_andrejs_cekalins.lesson_7.level_6.Task_12;

class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int calculateNewArrayLength = newArrayLength(in, numberFrom, numberTo);
        int[] results = new int[calculateNewArrayLength];
        int counter =0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                results[counter] = in[i];
                counter++;
            }
        }
        return results;
    }

    public int newArrayLength(int[] in, int numberFrom, int numberTo) {
        int checker = 0;
        for (int j = 0; j < in.length; j++) {
            if (in[j] >= numberFrom && in[j] <= numberTo) {
                checker++;
            }
        }
        return checker;
    }
}
