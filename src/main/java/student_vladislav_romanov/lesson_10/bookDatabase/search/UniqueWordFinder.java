package student_vladislav_romanov.lesson_10.bookDatabase.search;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {

    Set<String> find(String text) {
        Set<String> dictionary = new HashSet<>();
        String[] split = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        Collections.addAll(dictionary, split);

        return dictionary;
    }

}
