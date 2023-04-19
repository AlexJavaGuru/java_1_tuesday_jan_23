package student_oksana_tarasova.lesson_10.level_3;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {

    Set<String> find(String text) {
        String[] strings = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Set<String> uniqueWord = new HashSet<>();
        for (String string : strings) {
            uniqueWord.add(string);
        }
        return uniqueWord;
    }
}
