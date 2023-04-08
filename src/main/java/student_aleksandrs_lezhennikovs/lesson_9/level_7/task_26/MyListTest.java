package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_26;

import java.util.Arrays;

class MyListTest {
    public static void main(String[] args) {
        testAddToMyList();
        testSortMyListByTitle();
        testDeleteFromMyListByTitle();
        testSearchByTitle();
    }

    private static void testAddToMyList() {
        MyListImpl myList = new MyListImpl();
        myList.add(new Orders("Milk", Flow.FRESH, 5, 500));
        myList.add(new Orders("Alcohol", Flow.DRY, 3, 300));
        String expectedResult = "Alcohol";
        String actualResult = myList.getOrdersRepo()[1].getTitle();
        if (expectedResult.equals(actualResult)) {
            System.out.println("Add test has PASSED");
        } else {
            System.out.println("Add test has FAILED");
        }
    }

    private static void testSortMyListByTitle() {
        MyListImpl sortedList = new MyListImpl();
        sortedList.add(new Orders("Alcohol", Flow.DRY, 3, 300));
        sortedList.getOrdersRepo()[0].setOrderId(11);
        sortedList.add(new Orders("IceCream" ,Flow.FREEZER, 1, 75));
        sortedList.getOrdersRepo()[1].setOrderId(12);
        sortedList.add(new Orders("Milk", Flow.FRESH, 5, 500));
        sortedList.getOrdersRepo()[2].setOrderId(10);
        MyListImpl myList = new MyListImpl();
        myList.add(new Orders("Milk", Flow.FRESH, 5, 500));
        myList.add(new Orders("Alcohol", Flow.DRY, 3, 300));
        myList.add(new Orders("IceCream" ,Flow.FREEZER, 1, 75));
        myList.sortByTitle();
        if (Arrays.equals(sortedList.getOrdersRepo(), myList.getOrdersRepo())) {
            System.out.println("Sort list has PASSED");
        } else {
            System.out.println("Sort list has FAILED");
        }
    }

    private static void testSearchByTitle() {
        MyListImpl myList = new MyListImpl();
        myList.add(new Orders("Milk", Flow.FRESH, 5, 500));
        myList.add(new Orders("Alcohol", Flow.DRY, 3, 300));
        myList.add(new Orders("IceCream" ,Flow.FREEZER, 1, 75));
        String expectedResult = "Alcohol";
        Orders[] actualOrders = myList.searchByTitle("Alcohol");
        String actualResult = actualOrders[0].getTitle();
        if (expectedResult.equals(actualResult)) {
            System.out.println("Searching test has PASSED");
        } else {
            System.out.println("Searching test has FAILED");
        }
    }

    private static void testDeleteFromMyListByTitle() {
        MyListImpl myList = new MyListImpl();
        myList.add(new Orders("Milk", Flow.FRESH, 5, 500));
        myList.add(new Orders("Alcohol", Flow.DRY, 3, 300));
        myList.add(new Orders("IceCream" ,Flow.FREEZER, 1, 75));
        int initialSize = myList.getOrdersRepo().length;
        myList.deleteByTitle("Alcohol");
        int sizeAfterDelete = myList.getOrdersRepo().length;
        if (initialSize != sizeAfterDelete) {
            System.out.println("Delete test has PASSED");
        } else {
            System.out.println("Delete test has FAILED");
        }
    }
}
