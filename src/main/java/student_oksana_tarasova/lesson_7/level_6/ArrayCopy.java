package student_oksana_tarasova.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopy {

    int calculateArrayLength(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom & in[i] <= numberTo) {
                count++;
            }
        }
        return count;
    }

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] newArray = new int[calculateArrayLength(in, numberFrom, numberTo)];
        int j = 0;
        for (int i = 0; i < in.length; i++) {
            if (numberFrom <= in[i] & in[i] <= numberTo) {
                newArray[j] = in[i];
                j++;
            }
        }
        return newArray;
    }
}
