package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_26;

import java.util.Arrays;

class MyListDemo {
    public static void main(String[] args) {
        Orders[] ordersRepo = {new Orders("Milk", Flow.FRESH, 5, 500)};
        ordersRepo[0].setOrderId(9L);
        MyList myList = new MyListImpl(ordersRepo);
        myList.add(new Orders("Alcohol", Flow.DRY, 3, 300));
        myList.add(new Orders("IceCream" ,Flow.FREEZER, 1, 75));
        System.out.println(myList);
        myList.sortByTitle();
        System.out.println(myList);
        myList.deleteByTitle("IceCream");
        System.out.println(myList);
        myList.add(new Orders("Tea" ,Flow.DRY, 40, 2));
        System.out.println(myList);
        System.out.println(Arrays.toString(myList.searchByTitle("Milk")));
    }
}
