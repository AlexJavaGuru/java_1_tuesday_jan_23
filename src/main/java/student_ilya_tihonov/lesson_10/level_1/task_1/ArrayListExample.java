package student_ilya_tihonov.lesson_10.level_1.task_1;

//ArrayList-реализация на основе массива, предназначенная для быстрого доступа к элементам по индексу.

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Jo");
        names.add("Kirill");

        System.out.println(names);

        String secondName = names.get(1);
        System.out.println(secondName);

        names.remove(0);
        System.out.println(names);

        boolean containsKirill = names.contains("Kirill");
        System.out.println(containsKirill);

    }
}
