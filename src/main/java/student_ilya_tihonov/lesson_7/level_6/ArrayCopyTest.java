package student_ilya_tihonov.lesson_7.level_6;

public class ArrayCopyTest {

    public static void main(String[] args) {
        testCopyInRange();
    }

    public static void testCopyInRange() {
        int[] in = {1, 2, 3, 4, 5};
        int numberFrom = 2;
        int numberTo = 4;
        int[] expected = {2, 3, 4};
        int[] actual = ArrayCopy.copyInRange(in, numberFrom, numberTo);
        if (actual.length != expected.length) {
            System.out.println("Test case testCopyInRange failed: arrays have different length");
            return;
        }
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != expected[i]) {
                System.out.println("Test case testCopyInRange failed: arrays are not equal");
                return;
            }
        }
        System.out.println("Test case testCopyInRange passed");
    }

}
