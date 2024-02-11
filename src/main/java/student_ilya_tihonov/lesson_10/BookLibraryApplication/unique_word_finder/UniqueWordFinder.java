package student_ilya_tihonov.lesson_10.BookLibraryApplication.unique_word_finder;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {
    public Set<String> find(String text) {
        Set<String> uniqueWords = new HashSet<>();

        String[] words = text.split("\\s+");

        for (String word : words) {
            uniqueWords.add(word);
        }

        return uniqueWords;
    }
}
