package student_oksana_tarasova.lesson_10.level_1;

import java.util.*;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> listInt = new LinkedList();

        listInt.add(2);
        listInt.add(4);
        listInt.add(6);
        listInt.add(2);
        listInt.add(4);
        listInt.add(6);
        listInt.add(2);
        listInt.add(4);
        listInt.add(6);

        System.out.println(listInt.toString());

        listInt.add(0, 10);
        System.out.println(listInt.toString());
        System.out.println(listInt.size());

        listInt.add(4, 10);
        System.out.println(listInt.toString());
        System.out.println(listInt.size());

        listInt.remove(3);
        System.out.println(listInt.toString());
        System.out.println(listInt.size());

        List<Integer> numbersToRemove = new ArrayList<>();
        numbersToRemove.add(Integer.parseInt("2"));
        listInt.removeAll(numbersToRemove);
        System.out.println(listInt.toString());
        System.out.println(listInt.size());

        System.out.println(listInt.isEmpty());

        for (Integer number : listInt) {
            System.out.println("element of list: " + number);

        }
        listInt.toString();
    }
}



