package teacher.lesson_10_collections.lessoncode;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> setExample = new HashSet<>();

        setExample.add("A");
        setExample.add("A");
        setExample.add("A");
        setExample.add("B");
        setExample.add("C");
        setExample.add("D");

        System.out.println(setExample);

        setExample.remove("D");
        System.out.println(setExample);
    }
}
