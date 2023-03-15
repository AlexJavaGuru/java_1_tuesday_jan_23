package student_natalja_semitseva.NS_Lesson_7_Level6;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest arrayCopy = new ArrayCopyTest();
        arrayCopy.testCopyInRange();
    }

    public void testCopyInRange() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {15, 100, 20, 0, 40, 25, 30};
        int[] expected = {20,30,40,25};
        int[] result = arrayCopy.copyInRange(array, 20, 40);
        checkResults(expected, result, "testCopyInRange");

    }

    public void checkResults(int[] expected, int[] result, String testName) {
        if (Arrays.equals(result, expected)) {
            System.out.println(testName + " = TRUE");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
