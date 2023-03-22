package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_27;

import java.util.LinkedList;

class MiLinkedListTest {
    public static void main(String[] args) {
        checkAddToStorage();
        checkSortStorage();
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
        System.out.println(etalonList.printAll());
        System.out.println(myLinkedLIst.printAll());
        myLinkedLIst.sortByTitle();
        System.out.println(myLinkedLIst.printAll());

        check("Sorting of storage", etalonList, myLinkedLIst);

    }

    private static void check(String actionName, Orders expect, Orders actual) {
        if (expect.equals(actual)) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }

    private static void check(String actionName, MyListBasedOnLinkedLinkedLIst expect, MyListBasedOnLinkedLinkedLIst actual) {
        if (expect.equals(actual)) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }
}
