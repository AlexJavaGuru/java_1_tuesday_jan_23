package student_julija_raudive.lesson_7.level_6;

import java.util.ArrayList;
import java.util.Arrays;

class ArrayCopyTest {

    ArrayCopy arrayCopy = new ArrayCopy();

    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test. arrayHasNumbersFromTheRangeTest();
        test.boundaryValueTest();
        test.noNumberFromTheRangeTest();

    }

    public void arrayHasNumbersFromTheRangeTest(){
        int[] array = new int[]{4, 3, 7, 8, 9, 46, 1, 6, 0};
        ArrayList<Integer> resultArrayList = new ArrayList<>(Arrays.asList(7, 8, 9, 6));
        ArrayList<Integer> realResultArrayList;
        realResultArrayList = arrayCopy.copyInRange(array, 5, 10);
        checkResults(realResultArrayList.equals(resultArrayList), "Array has numbers form range");
    }

    public void boundaryValueTest() {
        int[] array = new int[]{4, 3, 7, 8, 9, 46, 1, 0};
        ArrayList<Integer> resultArrayList = new ArrayList<>(Arrays.asList(7, 8, 9));
        ArrayList<Integer> realResultArrayList;
        realResultArrayList = arrayCopy.copyInRange(array, 7, 9);
        checkResults(realResultArrayList.equals(resultArrayList), "Array has boundary values");

    }

    public void noNumberFromTheRangeTest() {
        int[] array = new int[]{4, 3, 7, 9, 46, 1, 0};
        ArrayList<Integer> resultArrayList = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> realResultArrayList;
        realResultArrayList = arrayCopy.copyInRange(array, 50, 70);
        checkResults(realResultArrayList.equals(resultArrayList), "No numbers form the range");
        //System.out.println(realResultArrayList);

    }

    public void checkResults(boolean condition, String testName) {

        System.out.print(testName + ": ");
        if (condition) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
