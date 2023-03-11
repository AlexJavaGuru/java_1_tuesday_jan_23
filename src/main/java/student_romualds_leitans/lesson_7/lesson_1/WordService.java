package student_romualds_leitans.lesson_7.lesson_1;

import java.util.HashMap;
import java.util.Map;

public class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = splitTextIntoWords(text);
        Map<String, Integer> wordCounts = countWords(words);
        String mostFrequentWord = findMostFrequentWordInMap(wordCounts);
        return mostFrequentWord;
    }

    private String[] splitTextIntoWords(String text) {
        String[] words = text.split("[\\s\\p{Punct}]+"); // разбиваем текст на массив слов.
        return words;
    }

    private Map<String, Integer> countWords(String[] words) { // через HashMap подсчет каждого слова в массиве и возрашение его.
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            Integer count = wordCounts.get(word);
            if (count == null) {
                count = 0;
            }
            wordCounts.put(word, count + 1);
        }
        return wordCounts;
    }

    private String findMostFrequentWordInMap(Map<String, Integer> wordCounts) { //поиск слова которое встречается чаще всего(черезHashMap<> )
        String mostFrequentWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequentWord;
    }

}
