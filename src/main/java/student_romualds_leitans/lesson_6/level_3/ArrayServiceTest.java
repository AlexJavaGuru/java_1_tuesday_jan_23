package student_romualds_leitans.lesson_6.level_3;

public class ArrayServiceTest {


    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.positiveTest();
        test.negativeTest();
        test.repetitionNumberTest();
        test.searchNumberOutsideArrayTest();
        test.replaceFirstTestPositive();

    }

    public void positiveTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int numberToSearch = 3;
        boolean expected = true;
        boolean actual = arrayService.contains(arr, numberToSearch);
        if (expected == actual) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }

    }

    public void negativeTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int numberToSearch = 8;
        boolean expected = false;
        boolean actual = arrayService.contains(arr, numberToSearch);
        if (expected == actual) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void repetitionNumberTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 3, 4, 5, 3, 6, 3};
        int numberToSearch = 3;
        int count = arrayService.countOccurrences(arr, numberToSearch);
        System.out.println("Test. Search number Array: " + count);

    }

    public void searchNumberOutsideArrayTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 5, 4, 2, 1};
        int numberToSearch = 7;
        int count = arrayService.countOccurrences(arr, numberToSearch);
        System.out.println("Test. Search number outside Array: " + count);

    }
    public void replaceFirstTestPositive() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 1, 2, 3};
        int numberToReplace = 1;
        int newNumber = 9;
        boolean expected = true;
        boolean actual = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        int[] expectedArr = {9, 2, 3, 1, 2, 3};
        int[] actualArr = arr;

        }
    }

