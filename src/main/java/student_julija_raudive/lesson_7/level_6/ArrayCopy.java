package student_julija_raudive.lesson_7.level_6;

import java.util.ArrayList;


class ArrayCopy {

    ArrayList<Integer> copyInRange(int[] in, int numberFrom, int numberTo) {

        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i : in) {
            if (i >= numberFrom && i <= numberTo) {
                newArrayList.add(i);
            }
        }
        return newArrayList;

    }


}
