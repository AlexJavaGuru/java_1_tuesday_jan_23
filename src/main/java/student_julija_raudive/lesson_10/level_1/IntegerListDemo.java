package student_julija_raudive.lesson_10.level_1;

import java.util.LinkedList;


class IntegerListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(6);
        list.addFirst(3);
        list.addLast(8);
        System.out.println(list);
        System.out.println("List size: " + list.size());

        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(8));
        System.out.println(list);

        System.out.println(list.isEmpty());

        list.add(15);
        list.add(46);
        list.add(34);
        list.add(0);

        for (int element: list){
            System.out.println(element);
        }




    }
}
