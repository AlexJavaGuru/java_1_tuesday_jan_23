package student_konstantin_kudrjavtsev.lesson_7.level_6_middle;

import java.util.Arrays;

class ArrayCopy {
    public static int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] out = new int[in.length];
        int outIndex = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                out[outIndex] = in[i];
                outIndex++;
            }
        }
        return Arrays.copyOf(out, outIndex);
    }
}