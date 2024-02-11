package student_ilya_tihonov.lesson_10.level_1.task_1;

//Vector-Реализация, которая похожа на ArrayList, но является потокобезопасной.

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("Jo");
        names.add("Kirill");
        names.add("Nikolay");

        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        boolean containsNikolay = names.contains("Nikolay");
        System.out.println(containsNikolay);

    }

}
