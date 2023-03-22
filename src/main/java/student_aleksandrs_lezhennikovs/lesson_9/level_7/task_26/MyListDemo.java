package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_26;

import java.util.Arrays;
import java.util.Scanner;

class MyListDemo {
    public static void main(String[] args) {
        MyList myList = new MyListImpl();
        myList.add(new Orders("Milk", Flow.FRESH, 5, 500));
        myList.add(new Orders("Alcohol", Flow.DRY, 3, 300));
        myList.add(new Orders("IceCream" ,Flow.FREEZER, 1, 75));
        System.out.println("Print my storage \n" + myList);

        myList.sortByTitle();
        System.out.println("Print after sort \n" + myList);

        myList.deleteByTitle("IceCream");
        System.out.println("After delete \n" + myList);

        myList.add(new Orders("Tea" ,Flow.DRY, 40, 2));
        System.out.println("After add \n" + myList);

        System.out.println("Search result \n" + Arrays.toString(myList.searchByTitle("Milka")));

        Scanner input = new Scanner(System.in);
        System.out.println("Input to delete title");
        String del = input.nextLine();
        myList.deleteByTitle(del);
        System.out.println("Print after delete \n" + myList);

    }
}
