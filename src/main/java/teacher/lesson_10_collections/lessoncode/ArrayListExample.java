package teacher.lesson_10_collections.lessoncode;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> strings = new LinkedList<>();

        System.out.println(strings.size());

        strings.add("Hello");
        strings.add("My Name Is");
        strings.add("Alex");
        strings.add("Alex");
        strings.add("Alex");
        strings.add("!");

        System.out.println(strings.size());

        System.out.println(strings);

        System.out.println(strings.contains("!"));

//        String objectToBeDeleted = "";
//        for (String string : strings) {
//            if (string.equals("!")) {
//                objectToBeDeleted = string;
//            }
//        }
//        strings.remove(objectToBeDeleted);

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (string.equals("!")) {
                iterator.remove();
            }
        }
        System.out.println(strings);

        strings.add("goiwhgikuwh");
        System.out.println(strings);

        strings.remove(2);

        strings.sort(Comparator.naturalOrder());

    }
}
