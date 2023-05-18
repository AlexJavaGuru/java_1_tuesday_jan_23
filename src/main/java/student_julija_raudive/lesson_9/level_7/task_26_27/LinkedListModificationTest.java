package student_julija_raudive.lesson_9.level_7.task_26_27;

import java.util.Arrays;

class LinkedListModificationTest {

     LinkedListModification LinkedListModification = new LinkedListModification();

     public static void main(String[] args) {

         LinkedListModificationTest test = new LinkedListModificationTest();
         test.addValueToArrayTest();
         test.removeValueFromArrayAndReduceArraySize();
         test.removeNonExistentValueFromArray();

     }

    private void addValueToArrayTest() {
        int[] array = new int[]{3, 6, 9, 0, 6};
        int[] resultArray = LinkedListModification.addValueToArray(array, 8);
        int[] expectedArray = new int[]{3, 6, 9, 0, 6, 8};
        checkResults(Arrays.equals(resultArray, expectedArray), "Add value test");
    }

    private void removeValueFromArrayAndReduceArraySize() {
        int[] array = new int[]{3, 6, 9, 0, 6, 8};
        int[] resultArray = LinkedListModification.removeValueFromArrayAndReduceArraySize(array, 6);
        int[] expectedArray = new int[]{3, 9, 0, 8};
        checkResults(Arrays.equals(resultArray, expectedArray), "Remove value test");
    }

     private void removeNonExistentValueFromArray() {
         int[] array = new int[]{3, 6, 9, 0, 6, 8};
         int[] resultArray = LinkedListModification.removeValueFromArrayAndReduceArraySize(array, 5);
         checkResults(Arrays.equals(resultArray, array), "Remove non-existent value value test");
     }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
 }
