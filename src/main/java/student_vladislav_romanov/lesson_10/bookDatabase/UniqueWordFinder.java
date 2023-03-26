package student_vladislav_romanov.lesson_10.bookDatabase;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {
        Set<String> dictionary = new HashSet<>();
        String[] split = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for (String word : split) {
            dictionary.add(word);
        }

        return dictionary;
    }

}
