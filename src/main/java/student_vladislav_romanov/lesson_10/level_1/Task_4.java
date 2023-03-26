package student_vladislav_romanov.lesson_10.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_4 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        arrayList.add("Hello");
        arrayList.add("Java");
        arrayList.add("World");
        arrayList.add("Hello");
        arrayList.add("Java");
        arrayList.add("World");
        System.out.println(arrayList);

        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(11);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(11);
        System.out.println(linkedList);

    }
}
