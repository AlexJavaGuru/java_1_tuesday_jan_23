package student_andrejs_cekalins.lesson_10.level_5_Task_27;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {

    Set<String> find(String text) {
        Set<String> findWord =new HashSet<>();
        String[] split = text.replaceAll("[^a-zA-Z\\- ]", " ").toLowerCase().split("\\s+");
        for (String word : split) {
            findWord.add(word);
        }
        return findWord;
    }
}
