package student_andrejs_cekalins.lesson_10.level_1.Task_4;

import java.util.*;

class ListDuplicates {
    public static void main(String[] args) {
        List<String> stringsArray = new ArrayList<>();
        stringsArray.add("Dog");
        stringsArray.add("Dog");
        System.out.println(stringsArray);

        List<String> stringsLinked = new LinkedList<>();
        stringsLinked.add("Dog");
        stringsLinked.add("Dog");
        System.out.println(stringsLinked);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Dog", "Rex");
        stringMap.put("Dog", "Rex");
        System.out.println(stringMap);
    }
}
