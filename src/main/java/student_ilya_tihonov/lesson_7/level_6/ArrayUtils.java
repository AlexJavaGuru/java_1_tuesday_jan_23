package student_ilya_tihonov.lesson_7.level_6;

public class ArrayUtils {

    public static int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                count++;
            }
        }
        int[] out = new int[count];
        int j = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                out[j] = in[i];
                j++;
            }
        }
        return out;
    }

}
