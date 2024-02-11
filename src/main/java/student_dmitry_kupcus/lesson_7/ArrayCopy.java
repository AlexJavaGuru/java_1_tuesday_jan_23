package student_dmitry_kupcus.lesson_7;

class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        int[] arr = new int[in.length];
        for (int j : in) {
            if (j >= numberFrom && j <= numberTo) {
                arr[count] = j;
                count++;
            }
        }
        int[] J = new int[count];
        System.arraycopy(arr, 0, J, 0, count);
        return J;
    }
}