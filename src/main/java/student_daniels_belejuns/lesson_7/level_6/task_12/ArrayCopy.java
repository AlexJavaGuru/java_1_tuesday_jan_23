package student_daniels_belejuns.lesson_7.level_6.task_12;

public class ArrayCopy {
    public static int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                count++;
            }
        }
        int[] out = new int[count];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                out[index] = in[i];
                index++;
            }
        }
        return out;
    }
}