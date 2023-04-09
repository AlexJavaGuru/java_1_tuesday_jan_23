package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_27;

import java.util.Arrays;
import java.util.Optional;

class MiLinkedListTest {
    public static void main(String[] args) {
        checkAddToStorage();
        checkFindByTitle();
        checkNotFindByTitle();
        checkSortStorage();
        checkDeleteByTitle();
    }

    public static void checkAddToStorage() {
        MyListBasedOnLinkedLinkedLIst myLinkedLIst = new MyListBasedOnLinkedLinkedLIst();
        Orders expectedOrder = new Orders("Milk package", Flow.FRESH, 5, 500);
        myLinkedLIst.add(expectedOrder);
        Orders actualOrder = myLinkedLIst.getStorage().get(0);
        check("Add order to storage", expectedOrder, actualOrder);
    }

    public static void checkSortStorage() {
        MyListBasedOnLinkedLinkedLIst myLinkedLIst = new MyListBasedOnLinkedLinkedLIst();
        Orders firstOrder = new Orders("Vodka", Flow.DRY, 5, 500);
        Orders secondOrder = new Orders("Milk", Flow.FRESH, 6, 700);
        Orders thirdOrder = new Orders("Apple", Flow.FRESH, 3, 100);
        MyListBasedOnLinkedLinkedLIst etalonList = new MyListBasedOnLinkedLinkedLIst();
        myLinkedLIst.add(firstOrder);
        myLinkedLIst.add(secondOrder);
        myLinkedLIst.add(thirdOrder);
        etalonList.add(thirdOrder);
        etalonList.add(secondOrder);
        etalonList.add(firstOrder);
        myLinkedLIst.sortByTitle();
        Object[] expectedArray = {thirdOrder, secondOrder, firstOrder};
        Object[] checkArray = myLinkedLIst.printAll().toArray();
        check("Sort storage", expectedArray, checkArray);
    }

    public static void checkFindByTitle() {
        MyListBasedOnLinkedLinkedLIst myLinkedLIst = new MyListBasedOnLinkedLinkedLIst();
        Orders firstOrder = new Orders("Vodka", Flow.DRY, 5, 500);
        Orders secondOrder = new Orders("Milk", Flow.FRESH, 6, 700);
        Orders thirdOrder = new Orders("Apple", Flow.FRESH, 3, 100);
        myLinkedLIst.add(firstOrder);
        myLinkedLIst.add(secondOrder);
        myLinkedLIst.add(thirdOrder);
        Orders expectedResult = secondOrder;
        Orders actualResult;
        Optional<Orders> findOpt = myLinkedLIst.searchByTitle("Milk");
        if (findOpt.isPresent()) {
            actualResult = findOpt.get();
            if (expectedResult.equals(actualResult)) {
                System.out.println("Find by title test has Passed: Order was found ");
            } else {
                System.out.println("Find by title test has Failed: Order " + expectedResult + " NOT EQUAL " + actualResult);
            }
        } else {
            System.out.println("Find by title test has Passed: Order Not found");
        }
    }

    public static void checkNotFindByTitle() {
        MyListBasedOnLinkedLinkedLIst myLinkedLIst = new MyListBasedOnLinkedLinkedLIst();
        Orders firstOrder = new Orders("Vodka", Flow.DRY, 5, 500);
        Orders secondOrder = new Orders("Milk", Flow.FRESH, 6, 700);
        Orders thirdOrder = new Orders("Apple", Flow.FRESH, 3, 100);
        myLinkedLIst.add(firstOrder);
        myLinkedLIst.add(secondOrder);
        myLinkedLIst.add(thirdOrder);
        Orders expectedResult = secondOrder;
        Orders actualResult;
        Optional<Orders> findOpt = myLinkedLIst.searchByTitle("FISH");
        if (findOpt.isPresent()) {
            actualResult = findOpt.get();
            if (expectedResult.equals(actualResult)) {
                System.out.println("Not Find by title test has Passed: Order is found and " + expectedResult + " EQUAL " + actualResult);
            } else {
                System.out.println("Not Find by title test has Failed: Order " + expectedResult + " NOT EQUAL " + actualResult);
            }
        } else {
            System.out.println("Not Find by title test has Passed: Order Not found");
        }
    }

    private static void check(String actionName, Orders expect, Orders actual) {
        if (expect.equals(actual)) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }

    private static void check(String actionName, Object[] expect, Object[] actual) {
        if (Arrays.equals(expect, actual)) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }

    private static void checkDeleteByTitle() {
        MyListBasedOnLinkedLinkedLIst myLinkedLIst = new MyListBasedOnLinkedLinkedLIst();
        Orders firstOrder = new Orders("Vodka", Flow.DRY, 5, 500);
        Orders secondOrder = new Orders("Milk", Flow.FRESH, 6, 700);
        Orders thirdOrder = new Orders("Apple", Flow.FRESH, 3, 100);
        myLinkedLIst.add(firstOrder);
        myLinkedLIst.add(secondOrder);
        myLinkedLIst.add(thirdOrder);
        int expected = myLinkedLIst.getStorage().size();
        myLinkedLIst.deleteByTitle("Milk");
        int result = myLinkedLIst.getStorage().size();
        Optional<Orders> optOrder = myLinkedLIst.searchByTitle("Milk");

        if (expected != result && optOrder.isEmpty()) {
            System.out.println("Delete test has PASSED.");
        } else {
            System.out.println("Delete test has FAILED");
        }
    }
}
